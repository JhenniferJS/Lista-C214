package br.inatel.service.test;

import br.inatel.enums.Plataform;
import br.inatel.enums.Publisher;
import br.inatel.model.Game;
import br.inatel.service.ConsultarGames;
import br.inatel.service.LerCSV;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.List;

public class ConsultarGamesTest {

    private static final String PATH = "src/main/resources/vendas-games.csv";
    private static List<Game> csvGames;
    private ConsultarGames games;

    @BeforeClass
    public static void initCsv() {

        csvGames = new LerCSV().lerGames(Paths.get(PATH));
    }

    @Before
    public void initGame(){

        games = new ConsultarGames();
    }

    @Test
    public void TestPlataformValida() {

        List<Game> lista = games.buscarPorPlataform(csvGames, Plataform.PLATFORM_PS2.getPlatform());
        Assert.assertFalse(lista.isEmpty());
    }

    @Test
    public void TestPlataformInvalida() {

        List<Game> lista = games.buscarPorPlataform(csvGames, "ABC");
        Assert.assertTrue(lista.isEmpty());
    }

    @Test
    public void TestPublisherValido() {

        List<Game> lista = games.buscarPorPublisher(csvGames, Publisher.ELECTRONIC_ARTS.getPublisher());
        Assert.assertFalse(lista.isEmpty());
    }

    @Test
    public void TestPublisherInvalido() {

        List<Game> lista = games.buscarPorPublisher(csvGames, "ABC");
        Assert.assertTrue(lista.isEmpty());
    }
}