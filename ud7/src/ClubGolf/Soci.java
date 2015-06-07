package ClubGolf;
import java.util.Scanner;
public class Soci {
	// variable statica 

	private static double quotaBase = 500.0;
	private String nom;
	private int edat;
	private boolean paresSocis;
	private double quota;

	
			// Contructor sense parametres 
	
	public Soci() {
		Scanner reader = new Scanner(System.in);
		
		String name;
		int age;
		String answer="";
		
		
		System.out.print("Inserta nom: ");
		name=reader.nextLine();
		
		System.out.print("Inserta edat: ");
		age=Integer.parseInt(reader.nextLine());
		
		if (age<18) {
			System.out.print("Els teus pares són socis?(Si/No): ");
			answer=reader.nextLine();
		}
		
		this.nom=name;
		this.edat=age;
		
		
		if (answer.equalsIgnoreCase("Si")) {
			this.paresSocis=true;
		}
		
		this.quota=this.calcularQuota();
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public boolean isParesSocis() {
		return paresSocis;
	}

	public void setParesSocis(boolean paresSocis) {
		this.paresSocis = paresSocis;
	}
	
	
	public double calcularQuota(){
		
		double quota;
		
		if (this.edat>65) {
			quota=quotaBase - quotaBase*0.50;
		} else if (this.edat<18) {
			
			if (this.paresSocis == true){
				quota=quotaBase - quotaBase*0.35;
			} else {
				quota=quotaBase - quotaBase*0.25;
			}
			
		} else {
			quota=quotaBase;
		}
		return quota;
	}

	
	public void mostrarInfo(){
		System.out.println(this.nom);
		System.out.println(this.edat);
		System.out.println(this.paresSocis);
		System.out.println(this.quota);
	}
	
}
