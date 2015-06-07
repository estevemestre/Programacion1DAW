/*
 * @ Esteve Mestre Company
 * 
 * Escriu un mètode que accepte un número enter i calcule el seu factorial (n!)
 * 
 */


package com.prog.ud6;
import java.util.Scanner;

public class Actividad7 {

		public static void main(String[] args){
			
			Scanner teclado = new Scanner(System.in);
			int numero = 1;
			int i = 1;
		
			System.out.println("Inserta el número que quieras saber su nunero factorial");
			
			numero = Integer.parseInt(teclado.nextLine());
		
			
			int fact=calcularFac(numero,i);
		
			System.out.println("El  factorial es " + fact);
		
				
		}
	
		
		
		
		public static int calcularFac(int numero, int i){
	
		
		
				while (numero > 0){
						i = i * numero;
						numero = numero - 1;
			
						calcularFac(numero,i);	
				}
		
		
					return i;
		}

}
