package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.PoblacionIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PoblacionIdentificacionRepository extends JpaRepository<PoblacionIdentificacion, Long> {
    Optional<PoblacionIdentificacion> findById(Long id);
}