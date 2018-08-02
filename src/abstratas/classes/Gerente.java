package abstratas.classes;

//essa classe não é abstrata, então deverá implementar todos os métodos abstratos herdados
public class Gerente extends Funcionario{

	public Gerente() {
	}
  public Gerente(String nome, byte idade, float salario, String cf){
    super(nome, idade, salario, cf);
  }

  @Override
  public float calculaSalario(){
    return this.salario * 1.2f;
  }
  @Override
  public String toString(){
    return "Gerente: "
    +"\nNome: "+this.nome
    +"\nIdade: "+this.idade
    +"\nSalario: "+this.salario
    +"\nCF: "+this.cf
    +"\nSalario final: "+this.calculaSalario();
  }
  @Override
  public void testeAbstrato(){

  }

}
