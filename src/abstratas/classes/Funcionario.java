package abstratas.classes;

//Essa classe também é abstrata, então não precisa implementar esses métodos
public abstract class Funcionario extends Pessoa{

  protected float salario;
  protected String cf;

  protected Funcionario() {

  }
	protected Funcionario(String nome, byte idade, float salario, String cf) {
		super(nome, idade);
		this.salario = salario;
		this.cf = cf;
	}


	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}


  protected abstract float calculaSalario();

}
