package com.tracyshandmadesoaps.soapstore.web;

import com.tracyshandmadesoaps.soapstore.domain.Cart;
import java.util.Date;

import com.tracyshandmadesoaps.soapstore.domain.Product;
import com.tracyshandmadesoaps.soapstore.domain.ProductFulfillment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;

import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RooWebJson(jsonObject = Cart.class)
@Controller
@RequestMapping("/cart")
public class CartController {


    final static private HttpHeaders jsonHeaders = new HttpHeaders();
    static{
        jsonHeaders.add("Content-Type", "application/json; charset=utf-8");
    }

    @RequestMapping(method = RequestMethod.GET)
    public String view(Principal principal, ModelMap modelMap){
        System.out.println("Here's the cart: " + getCart().getProducts().toString());
        modelMap.put("fulfillments", getCart().getProducts());
        return "cart";
    }

    @RequestMapping(value = "/{id}", headers = "Accept=application/json", method = RequestMethod.PUT)
    public ResponseEntity<String> updateQuantityInCart(Principal principal,
                                                       ModelMap modelMap,
                                                       @PathVariable("id") final Long id,
                                                       @RequestParam(value = "qty", required = true) final Integer quantity){
        Cart cart = getCart();
        ProductFulfillment productFulfillment = ProductFulfillment.findProductFulfillment(id);
        if(productFulfillment != null && cart.getProducts().contains(productFulfillment)){
            productFulfillment.setQuantity(quantity);
            productFulfillment.persist();
            return new ResponseEntity<String>(productFulfillment.toJson(), jsonHeaders, HttpStatus.OK);
        }
        return new ResponseEntity<String>(null, jsonHeaders, HttpStatus.FORBIDDEN);
    }

    @RequestMapping(value = "/{id}", headers = "Accept=application/json", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteFromCart(Principal principal, ModelMap modelMap, @PathVariable("id") final Long id){
        Cart cart = getCart();
        ProductFulfillment productFulfillment = ProductFulfillment.findProductFulfillment(id);
        List<ProductFulfillment> products = cart.getProducts();

        if(products.contains(productFulfillment)){
            products.remove(productFulfillment);
            cart.setProducts(products);
            cart.persist();
            productFulfillment.remove();
        }

        return new ResponseEntity<String>(cart.toJson(), jsonHeaders, HttpStatus.OK);
    }

    @RequestMapping(value = "/add/{id}", headers = "Accept=application/json")
    public ResponseEntity<String> addToCart(@RequestBody String json,
                                            @PathVariable("id") final Long id,
                                            @RequestParam(value = "qty", required = true) final Integer quantity){
        Cart ownerCart = getCart();

        ProductFulfillment productFulfillment = new ProductFulfillment();
        productFulfillment.setProduct(Product.findProduct(id));
        productFulfillment.setQuantity(quantity);
        productFulfillment.persist();

        List<ProductFulfillment> productFulfillmentHashSet = ownerCart.getProducts();
        productFulfillmentHashSet.add(productFulfillment);
        ownerCart.setProducts(productFulfillmentHashSet);
        ownerCart.persist();

        return new ResponseEntity<String>(productFulfillment.toJson(), jsonHeaders, HttpStatus.CREATED);
    }

    private Cart getCart(){
        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        Cart ownerCart;
        if(Cart.findCartsByOwnerSessionId(sessionId).getResultList().size() == 0){  // user doesn't have an extant cart. let's make one!
            ownerCart = new Cart();
            ownerCart.setOwnerSessionId(sessionId);
            ownerCart.persist();
        }
        else{
            ownerCart = Cart.findCartsByOwnerSessionId(sessionId).getSingleResult();
        }
        return ownerCart;
    }
}
