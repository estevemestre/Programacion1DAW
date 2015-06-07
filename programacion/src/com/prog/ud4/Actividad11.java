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
	
	System.out.println("Introduzca el primer numero de la equación:");
	
	a= Integer.parseInt(lector.nextLine());
	
	System.out.println("Introduzca el segundo numero de la equación:");
	b= Integer.parseInt(lector.nextLine());
	
	System.out.println("Introduzca el resultado de la equación:");
	c= Integer.parseInt(lector.nextLine());
	

	
	if (a == 0) {
		System.out.println("El numero que has introduciodo es incorrecto, porfavor introduce un número mayor que 0");
	}else {
		x = ( c - b ) / a;
	System.out.println("El número de  x es : " + x);
	
	}
	
	

			
	
	}		
}
