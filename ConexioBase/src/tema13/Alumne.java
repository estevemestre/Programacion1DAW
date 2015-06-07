package tema13;

import java.util.Scanner;

public class Alumne {

	static Scanner reader = new Scanner(System.in);
	private String nom;
	
	
	public Alumne () {
	
		System.out.println("Inserta el nom del alumne");
		nom = reader.nextLine();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
