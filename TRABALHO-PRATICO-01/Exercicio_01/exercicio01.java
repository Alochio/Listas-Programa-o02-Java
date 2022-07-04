package principal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		int n;
		
		System.out.print("Digite quantos numeros deseja digitar: ");
		
		Scanner sc = new Scanner(System.in); //criando scanner para receber valores do teclado
		n = sc.nextInt(); //lendo o valor
		
		float[] vet = new float[n]; //criando um vetor vet de tamanho n, onde o valor de n foi informado pelo teclado
		
		System.out.println("Agora digite os números que deseja verificar: ");
		
		for(int cont = 0; cont < n; cont++){ //laço para atribuir valores ao vetor
			System.out.print("vet[" + cont + "] = ");
			vet[cont] = sc.nextFloat();
		}
		
		int numerosNegativos;
		
		numerosNegativos = negativos(vet); //variavel inteira recendo o valor que está retornando do método
		
		System.out.println("Foram digitados " + numerosNegativos + " numeros negativos!"); //realizando a impressão
		
			}

	public static int negativos(float vet[]){ //inicio do método para contar a quantidade de numeros negativod que há no vetor
		
		int contNegativos = 0; //atribuindo o valor 0 a variavel inteira
		
		for(int cont = 0; cont < vet.length; cont++){ //laço correr por todo o vetor
			if(vet[cont] < 0){ //condição para analisar se o valor é negativo
				contNegativos++; //caso seja negativo, atribui +1 a variavel 
			}
		}
		return contNegativos; //está retornando a main a quantidade de nummeros negativos que há no vetor
	}
}
