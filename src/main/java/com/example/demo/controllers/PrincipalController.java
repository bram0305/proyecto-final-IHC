package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PrincipalController {

    @RequestMapping("/")
    public String inicio(){
        return "principal";
    }

    @RequestMapping("/iniciosesion")
    public String iniciosesion(){
        return "iniciosesion";
    }

    @RequestMapping("/iniciosesion/registrar")
    public String registrar(){
        return "registrar";
    }
    
    @PostMapping("/iniciosesion/registrar/validar")
    public String datospersonales(@RequestParam("correo") String correo,@RequestParam("contra") String contra,@RequestParam("confirmacontra") String confirmacontra,@RequestParam("tele") String tele, RedirectAttributes flash){
        String mensaje = "";
        if(!correo.equals("") && !contra.equals("") && !confirmacontra.equals("") && !tele.equals("")){
            mensaje = "Datos registrados correctamente";
        }else{
            mensaje = "Los datos no se han sido registrados";
        }
        flash.addFlashAttribute("mensaje", mensaje);
        return "redirect:/registrar/";
    }

    @GetMapping("/lading")
    public String mostrarLading() {
        return "lading";
    }
}
