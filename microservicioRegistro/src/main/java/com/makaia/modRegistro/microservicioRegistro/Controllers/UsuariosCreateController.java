package com.makaia.modRegistro.microservicioRegistro.Controllers;

import com.makaia.modRegistro.microservicioRegistro.Dtos.AspirantesDTO;
import com.makaia.modRegistro.microservicioRegistro.Dtos.UsersDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api1/v1/user")
public class UsuariosCreateController {
    @Autowired
    private UserService userService;
    @GetMapping
    public String prueba(){
        return "Conexion ok";
    }
    @PostMapping
    public Usuario crearUsuario(@RequestBody UsersDTO dto){
        return this.userService.crearUsuario(dto);
    }
}
