/**
 * @author Esteve Mestre Company
 * 
 *Escriu un programa que sol·licite a l'usuari un número enter positiu. 
 *El programa ha de presentar en pantalla la descomposició en factors prims del número.
 *Exemple: si el número és 36, haurà d'escriure 36=2 * 2 * 3 * 3
 * 
 */





package com.prog.ud5;
import java.util.Scanner;
public class Actividad16 {
public static void main  (String[] args) {
	
	Scanner lector = new Scanner (System.in);
	
	int numero;
	int i = 2;	
	
	
	System.out.println("Inserta el número");
	numero = Integer.parseInt(lector.nextLine());

	System.out.println("El número "+numero+"= ");
	
	while (i <= numero) {	
		
		if (numero%i == 0) {
			
			System.out.print(i + "*");
			
			 numero = numero / i;
			 
		}else{ 
			i++;
		}
	
	}	
		
		
	}
}
