package br.com.webapp.screenmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController{
    @GetMapping("/series")
    public String obterSeries(){
        return "Lista de séries";
    }
}
