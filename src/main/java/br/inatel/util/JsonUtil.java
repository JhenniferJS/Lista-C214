package br.inatel.util;

import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonUtil {

    public static String converterParaJson(Object obj) {

        return new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(obj);
    }

    public static void criarArquivoJson(String json) {

        FileWriter writer;
        try {
            writer = new FileWriter("src/main/resources/games.json");
            writer.write(json);
            writer.close();
            System.out.println("Arquivo JSON criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
