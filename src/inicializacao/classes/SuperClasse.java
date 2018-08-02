package inicializacao.classes;

public class SuperClasse{

  //4- SUPERCLASSE: CONSTRUTOR
  public SuperClasse(){
    System.out.println("SuperClasse construtor\n");
  }


  //3- SUPERCLASSE:   BLOCOS DE INICIALIZACAO E INICIALIZACAO DE VARIAVEIS COM VALORES EXPLICITOS NA ORDEM EM QUE APARECEM
  int atributo1 = 1;
  {
    System.out.println("SuperClasse Bloco 1");
  }
  int atributo2 = 2;
  {
    System.out.println("SuperClasse Bloco 2\n");
  }

  //1- BLOCO ESTATICO SUPERCLASSE (APENAS UMA VEZ)
static{
    System.out.println("SuperClasse Bloco Estatico\n");
  }

}
