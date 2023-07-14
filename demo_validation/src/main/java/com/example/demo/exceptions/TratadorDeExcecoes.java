package com.example.demo.exceptions;

import com.example.demo.dtos.ErroValidacaoDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class TratadorDeExcecoes {

  @ExceptionHandler(EntityNotFoundException.class)
  public ResponseEntity<String> trataEntidadeNaoEncontrada() {
    return new ResponseEntity<>("Entidade não encontrada", HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<List<ErroValidacaoDTO>> trataParametroInvalido(MethodArgumentNotValidException exception) {
    List<FieldError> erros = exception.getFieldErrors();

    List<ErroValidacaoDTO> errosDTO = new ArrayList<>();

    for (FieldError erro : erros) {
      errosDTO.add(new ErroValidacaoDTO(erro));
    }

    return new ResponseEntity<>(errosDTO, HttpStatus.BAD_REQUEST);
  }
}
