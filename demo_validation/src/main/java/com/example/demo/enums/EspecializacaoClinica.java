package com.example.demo.enums;


public enum EspecializacaoClinica {
  CLINICA_GERAL("Clínica Geral"),
  ANESTESIOLOGIA("Anestesiologia"),
  DERMATOLOGIA("Dermatologia"),
  GINECOLOGIA("Ginecologia"),
  NEUROLOGIA("Neurologia"),
  PEDIATRIA("Pediatria"),
  PSIQUIATRIA("Psiquiatria"),
  ORTOPEDIA("Ortopedia");

  private final String descricao;
  EspecializacaoClinica(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return this.descricao;
  }
}
