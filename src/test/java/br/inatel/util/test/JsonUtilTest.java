package br.inatel.util.test;

import br.inatel.model.Game;
import br.inatel.service.ConsultarGames;
import br.inatel.service.LerCSV;
import br.inatel.util.JsonUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

public class JsonUtilTest {

    private static final String PATH_CSV = "src/main/resources/vendas-games.csv";
    private static List<Game> csvGames;

    private final String PATH_JSON = "src/main/resources/games.json";
    private ConsultarGames games = new ConsultarGames();

    @BeforeClass
    public static void initCsv() {

        csvGames = new LerCSV().lerGames(Paths.get(PATH_CSV));
    }

    @Before
    public void deletaJson(){

        File file = new File(PATH_JSON);
        file.deleteOnExit();
    }

    @Test
    public void criarJsonPublisher(){

        List<Game> gamesFiltrados = games.buscarPorPublisher(csvGames, "Atari");
        String json = JsonUtil.converterParaJson(gamesFiltrados);
        JsonUtil.criarArquivoJson(json);
        File file = new File(PATH_JSON);
        Assert.assertTrue(file.exists());
    }

    @Test
    public void criarJsonPlatform(){

        List<Game> gamesFiltrados = games.buscarPorPlataform(csvGames, "GBA");
        String json = JsonUtil.converterParaJson(gamesFiltrados);
        JsonUtil.criarArquivoJson(json);
        File file = new File(PATH_JSON);
        Assert.assertTrue(file.exists());
    }
}
