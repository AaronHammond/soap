package com.tracyshandmadesoaps.soapstore.web;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.List;


@Controller
public class IndexController {


	final static private HttpHeaders jsonHeaders = new HttpHeaders();
	static{
        jsonHeaders.add("Content-Type", "application/json; charset=utf-8");
	}

	@RequestMapping(value = {"/", "/index", "/hurr"})
    public String index(final ModelMap modelMap, final Principal principal){
        return "home";
    }

    @RequestMapping(value = {"/about"})
    public String about(final ModelMap modelMap, final Principal principal){
        return "about";
    }

    @RequestMapping(value = {"/contact"})
    public String contact(final ModelMap modelMap, final Principal principal){
        return "contact";
    }




}

