package estrutura;

public class LoginSingleton {

//VARIAVEL ESTÁTICA PARA USARMOS PARA INSTANCIAR O OBJETO
	private static LoginSingleton instancia;
	
	private String login;
	private String senha;
	
//CONSTRUTOR PRIVADO SEM ARGUMENTOS
	private LoginSingleton(){
	}

//MÉTODO QUE IRÁ INSTANCIAR O OBJETO
	public static LoginSingleton GetInstancia(){
		
		if(instancia == null)
			instancia = new LoginSingleton();
		
		return instancia;
	}
	
//MÉTODOS SET
	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//MÉTODO UTILIZADO PARA DEFINIR UM PADRÃO DE IMPRESSÃO
	@Override
	public String toString() {
		return "LOGIN: " + this.login + " || SENHA: " + this.senha;
	}	
}