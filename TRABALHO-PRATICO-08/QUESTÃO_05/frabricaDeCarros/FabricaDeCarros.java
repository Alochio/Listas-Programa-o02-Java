package frabricaDeCarros;

//DEFINE UM PADRÃO PARA AS FABRICAS DE CARROS
public interface FabricaDeCarros {

	public abstract CarroSedan criaCarroSedan();
	public abstract CarroPopular criaCarroPopular();	
}