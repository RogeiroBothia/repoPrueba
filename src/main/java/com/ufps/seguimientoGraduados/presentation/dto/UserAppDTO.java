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

    private String photoUrl;
    private boolean isEmpresario;
    private String residencia;
    //Campos Solicitados por Spring Security
    @Column(unique = true)
    private String username;//va a ser el correo

    public UserAppDTO(Long userId, String nombre, String cedula, String codigoPrograma){
        this.setUserId(userId);
        this.setNombre(nombre);
        this.setCedula(cedula);
        this.setCodigoPrograma(codigoPrograma);
    }
}
