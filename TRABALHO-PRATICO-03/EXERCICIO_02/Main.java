package principal;

public class Main {
	public static void main(String[] args){
		
//ATRIBUINDO VALORES AS LINHAS E COLUNAS COM OS OBJETOS ESTÁTICOS
		Matriz.setLinhas(5);
		Matriz.setColunas(5);
		
//CRIANDO A MATRIZ
		Matriz matriz = new Matriz();
		
//CHAMANDO MÉTODO PARA PREENCHER A MATRIZ
		matriz.preencherMatriz();
		
//CHAMANDO MÉTODO PARA EDITAR UM VALOR DA MATRIZ
		matriz.editarValor(1, 1);
		
//CHAMANDO MÉTODO PARA TRANSPOR A MATRIZ
		matriz.transporMatriz();
	
//IMPRIMINDO A MATRIZ
		matriz.imprimeMatriz();
		
//IMPRIMINDO A MATRIZ TRANSPOSTA
		matriz.imprimeMatrizTransposta();
	}
}
