package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Salario_Actual")
public class Salario_Actual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(length = 50)
    private String Rango_Salarial;
    @OneToMany(mappedBy = "salario_actual")
    List<Aspirante> aspirantes;
    public Salario_Actual() {
    }

    public Salario_Actual(String rangoSalarial) {
        Rango_Salarial = rangoSalarial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRango_Salarial() {
        return Rango_Salarial;
    }

    public void setRango_Salarial(String rango_Salarial) {
        Rango_Salarial = rango_Salarial;
    }
}
