package Proba;

import java.util.Scanner;

public class Pacient {
	private String nom;
	private String dni;
	private int tlf;
	private Visita [] visites =new Visita [10];
	private int comptaVisites=0;
	
	
	Scanner teclat=new Scanner(System.in);
	//Constructor
	public Pacient(){
		System.out.println("Nom i cognoms:");
		this.nom=teclat.nextLine();
		System.out.println("DNI: ");
		this.dni=teclat.nextLine();
		System.out.println("Telèfon de contacte:");
		this.tlf=Integer.parseInt(teclat.nextLine());
		for (int i = 0; i < visites.length; i++) {
			visites[i]=null;
		}
		
	}
	
	//getters i setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getTlf() {
		return tlf;
	}
	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	public Visita[] getVisites() {
		return visites;
	}
	public void setVisites(Visita[] visites) {
		this.visites = visites;
	}
		
	
	//mètode per a afegir visita al pacient
	public void insertarVisita(){
		comptaVisites++;
		if(comptaVisites<visites.length){
			visites[comptaVisites-1]=new Visita();
		}else{
			System.out.println("No es poden crear més visites en este pacient.");
		}
	}

}
