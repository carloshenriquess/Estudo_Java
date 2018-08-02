package abstratas.classes;

//essa classe não é abstrata, então deverá implementar todos os métodos abstratos herdados
public class Vendedor extends Funcionario{

  private float vendas;

	public Vendedor() {
	}
  public Vendedor(String nome, byte idade, float salario, String cf){
    super(nome, idade, salario, cf);
  }
  public Vendedor(String nome, byte idade, float salario, String cf, float vendas){
    this(nome, idade, salario, cf);
    this.vendas = vendas;
  }

  public void setVendas(float vendas){
    this.vendas = vendas;
  }

  public float getVendas(){
    return this.vendas;
  }

  @Override
  public float calculaSalario(){
    return this.salario + (vendas * 0.05f);
  }

  @Override
  public String toString(){
    return "Vendedor:"
    +"\nNome: "+this.nome
    +"\nIdade: "+this.idade
    +"\nSalário: "+this.salario
    +"\nCF: "+this.cf
    +"\nVendas: "+this.vendas
    +"\nSalario Final: "+this.calculaSalario();
  }
  @Override
  public void testeAbstrato(){

  }


}
