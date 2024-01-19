package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.Nivel_Educacion;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Nivel_EducacionRepository extends JpaRepository<Nivel_Educacion, Long> {
    Optional<Nivel_Educacion> findById(Long id);
}