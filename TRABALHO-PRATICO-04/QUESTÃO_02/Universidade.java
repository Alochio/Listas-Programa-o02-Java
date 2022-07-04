package principal;
import principal.Departamento;

public class Universidade {

	//CRIANDO AS VARIAVEIS
	private String nome, endereco;
	
	//CRIANDO UMA VARIAVEL ESTÁTICA PARA NÃO DEIXAR ATRIBUIREM MAIS DE 50 DEPARTAMENTOS A UMA UNIVERSIDADE
	private static int cont = 0;
	
	//CRIANDO UM VETOR DEPARTAMENTO
	private Departamento[] departamento = new Departamento[50];

	//METODOS GETERS AND SETERS
	public String getNome() {
		return this.nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getDepartamento(int num) {
		return departamento[num].getNome();
	}

	//CONDIÇÃO DENTRO DO SET PARA QUE NÃO POSSAM SER ATRIBUIDOS MAIS DE 50 DEPARTAMENTOS A UMA UNIVERSIDADE
	public void setDepartamento(Departamento[] departamento) {
		if (cont < 50) {
			this.departamento = departamento;
			cont = cont + 1;
		} else
			System.out.println("A universidade já posssui mais de " + cont + " departamentos!");
	}

	//CONSTRUTOR DA UNIVERSIDADE
	public Universidade(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
}