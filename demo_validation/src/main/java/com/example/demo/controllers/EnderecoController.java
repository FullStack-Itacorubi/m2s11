package com.example.demo.controllers;

import com.example.demo.dtos.EnderecoCadastroDTO;
import com.example.demo.models.Endereco;
import com.example.demo.services.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired private EnderecoService service;

    @PostMapping
    public ResponseEntity<Endereco> cadastra(@RequestBody @Valid EnderecoCadastroDTO novoEnderecoDTO) {
        Endereco response = service.cadastra(novoEnderecoDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}

