package com.ufps.seguimientoGraduados.persistence.repository;

import com.ufps.seguimientoGraduados.persistence.entity.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BeneficioRepository extends JpaRepository<Beneficio,Long>, CrudRepository<Beneficio,Long> {
}
