package Marian_teatre;
import java.util.Scanner;

public abstract class Entrada {
	static Scanner reader = new Scanner(System.in);
	static int total = 0;
	
	protected int id;
	protected Zona zona;
	protected String comprador;
	
	
	public Entrada(Zona z) {
		this.id = total+1;
		total++;
		this.zona=z;
		System.out.print("Nombre del espectador: ");
		this.comprador=reader.nextLine();
		
	}
	
	public abstract double calcularPrecio();

	
	public String infoEntrada() {
		return "Identificador: " + this.id;
	}
	
	@Override
	public String toString() {
		return "Espectador: " + this.comprador + "\nZona: " + this.zona.getNombre();
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
	
	
}
