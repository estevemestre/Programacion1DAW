package Practica4;

import java.util.Scanner;

public class Practica4 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		
		int menu;
		
		Fraccions primeraFrac = new Fraccions ();
		primeraFrac.visualitzarInformacio();
		
		Fraccions segonaFrac = new Fraccions ();
		segonaFrac.visualitzarInformacio();
		
		do{
			System.out.println( "OPERACIONS AMB FRACCIONS "
					+ "\n============================ "
					+ "\n 1.-Sumar fraccions."
					+ "\n 2.-Restar fraccions."
					+ "\n 3.-Multiplicar fraccions."
					+ "\n 4.-Dividir fraccions."
					+ "\n 0.-Eixir."
					+ "\nInserta opció vàlida:");
			
			menu=Integer.parseInt(teclado.nextLine());
			
			switch (menu){
			case 1:
				primeraFrac.suma(segonaFrac);
				break;
			case 2:
				primeraFrac.resta(segonaFrac);
				break;
			case 3:
				primeraFrac.multFrac(segonaFrac);
				break;
			case 4:
				primeraFrac.divisio(segonaFrac);
				break;
			case 0:
				System.out.println("Fi del programa. Fins aviat!");
				break;
			default:
				System.out.println("Inserta opció no vàlida.");
				break;
			}
		
			
		}while(menu ! =0);
		
		
		

}

}