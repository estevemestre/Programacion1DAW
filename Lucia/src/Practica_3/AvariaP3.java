package Practica_3;

public class AvariaP3 {
	private int id;
	private String nom;
	private double preu;
	
	//Constructors
	public AvariaP3(){
		
	}
	
	public AvariaP3(int id, String nom, double preu){
		this.id=id;
		this.nom=nom;
		this.preu=preu;
	}
	
	
	//getters i setters
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

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

}
