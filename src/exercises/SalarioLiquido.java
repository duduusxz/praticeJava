package exercises;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas");
        double ht = sc.nextDouble();
        double hg = ht * 24;

        double vh = 20;

        System.out.println("Qual o percentual é descontado do seu trabalho?");
        double pd = sc.nextDouble();

        double sb = hg * vh;

        double td = (pd / 100) * sb;

        double sl = sb - td;

        System.out.println("Salario Liquido: R$ " + " " + sl + "Salário base é: R$ " + sb);
    }
}
