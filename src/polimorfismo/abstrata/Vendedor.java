package polimorfismo.abstrata;


public class Vendedor extends Funcionario{

  private float vendas;



  public Vendedor(String nome, float salario, float vendas){
    super(nome, salario);
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




}
