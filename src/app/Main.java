package app;

import model.Luta;
import model.Lutador;

public class Main {
    public static void main(String[] args) {

        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Eduardo", "França", 18, 1.75f, 54.2f);

        lutador[1] = new Lutador("Matheus", "Brasil", 21, 1.79f, 64.2f);

        lutador[2] = new Lutador("Solon", "Argelia", 22, 1.73f, 74.2f);

        lutador[3] = new Lutador("Gabriel", "Polonia", 24, 1.85f, 84.2f);

        lutador[4] = new Lutador("Patrick", "Hungria", 26, 1.95f, 94.2f);

        lutador[5] = new Lutador("Washington", "Alemanha", 28, 1.65f, 104.2f);

        Luta luta1 = new Luta();
        luta1.marcarLuta(lutador[0], lutador[3]);
        luta1.lutar();
        lutador[0].status();
        lutador[3].status();
    }
}
