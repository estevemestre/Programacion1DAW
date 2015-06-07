package Practica_4;
import java.util.Scanner;

public class Practica4 {

	public static void main(String[] args) {
		int opcio;
		
		FraccionsP4 fraccio1=new FraccionsP4 ();
		fraccio1.visualitzarFraccio();
		
		FraccionsP4 fraccio2=new FraccionsP4 ();
		fraccio2.visualitzarFraccio();
		
		Scanner teclat=new Scanner(System.in);
		
		//Menú
		do{
			System.out.println("OPERACIONS AMB FRACCIONS "
					+ "\n======================== "
					+ "\n1.-Sumar fraccions."
					+ "\n2.-Restar fraccions."
					+ "\n3.-Multiplicar fraccions."
					+ "\n4.-Dividir fraccions."
					+ "\n0.-Eixir."
					+ "\nInserta opció vàlida: ");
			opcio=Integer.parseInt(teclat.nextLine());
			
			switch (opcio){
			case 1:
				fraccio1.suma(fraccio2);
				break;
			case 2:
				fraccio1.resta(fraccio2);
				break;
			case 3:
				fraccio1.multiplicacio(fraccio2);
				break;
			case 4:
				fraccio1.divisio(fraccio2);
				break;
			case 0:
				System.out.println("Fi del programa. Fins aviat!");
				break;
			default:
				System.out.println("Opció no vàlida.");
				break;
			}
		}while(opcio !=0);
		
		
		

	}

}
