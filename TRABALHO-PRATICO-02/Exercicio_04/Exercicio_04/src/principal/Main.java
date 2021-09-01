package principal;

public class Main {
	public static void main(String[] args){
		
//CRIANDO OS PAÍSES
		País p1 = new País();
		País p2 = new País();

//CHAMANDO OS MÉTODOS PARA CAPTURAR AS INFORMAÇÕES DO PRIMEIRO PAÍS
		p1.imprimeNumPais();
		p1.criaPais();		
		p1.declaraLimitrofe();
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//CHAMANDO OS MÉTODOS PARA CAPTURAR AS INFORMAÇÕES DO SEGUNDO PAÍS
		p2.imprimeNumPais();
		p2.criaPais();
		p2.declaraLimitrofe();
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//IMPRIMINDO TODAS AS INFORMAÇÕES DO PRIMEIRO PAÍS
		double recebe = p1.densidadePopulacional(p1.getPopulacao(), p1.getDimensao());
		p1.imprime(p1.getCodigoISO(), p1.getNome(),recebe , p1.getLimitrofes());
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//IMPRIMINDO TODAS AS INFORMAÇÕES DO SEGUNDO PAÍS
		
		recebe = p2.densidadePopulacional(p2.getPopulacao(), p2.getDimensao());
		p2.imprime(p2.getCodigoISO(), p2.getNome(), recebe, p2.getLimitrofes());
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//IMPRIMINDO SE OS PAÍSES SÃO LIMITROFES OU NÃO
		p1.analizaLimitrofes(p1.getLimitrofes(),p1.getNome(), p2.getNome(), p2.getLimitrofes());
	}
}