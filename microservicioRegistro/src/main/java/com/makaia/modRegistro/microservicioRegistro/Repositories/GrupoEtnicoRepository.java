package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.GrupoEtnico;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GrupoEtnicoRepository extends JpaRepository<GrupoEtnico, Long> {
    Optional<GrupoEtnico> findById(Long id);
}