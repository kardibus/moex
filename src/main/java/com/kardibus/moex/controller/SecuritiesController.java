package com.kardibus.moex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("securities")
public class SecuritiesController {

    @GetMapping
    public String getAllSecurities(){
        return "securities";
    }
}
