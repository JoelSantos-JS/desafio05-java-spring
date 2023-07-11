package com.br.joel.desafio05.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.joel.desafio05.model.Transferencia;
import com.br.joel.desafio05.repository.TransferenciaRepository;

@Service
public class TransferenciaService implements TransferenciaServiceImpl {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @Override
    public List<Transferencia> listar() {
        // TODO Auto-generated method stub
      

        return transferenciaRepository.findAll();
    }

    @Override
    public List<Transferencia> idConta(Long conta) {
        // TODO Auto-generated method stub
        return transferenciaRepository.findByConta(conta);
    }

    @Override
    public List<Transferencia> nomeOperador(String operador) {
        // TODO Auto-generated method stub
        return transferenciaRepository.findByOperador(operador);
    }

    @Override
    public List<Transferencia> periodo(LocalDateTime inicio, LocalDateTime fim) {
        // TODO Auto-generated method stub
       return transferenciaRepository.findByDateTime(inicio, fim);
    }

    @Override
    public List<Transferencia> nomeOperadorAndPeriodo(String operador, LocalDateTime inicio, LocalDateTime fim) {
        // TODO Auto-generated method stub
    
        return transferenciaRepository.findByOperadorDateTime(operador, inicio, fim);
    }
    
}
