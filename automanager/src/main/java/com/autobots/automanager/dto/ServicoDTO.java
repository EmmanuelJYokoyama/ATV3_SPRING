package com.autobots.automanager.dto;

import lombok.Data;

@Data
public class ServicoDTO {
    private Long id;
    private String nome;
    private double valor;
    private String descricao;
    private Boolean original;
}
