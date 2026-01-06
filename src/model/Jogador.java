package model;

public class Jogador extends Pessoa {
    private String esporte;
    private String clube;
    private String posicao;

    // constructor

    public Jogador(String nome, int idade, String sexo, String esporte, String clube, String posicao) {
        super(nome, idade, sexo);
        this.setEsporte(esporte);
        this.setClube(clube);
        this.setPosicao(posicao);
    }

    // gettres e setters

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public void status(){
        super.status();
        System.out.println("Esporte: " + getEsporte());
        System.out.println("Clube: " + getClube());
        System.out.println("Posicao: " + getPosicao());
        System.out.println("----------");
    }
}
