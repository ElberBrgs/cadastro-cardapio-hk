package com.example.cadastro_cardapio_hk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {

    @GetMapping
    public String welcome() {
        return "Use /pratos para acessar o gerenciamento de pratos.";
    }
}