package model;

public class Cachorro extends Mamifero{
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abandando Rabo");
    }

    public void reagir(String frase){
        if (frase.equals("Comida dog") || frase.equals("Cheguei")){
            System.out.println("Abanando rabo");
        } else {
            System.out.println("Cachorro está rosnando");
        }
    }
    
    public void reagir(int hora, int minuto){
        if (hora < 12){
            System.out.println("Abandando rabo");
        } else if (hora >= 18){
            System.out.println("Latindo");
        } else {
            System.out.println("Abanando rabo e latindo");
        }
    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abandando rabo");
        } else {
            System.out.println("Latir");
        }
    }

    public void reagir(float peso, int idade){
        if (idade < 5) {

            if (peso < 10){
                System.out.println("Abandando rabo");
            } else {
                System.out.println("Latindo");
            }
        } else {
            if (peso < 10){
                System.out.println("Rosnando");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

}
