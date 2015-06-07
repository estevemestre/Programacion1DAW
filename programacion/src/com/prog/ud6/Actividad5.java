/*
 *  @author Esteve Mestre Company
 *  
 * Escriu un mètode que accepte dos arguments: el caràcter que es vol imprimir i  el nombre de línies 
 * que s'imprimiran de forma triangular.
 *
 * 		a
 * 	   aaa
 * 	  aaaaa
 *	 aaaaaaa
 * 
 * 
 * 
 */



package com.prog.ud6;
import java.util.Scanner;


public class Actividad5 {
	public static void main (String[] args){
			Scanner teclado = new Scanner(System.in);
			
			char caracter;
			int lineas;
		
			System.out.println("Inserta el caracter que desea ver en forma de pirámide");
			caracter = teclado.nextLine().charAt(0);
		
		
			System.out.println("Inserta las lineas que quieras que aparezca la piramide");
			lineas = Integer.parseInt(teclado.nextLine());
			
			metodoPiramide(caracter,lineas);
		
		
			}
	
	public static void metodoPiramide (char caracter, int lineas){
		
			for (int i = 1; i < lineas + 1;i++){
				
			int contador = 2 * i - 1;
			int  aux = lineas - i;
			
				while (aux > 0){	
					
					System.out.print(" ");
					aux = aux - 1;
				}
				while (contador>0){		
					
					System.out.print(caracter);
					contador = contador -1;
				}
			 System.out.println();
		}
	}

}


