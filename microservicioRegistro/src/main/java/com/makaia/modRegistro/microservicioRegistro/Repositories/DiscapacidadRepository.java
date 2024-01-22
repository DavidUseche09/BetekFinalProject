package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.Discapacidad;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiscapacidadRepository extends JpaRepository<Discapacidad, Long> {
    Optional<Discapacidad> findById(Long id);
}