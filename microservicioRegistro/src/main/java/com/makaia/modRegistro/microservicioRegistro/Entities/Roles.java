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
}
