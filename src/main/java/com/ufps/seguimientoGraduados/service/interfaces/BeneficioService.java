package com.ufps.seguimientoGraduados.service.interfaces;

import com.ufps.seguimientoGraduados.persistence.entity.Beneficio;
import com.ufps.seguimientoGraduados.presentation.dto.BeneficioCreateDTO;

public interface BeneficioService{
    Beneficio saveBeneficio(Beneficio clientBeneficio);

    Beneficio mappearDTO(BeneficioCreateDTO clientBeneficioDTO);

    BeneficioCreateDTO mappearEntity(Beneficio clientBeneficio);

    BeneficioCreateDTO findBeneficioId(Long beneficioId);

    BeneficioCreateDTO updateBeneficio(Long beneficioId, BeneficioCreateDTO clientBeneficio);

    void deleteBeneficioById(Long id);
}
