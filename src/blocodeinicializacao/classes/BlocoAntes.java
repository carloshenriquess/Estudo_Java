package blocodeinicializacao.classes;

public class BlocoAntes{
	
	
	
	/*  O BLOCO DE INICIALIZACAO SEMPRE EXECUTA ANTES DO CONSTRUTOR...
	 *  POREM, EXECUTA ANTES OU DEPOIS DA INICIALIZAÇÃO DAS VARIAVEIS?
	 *  DEPENDE DA ORDEM QUE FOI COLOCADO!!!
	 *
	 * ESSE EXEMPLO MOSTRA COM O BLOCO SENDO COLOCADO ANTES DA INICIALIZACAO DAS VARIAVEIS
	**/
	
	
	
	
	
	//P-R-I-M-E-I-R-O
	//bloco de inicializacao eh executado antes de tudo.
	{
		//a linha a baixo mostra a variavel com o valor default
		System.out.println("INICIO DO BLOCO DE INICIALIZACAO: "+this.s);
		this.s = "PRIMEIRO";
		System.out.println("FINAL DO BLOCO DE INICIALIZACAO: "+this.s);
	}
	
	
	
	
	//S-E-G-U-N-D-O
	//depois do bloco, as variáveis sao iniciadas com valores explicitos
	private String s ="SEGUNDO";
	
	
	
	
	
	
	//T-E-R-C-E-I-R-O
	//soh no final comeca o construtor
	public BlocoAntes(String s){
		
		System.out.println("INICIO DO CONSTRUTOR: "+this.s);
		this.s = s;
		System.out.println("FIM DO CONSTRUTOR: "+this.s);
	}
	
	
	
	
	
	
}