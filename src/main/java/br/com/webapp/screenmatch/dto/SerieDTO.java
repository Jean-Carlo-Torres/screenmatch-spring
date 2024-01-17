package br.com.webapp.screenmatch.dto;

import br.com.webapp.screenmatch.models.enums.Categoria;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double avaliacao,
                       Categoria genero,
                       String atores,
                       String poster,
                       String sinopse) {
}
