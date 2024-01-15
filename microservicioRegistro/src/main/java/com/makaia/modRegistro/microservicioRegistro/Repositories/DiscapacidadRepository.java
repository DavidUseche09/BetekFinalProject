package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.Discapacidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscapacidadRepository extends JpaRepository<Discapacidad, Long> {

}