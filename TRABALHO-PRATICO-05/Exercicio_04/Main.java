package principal;

public class Main {
	public static void main(String[] args){
		
		Gato gato1 = new Gato();
		
		gato1.setNome("Frajola");
		gato1.setRaca("Per�a");
		
		System.out.println("Informa��es do gato: \n" + "Nome: " + gato1.getNome() + 
				"\nRa�a: " + gato1.getRaca());
		
		gato1.Caminha();
		gato1.mia();
		
		System.out.println("-----------------------------------------------------");
		
		Cachorro dog1 = new Cachorro();
		
		dog1.setNome("Thor");
		dog1.setRaca("Labrador");
		
		System.out.println("Informa��es do cachorro: \n" + "Nome: " + dog1.getNome()+
				"\nRa�a: " + dog1.getRaca());
		
		dog1.Latir();
		dog1.Caminha();
		dog1.Latir();
	}

}
