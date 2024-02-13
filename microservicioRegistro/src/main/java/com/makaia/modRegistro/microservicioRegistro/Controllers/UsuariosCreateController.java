package com.makaia.modRegistro.microservicioRegistro.Controllers;

import com.makaia.modRegistro.microservicioRegistro.Dtos.AspirantesDTO;
import com.makaia.modRegistro.microservicioRegistro.Dtos.UsersDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Services.UserService;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value = "Crear Usuario",notes = "Crea un usuario según el rol en la base de datos" +
            "con los parametros proporcionada por el endpoint", response = Usuario.class)
    @PostMapping
    public Usuario crearUsuario(@RequestBody UsersDTO dto){
        return this.userService.crearUsuario(dto);
    }
}
