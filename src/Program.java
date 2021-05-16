import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	private static String[] nomes;
	private static double[] notaAv1;
	private static double[] notaAv2;
	private static double[] notaFinal;
	private static double[] notasTurma;
		
	private static final int QTDE = 5;
	
	private static int index;	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		nomes = new String[QTDE];
		notaAv1 = new double[QTDE];
		notaAv2 = new double[QTDE];
		notaFinal = new double[QTDE];
		notasTurma = new double[QTDE];
				
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
				System.out.println("-------Consulta-------");
				System.out.println("Informe a posição: ");
				int pos = sc.nextInt();
				
				if (pos >= 0 && pos < index) {
					imprimir(pos);
				} else {
					System.out.println("Posição inválida!");
				}
				
				break;
				
			case "3":
				System.out.println("Notas da turma: ");
				imprimir();
				
				break;
				
			default:
				System.out.println("Opção inválida");
			}
			
		} while (!opcao.equals("4"));
			
		sc.close();				
	}
	
	private static void imprimir() {
		System.out.println("Lista de alunos: ");
		for (int i=0; i < index; i++) {
			imprimir(i);			
		}
		
	}
	
	private static void imprimir(int posicao) {
		System.out.printf("Posição: [%d]\n Aluno: %s\n Av1: %.2f\n Av2: %.2f\n Média final: %.2f\n Situação: %s\n", 
				posicao+1, 
				nomes[posicao],
				notaAv1[posicao],
				notaAv2[posicao],
				calcularMedia(posicao),
				situacao(posicao)
			);
		
		
		System.out.println(" ");
	}
	
	private static double calcularMedia(int idx) {
		return (notaAv1[idx] + notaAv2[idx]) / 2;
	}
	
	private static String situacao(double sl) {
		return (sl < 4) ? "reprovado" || (s1 >= 4) ? "Prova Final" : "aprovado";
	}
	
//	private static void resultado(int p) {
//		if(calcularMedia(p) < 4) {
//			System.out.println("Reprovado");
//		}
//		else if(calcularMedia(p) >= 4 ||calcularMedia(p) < 7 ){
//			System.out.println(" Prova final");
//		}
//		else if(calcularMedia(p) >= 7) {
//			System.out.println("Aprovado");
//		}
//	}
}




