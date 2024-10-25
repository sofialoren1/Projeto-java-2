import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cadastro cadastro = new Cadastro();

    while (true) {
      System.out.println("1. Adicionar Cliente");
      System.out.println("2. Listar Clientes");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");
      int opcao = scanner.nextInt();
      scanner.nextLine(); // Consumir a nova linha

      switch (opcao) {
        case 1:
          System.out.print("Digite o nome do cliente: ");
          String nome = scanner.nextLine();
          System.out.print("Digite o email do cliente: ");
          String email = scanner.nextLine();
          System.out.print("Digite o telefone do cliente: ");
          String telefone = scanner.nextLine();

          Cliente cliente = new Cliente(nome, email, telefone);
          cadastro.adicionarCliente(cliente);
          break;

        case 2:
          cadastro.listarClientes();
          break;

        case 3:
          System.out.println("Saindo...");
          scanner.close();
          return;

        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }
  }
}