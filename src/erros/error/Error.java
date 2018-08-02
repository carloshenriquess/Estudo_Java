package erros.error;

//Erros são praticamente impossíveis de serem tratados, já que não há muito que você possa fazer
public class Error{
  public static void main(String... args) {
    //Quando um métodos se chamam infinitamente, ocorre o Stack Overflow Error
    //Erro em tempo de execução, não há o que fazer
    System.out.println("Exemplo Stack Overflow Error");
    main("");
  }

}
