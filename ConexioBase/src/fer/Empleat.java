package fer;

import java.io.Serializable;
import java.util.Scanner;

public class Empleat  {

	private int id;
	private String nom;
	private int departament;
	private double sou;
	
	static Scanner reader = new Scanner(System.in);
	
	public Empleat ()  {
		
		System.out.println("Introdueix la id");
		this.id = Integer.parseInt(reader.nextLine());
		
		System.out.println("Introdueix el nom");
		this.nom = reader.nextLine();
		
		System.out.println("Introdueix el departament");
		this.departament = Integer.parseInt(reader.nextLine());
		
		System.out.println("Inserta el sou");
		this.sou = Double.parseDouble(reader.nextLine());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDepartament() {
		return departament;
	}

	public void setDepartament(int departament) {
		this.departament = departament;
	}

	public double getSou() {
		return sou;
	}

	public void setSou(double sou) {
		this.sou = sou;
	}

	@Override
	public String toString() {
		return "Empleat [id=" + id + ", nom=" + nom + ", departament="
				+ departament + ", sou=" + sou + "]";
	}
}
