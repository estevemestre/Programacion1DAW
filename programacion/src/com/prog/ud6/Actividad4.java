/**
 * @author Esteve Mestre Company
 * 
 * 
 * Escriu un m�tode que accepte tres arguments: un car�cter i dos enters.
 *  El car�cter s'ha d'imprimir. El primer enter indica el nombre de vegades que s'imprimir� el car�cter 
 *  en la l�nia i el segon enter indica el nombre de l�nies que s'han d'imprimir.
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
			
		
			System.out.println("Inserta  n�mero de veces para ver la palabra horizontal");
			linea = Integer.parseInt(lector.nextLine());
		
			System.out.println("Inserta  n�mero de veces de filas que quieres ver la palabra");
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




