package interfaces.classes;

public interface iTransportavel{
  //Interfaces não podem ser finais
  //todas as variáveis de uma interface são implicitamente public static final
  float FRETE = 0.05f;
  //todos os métodos de uma interface são implicitamente public
  //caso não especificado, são abstratos
  //para não serem abstratos, podem ser estáticos e com corpo
  float calculaFrete(float distancia);



}
