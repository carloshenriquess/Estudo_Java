package erros.trycatch;

import java.io.Closeable;
import java.io.IOException;

public class ExSoma implements Closeable{
  public ExSoma()throws IOException{
    System.out.println("\nSoma Aberta");
  }

  @Override
  public void close(){
    System.out.println("\nSoma Fechada");
  }

  public void soma(int n1, int n2){
    System.out.println((n1 + n2));
  }
}
