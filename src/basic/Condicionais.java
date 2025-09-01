package basic;

public class Condicionais {

    public static void main(String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5F;
        double d = 10.5;
        char c = 'a';
        String str = "";

        if(str == "eduardo"){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (str.isBlank()){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}