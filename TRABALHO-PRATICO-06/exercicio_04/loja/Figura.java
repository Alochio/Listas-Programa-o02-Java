package loja;

import loja.DVD;
import loja.CD;

public class Figura implements iLoja {
	
	private int posiMidia;
	private String tipoMidia;
		
	private Midia dvd = new DVD();
	private Midia cd = new CD();
	
//--------------------------------------------------------------------------
//METODOS GET AND SET
	
	public int getPosiMidia() {
		return posiMidia;
	}

	public void setPosiMidia(int posiMidia) {
		this.posiMidia = posiMidia;
	}
	
	public String getTipoMidia() {
		return tipoMidia;
	}

	public void setTipoMidia(String tipoMidia) {
		this.tipoMidia = tipoMidia;
	}
//--------------------------------------------------------------------------
//CONSTRUTOR
	public Figura(){
		
	}
//--------------------------------------------------------------------------	
	
	@Override
	public void printDetalhesDVD(Object objeto) {
		
		if (dvd.getTipo().equalsIgnoreCase("DVD") == true){
			System.out.println("Capa do DVD");
		}
	}
	
	@Override
	public void printDetalhesCD(Object objeto, int NFaixa) {
				
		if (cd.getTipo().equalsIgnoreCase("CD") == true){
			System.out.println("Capa da " + NFaixa + "ª musica");	
		}
	}
}