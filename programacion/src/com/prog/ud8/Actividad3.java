/*@uthor Esteve Mestre Company
 * 
 * Activitat3.- Escriu un m�tode que, donada una cadena de car�cters, retorne la meitat inicial de la cadena.
 *  Escriu un programa que prove el m�tode amb les cadenes �Hola qu� tal� i �Ad�u�.
 */
package com.prog.ud8;

public class Actividad3 {

	
	
	
	
	public static String meitatInicial(String cadenaCaracters){
		
		
		int caracters = cadenaCaracters.length();
		
		caracters = caracters / 2;
		
		for (int i = 0; i < caracters; i++) {
			System.out.print(cadenaCaracters.charAt(i));
		}
		
	
		
		cadenaCaracters=cadenaCaracters.substring(0, cadenaCaracters.length()/2);  //guara la primera meitat de la cadena
		return cadenaCaracters;
	}
	
	public static void main(String[] args) {
		
		String cadena1 = "Hola qu� tal";
		String cadena2 = "Ad�u";
		
		System.out.print("La meitat inicial de la cadena : " +cadena1+ " es : " );
		meitatInicial(cadena1);
		System.out.println();
		System.out.print("La meitat inicial de la cadena : " +cadena2+ " es : " );
		meitatInicial(cadena2);
		
		
		
	}
}


