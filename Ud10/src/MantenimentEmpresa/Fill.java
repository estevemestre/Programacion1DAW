package MantenimentEmpresa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Fill {

	private static Scanner reader=new Scanner(System.in);
	private static int total=0;
	
	//dades de fill
	private int id;
	private String nom;
	private int anyNaixement;
	
	
	
	
	/**
	 * Constructor: demana la informació del fill a l'usuari
	 */
	public Fill() {
		System.out.println("Introdueix la id del fill");
		id = Integer.parseInt(reader.nextLine());
		System.out.println("Introdueix el nom del fill ");
		nom = reader.nextLine();
		System.out.println("Any de naiximent");
		anyNaixement = Integer.parseInt(reader.nextLine());
	}
	
	
	
	
	/**
	 * Visualitza la informació del fill
	 */
	public void mostrarInfo(){
		System.out.println("Introdueix la id del fill");
		id = Integer.parseInt(reader.nextLine());
		System.out.println("Introdueix el nom del fill ");
		nom = reader.nextLine();
		System.out.println("Any de naiximent");
		anyNaixement = Integer.parseInt(reader.nextLine());
	}




	public static int getTotal() {
		return total;
	}




	public static void setTotal(int total) {
		Fill.total = total;
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




	public int getAnyNaixement() {
		return anyNaixement;
	}




	public void setAnyNaixement(int anyNaixement) {
		this.anyNaixement = anyNaixement;
	}
	
	
	
	
}