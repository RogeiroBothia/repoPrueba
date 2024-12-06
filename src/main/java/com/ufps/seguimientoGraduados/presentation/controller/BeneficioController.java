package com.ufps.seguimientoGraduados.presentation.controller;

import com.ufps.seguimientoGraduados.presentation.dto.BeneficioCreateDTO;
import com.ufps.seguimientoGraduados.service.interfaces.BeneficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/beneficio")
public class BeneficioController {

    @Autowired
    BeneficioService beneficioService;

    @PostMapping
    public ResponseEntity<?> saveBeneficio(@RequestBody BeneficioCreateDTO clientBeneficio){
        System.out.println(clientBeneficio.toString());
        if(clientBeneficio==null)
            return ResponseEntity.badRequest().build();
        beneficioService.saveBeneficio(beneficioService.mappearDTO(clientBeneficio));
        return new ResponseEntity<>(clientBeneficio, HttpStatus.CREATED);
    }



    @GetMapping("/{beneficioId}")
    public ResponseEntity<?> findBeneficioById(@PathVariable Long beneficioId){
        return new ResponseEntity<>(beneficioService.findBeneficioId(beneficioId),HttpStatus.OK);
    }

    @PutMapping("/{beneficioId}")
    public ResponseEntity<?> updateBeneficio(@PathVariable Long beneficioId, @RequestBody BeneficioCreateDTO clientBeneficio){
        return new ResponseEntity<>(beneficioService.updateBeneficio(beneficioId,clientBeneficio),HttpStatus.OK);
    }

    @DeleteMapping("/{beneficioId}")
    public ResponseEntity<?> deleteBeneficio(@PathVariable Long beneficioId){
        beneficioService.deleteBeneficioById(beneficioId);
        return ResponseEntity.noContent().build();
    }
}
