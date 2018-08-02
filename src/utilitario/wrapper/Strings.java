package utilitario.wrapper;

//As strings são imutáveis. Quando uma nova string é criada, ele fica em um pool de strings, onde diversas strings são guardadas
public class Strings{

  public static void main(String[] args) {

    /*Nesse momento:
      1- variável de referência 'nome' do tipo String é criada
      2- String "Pedro" é criada e gravada no 'pool de strings'
      3- variável 'nome' aponta para a String "Pedro"
    */
    String nome = "Pedro";



    /*Nesse momento:
      O que NÃO acontece:
      1- String "Pedro" é modificada e transformada em "Vitor"

      O que realmente acontece:
      1- O JAVA procura no 'pool de strings' alguma String idêntica a "Vitor"
      2- Como não achou, uma nova String "Vitor" é criada e gravada no 'pool de strings'
      3- Agora o 'pool de strings' tem "Pedro" e "Vitor" gravados
      4- Pedro perde sua referência, mas ainda existe no pool de Strings
      5- variável de referência 'nome' passa a apontar para "Vitor"
    */
    nome = "Vitor";


    /*Nesse momento:
      1- o JAVA procura uma variável idêntica a "Pedro" no 'pool de strings'
      2- como achou, nome passa a referenciar novamente "Pedro", sem criar uma nova variável, economizando memória e processamento
    */
    nome = "Pedro";


    /*Nesse momento:
      1- O JAVA procura uma String idêntica a " Henrique" no 'pool de strings'
      2- Como não acha, cria uma nova String " Henrique" e grava no 'pool de string'
      3- Uma nova String "Pedro Henrique" é criada e gravada no 'pool de Strings'
      4- agora o 'pool de strings' tem "Pedro", "Vitor", " Henrique" e "Pedro Henrique"
      5- a variável de referência 'nome' agora aponta para "Pedro Henrique" no 'pool de strings'
    */
    nome = nome + " Henrique";


    //Nesse caso, um novo objeto é criado, mas isso é desnecessário, e deve ser evitado
    nome = new String("Pedro");


    String teste = "teste.de.ponto";
    System.out.println(teste.replace(".",""));
    // System.out.println(teste);
  }
}
