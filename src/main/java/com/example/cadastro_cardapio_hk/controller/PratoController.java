package com.example.cadastro_cardapio_hk.controller;

import com.example.cadastro_cardapio_hk.model.Prato;
import com.example.cadastro_cardapio_hk.service.PratoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pratos")
public class PratoController {
    private PratoService pratoService;

    public PratoController(PratoService pratoService) {
        this.pratoService = pratoService;
    }

    @GetMapping
    public List<Prato> listarTodos() {
        return pratoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody Prato prato) {
        pratoService.salvar(prato);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Prato cadastrado com sucesso."));
    }
}
