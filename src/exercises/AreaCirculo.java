package exercises;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

    double pi = 3.1415;

    Scanner sc = new Scanner(System.in);

    System.out.println("Qual será o raio do círculo?");
    int raio = sc.nextInt();
    double area = pi * Math.pow(raio, 2);

    System.out.println("A área do círculo é: " + area);

}
}
