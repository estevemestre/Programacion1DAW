package Examen;

import java.util.Arrays;

public class SenarsParells {
	static int [] llenarArray(int [] numeros){
		for (int count = 0; count < numeros.length; count++) {
			numeros[count] = (int)(Math.random()*61);
		}
		return numeros;
	}
	static int [] organizar(int [] numeros){
		int count = 0;
		int [] organizado = new int [numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2 !=0){
				organizado[count++] = numeros[i];
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2==0){
				organizado[count++] = numeros[i];
			}
		}
		return organizado;
	}
	public static void main(String[] args) {
		int [] numeros = llenarArray(new int [10]);
		System.out.println("Array original: " + Arrays.toString(numeros));
		System.out.println("Array senars-parells: " + Arrays.toString(organizar(numeros)));
	}
}
