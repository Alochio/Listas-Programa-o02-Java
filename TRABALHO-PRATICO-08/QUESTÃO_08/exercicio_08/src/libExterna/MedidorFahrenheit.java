//CLASSE QUE GERA UM VALOR DOUBLE PARA A TEMPERATURA EM FAHRENHEIT DADA PELO EXERCICIO
package libExterna;

import java.util.Random;

public class MedidorFahrenheit {

	public double getTemperaturaFahrenheit(){
		return new Random().nextDouble();
	}
}