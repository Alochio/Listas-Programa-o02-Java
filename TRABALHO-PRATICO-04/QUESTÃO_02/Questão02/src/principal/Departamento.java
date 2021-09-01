package principal;
import principal.Universidade;

public class Departamento {
	
	//CRIANDO VARIAVEIS
	private String nome;
	
	//ASSOCIANDO A UNIVERSIDADE AO DEPARTAMENTO
	Universidade universidade;
	
	//CRIANDO UMA VARIAVEL DO TIPO UNIVERSIDADE
	private Universidade universidadeAssociada;
	
	//METODOS GETERS AND SETERS
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUniversidadeAssociada() {
		return this.universidadeAssociada;
	}

	//METODO PARA SETAR A QUAL UNIVERSIDADE O DEPARTAMENTO PERTENCE
	public void setUniversidadeAssociada(Universidade universidade) {
		this.universidadeAssociada = universidade;
	}
}