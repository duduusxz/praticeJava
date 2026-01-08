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
}
