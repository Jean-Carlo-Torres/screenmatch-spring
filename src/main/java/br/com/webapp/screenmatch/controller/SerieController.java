package br.com.webapp.screenmatch.controller;

import br.com.webapp.screenmatch.dto.SerieDTO;
import br.com.webapp.screenmatch.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController{

    @Autowired
    private SerieService servico;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries(){
        return servico.obterTodasAsSeries();
    }
}
