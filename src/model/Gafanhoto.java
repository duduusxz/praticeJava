package model;

import contract.Visivel;

public class Gafanhoto extends Pessoa implements Visivel {

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void assistir(){
        this.setTotAssistido(getTotAssistido() + 1);
    }

    @Override
    public void verStatus(){
        System.out.println("----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Login: " + this.getLogin());
        System.out.println("Total de vídeos assistidos: " +  this.getTotAssistido());
        System.out.println("----------");
    }
}
