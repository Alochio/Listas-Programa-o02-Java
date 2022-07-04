package principal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		int n;
		
		System.out.print("Digite quantos numeros deseja digitar: ");
		
		Scanner sc = new Scanner(System.in); //criando scanner para receber valores do teclado
		n = sc.nextInt(); //lendo o valor
		
		float[] vet = new float[n]; //criando um vetor vet de tamanho n, onde o valor de n foi informado pelo teclado
		
		System.out.println("Agora digite os n�meros que deseja verificar: ");
		
		for(int cont = 0; cont < n; cont++){ //la�o para atribuir valores ao vetor
			System.out.print("vet[" + cont + "] = ");
			vet[cont] = sc.nextFloat();
		}
		
		int numerosNegativos;
		
		numerosNegativos = negativos(vet); //variavel inteira recendo o valor que est� retornando do m�todo
		
		System.out.println("Foram digitados " + numerosNegativos + " numeros negativos!"); //realizando a impress�o
		
			}

	public static int negativos(float vet[]){ //inicio do m�todo para contar a quantidade de numeros negativod que h� no vetor
		
		int contNegativos = 0; //atribuindo o valor 0 a variavel inteira
		
		for(int cont = 0; cont < vet.length; cont++){ //la�o correr por todo o vetor
			if(vet[cont] < 0){ //condi��o para analisar se o valor � negativo
				contNegativos++; //caso seja negativo, atribui +1 a variavel 
			}
		}
		return contNegativos; //est� retornando a main a quantidade de nummeros negativos que h� no vetor
	}
}
