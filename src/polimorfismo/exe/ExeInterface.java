package polimorfismo.exe;

import polimorfismo.inter.*;

public class ExeInterface {
  public static void main(String[] args) {

    //A variável de referência é mais genérica
    //Dessa forma, é possível trocar o objeto a vontade sem que ocorram erros
    Database d = new DatabaseDAOimpl();
    d.save();
    d = new FilesDAOimpl();
    d.save();
  }
}
