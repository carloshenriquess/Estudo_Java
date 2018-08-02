package utilitario.wrapper;

public class Wrapper{
  public static void main(String[] args) {
    //existem 8 tipos primitovos, cada um com sua respectiva WrapperClass
    //Para números, de Byte até Integer, é possível o AutoBoxing sem casting explícito
    Byte numByte = 1;
    Short numShort = 1;
    Integer numInteger = 1;
    //A partir de Long, é necessário o casting explícito para o AutoBoxing
    Long numLong = 1l;
    Float numFloat = 1f;
    Double numDouble = 1d;
    //Character e char precisam usar ('') ao invés de ("")
    Character numCaracter = '1';
    Boolean bool = true;

    //Sem utilizar AutoBoxing, não precisa de casting explícito, e também aceita String com case insensitive
    Long numLongSemCasting = new Long(2);
    Float numFloatString = new Float("2");
    Boolean boolInsesitive = new Boolean("TrUe");

    //Unboxing explícito usa o método ___Value() que retorna o valor primitivo:
    float floatPrimitivo = numFloat.floatValue();
    //O código abaixo é para provar que o valor retornado é primitivo, e não contém MAX_VALUE...
    //assim, não compila
    // System.out.println(numFloat.floatValue().MAX_VALUE);
    //AutoUnboxing torna desnecessária a utilização do método ___Value():
    floatPrimitivo = numFloat;

    //para transformar em Objeto da classe Wrapper, usa-se o método valueOf();
    Long.valueOf("3");
    Long.valueOf(3);
    Long.valueOf(3l);
    //O código abaixo prova que o valor retornado é um objeto
    // System.out.println(Long.valueOf("3").MAX_VALUE);

    //Também existe o parse___() que faz o mesmo, porém retorna um tipo primitivo e só aceita String:
    Long.parseLong("3");
    //A linha abaixo prova que o valor retornado é primitivo...
    //Assim código não compila
    // System.out.println(Long.parseLong("3").MAX_VALUE);
  }
}
