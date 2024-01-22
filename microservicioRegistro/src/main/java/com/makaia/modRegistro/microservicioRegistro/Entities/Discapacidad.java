package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Discapacidad")
public class Discapacidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(length = 30)
    private String Descripcion;
    @OneToMany(mappedBy = "discapacidad")
    List<Aspirante> aspirantes;

    public Discapacidad() {
    }

    public Discapacidad(Long id, String descripcion) {
        this.id = id;
        Descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
