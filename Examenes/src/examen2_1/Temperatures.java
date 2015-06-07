package examen2_1;
import java.util.Arrays;
public class Temperatures {

	
	public static int [] generaTemperatures() {
		
		int [] temperatures = new int [18];
		
		for (int i = 0; i < temperatures.length; i++) {
			
			temperatures[i] =(int)Math.round(Math.random()*40);
		}
		return temperatures;
	}
	
	
	public static int maxTemperatura (int [] temperatures) {
		
		int max = 0;
		
		for (int i = 0; i < temperatures.length; i++) {
			
			if (temperatures[i] > max){
				
				 max = temperatures[i];
			}
		}
		return max;
	}
	
	public static int vegadesrepetides (int [] temperatures) {
		
		
		
		int repeticions = maxTemperatura(temperatures);
		int cont = 0;
		
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] == repeticions){
				cont = cont + 1;
			}
		}
		return cont;
	}
	
	public static void main(String[] args) {
		
		int [] num = new int [18];
		
		num = generaTemperatures();
		
		System.out.println("Temperatures generades :"+ Arrays.toString(num));
		System.out.println("Temperatura máxima: "+ maxTemperatura(num));
		System.out.println("Vegades que s´ha produit la temperatura màxima: " + vegadesrepetides(num));
	}
}
