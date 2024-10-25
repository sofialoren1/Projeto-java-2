public class Funcionario{
  private String nome;
  private int idade;
  private double salario;

  //Getter nome
  public String getNome(){
    return this.nome;
  }

  //Setter nome
  public void setNome(String nome){
    this.nome = nome;
  }

  //Getter idade
  public int getIdade(){
    return this.idade;
  }

  //Setter idade
  public void setIdade(int idade){
    this.idade = idade;
  }

  //Getter salario
  public double getSalario(){
    return this.salario;
  }

  //Setter salario
  public void setSalario(double salario){
    this.salario = salario;
  }
}