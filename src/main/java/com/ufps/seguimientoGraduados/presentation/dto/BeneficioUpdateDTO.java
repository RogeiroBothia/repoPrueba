package com.ufps.seguimientoGraduados.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeneficioUpdateDTO {
    private Long beneficioId;
    private String titulo;
    private String descripcion;
    private String imagen;
    private String masInfo;
}