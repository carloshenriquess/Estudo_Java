package erros.exception;

import java.io.File;
import java.io.IOException;

//Exceptions do tipo Checked são obrigadas a terem um tratamento, e são a classe Exception + suas SubClasses que não tenham ligação com RuntimeException
public class Checked{
  public static void main(String[] args) {

    // //O próprio método já trata o erro
    //criaArquivo1();

    // //O método que chamou é obrigado a tratar o erro
    // try {
    //   criaArquivo2();
    // } catch(IOException e) {
    //   System.out.println(e.getMessage());
    //   e.printStackTrace();
    // }

    // //Tanto o método chamado quanto o que chamou tratam o erro
    // try {
    //   criaArquivo3();
    // } catch(Exception e) {
    //   e.printStackTrace();
    // }

  }

  //Esse método trata o erro sozinho
  public static void criaArquivo1(){
    File f = new File("TXT.txt");
    //a exceção que createNewFile() pode lançar deve ser obrigatóriamente tratada, já que IOException é Checked
    try {
      String s = (f.createNewFile()) ?"Arquivo Criado":"Impossível criar Arquivo";
      System.out.println(s);
    } catch(IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

  //Esse método passa toda a responsabilidade de tratar a exceção para o método que chamar
  public static void criaArquivo2() throws IOException{
    File f = new File("TXT.txt");
    String s = (f.createNewFile()) ?"Arquivo Criado":"Impossível criar Arquivo";
    System.out.println(s);
  }

  //Esse método faz seu tratamento, e relança o erro para a classe que chamou tratar também
  public static void criaArquivo3() throws IOException{
    File f = new File("TXT.txt");
    try {
      String s = (f.createNewFile()) ?"Arquivo Criado":"Impossível criar Arquivo";
      System.out.println(s);
    } catch(IOException e) {
      System.out.println(e.getMessage());
      throw e;
    }
  }
  
}
