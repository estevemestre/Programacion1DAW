package Examennn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Dietes implements Serializable{
	
	protected static Scanner reader = new Scanner(System.in);
	protected int identificador;
	protected String nomPersona;
	protected  ArrayList<Aliment> aliments = new ArrayList<Aliment>();
	
	
	
	
	
	public Dietes () {
		this.aliments = aliments;
		
		System.out.println("Inserta el identificador de la dieta");
		this.identificador = Integer.parseInt(reader.nextLine());
		
		System.out.println("Inserta el nom de la persona ");
		this.nomPersona = reader.nextLine();
		
		
		
		
		
	}





	public int getIdentificador() {
		return identificador;
	}





	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}





	public String getNomPersona() {
		return nomPersona;
	}





	public void setNomPersona(String nomPersona) {
		this.nomPersona = nomPersona;
	}





	public ArrayList<Aliment> getAliments() {
		return aliments;
	}





	public void setAliments(ArrayList<Aliment> aliments) {
		this.aliments = aliments;
	}





	@Override
	public String toString() {
		return "Dietes [identificador=" + identificador + ", nomPersona="
				+ nomPersona + ", aliments=" + aliments + "]";
	}
	
	
	// Metode per afegir aliments
	public  void afegirAliments (Aliment aliment) {
		
		 this.aliments.add(aliment);
	}
	
	
	

	
}
