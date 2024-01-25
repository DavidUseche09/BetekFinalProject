package com.makaia.modRegistro.microservicioRegistro;

import com.makaia.modRegistro.microservicioRegistro.Dtos.AspirantesDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.*;
import com.makaia.modRegistro.microservicioRegistro.Repositories.*;
import com.makaia.modRegistro.microservicioRegistro.Services.AspiranteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AspiranteServiceTest {

    @Mock
    private AspiranteRepository aspiranteRepository;

    @Mock
    private Bootcamp_InfoRepository bootcampInfoRepository;

    @Mock
    private DiscapacidadRepository discapacidadRepository;

    @Mock
    private EntrenamientoRepository entrenamientoRepository;

    @Mock
    private EstratoRepository estratoRepository;

    @Mock
    private GeneroRepository generoRepository;

    @Mock
    private GrupoEtnicoRepository grupoEtnicoRepository;

    @Mock
    private Nivel_EducacionRepository nivelEducacionRepository;

    @Mock
    private OcupacionRepository ocupacionRepository;

    @Mock
    private PoblacionIdentificacionRepository poblacionIdentificacionRepository;

    @Mock
    private Salario_ActualRepository salarioActualRepository;

    @Mock
    private Tipo_DocRepository tipoDocRepository;

    @InjectMocks
    private AspiranteService aspiranteService;

    // Pasando LocalDate a Date
    String fechaString = "1997-01-15";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate fechaNacimiento = LocalDate.parse(fechaString, formatter);
    Date date = convertirADate(fechaNacimiento);
    private static Date convertirADate(LocalDate localDate) {
    ZoneId zonaHoraria = ZoneId.systemDefault();
    return Date.from(localDate.atStartOfDay(zonaHoraria).toInstant());
    }

    @Test
    public void crearAspirante() {
        // Arrange
        AspirantesDTO dto = new AspirantesDTO(
                1L,                      // entrenamiento
                "Juan Pérez",           // nombre
                1L,                      // tipo_doc
                123456789L,              // numero_documento
                1L,                     // genero
                25L,                     // edad
                date,           // fecha_nacimiento
                1234567890L,           // celular
                "juan@example.com",     // email
                "Colombiana",           // nacionalidad
                "Cundinamarca",         // departamento
                "Bogotá",               // ciudad
                "Calle 123",            // direccion
                3L,                      // estrato
                1L,                     // grupo_etnico_id
                2L,                     // discapacidad_id
                1L,                     // poblacion_id_id
                3L,                     // nivel_educacion_id
                4L,                     // ocupacion_id
                "Ingeniero",            // ultimo_titulo
                "Trabajador",           // ocupacion_si
                2L,               // salario_actual_id
                "Tiempo libre",         // tiempo_libre
                "Contacto de emergencia",// persona_emergencia
                987654321L,             // contacto_emergencia
                "emergencia@example.com",// email_emergencia
                1L,                     // bootcamp_info_id
                "Empresa XYZ"           // organizacion);
        );

        Optional<Entrenamiento> entrenamientoOpt = Optional.of(new Entrenamiento(1L, "BackEnd"));
        Mockito.when(entrenamientoRepository.findById(1L)).thenReturn(entrenamientoOpt);
        Optional<Tipo_Doc> tipoDocOpt = Optional.of(new Tipo_Doc(1L, "Cedula Ciudadania"));
        Mockito.when(tipoDocRepository.findById(1L)).thenReturn(tipoDocOpt);
        Optional<Genero> generoOpt = Optional.of(new Genero(1L, "Masculino"));
        Mockito.when(generoRepository.findById(1L)).thenReturn(generoOpt);
        Optional<Estrato> estratoOpt = Optional.of(new Estrato(3L, 3));
        Mockito.when(estratoRepository.findById(3L)).thenReturn(estratoOpt);
        Optional<GrupoEtnico> grupoEtnicoOpt = Optional.of(new GrupoEtnico(1L, "Indigena"));
        Mockito.when(grupoEtnicoRepository.findById(1L)).thenReturn(grupoEtnicoOpt);
        Optional<Discapacidad> discapacidadOpt = Optional.of(new Discapacidad(2L, "Ninguna"));
        Mockito.when(discapacidadRepository.findById(2L)).thenReturn(discapacidadOpt);
        Optional<PoblacionIdentificacion> poblacionOpt = Optional.of(new PoblacionIdentificacion(1L, "Desplazado"));
        Mockito.when(poblacionIdentificacionRepository.findById(1L)).thenReturn(poblacionOpt);
        Optional<Nivel_Educacion> nivelEducacionOpt = Optional.of(new Nivel_Educacion(3L, "Tecnico"));
        Mockito.when(nivelEducacionRepository.findById(3L)).thenReturn(nivelEducacionOpt);
        Optional<Ocupacion> ocupacionOpt = Optional.of(new Ocupacion(4L, "Estudio"));
        Mockito.when(ocupacionRepository.findById(4L)).thenReturn(ocupacionOpt);
        Optional<Salario_Actual> salarioOpt = Optional.of(new Salario_Actual(2L, "Menos de un salario minimo"));
        Mockito.when(salarioActualRepository.findById(2L)).thenReturn(salarioOpt);
        Optional<Bootcamp_Info> bootcampInfoOpt = Optional.of(new Bootcamp_Info(1L, "Parceros por Bogota"));
        Mockito.when(bootcampInfoRepository.findById(1L)).thenReturn(bootcampInfoOpt);

        // Configuramos el comportamiento del servicio
        Mockito.when(aspiranteRepository.save(Mockito.any(Aspirante.class))).thenAnswer(invocation -> {
            Aspirante aspiranteToSave = invocation.getArgument(0);
            return new Aspirante(aspiranteToSave.getNombre(),aspiranteToSave.getNumeroDocumento(),
                    aspiranteToSave.getEdad(), aspiranteToSave.getFechaNacimiento(), aspiranteToSave.getCelular(),
                    aspiranteToSave.getEmail(), aspiranteToSave.getNacionalidad(), aspiranteToSave.getDepartamento(),
                    aspiranteToSave.getCiudad(), aspiranteToSave.getDireccion(),aspiranteToSave.getUltimoTitulo(),
                    aspiranteToSave.getOcupacionSi(), aspiranteToSave.getTiempoLibre(), aspiranteToSave.getPersonaEmergencia(),
                    aspiranteToSave.getContactoEmergencia(), aspiranteToSave.getEmailEmergencia(), aspiranteToSave.getOrganizacion(),
                    aspiranteToSave.getTipo_doc(), aspiranteToSave.getGenero(),aspiranteToSave.getGrupo_etnico(),
                    aspiranteToSave.getDiscapacidad(), aspiranteToSave.getPoblacion_Id(), aspiranteToSave.getNivel_educacion(),
                    aspiranteToSave.getOcupacion(), aspiranteToSave.getSalario_actual(), aspiranteToSave.getBootcamp_info(),
                    aspiranteToSave.getEntrenamiento(), aspiranteToSave.getEstrato());
        });

        // Act
        Aspirante result = aspiranteService.crearAspirante(dto);

        // Assert
        assertEquals(dto.getNombre(), result.getNombre());
    }
}