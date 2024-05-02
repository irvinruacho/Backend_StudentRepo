package com.school.demo.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        // Devuelve el nombre de la plantilla (vista) para la página de inicio de sesión
        return "login";
    }
}