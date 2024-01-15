package com.makaia.modRegistro.microservicioRegistro.Services;

import com.makaia.modRegistro.microservicioRegistro.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AspiranteService {

    AspiranteRepository aspiranteRepository;
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
    public AspiranteService(AspiranteRepository aspiranteRepository, Bootcamp_InfoRepository bootcampInfoRepository, DiscapacidadRepository discapacidadRepository, EntrenamientoRepository entrenamientoRepository, EstratoRepository estratoRepository, GeneroRepository generoRepository, GrupoEtnicoRepository grupoEtnicoRepository, Nivel_EducacionRepository nivelEducacionRepository, OcupacionRepository ocupacionRepository, PoblacionIdentificacionRepository poblacionIdentificacionRepository, Salario_ActualRepository salarioActualRepository, Tipo_DocRepository tipoDocRepository) {
        this.aspiranteRepository = aspiranteRepository;
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
}
