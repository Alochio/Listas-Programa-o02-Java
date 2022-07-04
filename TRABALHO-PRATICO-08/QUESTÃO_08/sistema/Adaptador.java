package sistema;

public class Adaptador implements MedidorCelciusIF {
	
	//ADAPTADOR IMPLEMENTADO DO MEDIDORCELCIUSIF
	private double celcius;
	
	@Override
	public double medirTemperatura(double temperatura) {
		celcius = (temperatura - 32)/1.8;
		return celcius;
	}
}