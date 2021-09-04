package br.inatel.service;

import br.inatel.model.Game;

import java.util.List;
import java.util.stream.Collectors;

public class ConsultarGames {

    public List<Game> buscarPorPlataform(List<Game> games, String plataform){

        return games.stream()
                .filter(g -> g.getPlatform().equals(plataform))
                .collect(Collectors.toList());
    }

    public List<Game> buscarPorPublisher(List<Game> games, String publisher){

        return games.stream()
                .filter(g -> g.getPublisher().equals(publisher))
                .collect(Collectors.toList());
    }
}
