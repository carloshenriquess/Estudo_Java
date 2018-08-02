package interfaces.exe;

import interfaces.classes.Carro;
import interfaces.classes.Farinha;


public class Exe{
  public static void main(String[] args) {
    Carro c = new Carro("Fusca", 1500);
    Farinha f = new Farinha("Rosca", 1.5f, 1000);
    System.out.println(c);
    System.out.println("\n********************\n");
    System.out.println(f);
    System.out.println("Frete: "+f.calculaFrete(500));
  }
}
