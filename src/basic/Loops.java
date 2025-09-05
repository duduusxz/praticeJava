package basic;

public class Loops {

    public static void main(String[] args) {

        for(int i = 0; i < 100; i+= 3){
            System.out.println(i);
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Esse é um loop de while");
            contador++;
        }
    }
}
