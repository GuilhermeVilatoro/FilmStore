package com.store.filmes.service;

import com.exemplo.filmes.dto.FilmeDTO;

public class FilmeService {
    public String classificar(Object obj) {
        return switch (obj) {
            case FilmeDTO(Long id, String titulo, String descricao, Integer ano, String genero, String diretor, Double nota)
                when nota >= 8 -> "Excelente";
            case FilmeDTO(Long id, String titulo, String descricao, Integer ano, String genero, String diretor, Double nota)
                when nota >= 5 -> "Mediano";
            case FilmeDTO(Long id, String titulo, String descricao, Integer ano, String genero, String diretor, Double nota)
                -> "Ruim";
            default -> "Desconhecido";
        };
    }
}
