package com.example.demo.controllers;

import com.example.demo.dtos.UsuarioCadastroDTO;
import com.example.demo.dtos.UsuarioGetRequest;
import com.example.demo.dtos.UsuarioResponseDTO;
import com.example.demo.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired private UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> cadastra(@RequestBody @Valid UsuarioCadastroDTO usuarioCadastroDTO) {
        UsuarioResponseDTO response = service.cadastra(usuarioCadastroDTO);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<UsuarioResponseDTO> busca(@Valid UsuarioGetRequest requestParam){
        return new ResponseEntity<>(new UsuarioResponseDTO(), HttpStatus.OK);
    }
}
