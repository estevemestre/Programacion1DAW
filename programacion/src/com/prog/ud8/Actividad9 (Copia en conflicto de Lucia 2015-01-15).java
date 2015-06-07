/*@uthor Esteve Mestre Company
 * public static int[] crearArray()
Has d'introduir dades en un array numèric de 10 elements. Pots omplir el fitxer amb números aleatoris.
public static void visualitzarArray(int[] numeros)
Visualitza tot el contingut de l'array.
public static void visualitzarContParell(int[] numeros)
Visualitza la posició i el contingut d'aquells elements amb contingut parell.
public static void visualitzarContSenar(int[] numeros)
Visualitza la posició i el contingut d'aquells elements amb contingut senar.

Crida als diferents mètodes des del main().
 */
package com.prog.ud8;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int menu;
	
		do {
			System.out.println("1_Crear un array de 10 elementos"
							+"\n2_Visualitzar el array"
							+"\n3_Visualitzar contador par"
							+"\n4_Visualitzar contador impar");
		

			System.out.print("Introduce una opción: ");
			menu = Integer.parseInt(teclado.nextLine());
		
		
			switch (menu) {
		
				case 1:
						crearArray();
					break;
				case 2:
						visualitzarArray(crearArray());
					break;
					
				case 3:	
						visualitzarContParell(crearArray());
					break;
				case 4:
					visualitzarContSenar(crearArray());
					break;
			}
			}while(menu !=0);	
		
		
			
		}
		
	
	
	
	//switch
	
	
	public static int[] crearArray() {
		
		
		int[] crearArray = new int [10];
		
		for (int i = 0; i <crearArray.length; i++){
			
			crearArray[i]=(int)Math.round(Math.random()*100);
		}	
		
		return crearArray;
	}

	public static void visualitzarArray(int[] numeros) {
		
		for (int i = 0; i <numeros.length; i++){
			
			System.out.println(numeros[i]);
		}
	}

	public static void visualitzarContParell(int[] numeros) {
		
		System.out.println("Los números pares del array són :");
		
		for (int i =0; i <=numeros.length; i++) {
			if (numeros[i]%2==0) {
				System.out.println(3
					+" es par i está en la posción  "+i);
			}
		}	
		
		
		
	}
	
	public static void visualitzarContSenar(int[] numeros) {


	System.out.println("Los números impares del array són :");
		
		for (int i =0; i <=numeros.length; i++) {
			if (numeros[i] % 2 == 1) {
				System.out.println(numeros[i] +" es impar i está en la posción  "+i);
			}
		}	
	}
	
	
	
}
	

	

