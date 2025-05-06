package com.store.filmes.dto;

public record FilmeDTO(
    Long id,
    String titulo,
    String descricao,
    Integer anoLancamento,
    String genero,
    String diretor,
    Double nota
) {}
