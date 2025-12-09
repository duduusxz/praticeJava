import classes.Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "Bic";
        caneta1.cor = "Verde";
        caneta1.ponta = 0.2;
        caneta1.tampar();
        caneta1.status();
        caneta1.escrever();
        caneta1.destampar();
        caneta1.escrever();
    }
}