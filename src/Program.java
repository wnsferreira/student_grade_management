import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	private static String[] nomes;
	private static double[] notaAv1;
	private static double[] notaAv2;
//	private static double[] notaFinal;
//	private static double[] notasTurma;
		
	private static final int QTDE = 5;
	
	private static int index;	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		nomes = new String[QTDE];
		notaAv1 = new double[QTDE];
		notaAv2 = new double[QTDE];
//		notaFinal = new double[QTDE];
//		notasTurma = new double[QTDE];
				
		String opcao = null;		
		
		do {
			System.out.println("[1] Registrar as notas de um aluno");
			System.out.println("[2] Consultar boletim de um aluno");
			System.out.println("[3] Consultar notas da turma");
			System.out.println("[4] Sair");
			
			System.out.println("Informe a opção desejada: ");
			opcao = sc.next();
						
			switch (opcao) {
			
			case "1": 
				if(index < QTDE) {
					System.out.println(" ");
					System.out.println("---------Registro--------");
					System.out.println("Informe o seu nome: ");
					nomes[index] = sc.next();
					
					System.out.println("Informe a nota da Av1: ");
					notaAv1[index]= sc.nextDouble();
					
					System.out.println("Informe a nota da Av2:");
					notaAv2[index] = sc.nextDouble();
					
					System.out.println("Informação cadastrada!");
					System.out.println(" ");
					imprimir(index);
					
					index++;
					break;
				} else {
					System.out.println("Todas as vagas já foram preenchidas!");
				}
				
			case "2":
				System.out.println(" ");
				System.out.println("-------Consulta-------");
				System.out.println("Informe a posição: ");
				int pos = sc.nextInt();
				
				if (pos >= 0 && pos < index) {
					imprimir(pos);
				} else {
					System.out.println("Posição inválida!");
				}
				
				situacaoAluno(pos);
				
				break;
				
			case "3":
				System.out.println(" ");
				System.out.println("----Notas da turma----: ");
				exibirRelatorio();
				imprimir();
				
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
			imprimir(i);			
		}
		
	}
	
	private static void imprimir(int posicao) {
		System.out.printf("Posição: [%d]\n Aluno: %s\n Av1: %.2f\n Av2: %.2f\n Media: %.2f\n", 
				posicao+1, 
				nomes[posicao],
				notaAv1[posicao],
				notaAv2[posicao],
				calcularMediaAluno(posicao)
			);
		
		situacaoAluno(posicao);
		System.out.println(" ");
	}
	
	private static void exibirRelatorio() {
		int qtde = index;
		int alunosCadastrados = qtde;
		
		System.out.println("Quantidade de alunos: " + alunosCadastrados);
		System.out.printf("Média da turma: %.2f\n" ,calcularMediaTurma());
		System.out.println(" ");
	}
	
	private static double calcularMediaAluno(int idx) {
		return (notaAv1[idx] + notaAv2[idx]) / 2;
		
	}
	
	private static double calcularMediaTurma() {
		double soma = 0;
		
		for(int i = 0; i < index; i++) {
			soma = soma + calcularMediaAluno(i);
		}
		
		return soma / index;
	}
	
	private static void situacaoAluno(int idx) {
		
		double media = calcularMediaAluno(idx);
		
		if (media < 4) {
			System.out.println("Reprovado");
		}else if (media > 4 && media < 7) {
			System.out.println("Prova final");
		}else {
			System.out.println("Aprovado");
		}
		
	}
}




