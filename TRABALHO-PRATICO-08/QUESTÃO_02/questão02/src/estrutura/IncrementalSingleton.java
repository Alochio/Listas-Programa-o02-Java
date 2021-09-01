//C�DIGO ALTERADO
package estrutura;

public class IncrementalSingleton {
	
//CRIA��O DE UMA NOVA VARI�VEL EST�TICA
	private static IncrementalSingleton instancia;
	
	private static int count = 0;
	private int numero;
	
//CONSTRUTOR FOI MUDADO DE PUBLIC PARA PRIVATE
	private IncrementalSingleton(){
		numero = ++count;
	}

//NOVO M�TODO CRIADO PARA INSTANCIAR O VALOR
	public static IncrementalSingleton GetInstancia(){
			
		//S� IR� SER INSTANCIADO SE N�O TIVER SIDO INSTANCIADO NENHUMA OUTRA VEZ
		if(instancia == null)
			instancia = new IncrementalSingleton();
		
		return instancia;
	}

//M�TODO PARA PADRONIZAR A IMPRESS�O
	@Override
	public String toString() {
		return "IncrementalSingleton " + numero;
	}
}