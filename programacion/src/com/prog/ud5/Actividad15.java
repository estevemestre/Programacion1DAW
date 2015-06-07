/**
 * 
 * @author Esteve Mestre Company
 * 
 *  
 * Escriu un programa que sol·licite un número enter i indique 
 * si es tracta d'un número prim o no.
 * 
 */

package com.prog.ud5;
import java.util.Scanner;
public class Actividad15 {
	
public static void main (String [] args) {
	
	
	
	
	
	Scanner lector= new Scanner (System.in);
	
	int numero;
	int j = 0;
	
	
	
	System.out.println("Inserte un numero para saber si es primo");
	numero = Integer.parseInt(lector.nextLine());
	
				for(int i = 1; i<(numero+1);i++){
	
						if(numero % i == 0){ 
								j = j + 1;
						}
				}
	
	
		if (j!= 2) {
			
			System.out.println("El número que has itroducido no es primo");
			
		}else{
			System.out.println("El número que has introducido es primo");
		}	
	
	}
}
