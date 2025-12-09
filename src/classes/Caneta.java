package classes;

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    public boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
    }

    public void tampar(){
        this.tampada = true;
        System.out.println("Caneta tampada");
    }

    public void destampar(){
        this.tampada = false;
        System.out.println("Caneta destampada");
    }

    public void escrever(){
        if (this.tampada == true){
            System.out.println("Impossível escrever amigão");
        } else {
            System.out.println("É pra já.");
        }
    }
}
