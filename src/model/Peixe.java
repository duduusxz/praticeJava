package model;

public class Peixe extends Animal {

    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.setCorEscama(corEscama);
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias marítmicas");
    }

    @Override
    public void emitirSom(){
        throw new IllegalArgumentException("Peixe nao faz som.");
    }
}
