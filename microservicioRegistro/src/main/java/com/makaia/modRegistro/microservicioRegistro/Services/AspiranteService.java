package com.makaia.modRegistro.microservicioRegistro.Services;

import com.makaia.modRegistro.microservicioRegistro.Dtos.AspirantesDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.*;
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
    public Aspirante crearAspirante(AspirantesDTO dto) {
        Optional<Bootcamp_Info> botcampOptional = bootcampInfoRepository.findById(dto.getBootcamp_info_id());
       if(botcampOptional.isPresent()) {
           Bootcamp_Info bootcampInfoResult = botcampOptional.get();
       }
        Optional<Discapacidad> discapacidadOptional = discapacidadRepository.findById(dto.getDiscapacidad_id());
        Discapacidad discapacidadResult = new Discapacidad(discapacidadOptional.get().getId(),discapacidadOptional.get().getDescripcion());
        Optional<Entrenamiento> entrenamientoOptional = entrenamientoRepository.findById(dto.getEntrenamiento());
        Entrenamiento entrenamientoResult = new Entrenamiento(entrenamientoOptional.get().getId(),entrenamientoOptional.get().getFormacion());
        Optional<Estrato> estratoOptional = estratoRepository.findById(dto.getEstrato());
        Estrato estratoResult = new Estrato(estratoOptional.get().getId(),estratoOptional.get().getNumEstrato());
        Optional<Genero> generoOptional = generoRepository.findById(dto.getGenero());
        Genero generoResult = new Genero(generoOptional.get().getId(),generoOptional.get().getDescripcion());
        Optional<GrupoEtnico> grupoEtnicoOptional = grupoEtnicoRepository.findById(dto.getGrupo_etnico_id());
        GrupoEtnico grupoEtnicoResult = new GrupoEtnico(grupoEtnicoOptional.get().getId(),grupoEtnicoOptional.get().getDescripcion());
        Optional<Nivel_Educacion> nivelEducacionOptional = nivelEducacionRepository.findById(dto.getNivel_educacion_id());
        Nivel_Educacion nivelEducacionResult = new Nivel_Educacion(nivelEducacionOptional.get().getId(),nivelEducacionOptional.get().getDescripcion());
        Optional<Ocupacion> ocupacionOptional = ocupacionRepository.findById(dto.getOcupacion_id());
        Ocupacion ocupacionResult = new Ocupacion(ocupacionOptional.get().getId(),ocupacionOptional.get().getDescripcion());
        Optional<PoblacionIdentificacion> poblacionIdentificacion = poblacionIdentificacionRepository.findById(dto.getPoblacion_id_id());
        PoblacionIdentificacion poblacionIdentificacionResult = new PoblacionIdentificacion(poblacionIdentificacion.get().getId(),poblacionIdentificacion.get().getDescripcion());
        Optional<Salario_Actual> salarioActualOptional = salarioActualRepository.findById(dto.getSalario_actual_id());
        Salario_Actual salarioActualResult = new Salario_Actual(salarioActualOptional.get().getId(),salarioActualOptional.get().getRango_Salarial());
        Optional <Tipo_Doc> tipo_docOptional = tipoDocRepository.findById(dto.getTipo_doc());
        Tipo_Doc tipodocResult = new Tipo_Doc(tipo_docOptional.get().getId(),tipo_docOptional.get().getDescripcion());
        Aspirante newAspirante = new Aspirante(
                dto.getNombre(),
                dto.getNumero_documento(),
                dto.getEdad(),
                dto.getFecha_nacimiento(),
                dto.getCelular(),
                dto.getEmail(),
                dto.getNacionalidad(),
                dto.getDepartamento(),
                dto.getCiudad(),
                dto.getDireccion(),
                dto.getUltimo_titulo(),
                dto.getOcupacion_si(),
                dto.getTiempo_libre(),
                dto.getPersona_emergencia(),
                dto.getContacto_emergencia(),
                dto.getEmail_emergencia(),
                dto.getOrganizacion(),
                tipodocResult,
                generoResult,
                grupoEtnicoResult,
                discapacidadResult,
                poblacionIdentificacionResult,
                nivelEducacionResult,
                ocupacionResult,
                salarioActualResult,
                bootcampInfoResult,
                entrenamientoResult,
                estratoResult
                );
        newAspirante = this.repository.save(newAspirante);
        return newAspirante;
    }
}
