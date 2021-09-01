package exercicio_03;

public class Main {
	public static void main(String[] args){

//ELEVADOR CRIADO
	Elevador elevador = new Elevador();
	
//PASSADO A CAPACIDADE E NUMERO DE ANDARES DO PRÉDIO
	elevador.setInicializa(10, 12);
	
	elevador.imprimeLinha();
	
//INICIALIZOU O ELEVADOR
	System.out.println("Capacidade do Elevador: " + elevador.getCapacidade() );
	System.out.println("Numero de andares do prédio: " + elevador.getNumeroDeAndares());
	System.out.println("Posição atual do elevador: " + elevador.getAndarAtual());
	System.out.println("Numero de pessoas: " + elevador.getOcupacaoAtual());
	
	elevador.imprimeLinha();
	
//MANDOU O ELEVADOR SUBIR
	elevador.setSobe(elevador.getNumeroDeAndares(), elevador.getAndarAtual());
	System.out.println("Subiu!!");
	System.out.println("Posição atual do elevador: " + elevador.getAndarAtual());
	
	elevador.imprimeLinha();
	
//MANDOU O ELEVADOR DESCER
	elevador.setDesce(elevador.getAndarAtual());
	System.out.println("Desceu!!");
	System.out.println("Posição atual do elevador: " + elevador.getAndarAtual());
	
	elevador.imprimeLinha();
	
//TENTANDO DESCER DENOVO, COM O ELEVADOR JÁ NO TÉRREO
	elevador.setDesce(elevador.getAndarAtual());
	System.out.println("Posição atual do elevador: " + elevador.getAndarAtual());
	
	elevador.imprimeLinha();
	
//ENTRANDO ALGUEM
	elevador.setEntra(elevador.getCapacidade(), elevador.getOcupacaoAtual());
	System.out.println("Entrou!!");
	System.out.println("Pessoas no elevador: " + elevador.getOcupacaoAtual());
	
	elevador.imprimeLinha();
	
//SAINDO ALGUEM
	elevador.setSai(elevador.getOcupacaoAtual());
	System.out.println("Saiu!!");
	System.out.println("Pessoas no elevador: " + elevador.getOcupacaoAtual());
	
	elevador.imprimeLinha();
	
//TENTANDO TIRAR MAIS ALGUMA PESSOA
	elevador.setSai(elevador.getOcupacaoAtual());
	System.out.println("Pessoas no elevador: " + elevador.getOcupacaoAtual());

	elevador.imprimeLinha();		
	}
}
