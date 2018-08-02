package enumeracao.classes;

import enumeracao.classes.Sexo;

public class Pessoa{

  private String nome;
  private int idade;
  private Sexo sexo;

  public Pessoa(String nome, int idade, Sexo sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}




	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}



	@Override
	public String toString() {
		return "Pessoa: "+
    "\nNome= " +this.nome
    +"\nIdade= " +this.idade
    +"\nSexo= "+this.sexo.getNome()
    +"\nTipo do Sexo= "+this.sexo.getTipo();
	}


}
