package com.prog.ud6;
import java.util.Scanner;
public class Actividad1_1 {
	
	public void retorno() {
	
		Scanner lector=new Scanner (System.in);
	
		
		int numero1;
		int numero2;
		int numero3;
		
		
		System.out.println("Inserta primer n�mero ");
		numero1 = Integer.parseInt(lector.nextLine());
	
		System.out.println("Inserta el segundo n�mero");
		numero2 = Integer.parseInt(lector.nextLine());
		
		
		System.out.println("Inserta el tercer n�mero");
		numero3 = Integer.parseInt(lector.nextLine());
		
		
		
			if (numero1 > numero2 && numero1 > numero3) {
				
				System.out.println("El n�mero mayor sera " +numero1);
				
			}
			

			if (numero2 > numero1 && numero2 > numero3) {
				
				System.out.println("El n�mero mayor sera " +numero2);
				
			}
			

			if (numero3 > numero1 && numero3 > numero2) {
				
				System.out.println("El n�mero mayor sera " +numero3);
				
			}
		
		
	
	}
}
