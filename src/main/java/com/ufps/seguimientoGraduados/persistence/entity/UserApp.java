package com.ufps.seguimientoGraduados.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserApp  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    //Campos Basicos:
    private String nombre;
    private String cedula;
    private String codigoPrograma;
    //Campos Adicionales
    private String rol;
    private String photoUrl;
    private boolean isEmpresario;
    private String residencia;
    private boolean isAdmin;
    private boolean isUser;
    private boolean isNoUser;
    //Campos Solicitados por Spring Security
    @Column(unique = true)
    private String username;//va a ser el correo
    private String password;


}
