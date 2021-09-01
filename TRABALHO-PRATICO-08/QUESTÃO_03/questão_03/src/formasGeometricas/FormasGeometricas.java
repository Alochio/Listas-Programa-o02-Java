package formasGeometricas;

public class FormasGeometricas {
	
	private String nome;

//CONSTRUTOR DAS FORMAS GEOMETRICAS, ONDE O MESMO � PROTECTED PARA SER USADO SOMENTE DENTRO DO PACOTE
	protected FormasGeometricas(String nome){
		this.nome = nome;
	}
	
//M�TODO GET PARA RETORNAR O NOME ATRIBUIDO A FORMA
	public String getNome(){
		return this.nome;
	}

//TO STRING PARA PADRONIZAR UMA IMPRESS�O
	@Override
	public String toString() {
		return "Nome da forma: " + nome;
	}
}