package empresa;

public class Main {
	public static void main(String[] args){
		
//CRIANDO EMPREGADO (1� EMPREGADO)
		System.out.println("\t Empregado Criado: ");
		Empregado empregado01 = new Empregado("Vinicius", 3000.50);
		empregado01.printInfo();
		
//EMPREGADO COM O M�TODO DE PROMO��O
		System.out.println("\t Empregado ap�s promo��o: ");
		empregado01.setSalario(empregado01.promocao(empregado01.getSalario()));
		empregado01.printInfo();
			
//EMPREGADO COM O M�TODO DE GRATIFICA��O
		System.out.println("\t Empregado ap�s gratifica��o");
		empregado01.setSalario(empregado01.gratificacao(empregado01.getSalario()));
		empregado01.printInfo();
	

		System.out.println("TESTANDO STATIC - NUMERO DE FUNCIONARIOS CADASTRADOS\n");
		
		
//TESTANDO O M�TODO STATIC PARA CONTAR O NUMERO DE FUNCIONARIOS DA EMPRESA
		System.out.println("Numero de funcionarios criados: " + empregado01.getNumeroDeFuncionarios());
//2� EMPREGADO
		Empregado empregado02 = new Empregado("Jo�o", 4000.50);
		System.out.println("Numero de funcionarios criados: " + empregado01.getNumeroDeFuncionarios());
//3� EMPREGADO
		Empregado empregado03 = new Empregado("Andre", 3045.50);
		System.out.println("Numero de funcionarios criados: " + empregado01.getNumeroDeFuncionarios());
	}
	
	
}