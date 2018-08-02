package assertivas.classes;


public class Funcionario{
  private float salario;

  public Funcionario(float salario) throws IllegalArgumentException {
    if (salario>0){
      throw new IllegalArgumentException("Salário menor que zero (salario<0)");
    }
    //a partir da 1.4 do JAVA
    //Usada apenas para auxiliar o desenvolvedor para que ele tenha CERTEZA ABSOLUTA de algo
    //Geralemte utilizadas em métodos privados
    //é possível capturar o erro, mas é EXTREMAMENTE não recomendável não fazer isso
    //para habilitar as assertivas, se utiliza -ea na hora de executar o comando java
    try{
      assert (salario>0) : "Salário menor que zero passou! Classe: assertivas.classes.Funcionario.java";
    }catch(AssertionError e){
      System.out.println("CAPTUREI UM ERRO!");
      e.printStackTrace();
    }
    System.out.println("MAIS QUE ZERO (supostamente)");
    this.salario = salario;
  }
	public float getSalario() {
		return this.salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
