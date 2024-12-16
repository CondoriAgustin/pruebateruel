package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // Mapea la URL de inicio para servir la página estática index.html
    @GetMapping("/")
    public String home() {
        return "index";  // Thymeleaf buscaría un archivo en src/main/resources/templates/index.html
    }
}
