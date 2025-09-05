package exercises;

import java.util.Scanner;

public class LitrosKm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto tempo leva sua viagem? Responda em horas");
        float tempo = sc.nextFloat();

        System.out.println("A qual velocidade você anda nesta viagem? Responda em Km/h");
        int velocidade = sc.nextInt();

        float distancia = tempo * velocidade;
        float litros = distancia / 12;

        System.out.println("Seu automóvel consome " + litros + "L de combustível nessa viagem");
    }
}
