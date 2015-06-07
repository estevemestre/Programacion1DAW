/**
 * @author Esteve Mestre Company
 * 
 * Escriu un programa que calcula la potència d'un número real (a) 
 * elevat a un número enter (b). Has de tindre en compte que tant a
 *  com b poden valer 0 o poden ser números negatius. 
 *  Has d’implementar la funcionitat, no emprar el mètode de Java.
 * 
 * 
 */
package com.prog.ud5;
import java.util.Scanner;
public class Actividad14 {

	public static void main (String [] args) {
		
		Scanner lector= new Scanner (	System.in);
	
		double potencia;
		int exponente;
		double resultado = 1;
	
					
				System.out.println("Inserta una potencia con número  real");
				potencia = Integer.parseInt(lector.nextLine());
			
				System.out.println("Inserta el exponente de la potencia");
				exponente = Integer.parseInt(lector.nextLine());
				
				
				if(exponente >=0){
		
				for (int i = 0; i < exponente; i++ ) {	
				
					resultado = resultado * potencia;
					
					}
					
				System.out.println("El resultado de la potencia es "+resultado);	
				}else{
					for(int i =0; i > exponente; i--){
						resultado = resultado * (1 /potencia);
						
					}
					System.out.println("El resultado es :" + resultado);
				}
				
				lector.close();
				
				
				
				
				
				}
}
				
				
					
		