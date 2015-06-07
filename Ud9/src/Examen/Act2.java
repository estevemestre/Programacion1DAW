package Examen;

import java.util.Arrays;

public class Act2 {
	static int [] llenar (int [] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*41);
		}
		return array;
	}
	static int max(int [] array){
		int mayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > mayor){
				mayor = array[i];
			}
		}
		return mayor;
	}
	static int repeticion(int [] array){
		int contador = 0;
		int mayor = max(array);
		for (int i = 0; i < array.length; i++) {
			if(mayor == array[i]){
				contador++;
			}
		}
		return contador;
	}
	
	public static void main(String[] args) {
		int [] numeros = new int [20];
		llenar(numeros);
		
		System.out.println("Temperatures generades: " + Arrays.toString(numeros));
		System.out.println("Temperatures maxima: " + max(numeros));
		System.out.println("Vegades que es repetix: " + repeticion(numeros));
	}
}