/*
 * @author Esteve Mestre Company
 */
package com.prog.ud8;
import java.util.Scanner;
public class Activitat1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nom;
		String primerCognom;
		String segonCognom;
		String nomComplet;
		int repeticions = 1;
		
		
		System.out.println("Inserta el teu nom: ");
		nom = teclado.nextLine();
		
		System.out.println("Inserta el teu primer cognom: ");
		primerCognom = teclado.nextLine();
		
		System.out.println("Inserta el teu segon cognom: ");
		segonCognom = teclado.nextLine();
		
		// nomComplet = Guardara 3 variables en una.
		nomComplet = nom.concat( " " + primerCognom.concat(" " +segonCognom));
		System.out.println(nomComplet +" t� " +nomComplet.length() + " caracteres");
		
		
		
		
		System.out.println("El teu nom en min�cules "+nomComplet.toLowerCase());
		System.out.println("El teu nom en may�cules "+nomComplet.toUpperCase());
	
		
	

			if (nom.length() >= 2) {
				System.out.println("Els 2 primers caracters son : "+nom.substring(0, 2));
				System.out.println("Els 2 ultims caracters son : "+nom.substring(nom.length()-2));  //mostra els 2 �ltims car�cters
			
			}
	
			
			int totalCaract = nomComplet.length()-1;  
			char ultimCaract = nomComplet.charAt(nomComplet.length()-1);

			
			for (int contCaract = 0; contCaract < totalCaract; contCaract++) {
				if(nomComplet.charAt(contCaract) == ultimCaract) {
					repeticions = repeticions + 1;
				}
				
			}
			
			System.out.println("N�mero de repeticions de la lletra : " + ultimCaract +"  "+ repeticions + " vegades");
	
	
			

			for (int contCaract = 0; contCaract < totalCaract; contCaract++) {
				
				if(nomComplet.charAt(contCaract)==nomComplet.toLowerCase().charAt(0)){
					System.out.print(nomComplet.toUpperCase().charAt(contCaract));
		
				}
			}


			System.out.println("***"+nomComplet+"***");

	
	
			String cadenaInvertida = "";

			for (int i = nomComplet.length()-1; i >=0 ; i--) {
			cadenaInvertida += nomComplet.charAt(i);
			}
			System.out.println(cadenaInvertida); 
			
			
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
