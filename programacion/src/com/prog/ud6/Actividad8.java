/*
 * @author Esteve Mestre Company
 * 
 * Escriu un mètode que reba 4 paràmetres de tipus enter i comprove si la seqüència de números rebuda és capicua.
 * 
 * 
 * 
 */

package com.prog.ud6;
import java.util.Scanner;

public class Actividad8 {

		public static void main(String[] args){
			
			Scanner teclado = new Scanner(System.in);
			
			int numero1;
			int numero2;
			int numero3;
			int numero4;
		
			
			System.out.println("Inserta el primer número");
			numero1 = Integer.parseInt(teclado.nextLine());
			
			
			System.out.println("Inerta el segundo número");
			numero2 = Integer.parseInt(teclado.nextLine());
			
			
			System.out.println("Inserta el tercer número");
			numero3 = Integer.parseInt(teclado.nextLine());
			
			
			System.out.println("Inserta el quarto número");
			numero4 = Integer.parseInt(teclado.nextLine());
			
			
		
			System.out.println (capicua(numero1,numero2,numero3,numero4));
				
		
			}
		
		
		
	
		public static String capicua (int a, int b, int c, int d){
			
			String resultado;
		
			if (a == d && b == c){
				
				resultado = " el número que has introducido es  capicua.";
			
			} else{
				
				resultado = " el número que has introducido no es capicua.";
			}	
			
			return resultado;
		}
}
