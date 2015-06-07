/**
 * @author Esteve Mestre Company
 * 
 * .- Escriu un programa que jugue amb l'usuari a adivinar un n�mero. 
 * L'ordinador ha de generar un n�mero enter 1 i 100 i l'usuari ha d'intentar adivinar-lo. 
 * Per a fer-ho, cada vegada que l'usuari introdu�sca un valor, l'ordinador ha de dir-li si el n�mero que 
 * ha d'adivinar �s major o menor que el que ell ha introdu�t. Quan aconseguisca adivinar-lo, 
 * li ho ha d'indicar i tamb� li dir� el nombre d'intents que ha fet.
 *	Ac� tens un exemple:
 *L'ordinador s'ha pensat un n�mero que has d'intentar adivinar...
 *
 * Inserta un n�mero: 50
 * No arribes.
 * Inserta un n�mero: 70
 * T'has passat.
 * Inserta un n�mero: 60
 * No arribes.
 * Inserta un n�mero: 65
 * T'has passat.
 * Inserta un n�mero: 63
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
			
	

			System.out.println("Intenta adiviniar un n�mero comprendido entre 1 y 50, el programa te ayudar�");
			numero=Integer.parseInt(lector.nextLine());
	
	
				numeroaleatorio = (int)(Math.random()*50+1); // Nos generar� n�meros comprendidos del 1 al 50
															 //y dentro de la variable numeroaleatorio tendremos 
															//	un numero comprendido entre 1 y 50
	
	
			
	
					while (numero != numeroaleatorio){ // Mientras que el n�mero sea diferente que el aleatorio que haga el bucle
		
		
		
						if(numero < numeroaleatorio){ 
							
							System.out.print("Introduce otro n�mero mayor, ");
						
						} else {
			
							System.out.print("Introduce un n�mero menor, ");
							
						}
		
						intentos = intentos + 1; // Cada vez que no adivine el n�mero se hara otra vez el bucle y se sumara un intento
		
		System.out.println(" haver si tienes mas suerte. ");					
		numero=Integer.parseInt(lector.nextLine());	
	}
	System.out.println("N�mero correcto !! el n�mero es " + numero);
	System.out.println("Has adivinado el n�mero con  " + intentos + " intentos");
}

	}
