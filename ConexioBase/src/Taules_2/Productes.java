package Taules_2;

import java.util.Scanner;

public class Productes {

	
	static Scanner reader = new Scanner (System.in);
	// Variable de instancia seccio 
	private String codi;
	private String nom;
	private String descripcio;
	private double preu_unitari;
	private String seccio;
	

	public Productes (int cod, String sec) {
		
		if (cod >= 10) {
			this.codi = "p" + cod;
		}else{
			this.codi = "p0" + cod;	
		}
		
		System.out.println("inserta un nom del producte");
		this.nom = reader.nextLine();
			
		System.out.println("Inserta una descripcio del producte");
		this.descripcio = reader.nextLine();
		
		System.out.println("Inserta el preu del producte");	
		this.preu_unitari = Double.parseDouble(reader.nextLine());
		
		this.seccio = sec;
		
	}


	public String getCodi() {
		return codi;
	}


	public void setCodi(String codi) {
		this.codi = codi;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescripcio() {
		return descripcio;
	}


	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}


	public double getPreu_unitari() {
		return preu_unitari;
	}


	public void setPreu_unitari(double preu_unitari) {
		this.preu_unitari = preu_unitari;
	}


	public String getSeccio() {
		return seccio;
	}


	public void setSeccio(String seccio) {
		this.seccio = seccio;
	}
	
	
	
}