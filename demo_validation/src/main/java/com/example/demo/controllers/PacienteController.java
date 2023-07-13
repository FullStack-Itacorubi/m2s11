package com.example.demo.controllers;

import com.example.demo.dtos.PacienteCadastroDTO;
import com.example.demo.dtos.PacienteResponseDTO;
import com.example.demo.services.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
  @Autowired private PacienteService service;

  @PostMapping
  public ResponseEntity<PacienteResponseDTO> cadastra(
      @RequestBody @Valid PacienteCadastroDTO novoPacienteDTO) {
    PacienteResponseDTO response = service.cadastra(novoPacienteDTO);

    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<PacienteResponseDTO> atualiza(
      @RequestBody @Valid PacienteCadastroDTO pacienteDTO, @PathVariable Long id) {
    PacienteResponseDTO response = service.atualiza(pacienteDTO, id);

    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
