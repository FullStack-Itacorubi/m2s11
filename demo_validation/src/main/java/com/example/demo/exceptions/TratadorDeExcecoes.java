package com.example.demo.exceptions;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeExcecoes {

  @ExceptionHandler(EntityNotFoundException.class)
  public ResponseEntity<String> trataEntidadeNaoEncontrada() {
    return new ResponseEntity<>("Entidade não encontrada", HttpStatus.NOT_FOUND);
  }
}
