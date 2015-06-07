package com.prog.ud5;
import java.util.Scanner;

public class Actividad1 {
	
	public static void main (String[] args) {
		
	
		Scanner lector=new Scanner (System.in);
		int edad;
	
		System.out.println("Introduce la edad ");
		
		edad=Integer.parseInt(lector.nextLine());
		
		
		if (edad >= 18) {
			System.out.println ("Eres mayor de edad");
			
		}else{
			
		System.out.println ("Eres menor de edad");
			}
		
		
		}

}
