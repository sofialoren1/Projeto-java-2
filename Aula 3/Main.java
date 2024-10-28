
public class Main {
  public static void main(String[] args) {
  Pessoa pessoa1 = new Pessoa("joão", 25);
  Pessoa pessoa2 = new Pessoa("suelen", 18);
  Pessoa pessoa3 = new Pessoa("loren", 19);  
    
    System.out.println("A pessoa é igual a pessoa2?" + pessoa1.equals(pessoa2));
    System.out.println("A pessoa é igual a pessoa3?" + pessoa1.equals(pessoa3));
  } 
}