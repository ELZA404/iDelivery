package com.nure.antonenko.iDelivery.controller.ua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ua")
public class UaMainController {

    @GetMapping
    public String index(){
        return "ua/ua_index";
    }
}
