package com.unifil.aula_web_exemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/testes")
public class TesteController {

    @GetMapping
    public String testEndpoint() {
        return "Teste bem-sucedido!";
    }
}
