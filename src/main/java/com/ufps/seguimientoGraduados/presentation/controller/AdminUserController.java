package com.ufps.seguimientoGraduados.presentation.controller;

import com.ufps.seguimientoGraduados.presentation.dto.UserAppDTO;
import com.ufps.seguimientoGraduados.presentation.dto.UserBasicDTO;
import com.ufps.seguimientoGraduados.service.interfaces.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/user")
public class AdminUserController {

    @Autowired
    UserAppService userAppService;

    @GetMapping
    public List<UserAppDTO> verUsers (){
        return userAppService.userNoAprobados();
    } //funciona

    @PutMapping("/{userId}/activate") //funciona
    public ResponseEntity<String> activarUser(@PathVariable Long userId){
        userAppService.activeUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body("1");
    }

    @PutMapping("/{userId}/addCode") //funciona
    public ResponseEntity<String> agregarCodigoUser(@PathVariable Long userId, @RequestBody UserBasicDTO codigoUser){
        userAppService.updateCodigo(userId,codigoUser);
        return ResponseEntity.status(HttpStatus.OK).body("1");
    }

    @DeleteMapping("/{userId}") //funciona
    public ResponseEntity<String> deleteUser(@PathVariable Long userId){
        userAppService.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("1");
    }
}
