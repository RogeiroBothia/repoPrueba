package com.ufps.seguimientoGraduados.persistence.repository;

import com.ufps.seguimientoGraduados.persistence.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<Pregunta,Long> {
}
