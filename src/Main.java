public class Main {
    public static void main(String[] args) {

        //Caneta c1 = new Caneta("Master", "Verde", 0.3f);

        //c1.setModelo("BIC");
        //c1.modelo = "BIC";

        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;

        //System.out.println("Minha caneta tem o modelo " + c1.getModelo() + " e a ponta " + c1.getPonta());

        Produto brinquedo = new Produto("Carrinho", 18.99f, 300);
        brinquedo.status();
        System.out.println("");

        Produto decoracao = new Produto("Decoração Natal", 50.99f, 40);
        decoracao.status();
    }
}
