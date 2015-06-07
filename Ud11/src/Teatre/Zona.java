package Teatre;

public class Zona {

	private String nom;
	private int numEntrades;
	private double preu;
	private double preuAbonat;
	
	
	
	public Zona(String nom, int numEntrades, double preu, double preuAbonat) {
	
		this.nom = nom;
		this.numEntrades = numEntrades;
		this.preu = preu;
		this.preuAbonat = preuAbonat;
		
	}


	protected String getNom() {
		return nom;
	}


	protected void setNom(String nom) {
		this.nom = nom;
	}


	protected int getNumEntrades() {
		return numEntrades;
	}


	protected void setNumEntrades(int numEntrades) {
		this.numEntrades = numEntrades;
	}


	protected double getPreu() {
		return preu;
	}


	protected void setPreu(double preu) {
		this.preu = preu;
	}


	protected double getPreuAbonat() {
		return preuAbonat;
	}


	protected void setPreuAbonat(double preuAbonat) {
		this.preuAbonat = preuAbonat;
	}
	
	
}
