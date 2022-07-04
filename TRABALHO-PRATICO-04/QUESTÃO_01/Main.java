package principal;
import principal.Pessoa;
import principal.Universidade;

public class Main {
	public static void main(String[] args){

//PESSOAS CRIADAS UTILIZANDO UM CONTRUTOR
	Pessoa pessoa01 = new Pessoa("Albert", "Einstein","Professor de Física", 14, 03, 1879);
	Pessoa pessoa02 = new Pessoa("Isaac", "Newton", "Professor de Matematica", 04, 01, 1643);
		
//UNIVERSIDADES CRIADAS UTILIZANDO UM CONSTRUTOR
	Universidade universidade01 = new Universidade("Princeton", "Nova Jersey - Estados Unidos da América");
	Universidade universidade02 = new Universidade("Cambridge", "Inglaterra");
	
//ATRIBUINDO UNIVERSIDADE A PESSOA USANDO ASSOCIAÇÃO
	pessoa01.setUniversidade(universidade01);
	pessoa02.setUniversidade(universidade02);	
	
//IMPRIMINDO AS INFORMAÇÕES DAS PESSOAS CRIADAS
	pessoa01.ImprimeInformacoes(pessoa01.getSobrenome(), pessoa01.getProfissao(), pessoa01.getUniversidade().getNome(),
		pessoa01.getUniversidade().getEndereco());
	
	pessoa02.ImprimeInformacoes(pessoa02.getNome(),pessoa02.getProfissao(), pessoa02.getUniversidade().getNome(),
			pessoa02.getUniversidade().getEndereco());
 }
}