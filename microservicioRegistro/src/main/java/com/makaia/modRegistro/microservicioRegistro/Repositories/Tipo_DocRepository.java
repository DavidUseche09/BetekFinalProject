package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Tipo_Doc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Tipo_DocRepository extends JpaRepository<Tipo_Doc, Long> {
    Optional<Tipo_Doc> findById(Long id);
}