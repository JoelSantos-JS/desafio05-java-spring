package com.br.joel.desafio05.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.joel.desafio05.model.Transferencia;
import com.br.joel.desafio05.services.TransferenciaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TransferenciaImpl {


        @Autowired
        private TransferenciaService transferenciaService;






        public static final LocalDateTime dataTimeConveter(String string) {
            return LocalDateTime.parse(string);
        }




        public List<Transferencia> filtro (String nomeOperador , LocalDateTime inicio, LocalDateTime fim) {
                List<Transferencia> transferencias = transferenciaService.listar();


                if(!nomeOperador.isEmpty()) {
                    transferencias = transferencias.stream().filter(t -> t.getOperador() !=null && t.getOperador().equals(nomeOperador)).collect(Collectors.toList());
                    
                }



                if(inicio !=null && fim !=null) {
                    transferencias = transferencias.stream().filter(t -> t.getOperationDate().equals(inicio) || t.getOperationDate().equals(fim)).collect(Collectors.toList());




                }


                return transferencias;


            }
        
    
}
