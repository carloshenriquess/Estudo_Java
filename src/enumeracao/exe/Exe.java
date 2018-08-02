package enumeracao.exe;

import enumeracao.classes.Pessoa;
import enumeracao.classes.Sexo;

public class Exe{
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Josefina",20,Sexo.INDEFINIDO);
    System.out.println(p);
    System.out.println(p.getSexo().INDEFINIDO.getTeste());
  }
}
