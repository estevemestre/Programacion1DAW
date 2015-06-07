package com.prog.ud4;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {

		
			double perimetro;
			double ancho;
			double alto;
			double area;
			Scanner lector=new Scanner(System.in);
		
			
		System.out.println("Introduce el ancho");
		
		ancho = Integer.parseInt(lector.nextLine());
		
		System.out.println("Introduce el lado");
		
		alto = Integer.parseInt(lector.nextLine());
		
		
		perimetro = 2 * ancho + 2 * alto;
		
		area = ancho * alto;
		
		
		
		

		System.out.println("El perimetro del rectangulo es: " + perimetro +" y el area del rectangulo es: " + area);


	}
}