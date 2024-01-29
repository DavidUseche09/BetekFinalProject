package com.makaia.modRegistro.microservicioRegistro.Repositories;

import com.makaia.modRegistro.microservicioRegistro.Entities.ResultadosTestGorilla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResultadosTestGorillaRepository extends JpaRepository<ResultadosTestGorilla, Long> {
    Optional<ResultadosTestGorilla> findById(Long test_id);
}