/**
 * @author Esteve Mestre Company
 * 
 * 
 * Escriu un mètode que accepte tres arguments: un caràcter i dos enters.
 *  El caràcter s'ha d'imprimir. El primer enter indica el nombre de vegades que s'imprimirà el caràcter 
 *  en la línia i el segon enter indica el nombre de línies que s'han d'imprimir.
 * 
 * 
 * 
 */


package com.prog.ud6;
import java.util.Scanner;
public class Actividad4 {
	public static void main(String [] args) {
		
			Scanner lector = new Scanner(System.in);
	
	
			char caract;
			int linea;
			int fila;
		
			System.out.println("Inserta un caracter");
			caract = lector.nextLine().charAt(0);
			
		
			System.out.println("Inserta  número de veces para ver la palabra horizontal");
			linea = Integer.parseInt(lector.nextLine());
		
			System.out.println("Inserta  número de veces de filas que quieres ver la palabra");
			fila = Integer.parseInt(lector.nextLine());
	
	
			metodo3(caract, linea, fila);
			
			
	}
	
	public static void metodo3 (char caract, int linea, int fila) {
		
		int j = 0;
		
		
		for (int i=0; i < linea; i++) {
			for (j=0; j < fila; j++) {
				System.out.print(caract);
			}
			System.out.println();
		}
		
		
			}
	}




