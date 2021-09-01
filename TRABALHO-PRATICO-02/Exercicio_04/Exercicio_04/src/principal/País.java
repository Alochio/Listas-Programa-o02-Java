package principal;
import java.util.Scanner;

public class País {
	
//CRIANDO AS VARIAVEIS USADAS NO CÓDIGO
	private String codigoISO;
	private String nome;
	private double populacao;
	private double dimensao;
	public int a = 1;
	private String[] limitrofes = new String[3];
	
//CRIANDO UM SCANNER
	Scanner sc = new Scanner(System.in);
	
//CRIANDO OS MÉTODOS GET E SET DAS VÁRIAVEIS PRIVADAS
	public void setCodigoISO(String codigoISO){
		this.codigoISO = codigoISO;
	}
	public String getCodigoISO(){
		return this.codigoISO;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setPopulacao(double populacao){
		this.populacao = populacao;
	}
	public double getPopulacao(){
		return this.populacao;
	}
	public void setDimensao(double dimensao){
		this.dimensao = dimensao;
	}
	public double getDimensao(){
		return this.dimensao;
	}
	
	public void setLimitrofes(String[] limitrofes){
		this.limitrofes = limitrofes;
	}
	public String[] getLimitrofes(){
		return this.limitrofes;
	}
	
//UM MÉTODO QUE SERVE SOMENTE PARA MOSTRAR QUAL PAÍS ESTÁ SENDO ANALIZADO
	public void imprimeNumPais(){
		System.out.print("Pais: " + a + "\n");
		a++;
	}
	
//MÉTODO CRIA PAIS, ONDE POR AQUI IRÁ RECEBER TODAS AS INFORMAÇÕES NECESSÁRIAS
	public void criaPais(){
		System.out.print("Digite o código ISO do país: ");
		this.setCodigoISO(sc.next());
		System.out.print("Digite o nome do país: ");
		this.setNome(sc.next());
		System.out.print("Digite a quantidade populacional do país, em milhões: ");
		this.populacao = sc.nextDouble();
		System.out.print("Digite o tamanho do país: ");
		this.dimensao = sc.nextDouble();		
	}
	
//MÉTODO QUE CALCULA A DENSIDADE POPULACIONAL DO PAÍS
	public double densidadePopulacional(double pupulacao, double dimensao){
		pupulacao = populacao *1000;
		return populacao/dimensao;
	}
	
//MÉTODO PARA LER OS PAÍSES QUE SÃO LIMITROFES DO PAÍS QUE ESTÁ SENDO CRIADO
	public void declaraLimitrofe(){
		int aux = 1;
		for(int cont = 0; cont < limitrofes.length; cont++){
			System.out.print("Digite o " + aux + " país limitrofe: ");
			limitrofes[cont] = sc.next();
			aux++;
		}
	}
	
//MÉTODO PARA ANALIZAR SE OS PAÍSES SÃO LIMITROFES OU NÃO, E IMPRIME O RESULTADO
	public void analizaLimitrofes(String[] limitrofes1,String nome1, String nome2, String[] limitrofes2){
		boolean aux = false;
		
		for (int cont = 0; cont < limitrofes1.length; cont++){
			if (nome2.equals(limitrofes1[cont])){
				aux = true;
			}
		}
		for (int cont = 0; cont < limitrofes2.length; cont++){
			if (nome1.equals(limitrofes2[cont])){
				aux = true;
			}
		}
		if (aux == true){
			System.out.println("Os países são limitrofes. ");
		}
		else{
			System.out.println("Os países não são limitrofes. ");
		}
	}
	
//MÉTODO PARA A IMPRESSÃO DE TODAS AS INFORMAÇÕES QUE FORAM COLETADAS E CALCULADAS
	public void imprime(String codigoIso, String nome, double densidadePopulacional, String[] limitrofes){
		
		System.out.println("Código ISO = " + codigoIso.toUpperCase());
		System.out.println("Nome = " + nome);
		System.out.print("Densidade populacional = " + densidadePopulacional + " pessoas por Km^2");
		System.out.println("\nPaises Limitrofes: ");
		for(int cont = 0; cont < limitrofes.length; cont++){
			System.out.println(limitrofes[cont]);
		}		
	}
	
//UM MÉTODO CRIADO SOMENTE PARA FAZER UMA IMPRESSÃO DE UMA LINHA NO CÓDIGO, SOMENTE PARA ESTÉTICA
	public void fazLinha(){
		System.out.println("---------------------------------------------------------");
	}		
}