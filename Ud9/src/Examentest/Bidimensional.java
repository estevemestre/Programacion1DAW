///*Crea una matriu de 5 files i 7 columnes i a continuació visualitza:
package Examentest;

import java.util.Arrays;

import javax.swing.SingleSelectionModel;

import org.omg.Messaging.SyncScopeHelper;




public class Bidimensional {

	public static void main(String[] args) {
		
		int [][] array2 = {
				{1,2,3,4,5,6,7},
				{8,9,10,11,12,13,14},
				{15,16,17,18,19,20,21},
				{20,21,22,23,24,25,26},
				{27,28,29,30,31,32,33},
		};
		
	
		
		// La primera columna i la quarta. Intercanvi el contingut d'estes columnes i visualitza-les de nou.
		
	System.out.println("Array complet");
	for (int i = 0; i < array2.length; i++) {
		for (int j = 0; j < array2[i].length; j++) {
			System.out.print(array2[i][j]+ "\t");
		}
		System.out.println();
	}
		
		
		
		System.out.println("primera columna");
	
		for (int i = 0; i < array2.length; i++) {  //files
				System.out.println(array2[i][0]);
		}
		System.out.println("Cuarta columna");
		for (int i = 0; i < array2.length; i++) {  //files
			System.out.println(array2[i][3]);
		}
		
		
		int [][] aux = new int [5][7];
		
		
		
		
		// COPIARE LA A 
		
		for (int i = 0; i < aux.length; i++) { // files 
			aux[i][0] = array2[i][0];
			
		}
		
		for (int i = 0; i < aux.length; i++) { // files 
			 array2[i][0] = array2[i][3];
		
		}
	
		for (int i = 0; i < aux.length; i++) { // files 
			 array2[i][3] = aux[i][0];
		
		}
		

		System.out.println("primera columna");
		
		for (int i = 0; i < array2.length; i++) {  //files
				System.out.println(array2[i][0]);
		}
		System.out.println("Cuarta columna");
		for (int i = 0; i < array2.length; i++) {  //files
			System.out.println(array2[i][3]);
		}
		

		
	}
}
