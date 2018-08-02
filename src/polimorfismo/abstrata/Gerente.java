package polimorfismo.abstrata;


public class Gerente extends Funcionario{

	private float pnl;
	protected float salario;

  public Gerente(String nome, float salario,float pnl){
    super(nome, salario);
		this.pnl = pnl;
  }

	public float getPnl(){
		return this.pnl;
	}
	public void setpnl(float pnl){
		this.pnl = pnl;
	}

  @Override
  public float calculaSalario(){
    return this.salario + pnl;
  }



}
