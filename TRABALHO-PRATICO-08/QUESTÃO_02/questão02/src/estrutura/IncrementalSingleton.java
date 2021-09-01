//CÓDIGO ALTERADO
package estrutura;

public class IncrementalSingleton {
	
//CRIAÇÃO DE UMA NOVA VARIÁVEL ESTÁTICA
	private static IncrementalSingleton instancia;
	
	private static int count = 0;
	private int numero;
	
//CONSTRUTOR FOI MUDADO DE PUBLIC PARA PRIVATE
	private IncrementalSingleton(){
		numero = ++count;
	}

//NOVO MÉTODO CRIADO PARA INSTANCIAR O VALOR
	public static IncrementalSingleton GetInstancia(){
			
		//SÓ IRÁ SER INSTANCIADO SE NÃO TIVER SIDO INSTANCIADO NENHUMA OUTRA VEZ
		if(instancia == null)
			instancia = new IncrementalSingleton();
		
		return instancia;
	}

//MÉTODO PARA PADRONIZAR A IMPRESSÃO
	@Override
	public String toString() {
		return "IncrementalSingleton " + numero;
	}
}