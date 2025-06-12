package com.example.eunoia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/registrarse")
public class RegistrarseController {
    
    @GetMapping("/")
    public String inicioSesion() {
        return "registrarse/index";
    }

    @PostMapping("/datos")
    public String datos(@RequestParam("correo") String correo,@RequestParam("contra") String contra,@RequestParam("confirmacontra") String confirmacontra,@RequestParam("tele") String tele,RedirectAttributes flash) {

        String res = "";

        if (!correo.contains("@") && !correo.contains(".")) {
            res = "El correo electrónico no es válido.";
            flash.addFlashAttribute("res", res);
            return "redirect:/registrarse/";
        }

        if (correo.isEmpty() || contra.isEmpty() || confirmacontra.isEmpty() || tele.isEmpty()) {
            res = "Todos los campos son obligatorios.";
            flash.addFlashAttribute("res", res);
            return "redirect:/registrarse/";
        }

        if (!contra.equals(confirmacontra)) {
            res = "Las contraseñas no coinciden.";
            flash.addFlashAttribute("res", res);
            return "redirect:/registrarse/";
        }

        if (contra.length() < 8) {
            res = "La contraseña debe tener al menos 8 caracteres.";
            flash.addFlashAttribute("res", res);
            return "redirect:/registrarse/";
        }

        res = "Puede continuar ingresando sus datos personales.";
        flash.addFlashAttribute("res", res);
        return "redirect:/registrarse/";

    }

}
