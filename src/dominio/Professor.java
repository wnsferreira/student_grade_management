package dominio;

public class Professor extends Pessoa {
	
	private int matricula;
	private String disciplina;
	
	
	
	@Override
	public String toString() {
		return "Professor [matricula=" + matricula + ", disciplina=" + disciplina + "]";
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void exibirFormaCalculo() {
		System.out.println("Professor não tem cálculo implementado");
		
	}
	
	
}
