package com.autobots.automanager.dto;

import java.util.Date;
import java.util.Set;

import lombok.Data;

@Data
public class VendaDTO {
    private Long id;
    private Date cadastro;
    private String identificacao;
    private Long clienteId;     // Usuario
    private Long funcionarioId; // Usuario
    private Set<Long> mercadoriaIds;
    private Set<Long> servicoIds;
    private Long veiculoId;
}
