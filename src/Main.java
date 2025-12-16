public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumConta(1111);
        conta1.setNome("Carlos");
        conta1.abrirConta("CC");
        conta1.depositar(100);
        conta1.estadoAtual();

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumConta(2222);
        conta2.setNome("Marta");
        conta2.abrirConta("CP");
        conta2.depositar(500);
        conta2.sacar(100);
        conta2.estadoAtual();
    }
}