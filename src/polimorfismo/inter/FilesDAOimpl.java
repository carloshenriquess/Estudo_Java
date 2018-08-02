package polimorfismo.inter;

//implementação específica do método save para essa classe
public class FilesDAOimpl implements GenericDAO {
  @Override
  public void save(){
    System.out.println("Salvo Arquivos");
  }
}
