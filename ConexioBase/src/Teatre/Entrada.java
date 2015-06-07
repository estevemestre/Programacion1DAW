package Teatre;

import java.util.Scanner;

public  class Entrada {

	protected static Scanner reader = new Scanner(System.in);
	protected static int idTotal; 

	
	protected int id;
	protected Zona zona;
	protected String nombre;
	protected double preuEntrada;
	
	

	
	
	public Entrada (Zona zona) {
		
		this.id = idTotal + 1;
		this.idTotal = idTotal +1;
		
		System.out.println("Introdueix el nom del espectador");
		this.nombre = reader.nextLine();
		this.zona = zona;
	
	}
	

	//public abstract void calcularPreu();


	public static Scanner getReader() {
		return reader;
	}


	public static void setReader(Scanner reader) {
		Entrada.reader = reader;
	}


	public static int getIdTotal() {
		return idTotal;
	}


	public static void setIdTotal(int idTotal) {
		Entrada.idTotal = idTotal;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Zona getZona() {
		return zona;
	}


	public void setZona(Zona zona) {
		this.zona = zona;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPreuEntrada() {
		return preuEntrada;
	}


	public void setPreuEntrada(double preuEntrada) {
		this.preuEntrada = preuEntrada;
	}
	
	
	
	
}
