import java.util.Arrays;
import java.util.Scanner;

import dominio.Instituicao;
import exceptions.MensalidadeNegativaException;
import exceptions.NomeIncompletoException;

public class InstituicaoTeste {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			try {
				Instituicao instituicao = new Instituicao();
				instituicao.setNome("Wellington Nascimento Silva");
				instituicao.setMensalidade(1000);
				instituicao.imprimir();
			} catch (MensalidadeNegativaException | NomeIncompletoException e) {
				System.out.println("Erro: " + e.getMessage());
				e.printStackTrace();
			}
					
			
			
			try {
				Instituicao inst = new Instituicao();
				inst.setNome("Aline Ferreira");
				inst.setMensalidade(-500); // Testar com um valor negativo
				inst.imprimir();
			} catch (MensalidadeNegativaException | NomeIncompletoException e1) {
				System.out.println("Erro: " + e1.getMessage());
				e1.printStackTrace();
			}
			
		} finally {
			System.out.println("Finalizado!");
			
		}
		
		
		

	}

}
