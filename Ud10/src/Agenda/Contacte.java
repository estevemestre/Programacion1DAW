//  * Afegir un contacte = id automática . nom, cognoms , telefon, email
package Agenda;

import java.util.Scanner;






public class Contacte {

	private static int idTotal = 0;
	private int id;
	private String nom;
	private String cognoms;
	private int telefon;
	private String email;

	static Scanner reader = new Scanner (System.in);

	public Contacte () {
		id = idTotal;
		idTotal = idTotal + 1;
		System.out.println("Inserta el nom que vols guardar en la agenda: ");
		nom =  reader.nextLine();
		System.out.println("Inserta el cognoms que vols guardar: ");
		cognoms = reader.nextLine();
		System.out.println("Inserta el teléfon que vols introduir: ");
		telefon = Integer.parseInt(reader.nextLine());
		System.out.println("Inserta un email: ");
	    email = reader.nextLine();
	}
	public static int getIdTotal() {
		return idTotal;
	}
	public static void setIdTotal(int idTotal) {
		Contacte.idTotal = idTotal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void mostrarInfo() {
		System.out.println("La id es " +id);
		System.out.println("El nom es " +nom);
		System.out.println("Els cognoms son " +cognoms);
		System.out.println("El telefon és " +telefon);
		System.out.println("El email es" +email);
		}
	
	public void modificarcontacte() {
		System.out.println("La id es " +id+ "Quina nova id vols posar-li?");
		id = Integer.parseInt(reader.nextLine());
		System.out.println("El nom es " +nom+ " Quin nou nom vols posar-li? ");
		nom = reader.nextLine();
		System.out.println("Els cognoms son " +cognoms+ " Quins nous cognoms vols posar-li?");
		cognoms= reader.nextLine();
		System.out.println("El telefon és " +telefon+ " Quin telefon vols cambiar-li?");
		telefon = Integer.parseInt(reader.nextLine());
		System.out.println("El email es" +email+ " Quin nou email vols posar-li?");
		email = reader.nextLine();
	}
}
