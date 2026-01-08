package model;

import contract.AcoesVideo;
import contract.Visivel;

public class Video implements AcoesVideo, Visivel {
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(0);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (this.isReproduzindo()) {
            throw new IllegalArgumentException("Já está reproduzindo");
        } else {
            this.setReproduzindo(true);
            System.out.println("Reproduzindo vídeo");
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("Vídeo pausado");
        } else {
            throw new IllegalArgumentException("Já está pausado");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
        System.out.println("Vídeo curtido");
    }

    @Override
    public void verStatus(){
        System.out.println("----------");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Avaliacao: " + this.getAvaliacao() + " estrelas");
        System.out.println("Views do vídeo: " + this.getViews() + " views");
        System.out.println("Curtidas: " + this.getCurtidas() + " curtidas");
        System.out.println("Reproduzindo? " + this.isReproduzindo());
        System.out.println("----------");
    }

    public void maisView(){
        this.setViews(this.getViews() + 1);
    }
}
