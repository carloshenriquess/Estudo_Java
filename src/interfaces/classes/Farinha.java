package interfaces.classes;

//Diferente de classes abstratas, classes podem implementar diversas interfaces ao mesmo tempo
public class Farinha implements iTributavel, iTransportavel{

  private String nome;
  private float preco;
  private float peso;

	public Farinha(String nome, float preco, float peso) {
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

  //Uma classe que implementa uma interface, é obrigada a sobrescrever seus métodos abstratos
  @Override
  public float calculaImposto(){
    return this.preco * iTributavel.IMPOSTO;
  }
  @Override
  public float calculaFrete(float distancia){
    return this.peso * iTransportavel.FRETE * distancia;
  }
  @Override
	public String toString() {
		return "Carro:"
    +"\nNome= " + this.nome
    +"\nPreco= " + this.preco
    +"\nImposto= "+this.calculaImposto();

	}
}
