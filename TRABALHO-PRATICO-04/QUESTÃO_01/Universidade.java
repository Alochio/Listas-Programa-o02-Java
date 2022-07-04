package principal;

public class Universidade {
	
//VARIAVEIS DA CLASSE
	private String nome, endereco;
	
	public String getNome(){
		return this.nome;
	}
	public String getEndereco(){
		return this.endereco;
	}
	
//CONSTRUTOR DA UNIVERSIDADE
	public Universidade(String nome,String endereco){		
			this.nome = nome;
			this.endereco = endereco;
	}	
}