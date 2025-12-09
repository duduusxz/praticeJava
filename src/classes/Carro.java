package classes;

public class Carro {
    public String modelo;
    public String cor;
    public String marca;
    public boolean licenciado;

    public void dirigir(){
        if(this.licenciado == true){
            System.out.println("Liberado para dirigir");
        } else {
            System.out.println("Você não pode dirigir");
        }
    }
}