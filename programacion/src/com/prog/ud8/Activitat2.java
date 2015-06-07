/*@author Esteve Mestre Company
 * Activitat2.- Escriu un mètode que, donat un String, retorne un altre objecte String en el 
 * qual es canvien totes les vocals minúscules de l'original per la lletra 'a'.
 *  Escriu un programa que permeta comprovar el funcionament.
 */
package com.prog.ud8;
import java.util.Scanner;
public class Activitat2 {

	
	public static void main(String[] args) {
		
	
		dadesiFuncionament();
		
		
	}


	
	
	
	
	public static String canvienVocals(String cadenaCaracters){
		
	
		String vocalsCambiades = "";
		
		// Cree un array en totes les vocals per despues comprovar una per una 
		char [] arrayVocals={'a','e','i','o','u'};
	
	
		int contArray = 0;
		
		for (int contString = 0; contString < cadenaCaracters.length(); contString++) {
			while ( contArray < arrayVocals.length) {
				
				if (cadenaCaracters.charAt(contString)== arrayVocals[contArray]) {
					cadenaCaracters=cadenaCaracters.replace(cadenaCaracters.charAt(contString), 'a');
				}
				contArray++;
			}
		
			contArray = 0; // Per a que torne a comprovar-ho tot
			

		}
		
		
		return cadenaCaracters;
		
		}


	public static void dadesiFuncionament () {
		
		String cadenaCaracters;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Inserta una frase ahon cambiaran totes les vocals minúscules de l'original per la lletra 'a' : ");
		cadenaCaracters=teclado.nextLine();
		
		System.out.println(canvienVocals(cadenaCaracters));
		
		
		canvienVocals(cadenaCaracters);
	}


}

