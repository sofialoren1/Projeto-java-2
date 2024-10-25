import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do funcionario: ");
    String nome = scanner.nextLine();

    System.out.println("Digite a idade do funcionario: ");
    int idade = scanner.nextInt();

    System.out.println("Digite o salário do funcionario: ");
    double salario = scanner.nextDouble();

    Funcionario funcionario = new Funcionario();
    funcionario.setNome(nome);
    funcionario.setIdade(idade);
    funcionario.setSalario(salario);

    System.out.println("Nome: " + funcionario.getNome());
    System.out.println("Idade: " + funcionario.getIdade());
    System.out.println("Salário: " + funcionario.getSalario());
    scanner.close();
  }
}