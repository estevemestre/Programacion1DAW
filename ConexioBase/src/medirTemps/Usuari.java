package medirTemps;

import java.util.Scanner;

public class Usuari {

	
	
	private static Scanner reader = new Scanner (System.in);

	
	private String nom_usuari;
	private String contrassenya;
	private String nom;
	private String cognoms;


	
	public Usuari (String nom_usuari, String contrassenya, String nom, String cognoms) {
		
		this.nom_usuari = nom_usuari;
		
		this.contrassenya = contrassenya;
		
		this.nom = nom;
		
		this.cognoms = cognoms;
	}



	public String getNom_usuari() {
		return nom_usuari;
	}



	public void setNom_usuari(String nom_usuari) {
		this.nom_usuari = nom_usuari;
	}



	public String getContrassenya() {
		return contrassenya;
	}



	public void setContrassenya(String contrassenya) {
		this.contrassenya = contrassenya;
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
