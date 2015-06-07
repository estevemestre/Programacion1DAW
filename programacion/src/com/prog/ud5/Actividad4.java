package com.prog.ud5;
import java.util.Scanner;

public class Actividad4 {

	public static void main (String[] args) {
	
		Scanner lector=new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Escriber el primer numero");
		num1 = Integer.parseInt(lector.nextLine());
		System.out.println("Escribe el segundo numero");
		num2 = Integer.parseInt(lector.nextLine());
		
		if (num1 < num2) {
			System.out.println ("El numero mayor es " + num2);
			
		}else {
			System.out.println ("El numero mayor es " +num1);
		
		
		}
	}
}
