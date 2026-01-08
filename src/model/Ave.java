package model;

public class Ave extends Animal{

    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.setCorPena(corPena);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Ninho construído");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo peixes");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu");
    }
}
