/*@uthor Esteve Mestre Company
 * Escriu un programa per introduir els valors d'un array de 10 elements num�rics i posteriorment visualitzar-los.
 */
package com.prog.ud8;
import java.util.Scanner;
public class Avtividad6 {
	
public static void main(String[] args) {
	
	Scanner teclado = new Scanner (System.in);

	int [] mi_matriz= new int [10];
	
	System.out.println("Introduce 10 n�meros que se almacenaran en un array: ");
	
	int cont = 1;
	
	for (int i = 0; i <= 9; i++) {
		System.out.println("N�mero "+cont+": ");
		mi_matriz[i]=Integer.parseInt(teclado.nextLine());
		cont++;
	}
	
		System.out.println("Los 10 n�meros almacenados s�n :");
		
		
	for (int i = 0; i <=9; i++) {
		System.out.print(mi_matriz[i]+", ");
		}	
	
	}
}