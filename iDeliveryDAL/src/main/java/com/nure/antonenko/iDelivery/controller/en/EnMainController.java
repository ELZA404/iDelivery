package com.nure.antonenko.iDelivery.controller.en;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/en")
public class EnMainController {

    @GetMapping
    public String index(){
        return "en/en_index";
    }
}
