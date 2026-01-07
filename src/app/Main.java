package app;

import dao.ClienteDAO;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClienteDAO dao = new ClienteDAO();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Email: ");
                    String email = sc.nextLine();

                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    Cliente c = new Cliente(email, nome);
                    dao.cadastrar(c);
                    System.out.println("✅ Cliente cadastrado!");
                    break;

                case 2:
                    System.out.println("\n=== CLIENTES CADASTRADOS ===");

                    List<Cliente> cliente = dao.listar();

                    if (cliente.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente cli : cliente) {
                            System.out.println(
                                    "Nome: " + cli.getNome() + " | Email: " + cli.getEmail()
                            );
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}