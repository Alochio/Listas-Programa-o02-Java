package principal;

public interface Ferramenta {

	public Animal[] filtrarEspecie(Animal[] completo, String especieFiltrar);

	public String[] classificarEspecies(Animal[] completo);
}