package com.prog.ud4;

	import java.util.Scanner;

	public class Menu {
	
		public static void main(String [] args) {
			
	Scanner reader=new Scanner(System.in);
	int num1=6;
	int num2= 3 ;
	int option;
	
	do {
		
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("Inserta una opció valida");
		option=Integer.parseInt(reader.nextLine());
	
		switch (option){
	
				case 1:
						System.out.println(num1 + num2);
		
				break;
				case 2:
						System.out.println(num1 - num2);
		
				break;
		
				case 0:
						System.out.println("Aplicacio finalitzada");
				break;
	
				default:
						System.out.println("Opció ni vàlida");
				break;
					}
						} while(option!=0);
		
		reader.close();

	}
}