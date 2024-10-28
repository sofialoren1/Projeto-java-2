class Pessoa{
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  //Sobrescrevendo o metodo Equalos
  @Override
  public boolean equals(Object obj){
    if( this == obj){
      return true;
    }
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Pessoa outraPessoa = (Pessoa) obj;
    return idade == outraPessoa.idade && nome.equals(outraPessoa.nome);
  }
}