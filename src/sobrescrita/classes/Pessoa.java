package sobrescrita.classes;


public class Pessoa {

  public enum Tipo{
    PESSOA_FISICA(1,"Pessoa Física"), PESSOA_JURIDICA(2,"Pessoa Jurídica");
    private int numero;
    private String nome;

    Tipo(int numero, String nome){
      this.numero = numero;
      this.nome = nome;
    }

    public int getNumero(){
      return numero;
    }
    public String getNome(){
      return nome;
    }


  }

  private String nome;
  private byte idade;
  private Tipo tipo;

  public Pessoa(String nome, byte idade, Tipo tipo) {
    this.nome = nome;
    this.idade = idade;
    this.tipo = tipo;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public byte getIdade() {
    return idade;
  }
  public void setIdade(byte idade) {
    this.idade = idade;
  }
  public Tipo getTipo(){
    return tipo;
  }
  public void setTipo(Tipo tipo){
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "PESSOA:\nNome:" +nome
    +"\nIdade: " + idade
    +"\nTipo: "+tipo.getNome()
    +"\nNumero do tipo: "+tipo.getNumero();

  }


}
