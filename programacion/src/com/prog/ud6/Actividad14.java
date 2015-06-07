/*
 * 
 * @author Esteve Mestre Company
 * 
 * Escriu un programa que calcule els valors de la següent funció matemàtica:
 *	funcioX(0)=0
 *	funcioX(1)=1
 * 	funcioX(2)=2 
 *	si n>2    funcioX(n)=fucioX(n-3)+2*funcioX(n-2)+funcioX(n-1)
 *
 * 
 */
package com.prog.ud6;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String [] args) {
		
		Scanner lector = new Scanner(System.in);
		int numero;
		
		
		System.out.println("Inserta un número");
		numero = Integer.parseInt(lector.nextLine());
		
		
		System.out.println("El resultado es" + funcion(numero));
	}	
		
	public static int funcion (int numero) {
		
		int resultado;
		
			if (numero > 2) {
				
				resultado = funcion(numero - 3) + 2 * funcion(numero - 2) + funcion(numero - 1 );
				
			}else{
				
				resultado = numero;
			}
				return resultado;
	}
}