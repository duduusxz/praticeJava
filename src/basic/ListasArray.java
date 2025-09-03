package basic;
import java.util.ArrayList;

public class ListasArray {
    public static void main(String[] args){

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Eduardo");
        nomes.add("Felipe");
        nomes.add("Márcio");

        System.out.println(nomes.get(2));

        nomes.remove(1);

        System.out.println(nomes.get(1));
    }
}