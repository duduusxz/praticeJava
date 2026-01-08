package app;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cachorro> cachorro = new ArrayList<>();
        List<Cobra> cobra = new ArrayList<>();
        List<Canguru> canguru = new ArrayList<>();
        List<PeixeDourado> peixeDourado = new ArrayList<>();
        List<Tartaruga> tartaruga = new ArrayList<>();
        List<Arara> arara = new ArrayList<>();

        cachorro.add(new Cachorro(10F, 20, 30, "Preto"));;
        cachorro.get(0).alimentar();

        cobra.add(new Cobra(10F, 20, 30, "Azul"));;
        cobra.get(0).locomover();

        arara.add(new Arara(10F, 20, 30, "Azul"));;
        arara.get(0).emitirSom();

        peixeDourado.add(new PeixeDourado(10F, 20, 30, "Azul"));

        cachorro.get(0).reagir(10, 15);
        cachorro.get(0).reagir(true);
        cachorro.get(0).reagir(20F, 3);
        cachorro.get(0).reagir("Cheguei");
    }

}