package frabricaDeCarros;

//DEFINE UM PADR�O PARA AS FABRICAS DE CARROS
public interface FabricaDeCarros {

	public abstract CarroSedan criaCarroSedan();
	public abstract CarroPopular criaCarroPopular();	
}