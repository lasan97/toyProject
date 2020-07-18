package com.toy.app.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelController {

    @GetMapping("/")
    public String hello(){
        return "index";
    }

}
