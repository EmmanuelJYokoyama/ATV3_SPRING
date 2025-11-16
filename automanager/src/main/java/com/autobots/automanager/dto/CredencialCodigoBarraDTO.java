package com.autobots.automanager.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CredencialCodigoBarraDTO extends CredencialDTO {
    private double codigo;
}
