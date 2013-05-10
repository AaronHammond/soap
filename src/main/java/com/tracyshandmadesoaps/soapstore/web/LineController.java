package com.tracyshandmadesoaps.soapstore.web;

import com.tracyshandmadesoaps.soapstore.domain.Line;
import com.tracyshandmadesoaps.soapstore.domain.Product;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.HashSet;
import java.util.List;

@RooWebJson(jsonObject = Line.class)
@Controller
@RequestMapping("/lines")
public class LineController {

    @RequestMapping(value = {"/simple"})
    public String simple(final ModelMap modelMap, final Principal principal){
        List<Product> products = Product.findProductsByLineEquals(Line.findLinesByNameEquals("Simple Pleasures").getSingleResult()).getResultList();
        modelMap.put("products", products);
        return "simple";
    }
    @RequestMapping(value = {"/eco"})
    public String eco(final ModelMap modelMap, final Principal principal){
        List<Product> products = Product.findProductsByLineEquals(Line.findLinesByNameEquals("Eco").getSingleResult()).getResultList();
        modelMap.put("products", products);
        return "eco";
    }
    @RequestMapping(value = {"/finer"})
    public String finer(final ModelMap modelMap, final Principal principal){
        List<Product> products = Product.findProductsByLineEquals(Line.findLinesByNameEquals("The Finer Things").getSingleResult()).getResultList();
        modelMap.put("products", products);
        return "finer";
    }
}
