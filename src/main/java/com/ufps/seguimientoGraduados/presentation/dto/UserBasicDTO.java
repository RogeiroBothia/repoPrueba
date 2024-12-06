package com.ufps.seguimientoGraduados.presentation.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicDTO {
    @NotEmpty(message = "El nombre es obligatorio")
    private String nombre;
    @NotEmpty(message = "La Cedula es obligatoria")
    private String cedula;
    private String codigoPrograma;
}
