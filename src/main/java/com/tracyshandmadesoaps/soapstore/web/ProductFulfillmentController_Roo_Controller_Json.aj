// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.tracyshandmadesoaps.soapstore.web;

import com.tracyshandmadesoaps.soapstore.domain.ProductFulfillment;
import com.tracyshandmadesoaps.soapstore.web.ProductFulfillmentController;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

privileged aspect ProductFulfillmentController_Roo_Controller_Json {
    
    @RequestMapping(value = "/{id}", headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<String> ProductFulfillmentController.showJson(@PathVariable("id") Long id) {
        ProductFulfillment productFulfillment = ProductFulfillment.findProductFulfillment(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        if (productFulfillment == null) {
            return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<String>(productFulfillment.toJson(), headers, HttpStatus.OK);
    }
    
    @RequestMapping(headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<String> ProductFulfillmentController.listJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        List<ProductFulfillment> result = ProductFulfillment.findAllProductFulfillments();
        return new ResponseEntity<String>(ProductFulfillment.toJsonArray(result), headers, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<String> ProductFulfillmentController.createFromJson(@RequestBody String json) {
        ProductFulfillment productFulfillment = ProductFulfillment.fromJsonToProductFulfillment(json);
        productFulfillment.persist();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/jsonArray", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<String> ProductFulfillmentController.createFromJsonArray(@RequestBody String json) {
        for (ProductFulfillment productFulfillment: ProductFulfillment.fromJsonArrayToProductFulfillments(json)) {
            productFulfillment.persist();
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<String> ProductFulfillmentController.updateFromJson(@RequestBody String json) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        ProductFulfillment productFulfillment = ProductFulfillment.fromJsonToProductFulfillment(json);
        if (productFulfillment.merge() == null) {
            return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<String>(headers, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/jsonArray", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<String> ProductFulfillmentController.updateFromJsonArray(@RequestBody String json) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        for (ProductFulfillment productFulfillment: ProductFulfillment.fromJsonArrayToProductFulfillments(json)) {
            if (productFulfillment.merge() == null) {
                return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity<String>(headers, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public ResponseEntity<String> ProductFulfillmentController.deleteFromJson(@PathVariable("id") Long id) {
        ProductFulfillment productFulfillment = ProductFulfillment.findProductFulfillment(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        if (productFulfillment == null) {
            return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
        }
        productFulfillment.remove();
        return new ResponseEntity<String>(headers, HttpStatus.OK);
    }
    
}
