package model;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.setCurso(curso);
    }

    // getters e setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // metodos

    public void cancelarMatricula(){

    }

    public void pagarMensalidade(){

    }

    @Override
    public void status(){
        super.status();
        System.out.println("Curso: " + this.getCurso());
        System.out.println("----------");
    }
}
