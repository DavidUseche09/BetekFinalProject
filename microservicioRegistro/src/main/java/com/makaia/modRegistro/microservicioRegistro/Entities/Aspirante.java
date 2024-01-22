package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name= "Aspirante")
public class Aspirante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column (length = 30)
    private String Nombre;
    @Column
    private Long NumeroDocumento;
    @Column
    private Long Edad;
    @Column
    private Date FechaNacimiento;
    @Column
    private Long Celular;
    @Column
    private String Email;
    @Column
    private String Nacionalidad;
    @Column
    private  String Departamento;
    @Column
    private String Ciudad;
    @Column
    private String Direccion;
    @Column
    private String UltimoTitulo;
    @Column
    private String OcupacionSi;
    @Column
    private String TiempoLibre;
    @Column
    private String PersonaEmergencia;
    @Column
    private Long ContactoEmergencia;
    @Column
    private String EmailEmergencia;
    @Column
    private String Organizacion;
    @ManyToOne (optional = false)
    Tipo_Doc tipo_doc;
    @ManyToOne (optional = false)
    Genero genero;
    @ManyToOne (optional = false)
    GrupoEtnico grupo_etnico;
    @ManyToOne(optional = false)
    Discapacidad discapacidad;
    @ManyToOne (optional = false)
    PoblacionIdentificacion poblacion_Id;
    @ManyToOne (optional = false)
    Nivel_Educacion nivel_educacion;
    @ManyToOne (optional = false)
    Ocupacion ocupacion;
    @ManyToOne (optional = false)
    Salario_Actual salario_actual;
    @ManyToOne (optional = false)
    Bootcamp_Info bootcamp_info;
    @ManyToOne (optional = false)
    Entrenamiento entrenamiento;
    @ManyToOne (optional = false)
    Estrato estrato;

    public Aspirante() {
    }

    public Aspirante(String nombre, Long numeroDocumento, Long edad, Date fechaNacimiento, Long celular, String email, String nacionalidad, String departamento, String ciudad, String direccion, String ultimoTitulo, String ocupacionSi, String tiempoLibre, String personaEmergencia, Long contactoEmergencia, String emailEmergencia, String organizacion, Tipo_Doc tipo_doc, Genero genero, GrupoEtnico grupo_etnico, Discapacidad discapacidad, PoblacionIdentificacion poblacion_Id, Nivel_Educacion nivel_educacion, Ocupacion ocupacion, Salario_Actual salario_actual, Bootcamp_Info bootcamp_info, Entrenamiento entrenamiento, Estrato estrato) {
        Nombre = nombre;
        NumeroDocumento = numeroDocumento;
        Edad = edad;
        FechaNacimiento = fechaNacimiento;
        Celular = celular;
        Email = email;
        Nacionalidad = nacionalidad;
        Departamento = departamento;
        Ciudad = ciudad;
        Direccion = direccion;
        UltimoTitulo = ultimoTitulo;
        OcupacionSi = ocupacionSi;
        TiempoLibre = tiempoLibre;
        PersonaEmergencia = personaEmergencia;
        ContactoEmergencia = contactoEmergencia;
        EmailEmergencia = emailEmergencia;
        Organizacion = organizacion;
        this.tipo_doc = tipo_doc;
        this.genero = genero;
        this.grupo_etnico = grupo_etnico;
        this.discapacidad = discapacidad;
        this.poblacion_Id = poblacion_Id;
        this.nivel_educacion = nivel_educacion;
        this.ocupacion = ocupacion;
        this.salario_actual = salario_actual;
        this.bootcamp_info = bootcamp_info;
        this.entrenamiento = entrenamiento;
        this.estrato = estrato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Long getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        NumeroDocumento = numeroDocumento;
    }

    public Long getEdad() {
        return Edad;
    }

    public void setEdad(Long edad) {
        Edad = edad;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public Long getCelular() {
        return Celular;
    }

    public void setCelular(Long celular) {
        Celular = celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getUltimoTitulo() {
        return UltimoTitulo;
    }

    public void setUltimoTitulo(String ultimoTitulo) {
        UltimoTitulo = ultimoTitulo;
    }

    public String getOcupacionSi() {
        return OcupacionSi;
    }

    public void setOcupacionSi(String ocupacionSi) {
        OcupacionSi = ocupacionSi;
    }

    public String getTiempoLibre() {
        return TiempoLibre;
    }

    public void setTiempoLibre(String tiempoLibre) {
        TiempoLibre = tiempoLibre;
    }

    public String getPersonaEmergencia() {
        return PersonaEmergencia;
    }

    public void setPersonaEmergencia(String personaEmergencia) {
        PersonaEmergencia = personaEmergencia;
    }

    public Long getContactoEmergencia() {
        return ContactoEmergencia;
    }

    public void setContactoEmergencia(Long contactoEmergencia) {
        ContactoEmergencia = contactoEmergencia;
    }

    public String getEmailEmergencia() {
        return EmailEmergencia;
    }

    public void setEmailEmergencia(String emailEmergencia) {
        EmailEmergencia = emailEmergencia;
    }

    public String getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(String organizacion) {
        Organizacion = organizacion;
    }

    public Tipo_Doc getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(Tipo_Doc tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public GrupoEtnico getGrupo_etnico() {
        return grupo_etnico;
    }

    public void setGrupo_etnico(GrupoEtnico grupo_etnico) {
        this.grupo_etnico = grupo_etnico;
    }

    public Discapacidad getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Discapacidad discapacidad) {
        this.discapacidad = discapacidad;
    }

    public PoblacionIdentificacion getPoblacion_Id() {
        return poblacion_Id;
    }

    public void setPoblacion_Id(PoblacionIdentificacion poblacion_Id) {
        this.poblacion_Id = poblacion_Id;
    }

    public Nivel_Educacion getNivel_educacion() {
        return nivel_educacion;
    }

    public void setNivel_educacion(Nivel_Educacion nivel_educacion) {
        this.nivel_educacion = nivel_educacion;
    }

    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Salario_Actual getSalario_actual() {
        return salario_actual;
    }

    public void setSalario_actual(Salario_Actual salario_actual) {
        this.salario_actual = salario_actual;
    }

    public Bootcamp_Info getBootcamp_info() {
        return bootcamp_info;
    }

    public void setBootcamp_info(Bootcamp_Info bootcamp_info) {
        this.bootcamp_info = bootcamp_info;
    }

    public Entrenamiento getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(Entrenamiento entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public Estrato getEstrato() {
        return estrato;
    }

    public void setEstrato(Estrato estrato) {
        this.estrato = estrato;
    }
}
