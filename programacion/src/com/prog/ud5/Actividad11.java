/**
 * @author: Esteve Mestre Company
 * 
 * Introduir per teclat dos números, A i B (A major que B). Visualitzar els números 
 * des d'A fins a B i
 * indicar quants n'hi ha que siguen parells.
 */


package com.prog.ud5;
import java.util.Scanner;

public class Actividad11 {
	public static void main(String[] args) {
		
		Scanner lector=new Scanner (System.in);
		int a = 1;
		int b = 2;
		int pares;
		int contador = 0;
		
		 while(b > a) {		

			System.out.println("Inserta un numero que sea mayor del que introduciras luego");
			a = Integer.parseInt(lector.nextLine());
			System.out.println("Inserta un numero que sea menor que el que terminas de introducir");
			b = Integer.parseInt(lector.nextLine());		
		}
		
		System.out.println("Los numeros que has introducido son correctos ");
		System.out.println("Los numeros comprendidos entre el primer numero i el segundo son:");
		
		do {
			
		
		System.out.println(a);
		
		a = a - 1;
		
		pares = a % 2;
		
		if (pares == 0) {
				contador = contador + 1;
				
			}		
		
		}while(a >= b);
	
		
		System.out.println("La cantidad de pares finales son :" + contador);
		
	}
}