/*@author Esteve Mestre Company
 * Escriu un m�tode que, donada una cadena de car�cters, substitu�sca totes les ocurr�ncies del 
 * text �es� per �no por�. Escriu un segon m�tode que substitu�sca tots els grups de d�gits per un �nic car�cter *,
 *  �s a dir, si la cadena de car�cters �s �esto1234es5678bueno900�, el primer m�tode ha de retornar
 *   �no porto1234no por5678bueno900� i el segon ha de retornar �esto*es*bueno*�. Escriu el programa 
 *   que permeta comprovar que funciona correctament.




Nota:
�	L'expressi� regular \\d+ significa un d�git o m�s.
�	Podem usar replaceAll(�\\d�, �*�);

Podeu trobar m�s informaci� sobre expressions regulars en Java a:
http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#sum
http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java


 */
package com.prog.ud8;
import java.util.Scanner;
public class Actividad4 {

	
	public static void main(String[] args) {
		
		
		String frase = "esto1234es5678bueno900" ;
		
	
		primerMetodo(frase);
		segonMetodo (frase);
		
	}
/*  Escriu un m�tode que, donada una cadena de car�cters, substitu�sca totes les ocurr�ncies del 
	text �es� per �no por�*/
	public static void primerMetodo (String frase) {
		System.out.println("Primer metodo: "+frase.replaceAll("es", "no por"));
	}
// Escriu un segon m�tode que substitu�sca tots els grups de d�gits per un �nic car�cter *,
	public static void segonMetodo (String frase) {
		System.out.println("Segon metodo: " +frase.replaceAll("\\d+","*"));
	}
}
