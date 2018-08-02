package erros.trycatch;

import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import erros.trycatch.ExSub;
import erros.trycatch.ExSoma;

public class WithResources{
  public static void main(String[] args) {

      // cria6();
      // cria7();
      System.out.println(ex7());
  }


  //havia um problema para fechar conexões até o JAVA 6:
  //o ato inicial da conexão podia geral algumas exceções, e o fechamento também gerava exceção
  //assim, era necessário a utilização e um try-catch dentro do outro
  private static void cria6(){
    Reader r=null;
    try {
      //Essa linha pode lançar uma exceção FileNotFoundException pelo construtor de FileReader
      r = new BufferedReader(new FileReader("TXT.txt"));
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    }finally{
      try {
        //O método close() pode lançar uma IOException
        r.close();
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }


  //Na versão JAVA 7 foi implementada uma nova maneira de trabalhar com try...
  private static void cria7(){
    //Abre-se um parênteses após o try, e dentro cria-se uma variável local do tipo reference para um objeto local (um recurso)
    //Esse objeto deve implementar a interface Closeable (que só contém o método close()) para ser aceito no try
    try(
      //O ";" não é obrigatório caso só se insira 1 recurso. Caso tenha mais de um, se separa com vírgula
      //Não é possível adicionar recursos já criados para serem fechados automáticamente no catch
      //qualquer exceção que possa acontecer na criação dos recursos é lançada para o catch
      //neste caso, a FileNotFoundException pode ser lançada pelo construtor de FileReader
      Reader r = new BufferedReader(new FileReader("TXT.txt"));
    ){
      //dentro do try
      System.out.println("To lendo");
      r.read();
      //Nem o catch nem o finally são obrigatórios caso seja um try-with-resources
    }catch (IOException e) {
      e.printStackTrace();
    }
    //No fim o método close sempre é executado, sem precisar de um finally
    //A IOException lançada pelo método close() é também lançada para o catch
    System.out.println("Fim");

  }

  private static boolean ex7(){

    try(
      ExSoma so = new ExSoma();
      ExSub su = new ExSub()
    ){
      so.soma(2, 4);
      su.sub(5, 1);
      //O close() é executado antes do método retornar para quem o chamou, assim como o finally
      return testRetorno();
    }catch(IOException e){
      e.printStackTrace();
    }
    return false;
  }

  private static boolean testRetorno(){
    System.out.println("TESTE");


    return true;
  }
}
