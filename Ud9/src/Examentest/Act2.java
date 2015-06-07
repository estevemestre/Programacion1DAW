package Examentest;

import java.util.Arrays;

public class Act2 {
	
	static int [] crearTemperatures () {
		
		int [] temperatures = new int [18];
		
		for (int i = 0; i < temperatures.length; i++) {
			temperatures[i] =(int)(Math.random()*41);
		}
		
		return temperatures;
	}
	
	static int maxima (int [] temperatures) {
		
	int aux = temperatures[0];
		
		for (int i = 1; i < temperatures.length; i++) {
			if (temperatures[i] > aux) {
				aux = temperatures[i];
			}
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
	

		
		System.out.println(Arrays.toString(crearTemperatures()));
		
		System.out.println("maxima "+ maxima(crearTemperatures()));
		
	
	}
}
