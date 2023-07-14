package com.example.demo.models;

import com.example.demo.enums.EspecializacaoClinica;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Usuario extends Pessoa {
    private String senha;
    @Enumerated(value = EnumType.STRING)
    private EspecializacaoClinica especializacaoClinica;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public EspecializacaoClinica getEspecializacaoClinica() {
        return especializacaoClinica;
    }

    public void setEspecializacaoClinica(EspecializacaoClinica especializacaoClinica) {
        this.especializacaoClinica = especializacaoClinica;
    }
}
