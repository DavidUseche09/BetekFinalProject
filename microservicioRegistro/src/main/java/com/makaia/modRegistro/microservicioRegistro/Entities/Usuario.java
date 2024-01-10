package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column
    private String email;
    @Column
    private String password;
    @ManyToOne (optional = false)
    Roles Rol;
}
