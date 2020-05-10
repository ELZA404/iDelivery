package com.nure.antonenko.iDelivery.controller.ru;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ru")
public class RuMainController {

    @GetMapping
    public String index(){
        return "ru/ru_index";
    }
}
