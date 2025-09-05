package exercises;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro:");
        int r = sc.nextInt();
        System.out.println("Digite a altura do cilindro:");
        int h = sc.nextInt();

        double pi = Math.PI;

        double v = (pi * Math.pow(r, 2)) * h;

        System.out.println("O volume do cilindro é de: " + v + "cm³");
    }
}
