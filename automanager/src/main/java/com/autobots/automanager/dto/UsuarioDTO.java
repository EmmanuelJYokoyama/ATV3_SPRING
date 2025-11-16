package com.autobots.automanager.dto;

import java.util.Set;

import com.autobots.automanager.enumeracoes.PerfilUsuario;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String nomeSocial;
    private Set<PerfilUsuario> perfis;
    private EnderecoDTO endereco;
    private Set<TelefoneDTO> telefones;
    private Set<DocumentoDTO> documentos;
    private Set<EmailDTO> emails;
    // For associations that are typically large/graph-like, only transfer IDs
    private Set<Long> mercadoriaIds;
    private Set<Long> vendaIds;
    private Set<Long> veiculoIds;
}
