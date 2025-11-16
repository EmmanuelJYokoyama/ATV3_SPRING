package com.autobots.automanager.dto;

import java.util.Date;
import java.util.Set;

import lombok.Data;

@Data
public class EmpresaDTO {
    private Long id;
    private String razaoSocial;
    private String nomeFantasia;
    private Date cadastro;
    private EnderecoDTO endereco;
    private Set<TelefoneDTO> telefones;
    private Set<Long> usuarioIds;
    private Set<Long> mercadoriaIds;
    private Set<Long> servicoIds;
    private Set<Long> vendaIds;
}
