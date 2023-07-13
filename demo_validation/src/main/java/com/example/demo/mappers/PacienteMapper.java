package com.example.demo.mappers;

import com.example.demo.dtos.PacienteCadastroDTO;
import com.example.demo.dtos.PacienteResponseDTO;
import com.example.demo.models.Paciente;

public class PacienteMapper {
  public static Paciente map(PacienteCadastroDTO source) {
    Paciente target = new Paciente();

    target.setNome(source.getNome());
    target.setCpf(source.getCpf());
    target.setRg(source.getRg());
    target.setEndereco(EnderecoMapper.map(source.getEndereco()));

    return target;
  }

  public static PacienteResponseDTO map(Paciente source) {
    PacienteResponseDTO target = new PacienteResponseDTO();

    target.setId(source.getId());
    target.setCpf(source.getCpf());
    target.setNome(source.getNome());
    target.setRg(source.getRg());
    target.setEndereco(source.getEndereco());

    return target;
  }
}
