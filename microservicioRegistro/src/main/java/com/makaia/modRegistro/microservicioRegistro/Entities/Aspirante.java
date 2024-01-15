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

    public Aspirante() {
    }
    public Aspirante(String nombre, Long numeroDocumento, Long edad, Date fechaNacimiento, Long celular, String email, String nacionalidad, String departamento, String ciudad, String direccion, int estrato, String ultimoTitulo, String ocupacionSi, String tiempoLibre, String personaEmergencia, Long contactoEmergencia, String emailEmergencia, String organizacion) {
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

}
