/*@author Esteve Mestre Company
 * Escriu un mètode que, donada una cadena de caràcters, substituïsca totes les ocurrències del 
 * text “es” per “no por”. Escriu un segon mètode que substituïsca tots els grups de dígits per un únic caràcter *,
 *  és a dir, si la cadena de caràcters és “esto1234es5678bueno900”, el primer mètode ha de retornar
 *   “no porto1234no por5678bueno900” i el segon ha de retornar “esto*es*bueno*”. Escriu el programa 
 *   que permeta comprovar que funciona correctament.




Nota:
•	L'expressió regular \\d+ significa un dígit o més.
•	Podem usar replaceAll(“\\d”, “*”);

Podeu trobar més informació sobre expressions regulars en Java a:
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
/*  Escriu un mètode que, donada una cadena de caràcters, substituïsca totes les ocurrències del 
	text “es” per “no por”*/
	public static void primerMetodo (String frase) {
		System.out.println("Primer metodo: "+frase.replaceAll("es", "no por"));
	}
// Escriu un segon mètode que substituïsca tots els grups de dígits per un únic caràcter *,
	public static void segonMetodo (String frase) {
		System.out.println("Segon metodo: " +frase.replaceAll("\\d+","*"));
	}
}
