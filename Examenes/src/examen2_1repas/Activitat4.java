package examen2_1repas;

import java.util.Arrays;

//-Escriu un mètode concatenarParaules que reba un array d'String i retorne la cadena resultant de
// concatenar totes les cadenes contingudes en l'array.
//- Escriu un mètode concatenarInicials que reba un array d'String i retorne la cadena resultant de
// concatenar el primer caracyer de  cada cadena de l'array
//En el main():
//-Crea un array d'String amb un única instrucció i visualitza els resultats obtinguts pels mètodes.


public class Activitat4 {

	public static String [] concatenarParaules(String []paraules){
		String resultat="";
		for (int i=0; i < paraules.length;i++){
			resultat=resultat.concat(paraules[i]);
		}
		
		return paraules;
	}
	
	//public static String [] concatenarInicials(String [] paraules2){
		
	//}
	
	public static void main(String[] args){
		
	//	System.out.println(Arrays.toString(paraules);
	}
	
}
