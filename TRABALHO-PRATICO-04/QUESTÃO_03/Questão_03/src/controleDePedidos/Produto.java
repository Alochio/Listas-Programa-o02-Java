package controleDePedidos;

public class Produto {

	//CRIANDO AS VARIAVEIS DO PRODUTO
	private int codigo;
	private float valor;
	private String descricao;

	//CRIANDO OS MÉTODOS GET
	public int getCodigo() {
		return this.codigo;
	}
	public float getValor() {
		return this.valor;
	}
	public String getDescricao() {
		return this.descricao;
	}
	//CRIANDO UM CONSTRUTOR PARA O PRODUTO, SOLICITANDO PARA A CRIAÇÃO DO MESMO
	//UM CÓDIGO, VALOR E DESCRIÇÃO
	public Produto(int codigo, float valor, String descricao) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
	}
}