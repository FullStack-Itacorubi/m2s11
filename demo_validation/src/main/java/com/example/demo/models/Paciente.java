package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Paciente extends Pessoa {
    @OneToOne
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
