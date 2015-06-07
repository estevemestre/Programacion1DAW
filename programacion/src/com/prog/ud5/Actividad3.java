package com.prog.ud5;
import java.util.Scanner;

public class Actividad3 {
	
	public static void main (String[] args) {
	
		Scanner lector = new Scanner (System.in);
		
		int num;
		
		System.out.println ("Inserte el numero ");

		num=Integer.parseInt(lector.nextLine());

		
		num = num % 2;
		
		if ( num == 0 ) {
			System.out.println ("El numero es par ");
		}else{
			System.out.println ("El numero es impar ");
		}
	}
}

