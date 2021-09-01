package principal;

public class Rica extends Pessoa{

	private double dinheiro;

//MÉTODOS GET AND SET
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

//MÉTODO
	public void fazCompras(double valorCompra){
		this.dinheiro = this.dinheiro - valorCompra;
	}
}
