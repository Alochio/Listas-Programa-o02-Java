package controleDePedidos;

import controleDePedidos.ItemPedido;

public class Pedido {

	//CRIANDO A VARIAVEL VALOR TOTAL
	private float valor_total;

	//ASSOCIANDO PEDIDO AO ITEM PEDIDO
	private ItemPedido itemPedido;

	//CRIANDO OS METODOS GET, J� QUE N�O PRECISAMOS DOS SETS, J� QUE OS VALORES SER�O
	//INSERIDOS COM A UTILIZA��O DO M�TODO CONSTRUTOR
	public double getValor_total() {
		return this.valor_total;
	}
	public ItemPedido getItemPedido(){
		return this.itemPedido;
	}

	//M�TODO ADICIONA ITEM, IMPRIME INFORMA��ES DO ITEM PEDIDO E CHAMA O M�TODO OBTER TOTAL
	public void adiciona_item(ItemPedido item) {
		
		System.out.println(item.getProduto().getCodigo() + " - " + item.getProduto().getDescricao() +
				" - " + item.getQuantidade() + " - " + item.getProduto().getValor());
		this.itemPedido = item;
		obter_total();
	}

	//METODO PARA CALCULAR O VALOR TOTAL DO PEDIDO
	public float obter_total() {
		return this.valor_total = this.valor_total + (itemPedido.getQuantidade() * itemPedido.getProduto().getValor());
	}
}