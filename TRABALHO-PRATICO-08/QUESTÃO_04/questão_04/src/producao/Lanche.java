package producao;

//CLASSE PAI PARA PADRONIZAR CADA UM DOS LANCHES
public class Lanche {

	private String pao;
	private String queijo;
	private String presunto;
	private boolean salada;
	
	protected Lanche(String pao, String queijo, String presunto, boolean salada){
		this.pao = pao;
		this.queijo = queijo;
		this.presunto = presunto;
		this.salada = salada;
	}
	
	@Override
	public String toString() {
		return "Ingredientes = [Pão: " + pao + "|| Queijo: " + queijo + "|| Presunto: "
				+ presunto + "|| Salada: " + salada + "]";	
	}
}