package br.com.webapp.screenmatch.repository;

import br.com.webapp.screenmatch.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
