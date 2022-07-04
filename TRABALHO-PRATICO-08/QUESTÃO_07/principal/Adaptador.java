package principal;

import java.util.List;

import principal.SomadorExistente;

public class Adaptador {

	int[] vetorAux = new int[100];
	int aux = 0;
	
	Adaptador(List<Integer> lista){
		for(int cont = 0; lista.get(cont) != null; cont++){
			vetorAux[cont] = lista.get(cont);
			aux = aux + 1;
		}
		
		int[] vetAdaptado = new int[aux];
		
		
	}
	
	

	
	
}
