package polimorfismo.inter;

//implementação específica do método save para essa classe
public class DatabaseDAOimpl implements GenericDAO {
  @Override
  public void save(){
    System.out.println("Salvo no Banco de dados");
  }
}
