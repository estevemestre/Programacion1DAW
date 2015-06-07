/*@uthor Esteve Mestre Company
 * Escriu un mètode que, donada una cadena de caràcters, compte quantes vegades
 * apareix en un text. Per exemple, per a la cadena “En un lugar de la mancha,
 * de cuyo nombre no quiero acordarme”, si es compta quantes vegades apareix “o ”,
 * o dit d'una altra forma, quantes paraules acaben en o, hauria d'indicar que en són 3.
 * 
 */
package com.prog.ud8;

public class Actividad5 {
	
	public static void main(String[] args) {
		String frase = "“En un lugar de la mancha de cuyo nombre no quiero acordarme”";
		vegadesApareix(frase);
	}

	public static void vegadesApareix (String frase){
		
	char busca1 = 'o';
	char busca2 = ' ';
	int trobat = 0;
	int e = 1;
		for (int i=0; i<frase.length(); i++) {
			if(frase.charAt(i) == busca1){
				if(frase.charAt(i+1)== busca2) {
					trobat = trobat + 1;
				}
			}
		}
		
			System.out.println("Quantes paraules acaben en o en la frase; "+frase);
			System.out.println("Acaben "+trobat+ " paraueles en O");
		
		
	}	
}

