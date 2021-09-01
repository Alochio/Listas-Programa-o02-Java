package exercicio_03;

public class Elevador {
	
//CRIAMDO AS VARIAVEIS PRIVADAS
	private int numeroDeAndares;
	private int andarAtual;
	private int capacidade;
	private int ocupacaoAtual;
	
//COMO N√O QUERO QUE O USUARIO INSIRA UM VALOR, DEIXEI O SET COMENTADO
//	public void setNumeroDeAndares(int numeroDeAndares){
//		this.numeroDeAndares = numeroDeAndares;
//	}
	
//GET PARA IMPRIMIR O NUMERO DE ANDARES
	public int getNumeroDeAndares(){
		return this.numeroDeAndares;
	}

//COMO N√O QUERO QUE O USUARIO INSIRA UM VALOR, DEIXEI O SET COMENTADO
//	public void setAndarAtual(int andarAtual){
//		this.andarAtual = andarAtual;
//		System.out.print(andarAtual);
//	}
	
//GET PARA MOSTRAR O ANDAR ATUAL
	public int getAndarAtual (){
		return this.andarAtual;
	}

//COMO N√O QUERO QUE O USUARIO INSIRA UM VALOR, DEIXEI O SET COMENTADO
//	public void setCapacidade(int capacidade){
//		this.capacidade = capacidade;
//	}

//GET PARA MOSTRAR A CAPACIDADE DO ELEVADOR
	public int getCapacidade(){
		return this.capacidade;
	}
	
//COMO N√O QUERO QUE O USUARIO INSIRA UM VALOR, DEIXEI O SET COMENTADO
//	public void setOcupacaoAtual(int ocupacaoAtual){
//		this.ocupacaoAtual = ocupacaoAtual;
//	}

//GET PARA MOSTRAR A QUANTIDADE DE POSSOAS NO ELEVADOR NO MOMENTO
	public int getOcupacaoAtual(){
		return this.ocupacaoAtual;
	}
	
	
//FUN«√O PRIVADA QUE INICIALIZA O ELEVADOR, COM SUA CAPACIDADE, NUMERO DE ANDARES DO PR…DIO, E DEFINE COMO 0, O NUMERO DE PESSOAS DENTRO E O ANDAR ATUAL
	private void inicializa(int capacidade, int numeroDeAndares){
		this.ocupacaoAtual = 0;
		this.andarAtual = 0;
		System.out.println("Elevador Inicializado!");
	}
	
//SET PARA RECEBER OS VALORES E PASSAR PARA A FUN«√O INICIALIZA QUE EST¡ PRIVADA
	public void setInicializa(int capacidade, int numeroDeAndares){
		this.capacidade = capacidade;
		this.numeroDeAndares = numeroDeAndares;
		
		inicializa(capacidade, numeroDeAndares);
	}
	
//FUN«√O ENTRA PRIVADA, COM AS CONDI«’ES PARA A ENTRADA DE MAIS ALGUMA PESSOA
	private void entra(int capacidade, int ocupacaoAtual){
		
		if (capacidade > ocupacaoAtual){
			this.ocupacaoAtual = ocupacaoAtual + 1;
		}else{
			System.out.print("Elevador cheio, n„o È permitida a entrada de mais pessoas!\n");
		}
	}
	
//M…TODO SET PARA CHAMAR A FUN«√O PRIVADA
	public void setEntra(int capacidade, int ocupacaoAtual){
		entra(capacidade, ocupacaoAtual);
	}
	
//M…TODO PRIVADO PARA TIRAR UMA PESSOA DO ELEVADOR, COM AS CONDI«’ES PARA PODER TIRAR
	private void sai(int ocupacaoAtual){
		
		if (ocupacaoAtual != 0){
			this.ocupacaoAtual = ocupacaoAtual - 1;
		}else{
			System.out.print("N„o h· ninguem para sair\n");
		}
	}
	
//M…TODO PUBLICO SET PARA CHAMAR O M…TODO PRIVADO QUE TIRA ALGUEM DO ELEVADOR
	public void setSai(int ocupacaoAtual){
		sai(ocupacaoAtual);
	}
	
//M…TODO PRIVADO PARA SUBIR O ELEVADOR COM SUAS CONDI«’ES
	private void sobe(int numeroDeAndares, int andarAtual){
		
		if (numeroDeAndares > andarAtual){
			this.andarAtual = andarAtual + 1;
		}else{
			System.out.print("O elevador j· est· na cobertura, n„o pode subir mais\n");
		}
	}
	
//SET PARA CHAMAR O M…TODO SOBE
	public void setSobe(int numeroDeAndares, int andarAtual){
		sobe(numeroDeAndares,andarAtual);
	}
	
//m…TODO PRIVADO DESCE, COM SUAS CONDI«’ES
	private void desce(int andarAtual){
		
		if (andarAtual != 0){
			this.andarAtual = andarAtual - 1;
		}else{
			System.out.print("O elevador j· est· no terreo, n„o pode descer mais\n");
		}
	}
	
//SET PARA CHAMAR O M…TODO DESCE
	public void setDesce(int andarAtual){
		desce(andarAtual);
	}

//SOMENTE UM M…TODO PUBLICO PARA IMPRIMIR UMA LINHA, QUEST√O DE EST…TICA
	public void imprimeLinha(){
		System.out.println("------------------------------------------------------");
	}
}