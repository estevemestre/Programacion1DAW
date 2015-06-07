/*Activitat1.- Crea els seg�ents m�todes respectant les cap�aleres donades:
void crearFitxer(String directori, String fitxer): crear� un fitxer amb el nom fitxer1.txt
void veureContingut(String directori): visualitzar� el contingut del directori passat com a
par�metre.
void veureInf (String directori, String fitxer): visualitzar� el nom, la ruta absoluta i relativa, si
es pot escriure, si es pot llegir, la grand�ria, si �s un directori i si �s un fitxer.
Els par�metres que necessiten els m�todes seran demanats a l'usuari des del programa
principal.
 */
package tema13;

import java.util.Scanner;

public class Actiivitat1Pricinpal {

	static Scanner reader = new Scanner (System.in); 
	

	public static void crearFitxer (Activitat1 fitxer) {
		System.out.println("Dime la ruta del directori (O:\\Activitats\\1-4)");
		String directori = reader.nextLine();
		System.out.println("Dime el nom del fitxer (fitxer1.txt)");
		String fitxer1 = reader.nextLine();
		// fitxer.crearFitxer("O:\\Activitats\\1-4","fitxer1.txt");
		fitxer.crearFitxer(directori,fitxer1);
	}
	public static void voreContingut (Activitat1 fitxer) {
		System.out.println("Disme la ruta del directori (O:\\Activitats\\1-4)");
		String ruta = reader.nextLine();
		//fitxer.veureContingut("O:\\Activitats\\1-4");
		fitxer.veureContingut(ruta);
	}
	public static void voreInformacio (Activitat1 fitxer) {
		System.out.println("Dime la ruta del directori (O:\\Activitats\\1-4)");
		String directori = reader.nextLine();
		System.out.println("Dime el nom del fitxer (fitxer1.txt)");
		String fitxer1 = reader.nextLine();
		//fitxer.veureInf("O:\\Activitats\\1-4","fitxer1.txt");
		fitxer.veureInf(directori,fitxer1);
	}
	
	public static void menu () {
		Activitat1 fitxer = new Activitat1();
		int option;
		do {
			System.out.println("1_ Crear un fitxer");
			System.out.println("2_Veure el contingut de un directori");
			System.out.println("3_Veure informacio");
			System.out.print("Inserte una opci�n v�lida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option ){
			case 1:
				crearFitxer(fitxer);
				break;
			case 2:
				voreContingut(fitxer);
				break;
			case 3:
				voreInformacio(fitxer);
				break;
			case 0:
				System.out.println("Adeu fins l'altra");
				break;
			default:
				System.out.println("Opci�n no v�lida.");
				break;
					
			}
		} while (option != 0);
	}

	public static void main(String[] args) {
		menu();
	}
		

}
