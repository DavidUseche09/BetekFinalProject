package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Botcamp_Info")
public class Bootcamp_Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(length = 70)
    private String Descripcion;
    @OneToMany(mappedBy = "bootcamp_info")
    List<Aspirante> aspirantes;
    public Bootcamp_Info() {
    }

    public Bootcamp_Info(String descripcion) {
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
