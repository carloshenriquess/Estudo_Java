package erros.sobrescrita;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialException;
import java.rmi.AlreadyBoundException;

//Para a sobrescrita de métodos que lançam exceções, existem algumas regras
//não se pode lançar exceções que não sejam idênticas ou SubClasses das exceções do método da SuperClasse
//Resumindo, a única regra é que a SubClasse não pode inventar mais que a SuperClasse
public class Funcionario extends Pessoa{

  // //pode-se replicar exatamente as exceções da SuperClasse
  // @Override
  // public void salvar() throws FileNotFoundException, SQLException{}

  // //pode-se não lançar nenhuma exceção da SuperClasse
  // @Override
  // public void salvar(){
  //
  // }

  // //pode-se lançar algumas das exceções da SuperClasse
  // @Override
  // public void salvar() throws SQLException{}

  // //pode-se lançar SubClasses das exceções da SuperClasse
  // @Override
  // public void salvar() throws SerialException{}

  // //NÃO NÃO NÃO NÃO NÃO NÃO NÃO NÃO
  // //NÃO se pode inserir uma exceção superior ou completamente diferente da SuperClasse
  // @Override
  // public void salvar() throws AlreadyBoundException{}
}
