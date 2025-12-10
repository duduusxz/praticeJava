import classes.Controle;

public class Main {
    public static void main(String[] args) {
        Controle controleVideoGame = new Controle();

        controleVideoGame.tipo = "VideoGame";
        controleVideoGame.modelo = "xBox360";
        //controleVideoGame.cor = "Preto";
        //controleVideoGame.peso = 0.300f;

        //não está no mesmo pacote, por isso o protected não funciona

        controleVideoGame.status();
    }
}