package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Entrenamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(length = 50)
    private String formacion;
    @OneToMany(mappedBy = "entrenamiento")
    List<Aspirante> aspirantes;

    public Entrenamiento() {
    }

    public Entrenamiento(String formacion) {
        this.formacion = formacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }
}
