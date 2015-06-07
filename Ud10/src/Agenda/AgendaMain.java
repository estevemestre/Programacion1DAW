/* (Agenda de contacte)
 * Menú 1:
 * Afegir un contacte = id automática . nom, cognoms , telefon, email
 * VOLS INTRODUIRNE UNALTRE ?
 * Menú 2: 
 * Llistar contactes
 * Menú 3:
 * Buscar per cognoms
 * Menú 4:
 * Eliminar contacte
 * LListar tots
 * Demanar id 
 * Eliminar Contacte amb id  
 * MENU 5
 * 
 * Modificar contacte
 * llistar  els contactes 
 * demanar id
 * si la id es ok  (MODIFICARO TOT Nom gonoms email etc)
 * TOrnar al menu principal
 */

package Agenda;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class AgendaMain {

	static Scanner reader =new Scanner (System.in);
	static ArrayList<Contacte> contactes = new ArrayList<Contacte>();
	
	
	static boolean preguntar () {
		
		String pregunta;
		System.out.println("Vols introduir un altre ? (Si o no ?)");
		pregunta = reader.nextLine();
		
		if (pregunta.equalsIgnoreCase("si")) {
			return true;
		}
		return false;
	}
	// Crear contactes
	static void nouContacte () {
	do {	
		contactes.add(new Contacte());
	}while(preguntar());	
	}
	// LListar contactes 
	static void llistarContacte() {
		int cont = 0; 
		for (int i = 0; i < contactes.size(); i++) {
			System.out.println("*******CONTACTE "+cont+ "********");
			contactes.get(i).mostrarInfo();
			cont++;
			System.out.println("***CONTACTE FINALITZAT***********");
		}
	}
	// Buscar Contacte per cognom
	static void buscarCognom() {
		String cognom;
		System.out.println("Perfavor introdueix el cognom que vols buscar");
		cognom = reader.nextLine();
	
		for (int i = 0; i < contactes.size(); i++) {
			if (contactes.get(i).getCognoms().equalsIgnoreCase(cognom)) {
					System.out.println("******CONTACTE:***** ");
						contactes.get(i).mostrarInfo();
						System.out.println("***CONTACTE FINALITZAT***");
						System.out.println();
			}
		}
	}
	
	// Buscar contacte per id
	static Contacte buscarId() {
		
		llistarContacte();
		int id;
		System.out.println("*******************************************");
		System.out.println("Perfavor introdueix la id del contacte");
		id = Integer.parseInt(reader.nextLine());		
		
		
		for (int i = 0; i < contactes.size(); i++) {
			if (contactes.get(i).getId()== id) {
				System.out.println("******CONTACTE:***** ");
				contactes.get(i).mostrarInfo();
				System.out.println("***CONTACTE FINALITZAT***");
				System.out.println();
				return contactes.get(i);
			}
		}
		return null;
	}
	
	// Elmiminar contacte
	 public static void eliminarContacte(Contacte contacte) {
		 if (contacte != null) {
			 contactes.remove(contacte);
			 System.out.println("El contacte s'ha borrat");
			 llistarContacte();
		}else{
			System.out.println("el contacte no s'ha pogut borrrar perque no existeix ");
		}
	}	
	
	 
	public	static void main(String[] args) {
				int menu;
				    do {
							System.out.println("1_ Afegir nou contacte");
							System.out.println("2_ LListar el constactes");
							System.out.println("3_ Buscar contacte per cognom");
							System.out.println("4_ Borrar contacte");
							System.out.println("5_ Modificar contecte");
							System.out.println("0_ Eixir");
							System.out.println("Elegis una opcio");
							menu=Integer.parseInt(reader.nextLine());
							
							switch(menu) {
								case 1:
									nouContacte();
									break;
								case 2:
									llistarContacte();
									break;
								case 3:
									buscarCognom();
									break;
								case 4:
									eliminarContacte(buscarId());
									break;
								case 5:
									if (buscarId() == null) {
										System.out.println("No s'ha pogut borrar el contacte, per que no s'ha trobat");
									}else{
									buscarId().modificarcontacte();
									}
									break;
								case 0:
									System.out.println("Adeu");
									break;
								default:
									System.out.println("ERROR");
									break;
							}
						}while (menu!=0);
	}
}
