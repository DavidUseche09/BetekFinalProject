package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Estrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(length = 50)
    private int numEstrato;
    @OneToMany(mappedBy = "estrato")
    List<Aspirante> aspirantes;

    public Estrato() {
    }

    public Estrato(Long id, int numEstrato) {
        this.id = id;
        this.numEstrato = numEstrato;
    }

    public Estrato(int numEstrato) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumEstrato() {
        return numEstrato;
    }

    public void setNumEstrato(int numEstrato) {
        this.numEstrato = numEstrato;
    }
}
