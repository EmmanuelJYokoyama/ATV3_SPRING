package com.autobots.automanager.dto;

import java.util.Date;

import com.autobots.automanager.enumeracoes.TipoDocumento;

import lombok.Data;

@Data
public class DocumentoDTO {
    private Long id;
    private TipoDocumento tipo;
    private Date dataEmissao;
    private String numero;
}
