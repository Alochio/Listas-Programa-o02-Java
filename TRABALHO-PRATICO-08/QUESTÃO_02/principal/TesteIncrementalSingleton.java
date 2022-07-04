//CÓDIGO ALTERADO
package principal;
import estrutura.IncrementalSingleton;

public class TesteIncrementalSingleton {
	public static void main (String[] args){
	
//FOR QUE IRÁ REALIZAR A IMPRESSÃO DO VALOR QUE FICARA NO INCREMENTALSINGLETON
		for(int i = 0; i < 10; i++){
			IncrementalSingleton inc = IncrementalSingleton.GetInstancia();
			System.out.println(inc);
		}
	}
		
}
/*
COM ESSA MUDANÇA NO CÓDIGO, O VALOR INSTANCIADO SERÁ SOMENTE UM, AO CONTRARIO 
DO CÓDIGO SEM A MUDANÇA QUE PODIA TER VARIOS VALORES DIFERENTES.
*/