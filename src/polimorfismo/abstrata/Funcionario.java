package polimorfismo.abstrata;


public abstract class Funcionario{

  protected float salario;
  protected String nome;
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}

  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

  public abstract float calculaSalario();

}
