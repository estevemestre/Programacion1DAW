package MantenimentEmpresa;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Empleat {

	private static Scanner reader=new Scanner(System.in);
	private static int total=0;
	
	//dades de l'empleat
	private int id;
	private String nom;
	private double sou;
	private ArrayList<Fill> fills=new ArrayList<Fill>();
	
	
	/**
	 * Constructor: demana la informació de l'empleat i dels seus fills
	 * 
	 */
	public Empleat() {
		
		String pregunta;
		String resposta= "si";
		int nfills;
		
		System.out.println("Introdueix el id del empleat");
		id = Integer.parseInt(reader.nextLine());
		System.out.println("Introdueix el nom  del empleat");
		nom = reader.nextLine();
		System.out.println("Introdueix el sou del empleat");
		sou = Integer.parseInt(reader.nextLine());
		

		System.out.println("Tens fills? (Si o no)");
		pregunta = reader.nextLine();
		
		 if (pregunta.equalsIgnoreCase(resposta)){
			System.out.println("Cuants fills tens?");
				nfills = Integer.parseInt(reader.nextLine());
				for (int i = 0; i < nfills; i++) {
					fills.add(new Fill());
				}
		 }
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public void setSou(double sou) {
		this.sou = sou;
	}
	
	
	
	

	public double getSou() {
		return sou;
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


	public ArrayList<Fill> getFills() {
		return fills;
	}


	public void setFills(ArrayList<Fill> fills) {
		this.fills = fills;
	}


	/**
	 * Visualitza la informació de l'empleat i dels seus fills
	 */
	
	public void mostrarInfo(){
		System.out.println("Nom de l'empleat es: " + this.nom);
		System.out.println("La id de l'empleat es: "+ this.id);
		System.out.println("El sou de l'empleat es: "+this.sou);
		
		for (int i = 0; i < fills.size(); i++) {
			fills.get(i).mostrarInfo();
		}

	}
	
	public void  modificarSou () {
		double nouSou;
		System.out.println("EL SOU QUE TENIA ANTES DE MODIFICARLO " +sou);
		System.out.println("Introdueix el nou sou");
		nouSou= Double.parseDouble(reader.nextLine());
		sou = nouSou;
		System.out.println("EL SOU QUE TENIA DESPRES DE MODIFICARLO " +sou);
	}
}
