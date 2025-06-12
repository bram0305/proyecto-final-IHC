package com.example.eunoia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iniciosesion")
public class IniciosesionController {
    
    @GetMapping("/")
    public String inicioSesion() {
        return "iniciosesion/index";
    }
    
}
