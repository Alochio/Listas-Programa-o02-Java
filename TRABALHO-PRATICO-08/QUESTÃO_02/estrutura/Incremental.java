//C�DIGO OFERECIDO PELO EXERCICIO
package estrutura;

public class Incremental {
	
//CRIA��O DAS VARIAVEIS
	private static int count = 0;
	private int numero;
	
//CONSTRUTOR
	public Incremental(){
		numero = ++count;
	}

//M�TODO PARA PADRONIZAR UM ESTILO DE IMPRESS�O
	public String toString(){
		return "Incremental " + numero;
	}
}