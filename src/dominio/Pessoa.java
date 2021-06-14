package dominio;


public abstract class Pessoa {
	
	private String nome;
	private String sobrenome;
	

	private int idade;
	private String email;
	
	
	public void imprimir() {
		
		System.out.printf("Posição: %d\n  %s\n  %s\n  %s\n  %s\n", 
				0,//posicao+1, 
				getNome(),
				getSobrenome(),
				this.toString(),
				getSituacao()
			);
		
	}
	
	public abstract void exibirFormaCalculo();
	
	public String getNome() {
		return nome;
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
