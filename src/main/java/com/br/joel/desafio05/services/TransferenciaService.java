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


    // Busca todas as transferencias realizadas  que estejam listadas na base de dados

    @Override
    public List<Transferencia> listar() {

        return transferenciaRepository.findAll();
    }


    // Busca todas as transferencias realizados por uma conta.

    @Override
    public List<Transferencia> idConta(Long conta) {
        
        return transferenciaRepository.findByConta(conta);
    }


    // Busca todas as transferencias realizados por um operador

    @Override
    public List<Transferencia> nomeOperador(String operador) {
        if(operador.equals("null") ) {
            return null;
        }
        
        return transferenciaRepository.findByOperador(operador);
    }

    //Busca todas as transferencias realizados por um periodo de tempo

    @Override
    public List<Transferencia> periodo(LocalDateTime inicio, LocalDateTime fim) {
        
       return transferenciaRepository.findByDateTime(inicio, fim);
    }

    //Busca todas as transferencias realizados por um operador e um periodo de tempo

    @Override
    public List<Transferencia> nomeOperadorAndPeriodo(String operador, LocalDateTime inicio, LocalDateTime fim) {
        
    
        return transferenciaRepository.findByOperadorDateTime(operador, inicio, fim);
    }
    
}
