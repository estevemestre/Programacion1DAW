package com.prog.ud5;

import java.util.Scanner;
public class Actividad2 {

	public static void main (String[] args) {
		
		Scanner lector=new Scanner (System.in);
		int edad;
		
		System.out.println ("indique su edad ");
		edad=Integer.parseInt(lector.nextLine());
		
		if ( edad == 25) {
			
			System.out.println ("Tienes 25 años");
			
		}else{
				if (edad < 25) {
					System.out.println ("Tienes menos de 25 años");
				}else{
					System.out.println ("Tienes mas de 25 años");
			}
		}
	
	 }
	}