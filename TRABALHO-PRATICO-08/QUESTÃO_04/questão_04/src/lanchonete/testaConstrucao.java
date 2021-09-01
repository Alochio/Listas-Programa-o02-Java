package lanchonete;

import producao.*;

public class testaConstrucao {
	public static void main(String[] args){
		
		//TESTANDO A CONSTRUÇÃO DOS LANCHES
		Lanche pedido01 = ConstrucaoLanche.FactoryLanche("CG");
		System.out.println("Pedido 01 \n" + pedido01);
		System.out.println();
		
		Lanche pedido02 = ConstrucaoLanche.FactoryLanche("RT");
		System.out.println("Pedido 02 \n" + pedido02);
		System.out.println();
		
		Lanche pedido03 = ConstrucaoLanche.FactoryLanche("JP");
		System.out.println("Pedido 03 \n" + pedido03);
		System.out.println();
		
	}
}
