package model;

public class PeixeDourado extends Peixe {
    public PeixeDourado(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("andando bem devagar");
    }
}
