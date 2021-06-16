package dominio;

import exceptions.NomeIncompletoException;

public abstract class Pessoa {
	private int id;
	protected String nome;
	protected String sobrenome;
	protected String ultimoNome;
	private int idade;
	private String email;
	
	
	public void imprimir() throws NomeIncompletoException  {
		
		System.out.printf("Posição: %d\n  %s\n  %s\n  %s\n  %s\n", 
				id,//posicao+1, 
				getNome(),
				getSobrenome(),
				this.toString(),
				getSituacao()
			);
		
	}
	
	
	public abstract void exibirFormaCalculo();
	

	public String getNome() throws NomeIncompletoException {
		return nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
				
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSituacao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
