/**
 * 
 * @author Esteve Mestre Company
 * 
 *  Visualitzar els números d'1 a 100 i indicar al final:
 * 
 * Quants números parells n'hi ha i la seua suma.
 * Quants números imparells n'hi ha i la seua suma.
 * Quants n'hi ha que siguen múltiples de quatre i de set i la seua suma.
 * 
 */
package com.prog.ud5;

public class Actividad12 {

	public static void main (String[] args) {
		
	
		int parescontador = 0;
		int sumapares = 0;
		int imparescontador = 0;
		int sumaimpares = 0;
		int multcontadorcuatro = 0;
		int sumamultcuatro = 0;
		int multcontadorsiete = 0;
		int sumamultsiete = 0;
		
		
		for (int i = 1; i <= 100; i++ ) {
		
			System.out.println (i);
		
		
			
			if (i % 2 != 0) {
				
			imparescontador = imparescontador + 1;
			
			sumaimpares = i + sumaimpares;
			
			
			}
			
			
			
			if (i % 2 == 0) {
			
			parescontador = parescontador + 1;
			sumapares = i + sumapares;
			
			}
			
			if (i % 4 == 0) {
				
				multcontadorcuatro = multcontadorcuatro + 1;
				sumamultcuatro =  sumamultcuatro + i;
			}
			
			if (i % 7 == 0) {
				
				multcontadorsiete++;
				sumamultsiete =  sumamultsiete + i;
				
			}
			
			
			
		}
		
		System.out.println("Total de numeros pares "+ parescontador);
		System.out.println("Suma total de numeros pares "+ sumapares);
		System.out.println("Total de numeros impares "+ imparescontador);
		System.out.println("Suma total de impares  " + sumaimpares);
		System.out.println("Total de multiplos 4   " + multcontadorcuatro);
		System.out.println("Suma total de multiplos 4   " + sumamultcuatro);
		System.out.println("Total de multiplos 7   " + multcontadorsiete);
		System.out.println("Suma total  de multiplos 7   " + sumamultsiete);
		
		
		
		
		}

	}

