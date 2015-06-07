package Teatre;

public class Zona {

	private String nom;
	private int numLocalitats;
	private double preuNormal;
	private double preuAbonat;
	private double recaudacioTotal;
	
	
	
	public Zona (String nom, int localitats, double preuNormal, double preuAbonats) {
		this.nom = nom;
		this.numLocalitats = localitats;
		this.preuNormal = preuNormal;
		this.preuAbonat = preuAbonats;
	}

	
	public void comprovarNumLocalitats () {
		
		if (1 <= numLocalitats) {
	
			System.out.println("i que queden entrades ");
			this.numLocalitats = numLocalitats - 1;
		}else {
			System.out.println("No queden entrades");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumLocalitats() {
		return numLocalitats;
	}
	public void setNumLocalitats(int numLocalitats) {
		this.numLocalitats = numLocalitats;
	}
	public double getPreuNormal() {
		return preuNormal;
	}
	public void setPreuNormal(double preuNormal) {
		this.preuNormal = preuNormal;
	}
	public double getPreuAbonat() {
		return preuAbonat;
	}
	public void setPreuAbonat(double preuAbonat) {
		this.preuAbonat = preuAbonat;
	}
	
}