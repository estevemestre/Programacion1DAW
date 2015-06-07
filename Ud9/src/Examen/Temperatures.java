package Examen;

import java.util.Arrays;

public class Temperatures {
	static int [] llenarArray(int [] numeros){
		for (int count = 0; count < numeros.length; count++) {
			numeros[count] = (int)(Math.random()*41);
		}
		return numeros;
	}
	static int maxima(int[] numeros){
		int max = 0;
		for (int count = 0; count < numeros.length; count++) {
			if(numeros[count] > max) max = numeros[count];
		}
		return max;
	}
	static int vecesMax(int[] numeros){
		int max = maxima(numeros);
		int count = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]==max) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int [] temp = llenarArray(new int [15]);
		System.out.println("Temperaturas generadas: " + Arrays.toString(temp));
		System.out.println("Temperatura máxima: " + maxima(temp));
		System.out.println("Veces que se ha producido la temperatura maxima: " + vecesMax(temp));
	}
}
