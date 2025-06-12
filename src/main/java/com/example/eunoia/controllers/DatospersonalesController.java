package com.example.eunoia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registrarse/datospersonales")
public class DatospersonalesController {
    @GetMapping("/")
    public String datospersonales() {
        return "registrarse/datospersonales/index";
    }
}
