/*@uthor Esteve Mestre Company
 * Escriu un programa que permeta llegir una seq��ncia de 50 n�meros i guardar-los en un array. 
 * Calcula i imprimix la suma d'aquells elements amb contingut parell.
 */
package com.prog.ud8;

public class Actividad10 {

	
	public static void main(String[] args) {
		
		int [] sequencia = new int [50];
		
		int cont = 1;
		int i =0;
		int par = 0;
	
		
		System.out.println("La sequencia dels 50 n�meros s�n :");
		
		
		while (i < sequencia.length) {
			sequencia[i] = cont;			
			
			if (sequencia[i] %2==0){
				
					par = par + cont;
					
			}
			
			System.out.print(cont+ "' ");
			System.out.println();
			cont++;
			i++;
		}
		
		
		
		System.out.println("Suma total pares "+par);
		
	}
}
