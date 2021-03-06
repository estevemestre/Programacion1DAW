package Teatres;

import java.util.Scanner;

public abstract class Entrada {
	
	static Scanner reader = new Scanner (System.in);
	 protected static int idTotal; 
	
	
	protected Zona zona;
	protected int id;
	protected String nombre;


	public Entrada () {
		
		System.out.println("Introduce el nombre del espectador: ");
		this.nombre = reader.nextLine();
		this.id = this.idTotal +1;
		this.idTotal =  this.idTotal +1;
		
		
		System.out.println("La entrada te la id: " + this.id);
		

	}
	
	
	protected static Scanner getReader() {
		return reader;
	}


	protected static void setReader(Scanner reader) {
		Entrada.reader = reader;
	}


	protected static int getIdTotal() {
		return idTotal;
	}


	protected static void setIdTotal(int idTotal) {
		Entrada.idTotal = idTotal;
	}


	protected Zona getZona() {
		return zona;
	}


	protected void setZona(Zona zona) {
		this.zona = zona;
	}


	protected int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract double calcularPrecio ();
}
