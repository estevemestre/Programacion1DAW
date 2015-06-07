/*
 *@author Esteve Mestre Company
 * 
 * .- La mitjana harmònica de dos números és el resultat obtingut al calcular els inversos dels 
 * números, calcular la mitjana i calcular l'invers del resultat. L'invers d'un número és 1/número.
 *  Escriu un mètode que accepte dos arguments de tipus double i retorne la mitjana harmònica dels
 *   números.
 * 
 * 
 * 
 */

package com.prog.ud6;
import java.util.Scanner;
public class Actividad6 {
	public static void main(String [] args) {
		
		Scanner lector =  new Scanner (System.in);
		
		double a;
		double b;
		
		
		System.out.println("Introduce un número");
	
		a =  lector.nextDouble();
		
		
		System.out.println("Introduce el segundo número");
		
		b = lector.nextDouble();
		
			harmonica(a , b);
		}
	
		public static void harmonica (double a, double b) {
			
			
			double resultado;
			
			resultado = 2 / (1/a+1/b);
			
			System.out.println(" La medida armonica de los 2 numeros introducidos anteriormente es " +resultado);
			
		}
		

}
	
	

