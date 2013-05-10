package com.tracyshandmadesoaps.soapstore.web;

import com.tracyshandmadesoaps.soapstore.domain.CartOrder;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = CartOrder.class)
@Controller
@RequestMapping("/cartorders")
public class CartOrderController {
}
