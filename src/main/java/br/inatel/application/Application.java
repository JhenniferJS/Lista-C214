package br.inatel.application;

import br.inatel.model.Game;
import br.inatel.service.ConsultarGames;
import br.inatel.service.LerCSV;
import br.inatel.util.JsonUtil;

import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConsultarGames games = new ConsultarGames();
        LerCSV csv = new LerCSV();

        String path = "src/main/resources/vendas-games.csv";
        List<Game> listGames = csv.lerGames(Paths.get(path));

        String json;
        List<Game> gamesFiltrados;

        int op = 0;

        while (op != 1 && op != 2) {
            System.out.println("Digite 1 para pesquisar por platform ou 2 para publisher");
            op = sc.nextInt();
            sc.nextLine();
        }

        switch (op) {
            case 1:
                System.out.println("Qual o nome da plataforma? ");
                String platform = sc.nextLine();
                gamesFiltrados = games.buscarPorPlataform(listGames, platform);
                json = JsonUtil.converterParaJson(gamesFiltrados);
                JsonUtil.criarArquivoJson(json);
                break;
            case 2:
                System.out.println("Qual o nome do publisher? ");
                String publisher = sc.nextLine();
                gamesFiltrados = games.buscarPorPublisher(listGames, publisher);
                json = JsonUtil.converterParaJson(gamesFiltrados);
                JsonUtil.criarArquivoJson(json);
                break;
        }
    }

}
