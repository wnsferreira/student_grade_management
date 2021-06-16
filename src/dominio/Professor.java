package dominio;

import exceptions.NomeIncompletoException;

public class Professor extends Pessoa {
	
	private int matricula;
	private String disciplina;
	
	public void imprimir() throws NomeIncompletoException {
		System.out.println(this.getNomes());
	}

	public StringBuilder getNomes() throws NomeIncompletoException {
		
		if(ultimoNome == null || nome == null || sobrenome == null) {
			throw new NomeIncompletoException("Preenchimento inv�lido!!!");
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(getUltimoNome().toUpperCase().charAt(0));
		sb.append(".");
		sb.append(", ");
		sb.append(getNome());
		sb.append(" ");
		sb.append(getSobrenome().toUpperCase());
		
		return sb;
	}

	
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
