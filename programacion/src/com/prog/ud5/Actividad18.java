/**
 * @author Esteve Mestre Company
 * 
 * .- Escriu un programa que jugue amb l'usuari a adivinar un número. 
 * L'ordinador ha de generar un número enter 1 i 100 i l'usuari ha d'intentar adivinar-lo. 
 * Per a fer-ho, cada vegada que l'usuari introduïsca un valor, l'ordinador ha de dir-li si el número que 
 * ha d'adivinar és major o menor que el que ell ha introduït. Quan aconseguisca adivinar-lo, 
 * li ho ha d'indicar i també li dirà el nombre d'intents que ha fet.
 *	Ací tens un exemple:
 *L'ordinador s'ha pensat un número que has d'intentar adivinar...
 *
 * Inserta un número: 50
 * No arribes.
 * Inserta un número: 70
 * T'has passat.
 * Inserta un número: 60
 * No arribes.
 * Inserta un número: 65
 * T'has passat.
 * Inserta un número: 63
 * Has encertat!!
 * Has necessitat 5 intents.
 * 
 */


package com.prog.ud5;
import java.util.Scanner;
	public class Actividad18 {
		public static void main (String [] args) {
	
			
			Scanner lector=new Scanner(System.in);
				
				int numero;
				int numeroaleatorio;
				int intentos = 1;
			
	

			System.out.println("Intenta adiviniar un número comprendido entre 1 y 50, el programa te ayudará");
			numero=Integer.parseInt(lector.nextLine());
	
	
				numeroaleatorio = (int)(Math.random()*50+1); // Nos generará números comprendidos del 1 al 50
															 //y dentro de la variable numeroaleatorio tendremos 
															//	un numero comprendido entre 1 y 50
	
	
			
	
					while (numero != numeroaleatorio){ // Mientras que el número sea diferente que el aleatorio que haga el bucle
		
		
		
						if(numero < numeroaleatorio){ 
							
							System.out.print("Introduce otro número mayor, ");
						
						} else {
			
							System.out.print("Introduce un número menor, ");
							
						}
		
						intentos = intentos + 1; // Cada vez que no adivine el número se hara otra vez el bucle y se sumara un intento
		
		System.out.println(" haver si tienes mas suerte. ");					
		numero=Integer.parseInt(lector.nextLine());	
	}
	System.out.println("Número correcto !! el número es " + numero);
	System.out.println("Has adivinado el número con  " + intentos + " intentos");
}

	}
