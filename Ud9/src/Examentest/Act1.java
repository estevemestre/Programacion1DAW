package Examentest;

import java.util.Arrays;



public class Act1 {

	static int [] senars (int[] array) {

		int [] copiaOrdenada =  new int [array.length];
		
		int cont=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 !=0){
				copiaOrdenada[cont]=array[i];
				cont++;
			}
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] %2 == 0) {
			copiaOrdenada[cont]=array[j];
			cont++;
			}
		}
		return copiaOrdenada;
	}
	
	
	
	public static void main(String[] args) {
		int [] array = new int [10];
		int [] prova = new int [10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*61);
		}
		
	
		
		
		
		System.out.println("Array desordenat és "+ Arrays.toString(array));
		System.out.println("Array ordenat és: " + Arrays.toString(senars(array)));
	}
}
