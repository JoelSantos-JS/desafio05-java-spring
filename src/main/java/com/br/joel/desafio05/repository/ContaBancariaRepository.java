package com.br.joel.desafio05.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.joel.desafio05.model.ContaBancaria;

public interface ContaBancariaRepository extends JpaRepository<ContaBancaria,Long> {
    
}
