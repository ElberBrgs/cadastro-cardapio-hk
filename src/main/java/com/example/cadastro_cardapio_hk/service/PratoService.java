package com.example.cadastro_cardapio_hk.service;

import com.example.cadastro_cardapio_hk.exception.NomePratoJaExistenteException;
import com.example.cadastro_cardapio_hk.model.Prato;
import com.example.cadastro_cardapio_hk.repository.PratoRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class PratoService {
    private PratoRepository pratoRepository;

    public PratoService(PratoRepository pratoRepository) {
        this.pratoRepository = pratoRepository;
    }

    public List <Prato> listarTodos() {
        return pratoRepository.findAll();
    }

    public Prato salvar(@Valid Prato prato) {
        if (pratoRepository.findByNomeDoPrato(prato.getNomeDoPrato()).isPresent()) {
            throw new NomePratoJaExistenteException("Prato já cadastrado.");
        }
        return pratoRepository.save(prato);
    }
}
