package estrututa;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Blog {

	Scanner sc = new Scanner(System.in);

	//CRIANDO ALGUMAS VARIAVEIS
	private Postagem postagens = new Postagem();
	private static int aux = 0;
	private static int aux2 = 0;
	private String[] postagensPubli = new String[50];
	private String[] todasPost = new String[50];

	//MÉTODO PARA A CRIAÇÃO DE UMA POSTAGEM
	public void adcionarPostagem(Postagem postagem) {

		System.out.println("\tCRIANDO POSTAGEM: \n");

		System.out.print("Titulo: ");
		postagem.setTitulo(sc.nextLine());

		System.out.print("Texto: \n");
		postagem.setTexto(sc.nextLine());

		Date data = new Date();
		DateFormat date = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data: " + data);
		System.out.println("-----------------------------------------");

		postagem.setId(0);
		this.postagens.setTitulo(postagem.getTitulo());
		this.postagens.setTexto(postagem.getTexto());
		this.postagens.setData(postagem.getData());

		aux2++;
	}

	//MÉTODO PARA PUBLICAR UMA POSTAGEM
	public void publicarPostagem(Postagem postagem) {

		postagem.setId(1);
		this.postagens.setTitulo(postagem.getTitulo());
		this.postagens.setTexto(postagem.getTexto());
		this.postagens.setData(postagem.getData());

		aux++;
	}

	//MÉTODO QUE LISTA AS POSTAGENS PUBLICADAS
	public void listarPostagensPublicadas(int funcao) {
		
		postagensPubli[aux - 1] = postagens.getTitulo();
		
		if (funcao != 0) {
			System.out.println("\tPostagens publicadas: \n");
		
			for (int cont = 0; cont < aux; cont++) {
				System.out.println("Título: " + postagensPubli[cont]);
			}
		}
	}

	//MÉTODO QUE LISTA TODAS AS POSTAGENS
	public void listarTodasAsPostagens(int funcao) {
	
		todasPost[aux2 - 1] = postagens.getTitulo();
		
		if (funcao != 0) {
			System.out.println("---------------------------------------------\n");
			System.out.println("\tTodas as Postagens: \n");
		
			for (int cont = 0; cont < aux2; cont++) {
				System.out.println("Título: " + todasPost[cont]);
			}
		}
	}

	//MÉTODO QUE APAGA AS POSTAGENS
	public void apagarPostagem(Postagem postagem) {

		postagem.setTitulo(null);
		postagem.setTexto(null);
		postagem.setId(null);
		postagem.setData(null);
	}
}