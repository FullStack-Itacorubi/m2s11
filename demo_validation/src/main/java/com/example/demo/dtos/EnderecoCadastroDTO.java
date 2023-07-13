package com.example.demo.dtos;

import jakarta.validation.constraints.NotBlank;

public class EnderecoCadastroDTO {
    @NotBlank
    private String logradouro;
    @NotBlank private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
