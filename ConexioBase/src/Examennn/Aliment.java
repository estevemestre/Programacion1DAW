package Examennn;


import java.io.Serializable;
import java.util.Arrays;

public class Aliment implements Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = -4664194098906808049L;
	private int id;
	private String nom;
	private int kcal;
	private int [] comp = new int [3];
	
	
	
	
	// 		al.add(new Aliment(1,"Lechuga",16,29,34,37));
	
	public Aliment () {
		
	}

	public Aliment(int id, String nom, int kcal, int proteines, int grassa, int hidrats) {
		
		this.id = id;
		this.nom = nom;
		this.kcal = kcal;
		this.comp[0] = proteines;
		this.comp[1] = grassa;
		this.comp[2]= hidrats;
		
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

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int[] getComp() {
		return comp;
	}

	public void setComp(int[] comp) {
		this.comp = comp;
	}

	@Override
	public String toString() {
		return "Aliment [id=" + id + ", nom=" + nom + ", kcal=" + kcal
				+ ", comp=" + Arrays.toString(comp) + "]";
	}




	
}


