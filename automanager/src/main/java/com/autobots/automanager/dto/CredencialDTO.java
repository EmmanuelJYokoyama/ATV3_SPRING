package com.autobots.automanager.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CredencialDTO {
    private Long id;
    private Date criacao;
    private Date ultimoAcesso;
    private boolean inativo;
}
