import dominio.Instituicao;
import exceptions.MensalidadeNegativaException;
import exceptions.NomeIncompletoException;

public class InstituicaoTeste {

	public static void main(String[] args) {
		
		Instituicao instituicao = new Instituicao();
		instituicao.setNome("Wellington Nascimento Silva");
		try {
			instituicao.setMensalidade(1000);
		} catch (MensalidadeNegativaException e2) {
			System.out.println("Erro: " + e2.getMessage());
			e2.printStackTrace();
		}
		try {
			instituicao.imprimir();
		} catch (NomeIncompletoException e1) {
			System.out.println("Erro: " + e1.getMessage());
			e1.printStackTrace();
		}
		
		
		Instituicao inst = new Instituicao();
		inst.setNome("Aline Ferreira");
		try {
			inst.setMensalidade(500); // Testar com um valor negativo
		} catch (MensalidadeNegativaException e1) {
			System.out.println("Erro: " + e1.getMessage());
			e1.printStackTrace();
		}
		try {
			inst.imprimir();
		} catch (NomeIncompletoException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
