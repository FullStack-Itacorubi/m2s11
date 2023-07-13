package com.example.demo.dtos;

import jakarta.validation.constraints.NotNull;

public class EnderecoDTO {
    @NotNull private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
