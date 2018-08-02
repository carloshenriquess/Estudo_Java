package blocodeinicializacao.classes;

public class BlocoDepois{
	
	
	
	/*  O BLOCO DE INICIALIZACAO SEMPRE EXECUTA ANTES DO CONSTRUTOR...
	 *  POREM, EXECUTA ANTES OU DEPOIS DA INICIALIZAÇÃO DAS VARIAVEIS?
	 *  DEPENDE DA ORDEM QUE FOI COLOCADO!!!
	 *
	 * ESSE EXEMPLO MOSTRA COM O BLOCO SENDO COLOCADO DEPOIS DA INICIALIZACAO DAS VARIAVEIS
	**/
	
	
	
	
	//P-R-I-M-E-I-R-O
	//como esta antes, primeiramente as variaveis sao inicializadas com seus valores padroes explicitos.
	private String s ="PRIMEIRO";
	
	
	
	
	//S-E-G-U-N-D-O
	//depois o bloco de inicializacao eh executado.
	{
		//a linha a baixo mostra a variavel com o valor default
		System.out.println("INICIO DO BLOCO DE INICIALIZACAO: "+this.s);
		this.s = "SEGUNDO";
		System.out.println("FINAL DO BLOCO DE INICIALIZACAO: "+this.s);
	}
	
	
	//T-E-R-C-E-I-R-O
	//soh no final comeca o construtor
	public BlocoDepois(String s){
		
		System.out.println("INICIO DO CONSTRUTOR: "+this.s);
		this.s = s;
		System.out.println("FIM DO CONSTRUTOR: "+this.s);
	}
	
	
	
	
	
	
}