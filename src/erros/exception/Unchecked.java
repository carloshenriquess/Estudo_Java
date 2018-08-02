package erros.exception;


//Exceptions do tipo Unchecked não são obrigadas a terem um tratamento, e são a RuntimeException + suas SubClasses
public class Unchecked{
  public static void main(String[] args) {

    // divisao1(1,0);
    // //a linha abaixo não será executada, pois o método lança uma exceção que o método main não trata
    // System.out.println("**************");

    // divisao2(2,0);
    // //a linha abaixo não será executada, pois não há try-catch
    // System.out.println("**************");

    // divisao3(3,0);
    // //a linha abaixo não será executada, pois o método lança uma exceção que o método main não trata
    // System.out.println("**************");

    // divisao4(4,0);
    // //A linha abaixo é executada normalmente, pois há um try-catch para a exceção
    // System.out.println("**************");

    // divisao5(5,0);
    // //A linha abaixo é executada normalmente, pois há um try-catch para a exceção
    // System.out.println("**************");

    // divisao6(6,0);
    // //A linha abaixo não é executada, pois mesmo tendo um try-catch, no catch a exceção é relançada
    // //e o método main não trata a exceção
    // System.out.println("**************");

    // divisao7(7,0);
    // //A linha abaixo não é executada, pois mesmo tendo um try-catch, no catch a exceção é relançada
    // //e o método main não trata a exceção
    // System.out.println("**************");

    // try {
    //   divisao8(8,0);
    // } catch(ArithmeticException e) {
    //   e.printStackTrace();
    // }
    // //A linha abaixo é executada normalmente, pois a exceção é tratada no bloco try-catch acima
    // System.out.println("**************");

  }

  //Esse método prevê o erro, e cria um objeto novo de erro que não contém nada
  private static void divisao1(int n1,int n2){
    System.out.println("Divisão 1");
    if (n2 ==0) {
      throw new ArithmeticException();
    }
    float r = n1/n2;
  }

  //Esse método faz o mesmo que o anterior, mas cria um novo objeto com uma mensagem
  private static void divisao2(int n1,int n2){
    System.out.println("Divisão 2");
    if (n2 ==0) {
      throw new ArithmeticException("passe um valor diferente de 0 para \"n2\"");
    }
    float r = n1/n2;
  }

  //Os exemplos anteriores estão incorretos, pois o ArithmeticException não chega a ocorrer de fato
  //o erro que ocorreu de fato foi um IllegalArgumentException, pois um valor de argumento inválido foi passado
  private static void divisao3(int n1,int n2){
    System.out.println("Divisão 3");
    if (n2 ==0) {
      throw new IllegalArgumentException("passe um valor diferente de 0 para \"n2\"");
    }
    float r = n1/n2;
  }

  //Esse método envolve onde o erro pode ocorrer com try catch, mas não faz nada no catch
  //O programa continua executando normalmente após o catch, então o erro passa despercebido
  //por isso nunca se deve deixar um catch sem nada
  private static void divisao4(int n1,int n2){
    System.out.println("Divisão 4");
    try {
      float r = n1/n2;
    } catch(ArithmeticException e) {
      //NADA
    }
  }

  //O próprio sistema gera um objeto do tipo ArithmeticException com várias informações,
  //e esse objeto é referenciado pela variável "e" no catch.
  //para ver algumas de suas informações, utilise .getMessage() ou printStackTarce()
  private static void divisao5(int n1,int n2){
    System.out.println("Divisão 5");
    try {
      float r = n1/n2;
    } catch(ArithmeticException e) {
      //getMessage() retorna uma String com a mensagem do erro
      System.out.println(e.getMessage());
      //printStackTrace() imprime no log algumas informações
      e.printStackTrace();
    }
  }

  //esse método pega a exceção, porém relança ela com o throw
  private static void divisao6(int n1,int n2){
    System.out.println("Divisão 6");
    try {
      float r = n1/n2;
    } catch(ArithmeticException e) {
      throw e;
    }
  }

  //esse método já deixa explícito que ele pode lançar uma ArithmeticException, porém...
  //como ArithmeticException é uma exceção Unchecked (RuntimeException) o tratamento não é obrigatório mesmo assim
  private static void divisao7(int n1,int n2) throws ArithmeticException{
    System.out.println("Divisão 7");
    try {
      float r = n1/n2;
    } catch(ArithmeticException e) {
      System.out.println(e.getMessage());
      throw e;
    }
  }

  //esse método é idêntico ao método acima, porém sem que fique explícito que ele lança uma ArithmeticException.
  //para a JVM não faz diferença se está explícito ou não, pois é Unchecked.
  private static void divisao8(int n1,int n2){
    System.out.println("Divisão 8");
    try {
      float r = n1/n2;
    } catch(ArithmeticException e) {
      System.out.println(e.getMessage());
      throw e;
    }
  }

}
