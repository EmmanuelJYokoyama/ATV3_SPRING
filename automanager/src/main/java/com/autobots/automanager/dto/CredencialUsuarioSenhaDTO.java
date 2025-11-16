package com.autobots.automanager.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CredencialUsuarioSenhaDTO extends CredencialDTO {
    private String nomeUsuario;
    private String senha;
}
