package com.ufps.seguimientoGraduados.service.implementation;

import com.ufps.seguimientoGraduados.persistence.entity.UserApp;
import com.ufps.seguimientoGraduados.persistence.repository.UserRepository;
import com.ufps.seguimientoGraduados.presentation.dto.UserAppDTO;
import com.ufps.seguimientoGraduados.presentation.dto.UserBasicDTO;
import com.ufps.seguimientoGraduados.service.interfaces.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserAppServiceImpl implements UserAppService {

    @Autowired
    UserRepository userRepository;

    //********************************* Metodos para el admin **************************************
    @Override
    public List<UserAppDTO> userNoAprobados(){
        userRepository.findByIsNoUserTrue();
        List<UserApp> usersUnabled = userRepository.findByIsNoUserTrue();
        return usersUnabled.stream()
                .map(user -> new UserAppDTO(
                        user.getUserId(),
                        user.getNombre(),
                        user.getCedula(),
                        user.getCodigoPrograma()
                )) .collect(Collectors.toList());
    }

    @Override
    public void activeUser(Long userId){
        Optional<UserApp> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            UserApp activatedUser = optionalUser.get(); //desempaquetar el optional
            activatedUser.setUser(true);
            activatedUser.setNoUser(false);
            userRepository.save(activatedUser); // Guarda los cambios en la base de datos
        } else {
            throw new RuntimeException("Usuario no encontrado");
        }
    }

    @Override
    public void deleteUser(Long userId){
        Optional<UserApp> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            userRepository.deleteById(userId);
        } else {
            throw new RuntimeException("Usuario no encontrado");
        }
    }

    @Override
    public void updateCodigo(Long userId, UserBasicDTO codigoUser){
        Optional<UserApp> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            UserApp userBD = optionalUser.get(); //desempaquetar el optional
            userBD.setCodigoPrograma(codigoUser.getCodigoPrograma());
            userRepository.save(userBD); // Guarda los cambios en la base de datos
        } else {
            throw new RuntimeException("Usuario no encontrado");
        }
    }

    //********************************* Metodos para todos los Users **************************************

    @Override
    public void createUser(UserBasicDTO userDTO){ //funciona
        UserApp newUser = new UserApp();
        newUser.setNombre(userDTO.getNombre());
        newUser.setCedula(userDTO.getCedula());
        newUser.setCodigoPrograma(userDTO.getCodigoPrograma());
        newUser.setUser(false);
        newUser.setAdmin(false);
        newUser.setNoUser(true);
        userRepository.save(newUser);
    }


}
