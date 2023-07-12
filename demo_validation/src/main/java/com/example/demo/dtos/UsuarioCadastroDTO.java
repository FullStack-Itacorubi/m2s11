package com.example.demo.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UsuarioCadastroDTO {
    @NotBlank(message = "nome é obrigatório") private String nome;
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    private String cpf;
    @NotBlank private String rg;
    @NotBlank @Size(min = 8)
    private String senha;
    @NotBlank @Email
    private String email;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
