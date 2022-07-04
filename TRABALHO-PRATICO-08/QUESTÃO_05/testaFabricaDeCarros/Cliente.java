//CLASSE CLIENTE PARA FAZER O TESTE DE TUDO QUE FOI IMPLEMENTADO
package testaFabricaDeCarros;

import frabricaDeCarros.*;

public class Cliente {
	public static void main(String[] args){
		
		//CRIANDO UMA FABRICA DA FIAT
		FabricaDeCarros fabrica = new FabricaFiat();
		
		//CONSTRUINDO O PRIMEIRO CARRO DA FIAT (SEDAN)
		CarroSedan car01 = fabrica.criaCarroSedan();
		car01.exibirInfoSedan();
		
		//CONSTRUINDO O SEGUNDO CARRO DA FIAT (POPULAR)
		CarroPopular car02 = fabrica.criaCarroPopular();
		car02.exibirInfoPopular();
		
		//CRIANDO UMA FABRICA DA FORD
		FabricaDeCarros fabrica02 = new FabricaFord();
		
		//CONSTRUINDO O PRIMEIRO CARRO DA FORD (SEDAN)
		CarroSedan car03 = fabrica02.criaCarroSedan();
		car03.exibirInfoSedan();
		
		//CONSTRUINDO O SEGUNDO CARRO DA FORD (POPULAR)
		CarroPopular car04 = fabrica02.criaCarroPopular();
		car04.exibirInfoPopular();
	}
}
