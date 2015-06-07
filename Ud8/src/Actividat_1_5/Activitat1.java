/*Activitat1.- Escriu un programa que sol·licite tres cadenes de caràcters, una que s'anomene nom, 
 * l'altra primerCognom i l'altra segonCognom.  El programa ha de crear una cadena amb el nom complet
 *  i després mostrar per pantalla:
el nom complet amb tots els caràcters en minúscula, després en majúscula,  i després la seua longitud
els dos primers caràcters de la cadena (sols en el cas de que la longitud siga de dos o més caràcters)
els dos últims caràcters de la cadena (sols en el cas de que la longitud siga de dos o més caràcters)
el nombre d'ocurrències en la cadena de l'últim caràcter
la cadena amb totes les ocurrències del primer caràcter en majúscula
la cadena amb tres * per davant i per darrere
la cadena invertida
 * 
 */

package Actividat_1_5;

import java.util.Scanner;

public class Activitat1 {

	public static void main(String[] args) {
		
		
		cadenaCaracter();
		
	}
	
	public static void cadenaCaracter (){
  
		Scanner teclado = new Scanner (System.in);
		String nom;
		String apellido1;
		String apellido2;
		
		String nomComplet;
		
	   System.out.println("Introduix un nom");
	   nom = teclado.nextLine();
	   System.out.println("Introduix un apellido");
	   apellido1= teclado.nextLine();
	   System.out.println("Introduix un segon apellido");
	   apellido2= teclado.nextLine();
	
	
	   nomComplet = nom + apellido1 + apellido2;
	   
	   System.out.println(nomComplet);
	   System.out.println("Nom en minusculas"+nomComplet.toLowerCase());
	   System.out.println("Nom en mayusucla"+nomComplet.toUpperCase());
	}

}
