package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Grupo_Etnico")
public class GrupoEtnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(length = 70)
    private String Descripcion;
    @OneToMany(mappedBy = "grupo_etnico")
    List<Aspirante> aspirantes;

    public GrupoEtnico() {
    }

    public GrupoEtnico(Long id, String descripcion) {
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
