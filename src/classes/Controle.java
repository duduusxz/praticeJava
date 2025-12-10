package classes;

public class Controle {
    public String tipo;
    public String modelo;
    public String cor;
    public int numBotoes;
    public float peso;
    public boolean ligado;

    public void status(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número de botões: " + this.numBotoes);
        System.out.println("Peso: " + this.peso + "kg");
        System.out.println("Ligado: " + this.ligado);
    }

    public void ligar(){
        this.ligado = true;
        System.out.println("Seu controle foi ligado");
    }

    public void desligar(){
        this.ligado = false;
        System.out.println("Seu controle foi desligado");
    }

    public void jogar(){
        if(this.ligado == true){
            System.out.println("Você está jogando");
        } else {
            System.out.println("Seu controle está desligado, ligue para jogar.");
        }

    }
}
