package principal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Ingresso i1 = new Ingresso();
		
		Scanner sc = new Scanner(System.in);
		double aux;
		
		System.out.println("Seja bem vindo!");
		System.out.println("-----------------------------------------------");
		
		System.out.println("Deseja comprar ingresso normal ou VIP"
				+ " \n(1 - normal / 2 - VIP): ");
		
		aux = sc.nextDouble();
		
		
		if(aux == 1){
			System.out.println("-----------------------------------------------");
			Normal n1 = new Normal();
			n1.imprimeIngressoNormal();
			System.out.println("valor: " + i1.valorIngresso());
			System.out.println("-----------------------------------------------");
		}
		else if(aux == 2){
						
			System.out.println("Ingresso VIP");
			System.out.println("Deseja comprar camarote Superior ou Inferior"
					+ " \n(1 - Superior / 2 - Inferior): ");
			
			aux = sc.nextDouble();
			
			if(aux == 1){
				CamaroteSuperior cs1 = new CamaroteSuperior();
				System.out.println("-----------------------------------------------");
				System.out.println("Camarote superior:");
				System.out.println("valor: " + cs1.valorIngressoCamaroteSuperior());
				System.out.println("-----------------------------------------------");
				
			}
			else if(aux == 2){
				CamaroteInferior ci1 = new CamaroteInferior();
				System.out.println("-----------------------------------------------");
				System.out.println("Camarote Inferior: ");
				System.out.println("valor: " + ci1.valorIngressoVIP());
				System.out.println("-----------------------------------------------");
			}
			else{
				System.out.println("-----------------------------------------------");
				System.out.println("Valor Invalido!!");
				System.out.println("-----------------------------------------------");
			}
		}
		else{
			System.out.println("-----------------------------------------------");
			System.out.println("Valor Invalido!!");
			System.out.println("-----------------------------------------------");
		}
	}
}
