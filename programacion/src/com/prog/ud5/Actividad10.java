package com.prog.ud5;

public class Actividad10 {

	public static void main(String[] args){
	
			int contadorimpar = 0;
			int contadorpar = 0;
			int contadormultiplo = 0;
		
	
		for (int impar = 1; impar <=99; impar = 2 + impar) {
			
			contadorimpar = contadorimpar + 1;
		
			System.out.println("Numeros impares  "+ impar);
		
		}
		
		for (int par = 0; par <= 99; par = 2 + par ) {
			
			contadorpar = contadorpar + 1;
			System.out.println("Numeros pares " +par);
		}
		
		
		for (int multiplo = 0; multiplo <= 99; multiplo = multiplo + 5){
			
			contadormultiplo = contadormultiplo + 1;
			System.out.println(" mulltiplos 5  "+multiplo);
		}
		
		
		
		System.out.println("Total de numeros pares es  " +contadorpar);
		
		System.out.println("Total de numeros impares es  "+contadorimpar);
		
		System.out.println("Total de numeros impares es  " +contadormultiplo);
	}
}
