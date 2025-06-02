package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrincipalController {

    @RequestMapping("/")
    public String inicio(){
        return "index";
    }

    @RequestMapping("/iniciosesion")
    public String iniciosesion(){
        return "iniciosesion";
    }
}
