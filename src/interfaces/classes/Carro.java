package interfaces.classes;

public class Carro implements iTributavel{

  private String nome;
  private float preco;

  public Carro(String nome, float preco){
    this.nome = nome;
    this.preco = preco;
  }

  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }
  public void setPreco(float preco) {
  	this.preco = preco;
  }
  public float getPreco() {
  	return preco;
  }

  //Uma classe que implementa uma interface, é obrigada a sobrescrever seus métodos abstratos
  //O método deve ser public, para não ferir as regras do Override
  @Override
  public float calculaImposto(){
    return this.preco * iTributavel.IMPOSTO;
  }
	@Override
	public String toString() {
		return "Carro:"
		+"\nnome: " +this.nome
		+"\npreco: " +this.preco
    +"\nImposto: "+this.calculaImposto();
	}
}
