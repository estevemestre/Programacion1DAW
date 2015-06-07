/*Crea una matriu de 5 files i 7 columnes i a continuació visualitza:
 *Tota la matriu.
 *La cinquena fila completa.
 *L'element de la quarta fila tercera columna i l'element de la quinta fila tercera columna. Intercanvia el contingut d'estos
 * dos elements i visualitza'ls de nou.
 *La primera columna i la quarta. Intercanvi el contingut d'estes columnes i visualitza-les de nou.
 * 
 */
package Arrays_multidimensionals;
import java.util.Arrays;
public class Activitat17 {

	public static void main(String[] args) {
		
		int [][] array= {
			{1,2,3,4,5,6,7},
			{8,9,10,11,12,13,14},
			{15,16,17,18,19,20,21},
			{22,23,24,25,26,27,28},
			{29,30,31,32,33,34,35}
		};
		
		
		/*for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				array[i][j]=(int)(Math.round(Math.random()*50));	
			}
		}*/
		System.out.println("visualitze tota la matriu");
		System.out.println("__________________________");
		for (int i = 0; i < 5; i++) { // files
			System.out.println();
			for (int j = 0; j < 7; j++) {  //columnes
				System.out.print(array[i][j] +"\t");
			}
		}
		System.out.println();
		System.out.println("__________________________");
		System.out.println("La cinquena fila completa");
		for (int i = 4; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < 7; j++) {
				System.out.print(array[i][j] +"\t");
			}
		}
		System.out.println();
		System.out.println("__________________________");
		System.out.println("L'element de la quarta fila i tercera columna");
		System.out.println(array[3][2]);
		System.out.println("____________________________");
		System.out.println("L'element de la quinta fila i tercera columna");
		System.out.println(array[4][2]);
		System.out.println("_______________________");
		System.out.println("Intercanvia el contingut d'estos dos elements i visualitza'ls de nou.");
		System.out.println("Elements intercambiats: ");
		int aux = array[3][2];
		array[3][2] = array[4][2];
		array[4][2] = aux;
		System.out.println(array[3][2] +"\t" + array[4][2]);
		System.out.println("__________________");
		// La primera columna i la quarta. Intercanvi el contingut d'estes columnes i visualitza-les de nou.
		
		int [] intercanvi = new int [5];
		int auxiliar;
		
		
		
		for (int i = 0; i < array.length; i++) { // Guarde el array
			intercanvi[i]= array[i][0];
		}	
		
	
	    System.out.println("Intercanvi de columnes");
	    System.out.println("Contingut de la primera columna: ");
		for (int i = 0; i < array.length; i++) {
			array[i][0] = array[i][3];
			System.out.println(array[i][0]);
		}
		System.out.println("Contingut de la cuarta columna: ");
		for (int i = 0; i < intercanvi.length; i++) {
			array[i][3] = intercanvi [i];
			System.out.println(array[i][3]);
		}
		

		
		
	}	
}