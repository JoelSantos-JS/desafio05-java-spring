package com.br.joel.desafio05.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "transferencias")
@AllArgsConstructor
@NoArgsConstructor
public class Transferencia {

        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_transferencia")
    private LocalDateTime operationDate;
    private Double valor;
    private String tipo;
    @Column(name = "nome_operador_transacao")
    private String operador;
    @Column(name = "conta_id")
    private Integer conta;

    
}
