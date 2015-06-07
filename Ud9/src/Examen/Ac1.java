package Examen;

import java.util.Arrays;

public class Ac1 {
	static int[] metodo1 (int [] array){
		int [] copiaOrdenada = new int [array.length];
		int posicionNueva = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] %2 != 0){
				copiaOrdenada[posicionNueva] = array[i];
				posicionNueva++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] %2 == 0){
				copiaOrdenada[posicionNueva] = array[i];
				posicionNueva++;
			}
		}
		return copiaOrdenada;
	}
	
	public static void main(String[] args) {
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*61);
		}
		
		System.out.println("Array original: " + Arrays.toString(numeros));
		System.out.println("Array ordenado: " + Arrays.toString(metodo1(numeros)));
	}
}
