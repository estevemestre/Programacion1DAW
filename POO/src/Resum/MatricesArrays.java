package Resum;
import java.util.Scanner;
public class MatricesArrays {



/* ¿ Que és ? Estructura de datos que contiene una coleccion de 
 * valores del mimsmo tipo 
 *
 * ¿ Para que sirve? Para almacenar valores que normalmente tienen 
 * alguna relacion entre si
 *
 * Sintaxis:
 * Declaracion : int[] mi-matriz = new int [10];
 * 
 * 
 * Problema
 * Si tenemos dentro del array muchimos valores para recorrelos todos
 * utilizaremos el bucle for pero no sabremos cuantos numeros tiene para ello
 * podemos utilizar  lenght longitud de la matriz
 * 
 * length
 * 
 * 
 * 
 * MIRAR 
 * 
 * variable.lenght()) String  caracters
 * variable.lenght) Posicions 
 * 
 * 
 * Sempre que mos done un metodo  sempre nomdelaclase.nomdelmetodo()
 * 
 */


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		declararCrearRecorrer();
		
		
		
		
	}
	
	
	
	public static void declararCrearRecorrer() {
		
		/*int [] mi_matriz= new int [5]; // Declaro un array
		
		mi_matriz[0]= 5;  //creo
		mi_matriz[1]= 38;
		mi_matriz[2]= -15;
		mi_matriz[3]= 92;
		mi_matriz[4]= 71; */
		
		int [] mi_matriz={5, 38, -15, 92, 71}; // Declaro i creo
		
		for(int i=0; i<mi_matriz.length; i++) {
			System.out.println("Valor del índice " + i + " = " +mi_matriz[i]); // Imprimir todos los elementos de la matriz
		}
		
		/*
		for(int elemento:mi_matriz){
			System.out.println(elemento);
		}
		*/
		System.out.println(mi_matriz[3]); // Imprimir solo el lugar 3
		
		
		//*****100 NUmeros aleatorios**********
		
		int[] matriz_aleatorios = new int [150];
		
		System.out.println("Los 100 números son :");
		
		for (int i = 0; i <matriz_aleatorios.length; i++){
		
				matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		
				
				 System.out.print(matriz_aleatorios[i]+", ");
		}
	
	}
}
	
	


