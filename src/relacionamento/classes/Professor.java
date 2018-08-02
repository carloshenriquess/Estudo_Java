public class Professor{
	
	private String nomeProfessor;
	private Seminario[] seminarioProfessor;
	
	
	public Professor(Seminario[] seminarioProfessor){
		this.seminarioProfessor = seminarioProfessor;
	}
	public Professor(String nomeProfessor, Seminario[] seminarioProfessor){
		this(seminarioProfessor);
		this.nomeProfessor = nomeProfessor;
	}
	
	
	
	public String getNomeProfessor(){
		return this.nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor){
		this.nomeProfessor = nomeProfessor;
	}
	
	public Seminario getSeminarioProfessor(){
		return this.seminarioProfessor;
	}
	public void setSeminarioProfessor(Seminario seminarioProfessor){
		this.seminarioProfessor = seminarioProfessor;
	}
}