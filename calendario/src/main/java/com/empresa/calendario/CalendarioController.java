package com.empresa.calendario;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CalendarioController {

    @GetMapping("/")
    public String inicio() {
        return "API funcionando";
    }

}