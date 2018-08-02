package enumeracao.classes;

//Enum é um tipo de classe
public enum Sexo{
  MALE("Masculino"),
  FEMALE("Feminino"),

  //A constante a baixo tem um corpo de classe específico só dela...
  //Porém, esse corpo só pode interagir com o mundo externo através de sobrescrita de métodos
  INDEFINIDO("Indefinido"){
      public String tipo = "Anormal";
      public String getTipo(){
        return tipo;
      }
  };

  private String nome;

  Sexo(String nome){
    this.nome = nome;
  }

  public String getNome() {
  	return this.nome;
  }
  public String getTipo(){
    return "Normal";
  }


}
