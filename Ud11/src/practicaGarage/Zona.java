package practicaGarage;

import java.util.Scanner;

public abstract class Zona {

	static int total =0;
	static double preuHora = 30.0;
	static Scanner lector = new Scanner(System.in);
	
	
	protected int id;
	protected String descripcio;
	protected double NumHores = 0;
	protected boolean finalitzat =false;
	protected String fecha;
	
	
	public Zona () {
		
		
		this.id = this.total + 1;
		this.total = this.total + 1;
		
		System.out.println(finalitzat);
		
		System.out.println("Introdueix una Descripcio");
		this.descripcio = lector.nextLine();
		
		System.out.println("El teu treball té el indetificador" +id);
		
		
		System.out.println("Inserta el termini al cual estara finalitzat");
		fecha = lector.nextLine();
		
		
		//this.NumHores = NumHores;
		//this.finalitzat = finalitzat;
		
		
	}

	
	
	
	protected String getFecha() {
		return fecha;
	}




	protected void setFecha(String fecha) {
		this.fecha = fecha;
	}




	public static int getTotal() {
		return total;
	}




	public static void setTotal(int total) {
		Treball.total = total;
	}




	public static double getPreuHora() {
		return preuHora;
	}




	public static void setPreuHora(int preuHora) {
		Treball.preuHora = preuHora;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getDescripcio() {
		return descripcio;
	}




	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}




	public double getNumHores() {
		return NumHores;
	}




	public void setNumHores(double numHores) {
		NumHores = numHores;
	}




	public boolean getFinalitzat() {
		if(finalitzat) {
			System.out.println("No puc modificar el treball perque ja esta finalitzat");
			return finalitzat;
		}else {
			System.out.println("Perfecte el treball  no esta finalitzat");
			return finalitzat;
		}
	}




	public void setFinalitzat(boolean finalitzat) {
		this.finalitzat = finalitzat;
	}




	public abstract double calcularCost ();
	
	
}
