/*
 *@author Esteve Mestre Company
 * 
 * .- La mitjana harm�nica de dos n�meros �s el resultat obtingut al calcular els inversos dels 
 * n�meros, calcular la mitjana i calcular l'invers del resultat. L'invers d'un n�mero �s 1/n�mero.
 *  Escriu un m�tode que accepte dos arguments de tipus double i retorne la mitjana harm�nica dels
 *   n�meros.
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
		
		
		System.out.println("Introduce un n�mero");
	
		a =  lector.nextDouble();
		
		
		System.out.println("Introduce el segundo n�mero");
		
		b = lector.nextDouble();
		
			harmonica(a , b);
		}
	
		public static void harmonica (double a, double b) {
			
			
			double resultado;
			
			resultado = 2 / (1/a+1/b);
			
			System.out.println(" La medida armonica de los 2 numeros introducidos anteriormente es " +resultado);
			
		}
		

}
	
	

