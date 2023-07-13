package com.example.demo.mappers;

import com.example.demo.dtos.EnderecoCadastroDTO;
import com.example.demo.dtos.EnderecoDTO;
import com.example.demo.models.Endereco;

public class EnderecoMapper {

  public static Endereco map(EnderecoDTO source) {
    Endereco target = new Endereco();

    target.setId(source.getId());
    return target;
  }

  public static Endereco map(EnderecoCadastroDTO source) {
    Endereco target = new Endereco();

    target.setCep(source.getCep());
    target.setLogradouro(source.getLogradouro());
    return target;
  }
}
