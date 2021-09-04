package br.inatel.service;

import br.inatel.model.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LerCSV {

    List<Game> listGames = null;

    public List<Game> lerGames(Path path){

        try{

            Reader reader = Files.newBufferedReader(path);
            CsvToBean<Game> csv = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            listGames = csv.parse();
        }catch (IOException e){

            e.printStackTrace();
        }
        return listGames;
    }
}
