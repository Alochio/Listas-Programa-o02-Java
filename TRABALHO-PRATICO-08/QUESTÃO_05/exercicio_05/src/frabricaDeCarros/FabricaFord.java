package frabricaDeCarros;

//CLASSE QUE IMPLEMENTA A INTERFACDE FABRICADECARROS
public class FabricaFord implements FabricaDeCarros{

	//SOBRESCRITA DA INTERFACE
	@Override
	public CarroSedan criaCarroSedan(){
		return new FiestaSedan();
	}
	
	//SOBRESCRITA DA INTERFACE
	@Override
	public CarroPopular criaCarroPopular(){
		return new Fiesta();
	}
}
