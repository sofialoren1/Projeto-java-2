import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente: ");
    String nome = scanner.nextLine();

    System.out.println("Digite a cidade: ");
    String cidade = scanner.nextLine();

    System.out.println("Digite a idade do cliente: ");
    int idade = scanner.nextInt();

    System.out.println("Digite o salario do cliente:");
    int salario = scanner.nextInt();

    Pessoa pessoa = new Pessoa();
    pessoa.setNome(nome);
    pessoa.setIdade(idade);
    pessoa.setCidade(cidade);
    pessoa.setSalario(salario);

    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade());
    System.out.println("Cidade: " + pessoa.getCidade());
    System.out.println("Salario: " + pessoa.getSalario());
    scanner.close();
  }

}