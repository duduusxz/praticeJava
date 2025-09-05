package exercises;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius (°C):");
        float c = sc.nextFloat();

        float f = ((9 * c) / 5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é de: " + f + "°F");
    }
}
