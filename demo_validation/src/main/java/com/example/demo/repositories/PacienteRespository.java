package com.example.demo.repositories;

import com.example.demo.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRespository extends JpaRepository<Paciente, Long> {

}
