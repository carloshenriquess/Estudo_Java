package blocoestatico.classes;

public class BlocoTest{
	
	// PRIMEIRO O ESPACO NA MEMORIA E ALOCADO PARA AS VARIAVEIS, E SAO INICIADAS COM VALORES PADRAO
	// DEPOIS VAI PARA O BLOCO DE INICIALIZACAO ESTATICO
	public int n=2;
	
	
	{
		System.out.println(n);
		System.out.println("BLOCO NORMAL: fim");
	}
	
	
	
	public BlocoTest(){
		System.out.println(n);
		System.out.println("CONSTRUTOR: FIM");
		System.out.println("*************************");
		System.out.println("*************************");
		System.out.println("*************************");
	}
	
	// INDEPENDENTE DE ONDE O BLOCO DE INICIALIZACAO ESTATICO ESTEJA, ELE EH EXECUTADO ANTES DE QUALQUER COISA
	// O BLOCO DE INICIALIZACAO ESTATICO SOH EH EXECUTADO UMA UNICA VEZ QUANDO A CLASSE EH CHAMADA PELA PRIMEIRA VEZ, INDEPENDENTE DE UM OBJETO
	static{
		System.out.println("BLOCO ESTATICO: INICIO");
		System.out.println("BLOCO ESTATICO: FIM");
	}
	
	
	
}