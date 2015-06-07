/**
 *@author Esteve Mestre Company
 * 
 * Escriu un programa que ens permeta determinar si utilitzar els n�meros aleatoris de la classe Math s�n apropiats. 
 * El programa ha de simular que es llan�a una moneda un n�mero elevat de vegades, per exemple, 1.000.000. 
 * A continuaci� ha d'imprimir per pantalla el n�mero de cares i el n�mero de creus que han eixit.
 */



package com.prog.ud5;

public class Actividad17 {

	public static void main (String[] args)  {
		
		int caraycruz;
		int cara = 1;
		int cruz = 1;
		int porcentajecara = 10000;
		int porcentajecruz = 10000;
		int i =1;
		int vueltas = 1000000;
		
		
		do {
			
			caraycruz= (int)(Math.random()*2+1); // Nos mostrara 2 n�meros decimales pero le sumamos 1g para que sean enteros
					if(caraycruz == 1){  // 1 = cara							
							cara++;		// Contador para saber cuantas caras
				
					} else{				// Contrario sera cruz
							cruz++;		// Contador de cruz
			}
			
					i++;
		} while (i<vueltas); // Bucle para que repita todas las veces que quieras que tire la moneda 
		
		porcentajecara = cara / porcentajecara;	
		porcentajecruz = cruz / porcentajecruz;
		
		System.out.println("N�mero de veces que saldra cara= "+ cara + " el porcentaje de veces cara es : " + porcentajecara + "%");
		
		System.out.println("N�mero de veces que saldra cruz= "+ cruz + " el porcentaje de veces cruz es : " + porcentajecruz + "%");
			
	}
}
