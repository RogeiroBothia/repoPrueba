package com.ufps.seguimientoGraduados.service.implementation;

import com.ufps.seguimientoGraduados.persistence.entity.Beneficio;
import com.ufps.seguimientoGraduados.persistence.repository.BeneficioRepository;
import com.ufps.seguimientoGraduados.presentation.dto.BeneficioCreateDTO;
import com.ufps.seguimientoGraduados.service.interfaces.BeneficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BeneficioImpl implements BeneficioService {

    @Autowired
    BeneficioRepository beneficioDao;

    @Override
    public Beneficio saveBeneficio(Beneficio clientBeneficio){
        return beneficioDao.save(clientBeneficio);
    }

    @Override
    public Beneficio mappearDTO(BeneficioCreateDTO clientBeneficioDTO){
        Beneficio newBeneficio = new Beneficio();
        newBeneficio.setTitulo(clientBeneficioDTO.getTitulo());
        newBeneficio.setDescripcion(clientBeneficioDTO.getDescripcion());
        newBeneficio.setImagen(clientBeneficioDTO.getImagen());
        newBeneficio.setMasInfo(clientBeneficioDTO.getMasInfo());
        return newBeneficio;
    }

    @Override
    public BeneficioCreateDTO mappearEntity(Beneficio clientBeneficio){
        BeneficioCreateDTO newBeneficio = new BeneficioCreateDTO();
        newBeneficio.setTitulo(clientBeneficio.getTitulo());
        newBeneficio.setDescripcion(clientBeneficio.getDescripcion());
        newBeneficio.setImagen(clientBeneficio.getImagen());
        newBeneficio.setMasInfo(clientBeneficio.getMasInfo());
        return newBeneficio;
    }

    @Override
    public BeneficioCreateDTO findBeneficioId(Long beneficioId){
        Optional<Beneficio> beneficio = beneficioDao.findById(beneficioId);
        BeneficioCreateDTO beneficioDTO = mappearEntity(beneficio.orElse(null));
        return beneficioDTO;
    }

    @Override
    public BeneficioCreateDTO updateBeneficio(Long beneficioId, BeneficioCreateDTO clientBeneficio){
        Beneficio updateBeneficio = mappearDTO(clientBeneficio);
        updateBeneficio.setBeneficioId(beneficioId);
        saveBeneficio(updateBeneficio);
        return clientBeneficio;
    }
    @Override
    public void deleteBeneficioById(Long id){
        beneficioDao.deleteById(id);
    }
}
