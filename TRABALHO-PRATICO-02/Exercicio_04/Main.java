package principal;

public class Main {
	public static void main(String[] args){
		
//CRIANDO OS PA�SES
		Pa�s p1 = new Pa�s();
		Pa�s p2 = new Pa�s();

//CHAMANDO OS M�TODOS PARA CAPTURAR AS INFORMA��ES DO PRIMEIRO PA�S
		p1.imprimeNumPais();
		p1.criaPais();		
		p1.declaraLimitrofe();
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//CHAMANDO OS M�TODOS PARA CAPTURAR AS INFORMA��ES DO SEGUNDO PA�S
		p2.imprimeNumPais();
		p2.criaPais();
		p2.declaraLimitrofe();
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//IMPRIMINDO TODAS AS INFORMA��ES DO PRIMEIRO PA�S
		double recebe = p1.densidadePopulacional(p1.getPopulacao(), p1.getDimensao());
		p1.imprime(p1.getCodigoISO(), p1.getNome(),recebe , p1.getLimitrofes());
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//IMPRIMINDO TODAS AS INFORMA��ES DO SEGUNDO PA�S
		
		recebe = p2.densidadePopulacional(p2.getPopulacao(), p2.getDimensao());
		p2.imprime(p2.getCodigoISO(), p2.getNome(), recebe, p2.getLimitrofes());
		
		p1.fazLinha(); //IMPRIMINDO UMA LINHA
		
//IMPRIMINDO SE OS PA�SES S�O LIMITROFES OU N�O
		p1.analizaLimitrofes(p1.getLimitrofes(),p1.getNome(), p2.getNome(), p2.getLimitrofes());
	}
}