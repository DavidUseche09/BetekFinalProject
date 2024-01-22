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
    Roles rol;

    public Usuario(String email, String password, Roles rol) {
        if (email == null || password == null || rol == null) {
            throw new IllegalArgumentException("Email, password y rol no pueden ser nulos.");
        }
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                '}';
    }
}

