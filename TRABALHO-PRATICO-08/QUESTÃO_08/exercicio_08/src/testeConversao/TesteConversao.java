package testeConversao;

import libExterna.MedidorFahrenheit;
import sistema.*;

public class TesteConversao {
	public static void main(String[] args){
				
		MedidorFahrenheit medidor = new MedidorFahrenheit();
		double temperatura = medidor.getTemperaturaFahrenheit();
		System.out.println("Tesperatura em Fahrenheit: " + temperatura);
	
		Adaptador adaptador = new Adaptador();
	
		System.out.println("Temperatura em celcius: " + adaptador.medirTemperatura(temperatura));
	}
}
