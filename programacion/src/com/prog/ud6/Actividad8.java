/*
 * @author Esteve Mestre Company
 * 
 * Escriu un m�tode que reba 4 par�metres de tipus enter i comprove si la seq��ncia de n�meros rebuda �s capicua.
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
		
			
			System.out.println("Inserta el primer n�mero");
			numero1 = Integer.parseInt(teclado.nextLine());
			
			
			System.out.println("Inerta el segundo n�mero");
			numero2 = Integer.parseInt(teclado.nextLine());
			
			
			System.out.println("Inserta el tercer n�mero");
			numero3 = Integer.parseInt(teclado.nextLine());
			
			
			System.out.println("Inserta el quarto n�mero");
			numero4 = Integer.parseInt(teclado.nextLine());
			
			
		
			System.out.println (capicua(numero1,numero2,numero3,numero4));
				
		
			}
		
		
		
	
		public static String capicua (int a, int b, int c, int d){
			
			String resultado;
		
			if (a == d && b == c){
				
				resultado = " el n�mero que has introducido es  capicua.";
			
			} else{
				
				resultado = " el n�mero que has introducido no es capicua.";
			}	
			
			return resultado;
		}
}
