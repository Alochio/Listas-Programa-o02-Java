package estrutura;

public class LoginSingleton {

//VARIAVEL EST�TICA PARA USARMOS PARA INSTANCIAR O OBJETO
	private static LoginSingleton instancia;
	
	private String login;
	private String senha;
	
//CONSTRUTOR PRIVADO SEM ARGUMENTOS
	private LoginSingleton(){
	}

//M�TODO QUE IR� INSTANCIAR O OBJETO
	public static LoginSingleton GetInstancia(){
		
		if(instancia == null)
			instancia = new LoginSingleton();
		
		return instancia;
	}
	
//M�TODOS SET
	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//M�TODO UTILIZADO PARA DEFINIR UM PADR�O DE IMPRESS�O
	@Override
	public String toString() {
		return "LOGIN: " + this.login + " || SENHA: " + this.senha;
	}	
}