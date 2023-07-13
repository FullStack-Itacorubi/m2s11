package com.example.demo.services;

import com.example.demo.dtos.EnderecoCadastroDTO;
import com.example.demo.mappers.EnderecoMapper;
import com.example.demo.models.Endereco;
import com.example.demo.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired private EnderecoRepository repository;

    public Endereco cadastra(EnderecoCadastroDTO novoEnderecoDTO) {
        return repository.save(EnderecoMapper.map(novoEnderecoDTO));
    }
}
