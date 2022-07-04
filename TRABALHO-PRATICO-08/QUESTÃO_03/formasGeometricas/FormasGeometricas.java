package formasGeometricas;

public class FormasGeometricas {
	
	private String nome;

//CONSTRUTOR DAS FORMAS GEOMETRICAS, ONDE O MESMO É PROTECTED PARA SER USADO SOMENTE DENTRO DO PACOTE
	protected FormasGeometricas(String nome){
		this.nome = nome;
	}
	
//MÉTODO GET PARA RETORNAR O NOME ATRIBUIDO A FORMA
	public String getNome(){
		return this.nome;
	}

//TO STRING PARA PADRONIZAR UMA IMPRESSÃO
	@Override
	public String toString() {
		return "Nome da forma: " + nome;
	}
}