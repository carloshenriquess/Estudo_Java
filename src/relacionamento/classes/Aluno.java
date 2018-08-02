public class Aluno{
	
	private String nomeAluno;
	private Seminario seminarioAluno;
	
	
	public Aluno(String nomeAluno, Seminario seminarioAluno){
		this(nomeAluno);
		this.seminarioAluno = seminarioAluno;
	}
	
	public Aluno(String nomeAluno){
		this.nomeAluno = nomeAluno;
	}
	
	
	public String getNomeAluno(){
		return this.nomeAluno;
	}
	public void setNomeAluno(String nomeAluno){
		this.nomeAluno = nomeAluno;
	}
	public Seminario getSeminarioAluno(){
		return this.seminarioAluno;
	}
	public void setSeminarioAluno(seminarioAluno){
		this.seminarioAluno = seminarioAluno;
	}
}