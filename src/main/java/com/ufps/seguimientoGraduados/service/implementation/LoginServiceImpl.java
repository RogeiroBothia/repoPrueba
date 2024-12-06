package com.ufps.seguimientoGraduados.service.implementation;

import com.ufps.seguimientoGraduados.persistence.repository.UserRepository;
import com.ufps.seguimientoGraduados.service.interfaces.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

}
