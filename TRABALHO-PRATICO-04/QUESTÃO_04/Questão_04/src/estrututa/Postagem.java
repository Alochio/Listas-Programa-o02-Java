package estrututa;
import java.util.Date;

public class Postagem {

	//CRIANDO AS  VARIAVEIS
	private Integer id;
	private String titulo;
	private String texto;
	private Date data;

	//CRIANDO OS MÉTODOS GETERS AND SETERS
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}