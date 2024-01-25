package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.Bootcamp_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Bootcamp_InfoRepository extends JpaRepository<Bootcamp_Info, Long> {
    Optional<Bootcamp_Info> findById(Long id);
}
