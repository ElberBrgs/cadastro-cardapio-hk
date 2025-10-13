package com.example.cadastro_cardapio_hk.repository;

import com.example.cadastro_cardapio_hk.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PratoRepository extends JpaRepository<Prato, Long> {
    Optional<Prato> findByNomeDoPrato(String nomeDoPrato);
}
