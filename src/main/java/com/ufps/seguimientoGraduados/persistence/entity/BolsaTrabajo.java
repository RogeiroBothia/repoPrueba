package com.ufps.seguimientoGraduados.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="bolsa_trabajo")
public class BolsaTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bolsaTrabajoId;

    private LocalDate ofertaInicio;
    private LocalDate ofertaFin;
    private boolean isAuthorized;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="ofertaId")
    private Oferta oferta;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserApp users;
}
