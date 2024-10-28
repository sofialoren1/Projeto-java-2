public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("João", 25, "123.123.123-00");
    Pessoa p2 = new Pessoa("Maria", 30, "123.123.123-00");

    System.out.println("A pessoa1 é igual a pessoa2? " + p1.equals(p2));
  }

}