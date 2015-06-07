package Proba;

import java.util.Scanner;

public class Visita {
	private Metges metge;
	private String data;
	private String hora;
	
	Scanner teclat=new Scanner(System.in);
	//Constructor
	public Visita(){
		int codiMetge;
		System.out.println("Número de col·legiat del metge: ");
		codiMetge=Integer.parseInt(teclat.nextLine());
		metge=Clinica.buscarMetge(codiMetge); //busca el metge i l'assigna a la visita.
		
		System.out.println("Data de la visita (DD/MM/AAAA):");
		this.data=teclat.nextLine();
		System.out.println("Hora de la visita (HH:MM):");
		this.hora=teclat.nextLine();
	}
	
	//getters i setters
	public Metges getMetge() {
		return metge;
	}
	public void setMetge(Metges metge) {
		this.metge = metge;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	

}
