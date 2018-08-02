package abstratas.classes;

//uma classe abstrata pode ter métodos abstratos e não abstratos
//porém, um método abstrato só pode existir em uma classe abstrata
public abstract class Pessoa{

  protected String nome;
  protected byte idade;

  public Pessoa(){

  }
	public Pessoa(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
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

  //O método abaixo é abstrato.
  //a primeira classe não abstrata, é obrigada a sobrescrever esses métodos
  public abstract void testeAbstrato();
  //mesmo o método toString() que já existe em todas as classes, deverá ser sobrescrito
  public abstract String toString();


}
