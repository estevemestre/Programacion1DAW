/*Un métode amb el nom longCad, que reba un array s 'String i retorne un array d'enters amb les
longituts de les cadenes obtingudes en l'array.
Des delmain():
crear un array amb una única instruccio ( posa les paraules que vullges)
Cridar el mètode anterior i visualitzar el resultat ( en una única instruccio)
*/
package examen2_1repas;
import java.util.Arrays;

public class Actividad2 {

	
	public static void main(String[] args) {
		
		
		String [] cadena = {"Hola", "Esteve", "Mestre"};
		
		
		System.out.println(Arrays.toString(cadena));
		System.out.println(Arrays.toString(longCad(cadena)));
	}
	
	
	
	
	public static int [] longCad (String [] s){

	int [] enters = new int [s.length];
	
	
	 	for (int i = 0; i < enters.length; i++) {

	 			 enters[i] = s[i].length();
	 	}
	
	return enters;
	 	
	}
}