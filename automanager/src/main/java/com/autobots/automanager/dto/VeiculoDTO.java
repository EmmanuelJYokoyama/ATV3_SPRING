package com.autobots.automanager.dto;

import java.util.Set;

import com.autobots.automanager.enumeracoes.TipoVeiculo;

import lombok.Data;

@Data
public class VeiculoDTO {
    private Long id;
    private TipoVeiculo tipo;
    private String modelo;
    private String placa;
    private Long proprietarioId; // Usuario
    private Set<Long> vendaIds;
}
