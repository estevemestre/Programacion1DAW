package examen2_1repas;

import java.util.Arrays;

/*
Escriu un programa que permeta, a partir d'un array de 10 elements numerics V (aleatoris?), 
generar un  array P amb els elements d'V en ordre invers. utilitza els mètodes que creges convenients
Exemple d'execucio:
Array original: [ 56, 56, 76, 64, 64, 64, 75, 57, 8, 19]
Array invers: [ 19, 8, 57,  64, 64, 64, 76, 56, 56]
*/

public class Activitat3 {

	public static void main(String[]args){
		
		int [] array= new int[10];
		int [] arrayInvers = new int[array.length];
	
		
		for(int i=0; i < array.length; i++){
			array[i]=(int) (Math.random()*100);
		}
		
		//Array Invers
		for (int i=0; i <array.length; i++){
			arrayInvers[arrayInvers.length-1-i]=array[i];
		}
				
		System.out.println("Array original"+ Arrays.toString(array));
		System.out.println("Array invers"+ Arrays.toString(arrayInvers));
		
		}
	}
