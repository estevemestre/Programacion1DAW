/*Activitat15.- Escriu un programa que permeta introduir un array de 20 elements.
 *  Després ha d'indicar si n'hi ha o no algun element repetit. En cas afirmatiu,
 *   s'ha d'indicar quins elements són i la posició que ocupen en l'array. 
 *   Seguix les orientacions de les activitats anteriors per crea els mètodes.
 */

package Activitat_11_15;
import java.util.Arrays;

public class Activitat15 {
	public static int [] omplirArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*(100-0+1)+0);
		}
		return array;
	}
	
	public static void elementsIguals(int [] array){
		System.out.println("els elements que son igual son:");
		for (int i = 0; i < array.length; i++) {
			int igual=array[i];
			for (int j = i+1; j < array.length; j++) {
				if(igual==array[j]){
				System.out.println("L'element "+array[i]+" està en la posició "+i+" i en la posició "+j);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		int []array=new int [20];
		omplirArray(array);
		System.out.println(Arrays.toString(array));
		elementsIguals(array);
	}

}