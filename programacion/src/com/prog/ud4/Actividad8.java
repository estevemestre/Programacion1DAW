package com.prog.ud4;

import java.util.Scanner;

public class Actividad8 {

	public static void main (String[] args) {

		Scanner lector=new Scanner(System.in);

		double diametro;
		double altura;
		double area;
		double radio;
		double volumen;
		double Pi = 3.1416;
		double radioCuadrado;
		
	System.out.println("Introduzca el diametro");
	
	diametro = Integer.parseInt(lector.nextLine());
		
	System.out.println("Introduzca la altura");
	
	altura = Integer.parseInt(lector.nextLine());
	
		radio = diametro / 2; 			// Elevamos al cuadrado
	
		radioCuadrado = Math.pow( radio, 2);
		
		
		area = 2 * Pi * radioCuadrado + 2 * Pi * radio * altura;
		volumen = Pi * ( radio * radio) * altura;
	
		
	System.out.println(" El area es :" +area);
	System.out.println(" El volumen es " +volumen);
	
	}
		}
