package principal;
import estrutura.LoginSingleton;

public class TestaLoginSingleton {
	public static void main(String[] args){
		
//INSTANCIANDO UM OBJETO
		LoginSingleton admin = LoginSingleton.GetInstancia();

//ATRIBUINDO VALORES A ELE
		admin.setLogin("Vinicius");
		admin.setSenha("alochio");

//IMPRIMINDO OS VALORES ATRIBUIDOS
		System.out.println(admin);
		System.out.println();
		
//INSTANCIANDO UM SEGUNDO OBJETO, ONDE ESTE IR� SUBSTITUIR O QUE FOI INSTANCIADO ANTERIORMENTE
		LoginSingleton admin2 = LoginSingleton.GetInstancia();
		
//ATRIBUINDO OS NOVOS VALORES
		admin2.setLogin("Rafael");
		admin2.setSenha("Alexandre");
		
//IMPRESS�ES DE TESTE
		System.out.println(admin);
		System.out.println(admin2);
		System.out.println();
		
		if(admin == admin2){
			System.out.println("As duas instancias s�o iguais!");
		}
	}	
}
