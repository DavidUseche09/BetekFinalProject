package com.makaia.modRegistro.microservicioRegistro.Dtos;


public class AspirantesDTO {
    private Long entrenamiento;
    private String nombre;
    private Long tipo_doc;
    private Long numero_documento;
    private Long genero;
    private Long edad;
    private String fecha_nacimiento;
    private String celular;
    private String email;
    private String nacionalidad;
    private String departamento;
    private String ciudad;
    private String direccion;
    private Long estrato;
    private Long grupo_etnico_id;
    private  Long discapacidad_id;
    private  Long poblacion_id_id;
    private  Long nivel_educacion_id;
    private  Long ocupacion_id;
    private  String ultimo_titulo;
    private String ocupacion_si;
    private Long salario_actual_id;
    private String tiempo_libre;
    private  String persona_emergencia;
    private Long contacto_emergencia;
    private  String email_emergencia;
    private  Long bootcamp_info_id;
    private  String organizacion;

    public AspirantesDTO() {
    }

    public AspirantesDTO(Long entrenamiento, String nombre, Long tipo_doc, Long numero_documento, Long genero, Long edad, String fecha_nacimiento, String celular, String email, String nacionalidad, String departamento, String ciudad, String direccion, Long estrato, Long grupo_etnico_id, Long discapacidad_id, Long poblacion_id_id, Long nivel_educacion_id, Long ocupacion_id, String ultimo_titulo, String ocupacion_si, Long salario_actual_id, String tiempo_libre, String persona_emergencia, Long contacto_emergencia, String email_emergencia, Long bootcamp_info_id, String organizacion) {
        this.entrenamiento = entrenamiento;
        this.nombre = nombre;
        this.tipo_doc = tipo_doc;
        this.numero_documento = numero_documento;
        this.genero = genero;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.celular = celular;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.estrato = estrato;
        this.grupo_etnico_id = grupo_etnico_id;
        this.discapacidad_id = discapacidad_id;
        this.poblacion_id_id = poblacion_id_id;
        this.nivel_educacion_id = nivel_educacion_id;
        this.ocupacion_id = ocupacion_id;
        this.ultimo_titulo = ultimo_titulo;
        this.ocupacion_si = ocupacion_si;
        this.salario_actual_id = salario_actual_id;
        this.tiempo_libre = tiempo_libre;
        this.persona_emergencia = persona_emergencia;
        this.contacto_emergencia = contacto_emergencia;
        this.email_emergencia = email_emergencia;
        this.bootcamp_info_id = bootcamp_info_id;
        this.organizacion = organizacion;
    }

    public Long getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(Long entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(Long tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public Long getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(Long numero_documento) {
        this.numero_documento = numero_documento;
    }

    public Long getGenero() {
        return genero;
    }

    public void setGenero(Long genero) {
        this.genero = genero;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getEstrato() {
        return estrato;
    }

    public void setEstrato(Long estrato) {
        this.estrato = estrato;
    }

    public Long getGrupo_etnico_id() {
        return grupo_etnico_id;
    }

    public void setGrupo_etnico_id(Long grupo_etnico_id) {
        this.grupo_etnico_id = grupo_etnico_id;
    }

    public Long getDiscapacidad_id() {
        return discapacidad_id;
    }

    public void setDiscapacidad_id(Long discapacidad_id) {
        this.discapacidad_id = discapacidad_id;
    }

    public Long getPoblacion_id_id() {
        return poblacion_id_id;
    }

    public void setPoblacion_id_id(Long poblacion_id_id) {
        this.poblacion_id_id = poblacion_id_id;
    }

    public Long getNivel_educacion_id() {
        return nivel_educacion_id;
    }

    public void setNivel_educacion_id(Long nivel_educacion_id) {
        this.nivel_educacion_id = nivel_educacion_id;
    }

    public Long getOcupacion_id() {
        return ocupacion_id;
    }

    public void setOcupacion_id(Long ocupacion_id) {
        this.ocupacion_id = ocupacion_id;
    }

    public String getUltimo_titulo() {
        return ultimo_titulo;
    }

    public void setUltimo_titulo(String ultimo_titulo) {
        this.ultimo_titulo = ultimo_titulo;
    }

    public String getOcupacion_si() {
        return ocupacion_si;
    }

    public void setOcupacion_si(String ocupacion_si) {
        this.ocupacion_si = ocupacion_si;
    }

    public Long getSalario_actual_id() {
        return salario_actual_id;
    }

    public void setSalario_actual_id(Long salario_actual_id) {
        this.salario_actual_id = salario_actual_id;
    }

    public String getTiempo_libre() {
        return tiempo_libre;
    }

    public void setTiempo_libre(String tiempo_libre) {
        this.tiempo_libre = tiempo_libre;
    }

    public String getPersona_emergencia() {
        return persona_emergencia;
    }

    public void setPersona_emergencia(String persona_emergencia) {
        this.persona_emergencia = persona_emergencia;
    }

    public Long getContacto_emergencia() {
        return contacto_emergencia;
    }

    public void setContacto_emergencia(Long contacto_emergencia) {
        this.contacto_emergencia = contacto_emergencia;
    }

    public String getEmail_emergencia() {
        return email_emergencia;
    }

    public void setEmail_emergencia(String email_emergencia) {
        this.email_emergencia = email_emergencia;
    }

    public Long getBootcamp_info_id() {
        return bootcamp_info_id;
    }

    public void setBootcamp_info_id(Long bootcamp_info_id) {
        this.bootcamp_info_id = bootcamp_info_id;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
}