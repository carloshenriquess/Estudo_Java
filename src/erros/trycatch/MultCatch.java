package erros.trycatch;

import java.io.IOException;
import java.sql.SQLException;

public class MultCatch{
  public static void main(String[] args) {
    // //JAVA 6 pra baixo
    // java6();


    // //JAVA 7 pra cima
    // java7();
  }

//Esse método trata múltiplos erros da forma que era até o JAVA 6
  private static void java6(){

    //é importante lembrar que os catchs devem ser organizados com os quem contém as Exceptions mais específicas para as mais genéricas
    //pois caso coloque um catch com exception muito genérico antes (como por exemplo a Exception, que é a mais genérica de todas)...
    //outros catchs que contenham suas subclasses jamais serão executados.
    try {
      System.out.println("LANÇANDO");
      lancei();
    }catch(IOException e) {
      System.out.println("TRATEI IOException");
      e.printStackTrace();
    }catch(SQLException e){
      System.out.println("TRATEI SQLException");
      e.printStackTrace();
    }
    // A baixo um exemplo da exceção do tipo Exception sendo tratada por último, pois se estivesse antes...
    // nenhum dos outros catchs jamais seria executado;
    catch(Exeption e){
      System.out.println("TRATEI Exception");
      e.printStackTrace();
    }
  }


  private static void java7(){
    try {
      System.out.println("LANÇANDO");
      lancei();
    }catch(IOException | SQLException e) {
      System.out.println("TRATEI OS 2");
      e.printStackTrace();
    }
  }

  private static void lancei() throws IOException, SQLException{
    throw new SQLException("SQLException Novinha");
    // throw new Exception("TESTE");
  }


}
