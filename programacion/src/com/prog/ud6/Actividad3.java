/**
 * @author Esteve Mestre Company
 * 
 * Escriu un mètode que accepte dos arguments: el caràcter que es desitja imprimir i el nombre de
 *  vegades que s'ha d'imprimir.
 * 
 */


package com.prog.ud6;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String [] args) {
		
		
		Scanner lector = new Scanner(System.in); 
		
		String nombre;
		int veces = 1;
		
		System.out.println("Escribe una palabra ");
		nombre = lector.nextLine();
		
		System.out.println("Numero de veces que quieres que se repita la palabra");
		veces = Integer.parseInt(lector.nextLine());
		
		metodo(nombre,veces);
	
	}

	 	public static void metodo (String nombre, int veces) {
						
	 			for (int i = 0; i < veces ; i++) {			
	 				System.out.println(nombre);
	 			}
			
	 	}		
}






