//C�DIGO ALTERADO
package principal;
import estrutura.IncrementalSingleton;

public class TesteIncrementalSingleton {
	public static void main (String[] args){
	
//FOR QUE IR� REALIZAR A IMPRESS�O DO VALOR QUE FICARA NO INCREMENTALSINGLETON
		for(int i = 0; i < 10; i++){
			IncrementalSingleton inc = IncrementalSingleton.GetInstancia();
			System.out.println(inc);
		}
	}
		
}
/*
COM ESSA MUDAN�A NO C�DIGO, O VALOR INSTANCIADO SER� SOMENTE UM, AO CONTRARIO 
DO C�DIGO SEM A MUDAN�A QUE PODIA TER VARIOS VALORES DIFERENTES.
*/