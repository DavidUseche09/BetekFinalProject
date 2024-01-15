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

}
