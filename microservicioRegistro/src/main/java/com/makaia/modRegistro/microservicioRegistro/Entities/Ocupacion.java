package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Ocupacion")
public class Ocupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(length = 50)
    private String Descripcion;
    @OneToMany(mappedBy = "ocupacion")
    List<Aspirante> aspirantes;
    public Ocupacion() {
    }

    public Ocupacion(String descripcion) {
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
