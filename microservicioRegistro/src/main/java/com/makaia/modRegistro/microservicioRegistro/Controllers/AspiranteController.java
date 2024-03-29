package com.makaia.modRegistro.microservicioRegistro.Controllers;

import com.makaia.modRegistro.microservicioRegistro.Dtos.AspirantesDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Aspirante;
import com.makaia.modRegistro.microservicioRegistro.Services.AspiranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/aspirante")
@Validated
public class AspiranteController {
    @Autowired
    AspiranteService service;
    @GetMapping
    public String prueba(){
        return "Conexion ok";
    }
    @PostMapping
    public Aspirante crearAspirante(@RequestBody AspirantesDTO dto) {
        return this.service.crearAspirante(dto);
    }
    @GetMapping("listAspirant")
    public List<Aspirante> listaAspirante(){
        return service.obtenerTodosLosAspirantes();
    }
    @DeleteMapping("/{id}")
    public void eliminaAspirante(@PathVariable("id") Long id){
        this.service.eliminarAspirantePorId(id);
    }

}


