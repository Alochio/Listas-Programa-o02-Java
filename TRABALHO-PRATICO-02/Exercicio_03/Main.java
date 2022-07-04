package principal;
import principal.ClasseReta;


public class Main {
	public static void main(String[] args){
		
//CRIA A RETA1
		ClasseReta r1 = new ClasseReta();
		
//CHAMA OS METODOS PARA A REALIZAÇÃO DO QUE FOI PEDIDO
		r1.lerReta();
		r1.coeficienteAngular();
		r1.coefLinear();
		r1.representeReta();
				
//COMPARA DUAS RETAS
		r1.comparaRetas();
	}
}