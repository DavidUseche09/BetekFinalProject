package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.Aspirante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AspiranteRepository extends JpaRepository<Aspirante, Long> {
    Optional<Aspirante> findById(Long NumeroDocumento);
}