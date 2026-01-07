package model;

public class Bolsista extends Aluno {

    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista(String nome, int idade, String sexo, String curso, int bolsa) {
        super(nome, idade, sexo, curso);
        this.setBolsa(bolsa);
    }

    public void renovarBolsa(){

    }

    @Override
    public void pagarMensalidade(){

    }
}
