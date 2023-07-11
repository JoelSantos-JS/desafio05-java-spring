package com.br.joel.desafio05.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.joel.desafio05.model.Transferencia;


@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
      List<Transferencia> findByConta(Long conta);
    List<Transferencia> findByOperador(String operador);

    @Query(value = "SELECT * FROM transferencia " +
            "WHERE data_transferencia BETWEEN :inicio AND :fim",
            nativeQuery = true)
    List<Transferencia> findByDateTime(LocalDateTime inicio, LocalDateTime fim);

    @Query(value = "SELECT * FROM transferencia " +
            "WHERE nome_operador_transacao = :operador AND data_transferencia BETWEEN :inicio AND :fim",
            nativeQuery = true)
    List<Transferencia> findByOperadorDateTime(String operador, LocalDateTime inicio, LocalDateTime fim);
}
