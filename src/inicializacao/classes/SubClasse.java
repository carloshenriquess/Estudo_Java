package inicializacao.classes;

public class SubClasse extends SuperClasse {

  //6- SUBCLASSE: CONSTRUTOR
  public SubClasse() {
    super();
    System.out.println("SubClasse construtor\n");
  }

  //5- SUBCLASSE:  BLOCOS DE INICIALIZACAO E INICIALIZACAO DE VARIAVEIS COM VALORES EXPLICITOS NA ORDEM EM QUE APARECEM
  {
    System.out.println("SubClasse bloco 1");
  }
  public static String atributo3 = "a";
  {
    System.out.println("SubClasse bloco 2");
    System.out.println("atributo3: "+atributo3+"\n");
  }

  //2- O BLOCO ESTATICO DA SUBCLASSE EH EXECUTADO (APENAS UMA VEZ)
  static {
    System.out.println("SubClasse bloco estatico");
    atributo3 = "b";
    System.out.println("Atributo3: "+atributo3+"\n");
  }

}
