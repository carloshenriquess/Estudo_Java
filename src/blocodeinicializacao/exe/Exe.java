package blocodeinicializacao.exe;

import blocodeinicializacao.classes.BlocoAntes;
import blocodeinicializacao.classes.BlocoDepois;

public class Exe{
	
	public static void main(String args[]){
		System.out.println("----------------------------------------------");
		System.out.println("  BLOCO ANTES DA INICIALIZACAO DAS VARIAVEIS");
		System.out.println("----------------------------------------------");
		BlocoAntes a = new BlocoAntes("TERCEIRO");
		System.out.println("\n\n----------------------------------------------");
		System.out.println("  BLOCO DEPOIS DA INICIALIZACAO DAS VARIAVEIS");
		System.out.println("----------------------------------------------");
		BlocoDepois d = new BlocoDepois("TERCEIRO");
	}
	
}