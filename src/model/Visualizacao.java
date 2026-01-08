package model;

import contract.Visivel;

public class Visualizacao implements Visivel {
    private Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.setEspectador(espectador);
        this.setVideo(video);
        espectador.assistir();
        video.maisView();
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public void verStatus() {
        System.out.println(this.getEspectador().getNome() + " está assistindo ao vídeo " + this.getVideo().getTitulo());
    }
}
