/*
 * @author Esteve Mestre Company
 * 
 * Escriu un programa que, donat el nom d'una persona i el seu idioma de preferència, escriga en pantalla
 *  un missatge de salutació a eixa persona amb l'idioma elegit, del tipus “Bon dia Pepe Sánchez”. 
 *  Els idiomes disponibles seran:
 *	(a) Valencià
 *	(b) Castellà
 *	(c) Anglès
 *	El missatge es mostrarà des d'un mètode al qual se li passen el nom i el codi de l'idioma. Per exemple,
 *  en el cas anterior la crida seria salutacions(“Pepe Sánchez”,'b').
 *
 * 
 */

package com.prog.ud6;
import java.util.Scanner;

public class Actividad9 {

	
		public static void main(String[] args){
				
				Scanner teclado = new Scanner(System.in);
			
				String nombre;
				char idioma;
		
				
				System.out.println("Inserta  tu nombre y tu primer apellido");
				
				nombre = teclado.nextLine();
				
				
				System.out.println("Los idiomas son los siguientes : ");
				System.out.println(" (a) Valencino \n (b) Castellano \n (c) Inglés");
				
				
				idioma = teclado.nextLine().charAt(0);
		
				
				difenteIdioma(nombre,idioma);
				
				System.out.println("a, b o c");
		

		}
		
		
	
	public static void difenteIdioma(String nombre, char idioma){
		
			if (idioma == 'a'){ // no faria falta gastar el equals perque en caracters si que funciona
			
				System.out.println("Bon dia "+nombre);
			
			} else if (idioma == 'b'){
			
				System.out.println("Buenos dias "+nombre);
			
			} else if ( idioma == 'c'){
				
			System.out.println("Good morning "+nombre);
			
			} 
			
				
			
	}
}

	
	
	
	