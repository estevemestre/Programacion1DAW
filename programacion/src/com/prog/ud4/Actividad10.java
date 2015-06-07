package com.prog.ud4;
import java.util.Scanner;

public class Actividad10 {
	
	public static void main (String[] args ) {

	Scanner lector=new Scanner (System.in);
	double celsius;
	double farenheit;
	
	
	System.out.println("Escribe los grados Celsius ");
	
	celsius = Integer.parseInt(lector.nextLine ());
	
	farenheit = (9.0 /5.0 ) * celsius + 32;
	
	
	
	System.out.println("Los grados Celsius que has introducido son:  " + farenheit + " Fahrenheit");
	
	
	
	
	}
}
