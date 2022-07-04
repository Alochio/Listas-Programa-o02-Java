package frabricaDeCarros;

//CLASSE QUE IMPLEMENTA FABRICADECARROS
public class FabricaFiat implements FabricaDeCarros{
	
	//SOBRESCRITA DA INTERFACE
	@Override
	public CarroSedan criaCarroSedan(){
		return new Siena();
	}
	
	//SOBRESCRITA DA INTERFACE
	@Override
	public CarroPopular criaCarroPopular(){
		return new Palio();
	}
}