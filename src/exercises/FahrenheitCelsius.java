package exercises;

import java.util.Scanner;

public class FahrenheitCelsius{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit (°F):");
        float f = sc.nextFloat();

        float c = ((f - 32) * 5) / 9;
        System.out.println("A temperatura em graus Celsius é de: " + c + "°C");
    }
}
