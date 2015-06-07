package com.prog.ud5;
import java.util.Scanner;

public class Actividad7 {

	public static void main (String[] args) {
	

		Scanner lector = new Scanner (System.in);
	
	int edad;
	String nombre;
	int precio = 500;
	int descpadre = 35;
	int descmenor = 25;
	int descmajor = 50;
	String socio;

	

	System.out.println("Inserta tu edad");
	edad = Integer.parseInt(lector.nextLine());
	
	System.out.println("Inserta tu nombre");	
	nombre=(lector.nextLine());
	
	if (edad < 18) {
		
		System.out.println("¿ Eres socio ?(Si/No)");	
		socio=(lector.nextLine());
			
				if (socio.equalsIgnoreCase("Si")) {
			
				descpadre = descpadre * precio / 100;
				precio = precio - descpadre;
		
				System.out.println(nombre + " tienes que pagar " +precio );
			
			}else{
				descmenor = descmenor * precio / 100;
				precio = precio - descmenor;
				System.out.println(nombre + " tienes que pagar " +precio );
				}
	
	}
	
	if (edad <= 65 && edad >= 18) {
		System.out.println(nombre + " tienes que pagar  " +precio );	
		
	}
	
	if (edad > 65)  {
		descmajor = descmajor * precio / 100;
		precio = precio - descmajor;
		System.out.println(nombre +"tienes que pagar " +precio);
		}
	
	
	}
}
