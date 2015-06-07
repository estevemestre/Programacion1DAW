package examen2_1repas;
import java.util.Arrays;

//import java.lang.*;

public class Activitat2 {
/*Un métode amb el nom longCad, que reba un array s'String i retorne un array d'enters amb les
longituts de les cadenes obtingudes en l'array.
Des delmain():
crear un array amb una única instruccio ( posa les paraules que vullges)
Cridar el mètode anterior i visualitzar el resultat ( en una única instruccio)
*/

		public static int[] logCad(String[] paraules){
			int[] longituds=new int[paraules.length];
			
			
			for (int i=0; i <longituds.length; i++ ){
				longituds[i]=paraules[i].length();
			}
			
			return longituds;
		}
		
		
		public static void main (String[]args){
			String [] array={"lunes", "martes", "miercoles","jueves", "viernes", "sabado", "domingo"};
			
			System.out.println("Longituds " + Arrays.toString(logCad(array)));//Una unica instruccio
			
			
		}

	}
