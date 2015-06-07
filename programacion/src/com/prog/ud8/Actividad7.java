/*@author Esteve Mestre Company
 *Escriu un programa que permeta introduir un array de deu elements alfanumèrics i 
 *després visualitzar els que ocupen la posició par. Repetir per als de les posicions senars.
 */
package com.prog.ud8;
import java.util.Scanner;
public class Actividad7 {
	public static void main(String[] args) {
		
	
	Scanner teclado = new Scanner (System.in);
	int cont = 1;
	String [] mi3_Array= new String [10];
	
	System.out.println("Inserta 10 palabras");
	
	for (int i =0; i <=9; i++) {
		System.out.println("Palabra "+cont+": ");
		mi3_Array[i]=teclado.nextLine();
		cont++;
	}
	
	System.out.print("Las cadenas de caracteres segun su posicion par en el array són : ");
	
	for (int i =0; i <=9; i= i+2) {
			System.out.print(mi3_Array[i]+", ");
		
	}
	
	}
}


