package com.empresa.calendario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarioController {

    @GetMapping("/")
    public String inicio() {
        return "API funcionando";
    }

    @GetMapping("/calendario")
    public String obtenerCalendario() {
        return "API de calendarios laborales funcionando";
    }
}