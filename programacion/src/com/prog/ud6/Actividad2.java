/**
 * @author Esteve Mestre Company
 * 
 * .- Dissenya un m�tode que retorne el major de quatre n�meros passats com a par�metres.
 * 
 * 
 */



package com.prog.ud6;
import java.util.Scanner;
public class Actividad2 {


	
	public static void main(String [] args) {
		


		
			Scanner lector=new Scanner (System.in);
	
		
			int numero1;
			int numero2;
			int numero3;
			int numero4;


	   

		
			System.out.println("Inserta primer n�mero ");
			numero1 = Integer.parseInt(lector.nextLine());
		
			System.out.println("Inserta el segundo n�mero");
			numero2 = Integer.parseInt(lector.nextLine());
		
		
			System.out.println("Inserta el tercer n�mero");
			numero3 = Integer.parseInt(lector.nextLine());
			
			System.out.println("Inserta el cuarto n�mero");
			numero4 = Integer.parseInt(lector.nextLine());
		
			System.out.println("El n�mero mayor sera: " +retorno(numero1, numero2, numero3, numero4));
	

		lector.close();
	}
	
	
		
		 static int retorno(int numero1, int numero2, int numero3, int numero4){
	
			if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
				
				return numero1;
				
			}
			

			if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
				
				return numero2;
				
			}
			

			if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
				
				return numero3;
			}
		
			if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3) {
				
				
			}
			return numero4;	
			
			
		
		 
		 }
		
}
		
		

