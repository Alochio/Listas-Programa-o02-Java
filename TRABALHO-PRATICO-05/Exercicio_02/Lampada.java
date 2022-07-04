package principal;

//----------------------------------------------------------------------------------------
//REUTILIZAÇÃO DA QUESTÃO 01

public class Lampada {
	
	private int luminosidadeDaLampada;
	private String estadoDaLampada;
	
	public static int quantVezesAcesa;
	public static int instanciasCriadas;
		

	public void setLuminosidadeDaLampada(int luminosidadeDaLampada){
		
		if (luminosidadeDaLampada > 0 || luminosidadeDaLampada < 100){
			this.luminosidadeDaLampada = luminosidadeDaLampada;
				
				if(luminosidadeDaLampada > 0){
					quantVezesAcesa = quantVezesAcesa + 1;
				}
		}
		else{
			System.out.println("Valor invalido!!");
			System.out.println("Digite um valor de luminosidade entre 0 a 100");
		}
	}
	
	public void estadoDaLampada(int luminosidadeDaLampada){
		
		if(luminosidadeDaLampada == 0){
			estadoDaLampada = "Apagada";
			getLuminosidadeDaLampada();
			System.out.println("A lampada está " + estadoDaLampada);
		}
		else if(luminosidadeDaLampada == 100){
			estadoDaLampada = "Acesa";
			System.out.println("A lampada está " + estadoDaLampada);
		}
		else if(luminosidadeDaLampada > 0 || luminosidadeDaLampada <100){
			estadoDaLampada = "Meia-Luz";
			System.out.println("A lampada está " + estadoDaLampada);
		}
	}

	public int getLuminosidadeDaLampada(){
		return this.luminosidadeDaLampada;
	}
	
	public String getEstadoDaLampada(){
		return this.estadoDaLampada;
	}
	
	public boolean estaLigado(double luminosidadeDaLampada){
		
		if(luminosidadeDaLampada == 0)
			return false;
		else
			return true;
	}
	
	
	private int whatsLampada;
	
	public void setWhatsLampada(int whatsLampada){
		this.whatsLampada = whatsLampada;
	}
	
	public boolean Eeconomida(int whatsLampada){
		if(whatsLampada < 40)
			return true;
		else
			return false;
	}
	
	public int getQuantidadeDeVezesAcesa(){
		return this.quantVezesAcesa;
	}
	
	public Lampada(int whatsLampada){
		this.whatsLampada = whatsLampada;
		instanciasCriadas = instanciasCriadas +  1;
	}
	
	public Lampada(){
		this.whatsLampada = 60;
		instanciasCriadas = instanciasCriadas +  1;
	}
	
	public int getWhatsDaLampada(){
		return this.whatsLampada;
	}
	
	public int getInstanciasCriadas(){
		return this.instanciasCriadas;
	}
}

//----------------------------------------------------------------------------------------