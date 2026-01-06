package app;

import model.Aluno;
import model.Jogador;
import model.Professor;

public class Main {
    public static void main(String[] args) {

        Aluno aluno[] = new Aluno[3];
        Professor professor[] = new Professor[3];
        Jogador jogador[] = new Jogador[3];

        aluno[0] = new Aluno("Eduardo", 28, "Masculino", "Analise de dados");
        aluno[1] = new Aluno("Miguel", 22, "Masculino", "Cyber Security");
        aluno[2] = new Aluno("Guilherme", 24, "Masculino", "Ciencia da Computação");

        aluno[0].fazerAniversario();
        aluno[0].status();

        professor[0] = new Professor("Nicolau", 48, "Masculino", 1518);
        professor[1] = new Professor("Marta", 52, "Feminino", 2900);
        professor[2] = new Professor("Igor", 21, "Masculino", 900);

        professor[0].status();

        jogador[0] = new Jogador("Gabigol", 24, "Masculino", "Handebol", "Corinthians", "Fixo");
        jogador[1] = new Jogador("Vitor Roque", 18, "Masculino", "Volei", "São Paulo", "Levantador");
        jogador[2] = new Jogador("Mazzola", 45, "Masculino", "Futebol", "Palmeiras", "Goleiro");

        jogador[0].status();
        jogador[1].status();
        jogador[2].status();

    }
}
