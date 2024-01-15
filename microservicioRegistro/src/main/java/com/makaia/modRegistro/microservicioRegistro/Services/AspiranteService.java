package com.makaia.modRegistro.microservicioRegistro.Services;

import com.makaia.modRegistro.microservicioRegistro.Dtos.AspirantesDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Aspirante;
import com.makaia.modRegistro.microservicioRegistro.Entities.Bootcamp_Info;
import org.springframework.stereotype.Service;
import com.makaia.modRegistro.microservicioRegistro.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AspiranteService {

    AspiranteRepository repository;
    Bootcamp_InfoRepository bootcampInfoRepository;
    DiscapacidadRepository discapacidadRepository;
    EntrenamientoRepository entrenamientoRepository;
    EstratoRepository estratoRepository;
    GeneroRepository generoRepository;
    GrupoEtnicoRepository grupoEtnicoRepository;
    Nivel_EducacionRepository nivelEducacionRepository;
    OcupacionRepository ocupacionRepository;
    PoblacionIdentificacionRepository poblacionIdentificacionRepository;
    Salario_ActualRepository salarioActualRepository;
    Tipo_DocRepository tipoDocRepository;
@Autowired
    public AspiranteService(AspiranteRepository repository, Bootcamp_InfoRepository bootcampInfoRepository, DiscapacidadRepository discapacidadRepository, EntrenamientoRepository entrenamientoRepository, EstratoRepository estratoRepository, GeneroRepository generoRepository, GrupoEtnicoRepository grupoEtnicoRepository, Nivel_EducacionRepository nivelEducacionRepository, OcupacionRepository ocupacionRepository, PoblacionIdentificacionRepository poblacionIdentificacionRepository, Salario_ActualRepository salarioActualRepository, Tipo_DocRepository tipoDocRepository) {
        this.repository = repository;
        this.bootcampInfoRepository = bootcampInfoRepository;
        this.discapacidadRepository = discapacidadRepository;
        this.entrenamientoRepository = entrenamientoRepository;
        this.estratoRepository = estratoRepository;
        this.generoRepository = generoRepository;
        this.grupoEtnicoRepository = grupoEtnicoRepository;
        this.nivelEducacionRepository = nivelEducacionRepository;
        this.ocupacionRepository = ocupacionRepository;
        this.poblacionIdentificacionRepository = poblacionIdentificacionRepository;
        this.salarioActualRepository = salarioActualRepository;
        this.tipoDocRepository = tipoDocRepository;
    }



public Aspirante crearAspirante(AspirantesDTO dto){
   Optional<Bootcamp_Info> botcampOptional = bootcampInfoRepository.findById(dto.getBootcamp_info_id());
   Bootcamp_Info bootcampInfoResult = new Bootcamp_Info(botcampOptional.get().getDescripcion());

}
