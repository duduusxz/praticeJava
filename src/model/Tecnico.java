package model;

public class Tecnico extends Aluno{

    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public Tecnico(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo, curso);
    }

    public void praticar(){}

}
