package com.makaia.modRegistro.microservicioRegistro.Repositories;
import com.makaia.modRegistro.microservicioRegistro.Entities.Salario_Actual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Salario_ActualRepository extends JpaRepository<Salario_Actual, Long> {

}