package principal;

public class Empresa {
	
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;

//-----------------------------------------------------------------------------------------
//CONSTRUTORES
	public Empresa(){
		
	}
	
	public Empresa(String nome, String endereco, String cidade, 
			String estado, String cep, String telefone){
		
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
	}
	
//-----------------------------------------------------------------------------------------
//MÉTODOS GET AND SET
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getCidade(){
		return this.cidade;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
//-----------------------------------------------------------------------------------------
//PRINTS
	
	public void printNome(){
		System.out.println("Nome: " + getNome());
	}
	
	public void printEndereco(){
		System.out.println("Nome: " + getEndereco());
	}
	
	public void printCidade(){
		System.out.println("Nome: " + getCidade());
	}
	
	public void printEstado(){
		System.out.println("Nome: " + getEstado());
	}
	
	public void printCep(){
		System.out.println("Nome: " + getCep());
	}

	public void printTelefone(){
		System.out.println("Nome: " + getTelefone());
	}
//-----------------------------------------------------------------------------------------



}
