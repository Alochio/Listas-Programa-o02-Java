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

//METODOS GET AND SET, COM RESTRIÇÕES, NÃO DEIXANDO SUBISTITUIR O NOME DA PESSOA NO DECORRER DO CÓDIGO
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if (this.nome != null)
			System.out.println("Não é possivel trocar informações de uma pessoa já criada");
		else
			this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if (this.nome != null)
			System.out.println("Não é possivel trocar informações de uma pessoa já criada");
		else
			this.sobrenome = sobrenome;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		if (this.nome != null)
			System.out.println("Não é possivel trocar informações de uma pessoa já criada");
		else
			this.profissao = profissao;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (this.nome != null)
			System.out.println("Não é possivel trocar informações de uma pessoa já criada");
		else
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (this.nome != null)
			System.out.println("Não é possivel trocar informações de uma pessoa já criada");
		else
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (this.nome != null)
			System.out.println("Não é possivel trocar informações de uma pessoa já criada");
		else
			this.ano = ano;
	}

	public Universidade getUniversidade() {
		return universidade;
	}
	
	public void setUniversidade(Universidade universidade) {
		if (this.getUniversidade() != null)
			System.out.println("Esta pessoa já está matriculdade em uma universidade");
		else
			this.universidade = universidade;
	}
	
	public Departamento getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(Departamento departamento){
		if (this.departamento != null)
			System.out.println("Esta pessoa já está em um departamento");
		else
			this.departamento = departamento;
	}

//CRIAÇÃO DO CONSTRUTOR PESSOA
	public Pessoa(String nome, String sobrenome, String profissao, int dia, int mes, int ano) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.profissao = profissao;
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
	}
	
//MÉTODO PARA REALIZAR A IMPRESSÃO DAS INFORMAÇÕES DAS PESSOAS
	public void ImprimeInformacoes(String sobrenome, String profissao, String universidade, String enderecoUniversidade){
		System.out.println(sobrenome + " trabalhou como " + profissao + " em " + 
				universidade + " ("+ enderecoUniversidade + ") ");
	}
}