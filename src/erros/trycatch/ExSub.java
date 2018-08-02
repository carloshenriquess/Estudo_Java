package erros.trycatch;

import java.io.Closeable;
import java.io.IOException;

public class ExSub implements Closeable{
  public ExSub()throws IOException{
    System.out.println("\nSubtração Aberta");
  }

  @Override
  public void close(){
    System.out.println("\nSubtração Fechada");
  }

  public void sub(int n1, int n2){
    System.out.println((n1-n2));
  }


}
