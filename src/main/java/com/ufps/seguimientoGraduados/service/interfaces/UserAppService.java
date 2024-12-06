package com.ufps.seguimientoGraduados.service.interfaces;

import com.ufps.seguimientoGraduados.presentation.dto.UserAppDTO;
import com.ufps.seguimientoGraduados.presentation.dto.UserBasicDTO;

import java.util.List;

public interface UserAppService {
    void activeUser(Long userId);

    void deleteUser(Long userId);

    void updateCodigo(Long userId, UserBasicDTO codigoUser);

    void createUser (UserBasicDTO userDTO);

    List<UserAppDTO> userNoAprobados();
}
