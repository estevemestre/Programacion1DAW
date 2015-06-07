/*
 * @author Esteve Mestre Company
 * 
 *Volem calcular el lucky number (n�mero de la sort) d'una persona a
 *partir  de la seua data de naixement. El n�mero de la sort es 
 *calcula reduint la data de naixement a un n�mero d'un �nic d�git.
 *Exemple: la data de naixement d'una persona �s la seg�ent: 16-08-1973.
 *Si sumem 1+6+0+8+1+9+7+3, el resultat �s 35. A continuaci� hem de sumar 3+5. El seu n�mero de la sort �s 8.
 *La data de naixement ser� tractada com un String, amb el format 
 *dd-mm-aaaa, i ser� introdu�da per l'usuari. El n�mero de la sort 
 *ser� retornat com un int.
 *Si necessites convertir un car�cter a int, la classe Character disposa d'un m�tode anomenat getNumericValue() que realitza 
 *la conversi�. Com sempre, ja saps que pots trobar informaci� sobre este m�tode en la documentaci� sobre l'API de Java, 
 *disponible a http://docs.oracle.com/javase/7/docs/api/.
 *Recorda que has de programar utilitzant m�todes, de forma que des del main() es facen �nicament les invocacions als m�todes 
 *i les instruccions estrictament necess�ries.
 * 
 * 
 */

package com.prog.ud6;
import java.util.Scanner;
public class Actividad12 {
	
		public static void main(String[] args){
		
			
			int numsuerte;
			
			
			numsuerte = calcNum();

		
		
			System.out.println("Tu numero de la suerte es "+ numsuerte);
		}
		
	
		
		public static int calcNum(){
			
			Scanner teclado = new Scanner(System.in);
			
			int suma;
			int decenas;
			int unidades;
			String feNacimiento="";
		
		
			
			while(feNacimiento.length() != 10){    // Repetira siempre que el usuario no inerte los 10 caracteres 
				
					System.out.println("Inserta tu fecha de nacimiento como en el siguiente formato (dd-mm-aaaa)");
					feNacimiento=teclado.nextLine();
			}
		
		// En el siguiente codigo sumo todos los numeros de la fecha de nacimiento para ello utilizo el metodo getNumericValue y paso el serultado a int
		suma=Character.getNumericValue(feNacimiento.charAt(0))+Character.getNumericValue(feNacimiento.charAt(1))+Character.getNumericValue(feNacimiento.charAt(3))+Character.getNumericValue(feNacimiento.charAt(4))+Character.getNumericValue(feNacimiento.charAt(6))+Character.getNumericValue(feNacimiento.charAt(7))+Character.getNumericValue(feNacimiento.charAt(8))+Character.getNumericValue(feNacimiento.charAt(9));
	
		
					decenas = suma / 10;
					
					unidades= suma % 10;
					
					
					suma = decenas + unidades;
				
		
		return suma;
	}
}
