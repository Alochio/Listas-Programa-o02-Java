//CÓDIGO OFERECIDO PELO EXERCICIO
package estrutura;

public class Incremental {
	
//CRIAÇÃO DAS VARIAVEIS
	private static int count = 0;
	private int numero;
	
//CONSTRUTOR
	public Incremental(){
		numero = ++count;
	}

//MÉTODO PARA PADRONIZAR UM ESTILO DE IMPRESSÃO
	public String toString(){
		return "Incremental " + numero;
	}
}