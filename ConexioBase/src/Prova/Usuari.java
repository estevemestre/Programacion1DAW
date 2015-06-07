package Prova;

import java.util.Scanner;

public class Usuari {
	private String usuari;
	private String pass;
	private String nom;
	private String cognoms;
	
	private static Scanner teclat=new Scanner(System.in);
	
	public Usuari(){
		System.out.println("Nom d'usuari:");
		this.usuari=teclat.nextLine();
		System.out.println("Contrasenya:");
		this.pass=teclat.nextLine();
		System.out.println("Nom:");
		this.nom=teclat.nextLine();
		System.out.println("Cognoms:");
		this.cognoms=teclat.nextLine();
	}
	
	public Usuari(String usuari, String pass, String nom, String cognoms) {
		super();
		this.usuari = usuari;
		this.pass = pass;
		this.nom = nom;
		this.cognoms = cognoms;
	}



	//getters i setters
	public String getUsuari() {
		return usuari;
	}

	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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
	
}
