package model;

public class Animal {

    private float peso;
    private int idade;
    private int membros;

    public Animal(float peso, int idade, int membros) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void locomover(){

    }

    public void alimentar(){

    }

    public void emitirSom(){

    }
}
