package principal;

public class Main {
	public static void main(String[] args){
	
	int n = 5; //valor que ser� atribuido a n, maior do que 0
	System.out.println(f(n)); //imprimindo o retorno da fun��o
	
	}
	public static int f(int n){ //func�o f
		
		if(n == 1){ //condi��o dada no exercicio
			return 1;
		}
		if(n == 2){ //condi��o dada no exercicio
			return 2;
		}
		return 2 * f(n-1) + 3 * f(n-2); //Recursividade
	}
}