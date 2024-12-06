package com.ufps.seguimientoGraduados.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="beneficio")
public class Beneficio {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long beneficioId;

    private String titulo;
    private String descripcion;
    private String imagen;
    private String masInfo;
}
