import java.util.Locale;
import java.util.Scanner;

import dominio.Aluno;
import dominio.Pessoa;
import dominio.Professor;

public class TP2 {
	
	static Scanner sc = new Scanner(System.in);
	
		
	//private static Pessoa[] pessoas;
	private static Pessoa[] pessoas;
			
	private static final int QTDE = 100;
	
	private static int index;	

	public static void main(String[] args) {
		
		System.out.println("TP2 de Fundamentos do desenvolvimento Java");
		System.out.println("Aluno: Wellington Nascimento");
		System.out.println("Professor: Elberth Moraes");
		System.out.println(" ");
		System.out.println("SBCA - Sistema Básico de Controle Acadêmico");
		System.out.println(" ");
		
		Locale.setDefault(Locale.US);
						
		//pessoas = new Pessoa[QTDE];
		pessoas = new Pessoa[QTDE];
		
		String opcao = null;		
		
		do {
			System.out.println("----------------Menu--------------");
			System.out.println("[1] Cadastrar professor");
			System.out.println("[2] Cadastrar aluno");
			System.out.println("[3] Consultar situação de um docente/discente");
			System.out.println("[4] Sair");
		
			
			System.out.println(" ");
			System.out.println("Informe a opção desejada: ");
			opcao = sc.next();
						
			switch (opcao) {
			
			case "1":
				if(index < QTDE) {
					
					Professor prof = new Professor();
					
					System.out.println(" ");
					System.out.println("---------Cadastro professor--------");
					System.out.println("Informe o nome do professor: ");
					prof.setNome(sc.next());
					
					System.out.println("Informe a matricula: ");
					prof.setMatricula(sc.nextInt());
										
					System.out.println("Informe a idade: ");
					prof.setIdade(sc.nextInt());
					
					System.out.println("Informe a disciplina: ");
					prof.setDisciplina(sc.next());
					
					pessoas[index] = prof;
					
					System.out.println("Informação cadastrada!");
					System.out.println(" ");
					//imprimir(index);
					pessoas[index].imprimir();
					
					index++;
					break;
				} else {
					System.out.println("Todas as vagas já foram preenchidas!");
				}
			
			case "2": 
				if(index < QTDE) {
					
					Aluno aluno = new Aluno();
					
					System.out.println(" ");
					System.out.println("---------Registro--------");
					System.out.println("Informe o seu nome: ");
					aluno.setNome(sc.next());
					
					System.out.println("Informe a nota da Av1: ");
					aluno.setNotaAv1(sc.nextDouble());
					
					
					System.out.println("Informe a nota da Av2:");
					aluno.setNotaAv2(sc.nextDouble());
					
					pessoas[index] = aluno;
					
					System.out.println("Informação cadastrada!");
					System.out.println(" ");
					//imprimir(index);
					pessoas[index].imprimir();
					
					index++;
					break;
				} else {
					System.out.println("Todas as vagas já foram preenchidas!");
				}
			
			case "3":
				System.out.println(" ");
				System.out.println("----Notas da turma---- ");
				exibirRelatorio();
				imprimir();
				//pessoas[index].imprimir();
				
				System.out.println("------Info professores------");
				System.out.println("Informe a posição: ");
				int pos = sc.nextInt();
				
				if(pos >= 0 && pos < index) {
					pessoas[pos].imprimir();
				} else {
					System.out.println("Professor inexistente");
				}
				
				break;

			case "4":
				System.out.println("Sistema finalizado");
				
				break;
								
			default:
				System.out.println("Opção inválida");
			}
			
		} while (!opcao.equals("4"));
			
		sc.close();				
	}
	
	private static void imprimir() {
		System.out.println(" ");
		for (int i=0; i < index; i++) {
			//imprimir(i);
			pessoas[i].imprimir();
		}
		
	}
	
//	private static void imprimir(int posicao) {
//		
//		Pessoa aluno = pessoas[posicao];
//				
//		System.out.printf("Posição: [%d]\n Aluno: %s\n Av1: %.2f\n Av2: %.2f\n Media: %.2f\n Aluno %s\n", 
//				posicao+1, 
//				aluno.getNome(),
//				aluno.getNotaAv1(),
//				aluno.getNotaAv2(),
//				aluno.calcularMediaAluno(),
//				aluno.getSituacao()
//			);
//		
//	
//		System.out.println(" ");
//	}
	
	private static void exibirRelatorio() {
			
		int qtde = index;
		int alunosCadastrados = qtde;
		
		//Aluno aluno = alunos[];
		
		System.out.println("Quantidade de alunos: " + alunosCadastrados);
		//System.out.printf("Média da turma: %.2f\n" , alunos.calcularMediaTurma());
		System.out.println(" ");
	}
	
	
	
	
}




