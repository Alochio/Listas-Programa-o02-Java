package principal;

public class Rica extends Pessoa{

	private double dinheiro;

//M�TODOS GET AND SET
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

//M�TODO
	public void fazCompras(double valorCompra){
		this.dinheiro = this.dinheiro - valorCompra;
	}
}
