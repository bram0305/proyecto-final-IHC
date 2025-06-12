package com.example.eunoia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lading")
public class LandingController {

    @GetMapping("/")
    public String lading() {
        return "lading/index";
    }

}
