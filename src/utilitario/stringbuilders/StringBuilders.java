package utilitario.stringbuilders;

public class StringBuilders{

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("1233345");
    sb.append("69").delete(2,4).insert(6,"78").reverse();
    System.out.println(sb);
  }

}
