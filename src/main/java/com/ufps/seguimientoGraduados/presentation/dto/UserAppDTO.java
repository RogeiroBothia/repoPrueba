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
public class UserAppDTO {
    private Long userId;
    @NotEmpty(message = "El nombre es obligatorio")
    private String nombre;
    @NotEmpty(message = "La cedula es obligatoria")
    private String cedula;
    private String codigoPrograma;
}
