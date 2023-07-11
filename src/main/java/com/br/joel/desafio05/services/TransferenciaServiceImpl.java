package com.br.joel.desafio05.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.joel.desafio05.model.Transferencia;

@Service
public interface TransferenciaServiceImpl {

     List<Transferencia> listar();
    List<Transferencia> idConta(Long conta);
    List<Transferencia> nomeOperador(String operador);
    List<Transferencia> periodo(LocalDateTime inicio, LocalDateTime fim);
    List<Transferencia> nomeOperadorAndPeriodo(String operador, LocalDateTime inicio, LocalDateTime fim);
    
}
