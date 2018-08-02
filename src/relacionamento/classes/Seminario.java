public class Seminario{
	
	private String codSeminario;
	private Aluno[] aluno;
	private Local local;
	private Professor professor;
	
	
	public Seminario(Local local, Professor professor){
		this.local = local;
		this.professor = professor;
	}
	public Seminario(Local local, Professor professor, Aluno aluno){
		this(local,professor);
		this.aluno = aluno;
	}
	public Seminario(String codSeminario, Local local, Professor professor, Aluno aluno){
		this(local,professor,aluno);
		this.codSeminario = codSeminario;
	}
	
	

	
	
	
	public String getCodSeminario(){
		return this.codSeminario;
	}
	public void setCodSeminario(String codSeminario){
		this.codSeminario = codSeminario;
	}
	public Aluno[] getAluno(){
		return this.aluno;
	}
	public void setAluno(Aluno[] aluno){
		this.aluno = aluno;
	}
	public Local getLocal(){
		return this.local;
	}
	public void setLocal(Local local){
		this.local = local;
	}
	public Professor getProfessor(){
		return this.professor;
	}
	public void setProfessor(Professor professor){
		this.professor = professor;
	}
}