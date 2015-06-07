/**
 * @author Esteve Mestre Company
 * 
 *Escriu un programa que sol�licite a l'usuari un n�mero enter positiu. 
 *El programa ha de presentar en pantalla la descomposici� en factors prims del n�mero.
 *Exemple: si el n�mero �s 36, haur� d'escriure 36=2 * 2 * 3 * 3
 * 
 */





package com.prog.ud5;
import java.util.Scanner;
public class Actividad16 {
public static void main  (String[] args) {
	
	Scanner lector = new Scanner (System.in);
	
	int numero;
	int i = 2;	
	
	
	System.out.println("Inserta el n�mero");
	numero = Integer.parseInt(lector.nextLine());

	System.out.println("El n�mero "+numero+"= ");
	
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
