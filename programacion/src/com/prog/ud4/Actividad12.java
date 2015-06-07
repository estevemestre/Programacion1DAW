package com.prog.ud4;

import java.util.Scanner;

public class Actividad12 {
	
	public static void main (String [] args){
		
		int teclado;
		int auxiliar;
		int unidades;
		int decenas;
		int centenas;
		
		Scanner lector =new Scanner (System.in);
		
		System.out.println("Inserta un numero que tenga 3 cifras: ");
		teclado= Integer.parseInt(lector.nextLine());
		
		centenas =  teclado / 100;
		
		auxiliar = teclado % 100; 
		
		decenas= auxiliar / 10;
			
		unidades = auxiliar % 10;
		
		
				
					
		System.out.println(teclado + " = " + centenas + "^100 + " + decenas +"^10 + "+ unidades);
				
		
	}

}
