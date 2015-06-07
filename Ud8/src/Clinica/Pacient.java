//Pacient = DNI, nom, telefon, visites(data,hora) maxim 10
	
package Clinica;

import java.util.Scanner;

	public class Pacient {
		private static Scanner teclado = new Scanner (System.in);

		
		private String nom;
		private int dni;
		private int telefon;
		private Visita [] visites = new Visita [10];	
		private int numVisita = 0;
	
		
		public Pacient () {
		
		System.out.println("Introdueix el teu nom");
		nom= teclado.nextLine();
		System.out.println("Introdueix el Dni");
		dni = Integer.parseInt(teclado.nextLine());
		System.out.println("Introdueix el teu telefon");
		telefon = Integer.parseInt(teclado.nextLine());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	public Scanner getTeclado() {
		return teclado;
	}

	public void setTeclado(Scanner teclado) {
		this.teclado = teclado;
	}


	public Visita[] getVisites() {
		return visites;
	}

	public void setVisites(Visita[] visites) {
		this.visites = visites;
	}

	
	
	
	
	public  void agregarVisita (Metge metge) {
		
		 if (numVisita < 10) {
		 visites[numVisita] = new Visita(metge);
		 numVisita++;
		 }	
	 }
	
	
	public void mostrarInfo() {
		System.out.println(this.dni);
	}
}