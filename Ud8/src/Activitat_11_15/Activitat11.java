/*Activitat11.- Implementa els seg�ents m�todes (respecta les cap�aleres que et done):
�	public static int[] crearArray(): ompli un array de 10 elements amb n�meros aleatoris
 del 0 al 50.
�	public static void visualitzarArray(int[] vector): visualitza tot el contingut del array.
�	public static void mostrarPosPars(int[] vector): mostra la posici� i contingut dels 
elements que ocupen posici� par.
�	public static void mostrarPosMultiples3(int[] vector): mostra la posici� i contingut
 dels elements que ocupen posici� m�ltiple de 3.

A m�s a m�s, es far� un men� semblant al seg�ent, des del qual es cridaran els m�todes creats:

MEN� PRINCIPAL
==============
1.-Crear array.
2.-Visualitzar contingut de l'array
3.-Visualitzar contingut de les posicions pars.
4.-Visualitzar contingut de les posicions m�ltiple de 3.
0.-Eixir del men�.
Selecciona una opci�:


 */
package Activitat_11_15;
import java.util.Arrays;
import java.util.Scanner;
public class Activitat11 {
	
	
	public static int[] crearArray(){
	
	int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
	
			numeros[i]=(int)Math.round(Math.random()*50);
		}
	
	return numeros;
	}


	public static void visualitzarArray(int[] vector) {
		
		System.out.println(Arrays.toString(vector));
		
	}

	public static void mostrarPosPars(int[] vector){

         for (int i = 0; i < vector.length; i++) {
					
        	 if (i % 2 == 0) {
        		 
        		 System.out.println("Posici�: "+i+" Contingut: "+vector[i]);
        	 }
         
         }
	}

	
	public static void mostrarPosMultiples3(int[] vector) {
		
		for (int i = 0; i < vector.length; i++) {
			
			if (i % 3 == 0) {
				System.out.println("Posicio "+i+ " Contingut "+vector[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int [] vector=null;	
		int menu;
		do {
		System.out.println("1.-Crear array.\n"
                          +"2.-Visualitzar contingut de l'array\n"
                          +"3.-Visualitzar contingut de les posicions pars.\n"
                          +"4.-Visualitzar contingut de les posicions m�ltiple de 3\n"
                          +"0.-Eixir del men�\n"
                          +"Selecciona una opci�:");
		
		menu = Integer.parseInt(teclado.nextLine());
		
		switch(menu) {
	
		case 1:
			vector = crearArray();
			break;
		case 2:
			visualitzarArray(vector);
			break;
		case 3:
			mostrarPosPars(vector);
			break;
		case 4:
			mostrarPosMultiples3(vector);
			break;
		default:
			System.out.println("Adeu");
			break;
	
		}
		}while(menu < 6);
	}
	
}