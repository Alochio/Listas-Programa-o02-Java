package principal;

import principal.Pessoa;
import principal.Universidade;
import principal.Departamento;

public class Main {
	public static void main(String[] args) {

		//CRIANDO PESSOAS
		Pessoa pessoa01 = new Pessoa("Albert", "Einstein", "Professor de Física", 14, 03, 1879);
		Pessoa pessoa02 = new Pessoa("Isaac", "Newton", "Professor de Matematica", 04, 01, 1643);

		//CRIANDO UNIVERSIDADES
		Universidade universidade01 = new Universidade("Princeton", "Nova Jersey - Estados Unidos da América");
		Universidade universidade02 = new Universidade("Cambridge", "Inglaterra");

		//ATRIBUINDO UMA UNIVERSIDADE A UMA PESSOA
		pessoa01.setUniversidade(universidade01);
		pessoa02.setUniversidade(universidade02);

		//CRIANDO DEPARTAMENTOS
		Departamento departamento01 = new Departamento();
		departamento01.setNome("Exatas");

		Departamento departamento02 = new Departamento();
		departamento02.setNome("Humanas");

		Departamento departamento03 = new Departamento();
		departamento03.setNome("Eletrica");

		Departamento departamento04 = new Departamento();
		departamento04.setNome("Biologicas");

		Departamento departamento05 = new Departamento();
		departamento05.setNome("Natureza");

		Departamento departamento06 = new Departamento();
		departamento06.setNome("Sistemas");
		
		//CRIANDO UM VETOR DE DEPARTAMENTOS
		Departamento[] vetDepartamento = new Departamento[50];
		//PASSANDO O NOME DOS DEPARTAMENTOS PARA O VETOR
		vetDepartamento[0] = departamento01;
		vetDepartamento[1] = departamento02;
		vetDepartamento[2] = departamento03;
		vetDepartamento[3] = departamento04;
		vetDepartamento[4] = departamento05;
		vetDepartamento[5] = departamento06;
				
		//ATRIBUINDO OS DEPARTAMENTOS DO VETOR A UMA UNIVERSIDADE
		universidade01.setDepartamento(vetDepartamento);
		
		//ATRIBUINDO UM UNICO DEPARTAMENTO A UMA PESSOA
		pessoa01.setDepartamento(departamento01);
		pessoa02.setDepartamento(departamento01);

		//ATRBUINDO A UNIVERSIDADE A CADA DEPARTAMENTO
		departamento01.setUniversidadeAssociada(universidade01);
		departamento02.setUniversidadeAssociada(universidade01);
		departamento03.setUniversidadeAssociada(universidade01);
		departamento04.setUniversidadeAssociada(universidade01);
		departamento05.setUniversidadeAssociada(universidade01);
		departamento06.setUniversidadeAssociada(universidade01);
		
		//REALIZANDO AS IMPRESSÕES
		System.out.println("Departamentos da Universidade: ");

		System.out.println(universidade01.getNome() + " : " + universidade01.getDepartamento(0));
		System.out.println(universidade01.getNome() + " : " + universidade01.getDepartamento(1));
		System.out.println(universidade01.getNome() + " : " + universidade01.getDepartamento(2));
		System.out.println(universidade01.getNome() + " : " + universidade01.getDepartamento(3));
		System.out.println(universidade01.getNome() + " : " + universidade01.getDepartamento(4));
		System.out.println(universidade01.getNome() + " : " + universidade01.getDepartamento(5));
		
		System.out.println("");
		System.out.println("Departamento das Pessoas: ");

		System.out.println(pessoa01.getNome() + " : " + pessoa01.getDepartamento().getNome());
		System.out.println(pessoa02.getNome() + " : " + pessoa02.getDepartamento().getNome());

		System.out.println("");
		System.out.println("Universidade que cada departamento pertence: ");
		System.out.println(departamento01.getUniversidadeAssociada().getNome());
		System.out.println(departamento02.getUniversidadeAssociada().getNome());
		System.out.println(departamento03.getUniversidadeAssociada().getNome());
		System.out.println(departamento04.getUniversidadeAssociada().getNome());
		System.out.println(departamento05.getUniversidadeAssociada().getNome());
		System.out.println(departamento06.getUniversidadeAssociada().getNome());
	}
}