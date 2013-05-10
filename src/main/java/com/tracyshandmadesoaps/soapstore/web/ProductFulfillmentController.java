package com.tracyshandmadesoaps.soapstore.web;

import com.tracyshandmadesoaps.soapstore.domain.ProductFulfillment;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = ProductFulfillment.class)
@Controller
@RequestMapping("/productfulfillments")
public class ProductFulfillmentController {
}
