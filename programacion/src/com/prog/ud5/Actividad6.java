package com.prog.ud5;
import java.util.Scanner;

public class Actividad6 {
	public static void main (String[] args) {
	
	Scanner lector = new Scanner (System.in);
	
	
	int moneda200;
	int moneda100;
	int moneda50;
	int moneda20;
	int moneda10;
	int moneda5;
	int moneda2;
	int moneda1;
	double x; 
	
	System.out.println("Inserta la cantidad de euros , porfavor introduzca de la siguiente forma x.xx");
	x=Double.parseDouble(lector.nextLine());
	
	
	x = x * 100;
	
	int euros = (int)Math.round(x);  // Le paso la variable  x que es de tipo double  a euros que es de tipo int 
	
	
	
	// La siguiente estrucura de Si la hago para que solo me salgan las monedas que quiero
	
	moneda200 = euros / 200;
	
		if (moneda200 > 0) {
			System.out.println (+ moneda200 + " de 2 Euros");
	}
	
	moneda100 = euros % 200;
	moneda100 = moneda100 / 100;

		if (moneda100 > 0) {
			System.out.println (+ moneda100 + " de 1 Euros");
	}
	
	moneda50 = euros % 100;
	moneda50 = moneda50 / 50;
	
		if (moneda50 > 0) {
			System.out.println (+ moneda50 + " de 0.50 Euros");
		}
	
	moneda20 = euros % 50;
	moneda20 = moneda20 / 20;
	
		if (moneda20 > 0) {
			System.out.println (+ moneda20 + " de 0.20 Euros");
	}
	
	moneda10 = euros % 20;
	moneda10 = moneda10 / 10;
	
	
		if (moneda10 > 0) {
			System.out.println (+ moneda10 + " de 0.10 Euros");
	}

	
	moneda5 = euros % 10;
	moneda5 = moneda5 / 5;
	
		if (moneda5 > 0) {
			System.out.println (+ moneda5 + " de 0.05 Euros");
	}
	
	moneda2 = euros % 5;
	moneda2 = moneda2 / 2;
	
		if (moneda2 > 0) {
			System.out.println (+ moneda2 + " de 0.02 Euros");
	}
	
	moneda1 = euros % 2;
	moneda1 = moneda1 / 1;
	

		if (moneda1 > 0) {
			System.out.println (+ moneda1 + " de 0.01 Euros");
}


	
	}
}