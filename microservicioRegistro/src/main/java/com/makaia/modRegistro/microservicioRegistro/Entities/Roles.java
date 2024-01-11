package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column
    private String descripcion;
    @OneToMany(mappedBy = "Rol")
    List<Usuario> usuarios;

    public Roles() {
    }

    public Roles(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Roles(String descripcion) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
