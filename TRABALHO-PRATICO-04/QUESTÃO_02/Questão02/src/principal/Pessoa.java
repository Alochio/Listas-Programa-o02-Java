package principal;

import principal.Universidade;

public class Pessoa {

//CRIANDO AS VARIAVEIS
	private String nome;
	private String sobrenome;
	private String profissao;
	private int dia;
	private int mes;
	private int ano;

//ASSOCIANDO PESSOA A UNIVERSIDADE
	private Universidade universidade;
//ASSOCIANDO PESSOA A DEPARTAMENTO
	private Departamento departamento;

//METODOS GET AND SET, COM RESTRI��ES, N�O DEIXANDO SUBISTITUIR O NOME DA PESSOA NO DECORRER DO C�DIGO
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if (this.nome != null)
			System.out.println("N�o � possivel trocar informa��es de uma pessoa j� criada");
		else
			this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if (this.nome != null)
			System.out.println("N�o � possivel trocar informa��es de uma pessoa j� criada");
		else
			this.sobrenome = sobrenome;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		if (this.nome != null)
			System.out.println("N�o � possivel trocar informa��es de uma pessoa j� criada");
		else
			this.profissao = profissao;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (this.nome != null)
			System.out.println("N�o � possivel trocar informa��es de uma pessoa j� criada");
		else
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (this.nome != null)
			System.out.println("N�o � possivel trocar informa��es de uma pessoa j� criada");
		else
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (this.nome != null)
			System.out.println("N�o � possivel trocar informa��es de uma pessoa j� criada");
		else
			this.ano = ano;
	}

	public Universidade getUniversidade() {
		return universidade;
	}
	
	public void setUniversidade(Universidade universidade) {
		if (this.getUniversidade() != null)
			System.out.println("Esta pessoa j� est� matriculdade em uma universidade");
		else
			this.universidade = universidade;
	}
	
	public Departamento getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(Departamento departamento){
		if (this.departamento != null)
			System.out.println("Esta pessoa j� est� em um departamento");
		else
			this.departamento = departamento;
	}

//CRIA��O DO CONSTRUTOR PESSOA
	public Pessoa(String nome, String sobrenome, String profissao, int dia, int mes, int ano) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.profissao = profissao;
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
	}
	
//M�TODO PARA REALIZAR A IMPRESS�O DAS INFORMA��ES DAS PESSOAS
	public void ImprimeInformacoes(String sobrenome, String profissao, String universidade, String enderecoUniversidade){
		System.out.println(sobrenome + " trabalhou como " + profissao + " em " + 
				universidade + " ("+ enderecoUniversidade + ") ");
	}
}