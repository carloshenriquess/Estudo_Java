package assertivas.exe;

import assertivas.classes.Funcionario;

public class Exe{
  public static void main(String[] args) {
    Funcionario f = new Funcionario(-1);
    System.out.println("Salário: "+f.getSalario());
  }
}
