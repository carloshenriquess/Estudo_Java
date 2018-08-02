package abstratas.exe;

import abstratas.classes.Vendedor;
import abstratas.classes.Gerente;

public class Exe {
  public static void main(String[] args) {
    Gerente g = new Gerente();
    g.setNome("João");
    g.setIdade((byte)30);
    g.setSalario(5000);
    g.setCf("wasdwasd12");
    System.out.println(g);
    System.out.println("\n********************\n");

    Vendedor v = new Vendedor("Mario",(byte)25,1500,"qwerty321",10000);
    System.out.println(v);
  }
}
