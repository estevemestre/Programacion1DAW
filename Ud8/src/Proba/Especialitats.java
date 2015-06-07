package Proba;

import java.util.Scanner;

public class Especialitats {
	private static int codi; //variable global compta les especialitats
	private int id;
	private String nom;
	
	
	static Scanner teclat=new Scanner(System.in);
	
	//Constructor
	public Especialitats(){
		System.out.println("Nom de l'especialitat:");
		this.nom=teclat.nextLine();
		id=codi+1;
		codi++;
	}
	
	//getters i setters
	public static int getCodi() {
		return codi;
	}
	public static void setCodi(int codi) {
		Especialitats.codi = codi;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
	

}
