package interfaces.classes;


public interface iTributavel{
  //Interfaces não podem ser finais
  //todas as variáveis de uma interface são implicitamente public static final
  float IMPOSTO = 0.1f;
  //todos os métodos de uma interface são implicitamente public
  //caso não especificado, são abstratos
  //para não serem abstratos, podem ser estáticos e com corpo
  float calculaImposto();

}
