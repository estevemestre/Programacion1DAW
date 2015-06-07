/*
Escriu un programa que permeta, a partir d'un array de 10 elements numerics V (aleatoris?), 
generar un  array P amb els elements d'V en ordre invers. utilitza els mètodes que creges convenients
Exemple d'execucio:
Array original: [ 56, 56, 76, 64, 64, 64, 75, 57, 8, 19]
Array invers: [ 19, 8, 57,  64, 64, 64, 76, 56, 56]
*/


package examen2_1repas;
import java.util.Arrays;
public class Actividad3 {

	public static void main(String[] args) {
	
	
		int [] original = new int  [10];
		
		for (int i = 0; i < original.length; i++) {
			
			original[i] = (int)Math.round(Math.random()*100);
			
			
		}
		
		
		int [] invertit =  new int [original.length];
		
		
		
		int cont = original.length -1;
		
		int i = 0;
		
		
		while (i < original.length) {
			
			
			 invertit[i] = original[cont];
			 
			 cont--;
			 i++;


		}
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(invertit));
		
		
	}
}
