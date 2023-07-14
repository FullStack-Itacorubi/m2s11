package com.example.demo.mappers;

import com.example.demo.dtos.UsuarioCadastroDTO;
import com.example.demo.dtos.UsuarioResponseDTO;
import com.example.demo.models.Usuario;

public class UsuarioMapper {

  public static Usuario map(UsuarioCadastroDTO source) {
    Usuario target = new Usuario();

    target.setNome(source.getNome());
    target.setCpf(source.getCpf());
    target.setRg(source.getRg());
    target.setEmail(source.getEmail());
    target.setEspecializacaoClinica(source.getEspecializacao());

    return target;
  }

  public static UsuarioResponseDTO map(Usuario source) {
    UsuarioResponseDTO target = new UsuarioResponseDTO();

    target.setId(source.getId());
    target.setNome(source.getNome());
    target.setCpf(source.getCpf());
    target.setRg(source.getRg());
    target.setEmail(source.getEmail());
    target.setEspecializacao(source.getEspecializacaoClinica().getDescricao());

    return target;
  }
}
