package com.br.joel.desafio05.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "conta_bancaria")
public class ContaBancaria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;
    private String nome;
    
}
