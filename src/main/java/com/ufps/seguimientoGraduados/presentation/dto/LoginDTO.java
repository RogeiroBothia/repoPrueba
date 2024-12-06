package com.ufps.seguimientoGraduados.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginDTO {

    @NotBlank(message = "Debe ingresar un correo")
    private String email;

    @NotBlank(message = "Debe ingresar un password")
    private String password;
}
