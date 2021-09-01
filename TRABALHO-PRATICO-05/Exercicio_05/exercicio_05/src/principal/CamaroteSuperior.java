package principal;

public class CamaroteSuperior extends VIP{
	
	private double valorAdicional = 15.50;
	
	public double valorIngressoCamaroteSuperior(){
		return valorIngressoVIP() + valorAdicional;
	}
}
