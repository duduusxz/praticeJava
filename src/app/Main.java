package app;

import model.Gafanhoto;
import model.Video;
import model.Visualizacao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Video> videos = new ArrayList<>(0);
        List<Gafanhoto> gafanhotos = new ArrayList<>(0);
        List<Visualizacao> visualizacoes = new ArrayList<>(0);

        videos.add(new Video("Não saia da casa e ganhe U$1.000.000!!!"));
        gafanhotos.add(new Gafanhoto("Eduardo", 18, "Masculino", "eduardo@gmail.com"));
        visualizacoes.add(new Visualizacao(gafanhotos.get(0), videos.get(0)));

        videos.get(0).play();
        visualizacoes.get(0).verStatus();
        videos.get(0).verStatus();
        gafanhotos.get(0).verStatus();


    }
}
