package com.ufps.seguimientoGraduados.presentation.controller;

import com.ufps.seguimientoGraduados.presentation.dto.UserBasicDTO;
import com.ufps.seguimientoGraduados.service.interfaces.UserAppService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    //@Autowired
    //private AuthenticationSercie;
    @Autowired
    private UserAppService userAppService;

    //Usuario recien registrado:
    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody @Valid UserBasicDTO newUser){
         userAppService.createUser(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body("1");
    }

    /*
    @PostMapping("/registro")
    public UserApp registrarUsuario(@RequestBody UserApp userApp) {
        userApp.setEnabled(false); // Usuario deshabilitado por defecto
        return userService.registrarUsuario(userApp);
    }

    @PostMapping("/completarRegistro/{correo}")
    public UserApp completarRegistro(@PathVariable String correo, @RequestBody UserApp userDetails) {

        return userService.registrarUsuario(user); }


    @GetMapping
    public String inicio(){
        return "logica del uset temp";
    }

    @GetMapping("/profile")
    public String profile(){
        return "logica con seguridad";
    }

/*
    @RestController
    @RequestMapping("/api/usuarios")
    public class UsuarioController {
        @Autowired
        private UsuarioService usuarioService;

        @PostMapping("/registro")
        public Usuario registrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
            Usuario usuario = new Usuario();
            usuario.setNombre(usuarioDTO.getNombre());
            usuario.setCc(usuarioDTO.getCc());
            usuario.setCorreo(usuarioDTO.getCorreo());
            usuario.setCodigo(usuarioDTO.getCodigo());
            return usuarioService.registrarUsuario(usuario);
        }

        @PostMapping("/aprobar/{id}")
        public Usuario aprobarUsuario(@PathVariable Long id) {
            return usuarioService.aprobarUsuario(id);
        }

        @DeleteMapping("/{id}")
        public void eliminarUsuario(@PathVariable Long id) {
            usuarioService.eliminarUsuario(id);
        }

        @GetMapping("/{correo}")
        public Usuario obtenerUsuario(@PathVariable String correo) {
            return usuarioService.obtenerUsuario(correo);
        }
    }*/

}
