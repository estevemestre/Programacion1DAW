package com.prog.ud4;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String [] args){
		String actividad11 = "equacion";
				
		
		double a;
		double b;
		double c;
		double x;

		
		
		
	Scanner lector=new Scanner(System.in);
	
	System.out.println("Introduzca el primer numero de la equaci�n:");
	
	a= Integer.parseInt(lector.nextLine());
	
	System.out.println("Introduzca el segundo numero de la equaci�n:");
	b= Integer.parseInt(lector.nextLine());
	
	System.out.println("Introduzca el resultado de la equaci�n:");
	c= Integer.parseInt(lector.nextLine());
	

	
	if (a == 0) {
		System.out.println("El numero que has introduciodo es incorrecto, porfavor introduce un n�mero mayor que 0");
	}else {
		x = ( c - b ) / a;
	System.out.println("El n�mero de  x es : " + x);
	
	}
	
	

			
	
	}		
}
