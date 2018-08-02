package polimorfismo.abstrata;

public class Relatorio{
  public static String relatorio(Funcionario f){
    String s = "Relatório do Funcionário: "
    +"\nNome: "+f.getNome()
    +"\nSalário: "+Float.toString(f.calculaSalario());
    if (f instanceof Gerente) {
      s += "\nParticipação nos lucros: "+((Gerente)f).getPnl();
    }else if(f instanceof Vendedor){
      s += "\nVendas: "+((Vendedor)f).getVendas();
    }

    return s;
  }
}
