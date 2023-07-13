package com.example.demo.services;

import com.example.demo.dtos.PacienteCadastroDTO;
import com.example.demo.dtos.PacienteResponseDTO;
import com.example.demo.mappers.EnderecoMapper;
import com.example.demo.mappers.PacienteMapper;
import com.example.demo.models.Paciente;
import com.example.demo.repositories.EnderecoRepository;
import com.example.demo.repositories.PacienteRespository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

  @Autowired private PacienteRespository repository;
  @Autowired private EnderecoRepository enderecoRepository;

  public PacienteResponseDTO cadastra(PacienteCadastroDTO novoPacienteDTO) {
    Paciente novoPaciente = repository.save(PacienteMapper.map(novoPacienteDTO));
    novoPaciente.setEndereco(
        enderecoRepository
            .findById(novoPaciente.getEndereco().getId())
            .orElseThrow(EntityNotFoundException::new));

    return PacienteMapper.map(novoPaciente);
  }

  public PacienteResponseDTO atualiza(PacienteCadastroDTO pacienteDTO, Long id) {
    Paciente oldPaciente = repository.findById(id).orElseThrow(() -> new EntityNotFoundException());

    oldPaciente.setCpf(pacienteDTO.getCpf());
    oldPaciente.setRg(pacienteDTO.getRg());
    oldPaciente.setNome(pacienteDTO.getNome());
    oldPaciente.setEndereco(EnderecoMapper.map(pacienteDTO.getEndereco()));

    repository.save(oldPaciente);

    return PacienteMapper.map(oldPaciente);
  }
}
