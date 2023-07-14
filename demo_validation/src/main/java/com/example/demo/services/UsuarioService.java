package com.example.demo.services;

import com.example.demo.dtos.UsuarioCadastroDTO;
import com.example.demo.dtos.UsuarioResponseDTO;
import com.example.demo.mappers.UsuarioMapper;
import com.example.demo.models.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired private UsuarioRepository repository;

    public UsuarioResponseDTO cadastra(UsuarioCadastroDTO usuarioCadastroDTO) {
        Usuario usuarioNovo = UsuarioMapper.map(usuarioCadastroDTO);

        usuarioNovo = repository.save(usuarioNovo);

        return UsuarioMapper.map(usuarioNovo);
    }
}
