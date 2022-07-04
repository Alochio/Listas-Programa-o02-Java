package estrutura;

public class Automovel extends Veiculo{

	private float velocidade;
	private boolean estado;

//----------------------------------------------------------------------------
//M�TODOS GET
	public float getVelocidade(){
		return this.velocidade;
	}
	public boolean getEstado(){
		return this.estado;
	}
//---------------------------------------------------------------------------
//CONSTRUTOR SEM ARGUMENTOS
	public Automovel(){
		
	}
//---------------------------------------------------------------------------
	public float acelerar(float velocidade){
		this.velocidade = velocidade;
		
		if (velocidade > 0){
			this.estado = true;
		}else{
			this.estado = false;
		}
		return velocidade;
	}
	
	public void parar(){
		this.estado = false;
		}
	
	public void trocarOleo(float litros){
		System.out.println("----------------------------------------------");
		System.out.println("�leo trocado - " + litros + " litros adicionado");
		System.out.println("----------------------------------------------");
	}
}