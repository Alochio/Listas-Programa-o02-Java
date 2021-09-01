package controleDePedidos;
import controleDePedidos.Produto;

public class ItemPedido {

	//CRIANDO VARIAVEL
	private int quantidade;
	
	//ASSOCIANDO ITEM PEDIDO AO PRODUTO
	private Produto produto;
	
	//CRIANDO METODOS GET
	public int getQuantidade() {
		return this.quantidade;
	}	
	public Produto getProduto(){
		return this.produto;
	}

	//CRIANDO UM CONSTRUTOR QUE RECEBE COMO PARAMETRO O PRODUTO E A QUANTIDADE DO PRODUTO
	public ItemPedido(Produto produto, int quantidade){
		this.quantidade = quantidade;
		this.produto = produto;
	}
}