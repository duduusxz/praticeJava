import classes.Controle;

public class Main {
    public static void main(String[] args) {
        Controle controleVideoGame = new Controle();

        controleVideoGame.modelo = "xBox360";
        controleVideoGame.tipo = "VideoGame";
        controleVideoGame.cor = "Preto";
        controleVideoGame.numBotoes = 16;
        controleVideoGame.peso = 0.300f;

        controleVideoGame.ligar();
        controleVideoGame.status();
        controleVideoGame.jogar();
        controleVideoGame.desligar();
    }
}