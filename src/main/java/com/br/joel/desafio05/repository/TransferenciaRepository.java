package com.br.joel.desafio05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.joel.desafio05.model.Transferencia;


@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
    
}
