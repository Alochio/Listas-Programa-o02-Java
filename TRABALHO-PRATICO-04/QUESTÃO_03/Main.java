package controleDePedidos;
import controleDePedidos.Pedido;
import controleDePedidos.ItemPedido;
import controleDePedidos.Produto;
import java.text.DecimalFormat;

public class Main{
	public static void main(String[] args){
				
		//CRIANDO OS PRODUTOS CADASTRADOS NA LOJA
		Produto mouse = new Produto(123, 90.00f , "Mouse_marcaXXX");
		Produto teclado = new Produto (124, 120.00f , "Teclado_MarcaXXX");
		Produto headset = new Produto (125, 199.99f , "FoneHeadset_MarcaXXX");
		Produto capaCelular = new Produto (002, 10.50f , "capaCelular_MarcaXXX");
		
		//SELECIONANDO OS ITENS DO PEDIDO
		ItemPedido item01 = new ItemPedido(mouse, 1);
		ItemPedido item02 = new ItemPedido(teclado, 1);
		ItemPedido item03 = new ItemPedido(headset, 1);
		ItemPedido item04 = new ItemPedido(capaCelular, 1);
		
		//CRIANDO UM PEDIDO
		Pedido pedido01 = new Pedido();
		
		//ADICIONANDO OS ITENS SELECIONADOS AO PEDIDO
		pedido01.adiciona_item(item01);
		pedido01.adiciona_item(item02);
		pedido01.adiciona_item(item03);
		pedido01.adiciona_item(item04);

		//FORMATANDO A EXIBIÇÃO DAS CASAS DECIMAIS DO FLOAT
		DecimalFormat df = new DecimalFormat();
	    df.setMinimumFractionDigits(2);
	    df.setMaximumFractionDigits(2);
	    
	    //IMPRESSÃO DO VALOR TOTAL DO PEDIDO
		System.out.println("\nValor total da compra: " + df.format(pedido01.getValor_total()));
	}
	
}