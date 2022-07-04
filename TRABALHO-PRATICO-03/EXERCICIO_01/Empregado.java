package empresa;

public class Empregado {

//CRIANDO AS VARIAVIES 
	private String nome;
	private double salario;
	private int NumDeHoras;

//CRIANDO OS MÉTODOS GET E SET
	public String getNome(){
		return this.nome;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	public int getNumHoras(){
		return this.NumDeHoras;
	}
	
//CRIANDO O CONSTRUTOR, E OBRIGANDO SER ATRIBUIDO NA CRIAÇÃO DO EMPREGADO, SEU NOME E SALÁRIO
	public Empregado(String nomeEmpregado, double salarioEmpregado){
		this.nome = nomeEmpregado;
		this.salario = salarioEmpregado;
		this.NumDeHoras = 8;
	}
	
//METODO PARA REALIZAR A IMPRESSÃO DAS INFORMAÇÕES DO EMPREGADO	
	public void printInfo(){
		System.out.println("------------------------------------------------------");
		System.out.println("Informações do empregado: ");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Horas trabalhadas por dia: " + this.getNumHoras());
		System.out.println("------------------------------------------------------");
	}
	
//METODO QUE DA UM AUMENTO DE 10% PARA O EPREGADO
	public double promocao(double salarioAtual){
		double novoSalario;
		novoSalario = salarioAtual + (salarioAtual * 0.10);
		return novoSalario;
	}
	
//METODO DE GRATIFICAÇÃO QUE ADICIONA 100 REAIS EM SEU SALÁRIO POR HORA A MAIS TRABALHADA
	public double gratificacao(double salarioAtual){
		int aux;
		
		if(this.NumDeHoras > 6){
			aux = this.NumDeHoras - 6;
			aux = aux * 100;
			return salarioAtual + aux;
		}
		else{
			return salarioAtual;
		}
	}
}