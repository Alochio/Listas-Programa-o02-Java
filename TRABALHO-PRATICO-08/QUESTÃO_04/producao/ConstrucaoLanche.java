package producao;

public class ConstrucaoLanche {
	
//ANALIZA QUAL LANCHE QUER SER CONSTRUIDO E CONSTROI ELE
	public static Lanche FactoryLanche(String nome){
		
		if(nome.equals("CG"))
			return new CG();
		else if(nome.equals("JP"))
			return new JP();
		else if(nome.equals("RT"));
			return new RT();		
	}
}
