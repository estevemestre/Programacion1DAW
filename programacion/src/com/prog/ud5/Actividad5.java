package com.prog.ud5;
import java.util.Scanner;

public class Actividad5 {

	public static void main (String[] args) {

	Scanner lector = new Scanner (System.in);
	
		int nota;
		
	System.out.println ("Inserta que nota tienes ");
	
	nota = Integer.parseInt(lector.nextLine());

	
		if (nota == 0 || nota == 1 || nota == 2) {
			System.out.println("Molt deficient");
			}
		
		if (nota == 3 || nota == 4) {
			System.out.println("Insuficient");
			}
		if (nota == 5) {
			System.out.println("Suficient");
			}
		if (nota == 6 ) {
			System.out.println("Bé");
		}
		if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		}
		if (nota == 9 || nota == 10) {
			System.out.println("Excel-lent");
		}
		
		
		/* switch (nota) {
		
		case 0 :
			System.out.println("Molt deficient");
			break;
		case 1 :
			System.out.println("Molt deficient");
			break;
		case 2 :
			System.out.println("Molt deficient");
			break;
		case 3 :
			System.out.println("Insuficient");
			break;
		case 4 :
			System.out.println("Insuficient");
			break;
		case 5 :
			System.out.println("Suficient");
			break;
		case 6 :
			System.out.println("Bé");
			break;
		case 7 :
			System.out.println("Notable");
			break;
		case 8 :
			System.out.println("Notable");
			break;
		case 9 :
			System.out.println("Excel-lent");
			break;
		case 10 :
			System.out.println("Excel-lent");
			break;
			}*/
	
	
	
	
	}
}