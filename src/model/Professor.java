package model;

public final class Professor extends Funcionario {
    private String especialidade;
    private int salario;

    public Professor(String nome, int idade, String sexo, int salario) {
        super(nome, idade, sexo);
        this.setSalario(salario);
    }

    // getters e setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // metodos

    public void receberAumento(){

    }

    @Override
    public void status(){
        super.status();
        System.out.println("Salario: " + this.getSalario());
        System.out.println("----------");
    }
}
