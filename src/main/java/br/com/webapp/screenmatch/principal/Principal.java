package br.com.webapp.screenmatch.principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.webapp.screenmatch.models.DadosEpisodio;
import br.com.webapp.screenmatch.models.DadosSerie;
import br.com.webapp.screenmatch.models.DadosTemporada;
import br.com.webapp.screenmatch.models.Episodio;
import br.com.webapp.screenmatch.services.ConsumoApi;
import br.com.webapp.screenmatch.services.ConverteDados;

public class Principal {
    Scanner sc = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    public void exibeMenu() {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = sc.nextLine();
        var json = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);
        System.out.println();

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
            json = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);

        // for (int i = 0; i < dadosSerie.totalTemporadas(); i++){
        // List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
        // for (int j = 0; j < episodiosTemporada.size(); j++){
        // System.out.println(episodiosTemporada.get(j).titulo());
        // }
        // }
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
        ;

        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        System.out.println("\nTop 5 episodios: ");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);

        System.out.println();

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d)))
                .collect(Collectors.toList());

        episodios.forEach(System.out::println);

        System.out.println("Deseja filtrar por data? s/n");
        char opcao = sc.nextLine().charAt(0);
        if (opcao == 's') {
            System.out.print("Digite o ano: ");
            int ano = sc.nextInt();
            LocalDate dataBusca = LocalDate.of(ano, 1, 1);
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            episodios.stream()
                    .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
                    .forEach(e -> System.out.println(
                            "Temporada: " + e.getTemporada() + " Episodio: " + e.getTitulo() + " Data de lancamento: "
                                    + e.getDataLancamento().format(formatador)
                    ));
        } else {
            System.out.println("Obrigado por utilizar nossos serviços!");
        }
    }
}
