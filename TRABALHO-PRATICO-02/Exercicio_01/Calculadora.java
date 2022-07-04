package principal;
import java.util.Scanner;

public class Calculadora {
	
//CRIANDO VARIAVEIS PRIVADAS
	private double num1;
	private double num2;
	private String operacao;
	private double resultado;
	
//CRIANDO A FUNÇÃO SCANNER
	Scanner sc = new Scanner(System.in);
	
//CRIANDO OS GET E SET DE TODAS AS VARIAVEIS PRIVADAS 
	public void setNum1(double num1){
		this.num1 = num1;
	}
	public double getNum1(){
		return this.num1;
	}
	
	public void setNum2(double num2){
		this.num2 = num2;
	}
	public double getNum2(){
		return this.num2;
	}
	
	public void setOpetcao(String operacao){
		this.operacao = operacao;
	}
	
	public String getOperacao(){
		return this.operacao;
	}
	
	public void setResultado(double resultado){
		this.resultado = resultado;
	}
	public double getResultado(){
		return this.resultado;
	}
	
		
//FUNÇÃO FAZ CONTA
	public double fazConta(){
		
		System.out.println("\tIniciando Calculadora: \n");
		
		System.out.println("Digite a operação: ");
		System.out.print("x = "); //PRIMEIRO VALOR
		num1 = sc.nextDouble();
		System.out.print("Operação = ");
		operacao = sc.next(); //OPERAÇÃO
		System.out.print("y = ");
		num2 = sc.nextDouble(); //SEGUNDO VALOR
		
		switch(operacao){ //ANALIZA A OPERAÇÃO DIGITADA
			case "+":
				resultado = num1 + num2;
				return resultado;
		
			case "-":
				resultado = num1 - num2;
				return resultado;
			
			case"*":
				resultado = num1 * num2;
				return resultado;
			
			case"/":
				resultado = num1 / num2;
				return resultado;
				
			default: //CASO A OPERAÇÃO SEJA INVALIDA
				System.out.println("OPERAÇÃO INVALIDA");
				System.out.println("Reiniciando calculadora");
				return fazConta();
		}
	}
	
	public void imprimeResult(){ //MÉTODO IMPRIME
		System.out.println(resultado);
	}
}
