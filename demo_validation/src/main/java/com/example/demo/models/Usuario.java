package com.example.demo.models;

import jakarta.persistence.Entity;
@Entity
public class Usuario extends Pessoa {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
