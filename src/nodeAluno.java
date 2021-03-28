
public class nodeAluno {
	
	private int RA;
	private String nome;
	private String turma;
	private String semestre;
	
	public nodeAluno prox;

	public nodeAluno(int rA, String nome, String turma, String semestre) {
		this.RA = rA;
		this.nome = nome;
		this.turma = turma;
		this.semestre = semestre;
		this.prox = null;
	}
	
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}


	
	
	
}
