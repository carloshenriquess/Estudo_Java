package polimorfismo.exe;

import polimorfismo.abstrata.*;

public class ExeAbstrata{
  public static void main(String[] args) {
    System.out.println("**************************");
    Funcionario fg = new Gerente("Pedro",2000f,1000f);
    Funcionario fv = new Vendedor("Luis",1000f,300000);
    System.out.println(Relatorio.relatorio(fg));
    System.out.println("**************************");
    System.out.println(Relatorio.relatorio(fv));
    System.out.println("**************************");

  }
}
