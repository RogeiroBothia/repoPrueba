package com.ufps.seguimientoGraduados.presentation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDTO {

    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
}
