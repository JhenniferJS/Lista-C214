package br.inatel.service.test;

import br.inatel.model.Game;
import br.inatel.service.LerCSV;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.List;

public class LerCSVTest {

    @Test
    public void TestLerCSV(){
        LerCSV csv = new LerCSV();
        List<Game> listGames = csv.lerGames(Paths.get("src/main/resources/vendas-games.csv"));
        Assert.assertNotNull(listGames);
    }
}
