package estrututa;

public class Usuario {
	
	//CRIANDO AS VARIAVEIS
	private Integer id;
	private String nome;
	private String login;
	private String senha;

	//METODOS GETERS
	public Integer getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getLogin() {
		return this.login;
	}

	public String getSenha() {
		return this.senha;
	}
	
	//CRIANDO UM CONTRUTOR DE USUARIO
	public Usuario(Integer id, String nome, String login, String senha){
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
}