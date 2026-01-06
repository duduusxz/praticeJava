package app;

import model.Livro;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa[] = new Pessoa[4];

        pessoa[0] = new Pessoa("Eduardo", 18, "Masculino");
        pessoa[1] = new Pessoa("Guilherme", 17, "Masculino");
        pessoa[2] = new Pessoa("Isabela", 18, "Feminino");
        pessoa[3] = new Pessoa("Giovana", 19, "Feminino");

        Livro livro[] = new Livro[4];

        livro[0] = new Livro("O menino do pijama listrado", "Jhon Meyer", 300);
        livro[1] = new Livro("O gato de botas", "JK Rolling", 1000);
        livro[2] = new Livro("O furto de paris", "Matue", 20);
        livro[3] = new Livro("A ditadura militar", "Nicolau Kardashian", 500);

        livro[2].abrir(pessoa[0]);
        livro[2].folhear(pessoa[0], 19);
        livro[2].detalhes();

    }
}
