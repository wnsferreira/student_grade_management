package dominio;

import exceptions.NomeIncompletoException;

public class Aluno extends Pessoa {
	
	private int id_aluno;
	private static double notaAv1;
	private static double notaAv2;


	private static int index;
	
	private static Aluno[] alunos;
	
	@Override
	public String toString() {
		return "Aluno [id_aluno=" + id_aluno + ", notaAv1=" + notaAv1 + ", notaAv2=" + notaAv2 + "]";
	}
	
	@Override
	public void imprimir() throws NomeIncompletoException  {
		double media = calcularMediaAluno();
		System.out.println("Aluno: "+ this.getNome()
		+ " | Av1: " + this.getNotaAv1() 
		+ " | Av2: " + this.getNotaAv2() 
		+ " |Média: "
		+ media
		+ " |Aluno "
		+ this.getSituacao());
		//super.imprimir();
	}
	
	@Override
	public void exibirFormaCalculo() {
		System.out.println("Média aluno = (Av1 + Av2) / 2");
		System.out.println("= " + getNotaAv1() + " + " + getNotaAv2() + " / " + " 2 ");	
		System.out.println("= " + calcularMediaAluno());
	}
	
	public static double calcularMediaAluno() {
		
		return (notaAv1 + notaAv2) / 2;
						
	}
	
	public  double calcularMediaTurma() {
		double soma = 0;
		
		for(int i = 0; i < index; i++) {
			soma = soma + calcularMediaAluno();
			
		}
		
		return soma / index;
	}
	
	//@Override
	public String getSituacao() {
		
		double media = calcularMediaAluno();
		
		if (media < 4) {
			return ("Reprovado");
		}else if (media > 4 && media < 7) {
			return ("Prova final");
		}else if (media >= 7 && media <= 10) {
			return ("Aprovado");
		} else {
			return ("Informe uma nota válida entre 0 e 10");
		}
		
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public double getNotaAv1() {
		return notaAv1;
	}

	public void setNotaAv1(double notaAv1) {
		this.notaAv1 = notaAv1;
	}

	public double getNotaAv2() {
		return notaAv2;
	}

	public void setNotaAv2(double notaAv2) {
		this.notaAv2 = notaAv2;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		Aluno.index = index;
	}

	public static Aluno[] getAlunos() {
		return alunos;
	}

	public static void setAlunos(Aluno[] alunos) {
		Aluno.alunos = alunos;
	}

	
	

}
