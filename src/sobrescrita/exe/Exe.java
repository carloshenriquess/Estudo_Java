package sobrescrita.exe;

import sobrescrita.classes.Pessoa;

public class Exe{

    public static void main(String[] args) {

    Pessoa p = new Pessoa("João", (byte)30, Pessoa.Tipo.PESSOA_FISICA);
    System.out.println(p);


  }
}
