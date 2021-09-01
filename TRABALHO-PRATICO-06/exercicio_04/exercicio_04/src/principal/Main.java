package principal;

import loja.Midia;
import loja.DVD;
import loja.CD;
import loja.Figura;

public class Main {
	public static void main(String[] args){
		
		
		Midia dvd = new DVD();
		Midia cd = new CD(698, 5.50, "CD-Musicas-Selecionadas", 12);
		Figura fig = new Figura();
		
		dvd.printDados();
		fig.printDetalhesDVD(dvd.getTipo());
		
		cd.printDados();
		fig.printDetalhesCD(cd.getTipo(), 1);
	}
}
