/*@uthor Esteve Mestre Company
 *Escriu un programa que permeta introduir un array de 20 elements numèrics i visualitzar-los de 4 en 4.
 */
package com.prog.ud8;
import java.util.Scanner;
public class Actividad8 {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int cont = 1;
	int [] mi2_Array= new int [20];
	
	
	for (int i =0; i <=19; i++) {
		System.out.println("Número "+cont+": ");
		mi2_Array[i]=teclado.nextInt();	
		cont++;
	}
	
	System.out.print("Los números de 4 en 4 segun su posicion en el array són :: ");
	
	for (int i =3; i <=19; i= i+4) {
			System.out.print(mi2_Array[i]+", ");
		
	}
	
	}
}
