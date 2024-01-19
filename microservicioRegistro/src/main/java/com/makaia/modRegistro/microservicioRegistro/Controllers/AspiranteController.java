package com.makaia.modRegistro.microservicioRegistro.Controllers;

import com.makaia.modRegistro.microservicioRegistro.Dtos.AspirantesDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Aspirante;
import com.makaia.modRegistro.microservicioRegistro.Services.AspiranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/aspirante")
public class AspiranteController {
    @Autowired
    AspiranteService service;
    @GetMapping
    public String prueba(){
        return "Conexion ok";
    }
    @PostMapping
    public Aspirante crearAspirante(@RequestBody AspirantesDTO dto){
        return this.service.crearAspirante(dto);
    }
}
