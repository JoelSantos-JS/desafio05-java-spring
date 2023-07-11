package com.br.joel.desafio05.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.joel.desafio05.model.Transferencia;
import com.br.joel.desafio05.services.TransferenciaService;

@RestController
@RequestMapping(value = "/transferencia")
public class TransferenciaController {



    @Autowired
    private TransferenciaService transferenciaService;


    @Autowired
    private  TransferenciaImpl transferenciaImpl;




    @GetMapping
    public ResponseEntity<List<Transferencia>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(transferenciaService.listar());
    }




    @GetMapping(value = "/")
    public ResponseEntity<List<Transferencia>> buscar(@RequestParam(value = "nomeOperador", required = false) String nomeOperador , @RequestParam(value = "inicio", required = false) String  inicio , @RequestParam(value = "fim", required = false) String fim) {

        List<Transferencia> transferencias = transferenciaImpl.filtro(nomeOperador, TransferenciaImpl.dataTimeConveter(inicio), TransferenciaImpl.dataTimeConveter(fim));

        return ResponseEntity.status(HttpStatus.OK).body(transferencias);
    }


    
}
