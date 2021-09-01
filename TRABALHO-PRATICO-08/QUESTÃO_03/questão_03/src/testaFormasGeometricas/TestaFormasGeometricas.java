//CLASSE PARA REALIZAR O TESTE DO QUE FOI IMPLEMENTADO
package testaFormasGeometricas;
import formasGeometricas.*;

public class TestaFormasGeometricas {
	public static void main (String[] args){
		
		FormasGeometricas forma01 = CriaFormas.FactoryForma("Quadrado");
		System.out.println(forma01);
		
		FormasGeometricas forma02 = CriaFormas.FactoryForma("Triangulo");
		System.out.println(forma02);
		
		FormasGeometricas forma03 = CriaFormas.FactoryForma("Retangulo");
		System.out.println(forma03);
		
		
		FormasGeometricas forma04 = CriaFormas.FactoryForma("Elipse");
		System.out.println(forma04);
	}
}