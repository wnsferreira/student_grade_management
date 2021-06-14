package dominio;

import exceptions.MensalidadeNegativaException;
import exceptions.NomeIncompletoException;

public class Instituicao {
	
	private String nome;
	private String sobrenome;
	private String ultimoNome;
	private float mensalidade;

	public void imprimir() throws NomeIncompletoException {
		System.out.println(this.getNome());
	}

	public StringBuilder getNome() throws NomeIncompletoException {
		
		if(ultimoNome == null || nome == null || sobrenome == null) {
			throw new NomeIncompletoException("Preenchimento inv�lido!!!");
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(ultimoNome.toUpperCase().charAt(0));
		sb.append(".");
		sb.append(", ");
		sb.append(nome.toUpperCase());
		sb.append(" ");
		sb.append(sobrenome.toUpperCase());
		
		return sb;
	}

	public void setNome(String nome) {
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) throws MensalidadeNegativaException {
		if(mensalidade < 0) {
			throw new MensalidadeNegativaException("A mensalidade está negativa");
		}
				
		this.mensalidade = mensalidade;
	}
	

}
