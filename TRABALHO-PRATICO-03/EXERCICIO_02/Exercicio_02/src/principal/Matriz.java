package principal;
import java.util.Scanner;

public class Matriz {
	
//CRIANDO AS VARIAVEIS PARA SABER O NUMERO DE LINHAS E COLUNAS DE MANEIRA ESTÁTICA
	private static int linhas, colunas;
	
//CRIANDO UM SCANNER
	Scanner scan = new Scanner(System.in);
	
//CRIANDO OS MÉTODOS GET E SET STATIC
	public static void setLinhas(int linhas){
		Matriz.linhas = linhas;
		
	}
	public static int getLinhas(){
		return Matriz.linhas;
	}
	
	public static void setColunas(int colunas){
		Matriz.colunas = colunas;
	}
	public static int getColunas(){
		return Matriz.colunas;
	}
	
//CRIANDO AS MATRIZES
	int[][] matriz = new int[linhas][colunas];
	int[][] matrizTransposta = new int[linhas][colunas];
	int a = 0; //VARIAVEL AUXILIAR PARA SABER SE A MATRIZ É QUADRADA
	
//CRIANDO MÉTODO PARA PREENCHER A MATRIZ NUMERO POR NUMERO
	public void preencherMatriz(){
		System.out.println("Preencha a matriz: ");
		
			for(int cont = 0; cont < matriz.length; cont++){
				for (int cont2 = 0; cont2 < matriz[cont].length; cont2++){
					System.out.print("[" + cont + "][" + cont2 + "] = ");
					matriz[cont][cont2] = scan.nextInt();
				}
			}
	}
	
//CRIANDO MÉTODO QUE EDITA UM VALOR DA MATRIZ, DA POSIÇÃO DESEJADA
	public void editarValor(int i, int j){
		System.out.print("Editando valor da posição [" + i + "][" + j + "] = ");
		matriz[i][j] = scan.nextInt();
	}
	
//MÉTODO RESPONSAVEL POR TRANPOR A MATRIZ
	public void transporMatriz(){
		if (linhas == colunas){
			for (int i = 0; i < linhas; i++){
				for (int j = 0; j < colunas; j++){
					matrizTransposta[j][i] = matriz[i][j];
				}
			}
		a = 1; //CASO ENTRE NESSA CONDIÇÃO, A MATRIZ NÃO É QUADRADA
		}
	}
	
//MÉTODO PARA IMPRIMIR A MATRIZ
	public void imprimeMatriz(){
	System.out.println("-----------------------------------------------------------");
	System.out.println("\t Matriz digitada: ");	
		for(int cont = 0; cont < matrizTransposta.length; cont++){
			for(int cont2 = 0; cont2 < matrizTransposta[cont].length; cont2++){
				System.out.print(matriz[cont][cont2] + " ");				
			}
			System.out.println("");
		}	
	System.out.println("-----------------------------------------------------------");
	}
	
//MÉTODO PARA IMPRIMIR A MATRIZ TRANSPOSTA
	public void imprimeMatrizTransposta(){

		if (a == 1){
			System.out.println("-----------------------------------------------------------");
			System.out.println("\t Matriz Transposta: ");	
				for(int cont = 0; cont < matrizTransposta.length; cont++){
					for(int cont2 = 0; cont2 < matrizTransposta[cont].length; cont2++){
						System.out.print(matrizTransposta[cont][cont2] + " ");				
					}
				System.out.println("");
				}	
			System.out.println("-----------------------------------------------------------");
		}
		else{
			System.out.println("Essa matriz não é quadrada!");
		}
	}
}