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

}
