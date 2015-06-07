package Institut;

import java.util.Scanner;

public class Alumnes {
	private static int codiTotal;   //guardarà el número de alumnes totals del centre
	private int codi; //guarda el codi de l'alumne sinó tots tindrien el mateix.
	private String nom;
	private int edat;
	
	static Scanner teclat=new Scanner (System.in);
	//constructor
	public Alumnes(){
		System.out.println("Nom i cognoms:");
		this.nom=teclat.nextLine();
		System.out.println("Edat:");
		this.edat=Integer.parseInt(teclat.nextLine());
		this.codi=codiTotal+1;
		codiTotal=codiTotal+1; // sumem 1 alumne més cada vegada que en creem un nou.
	}
	
	//getters i setters
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

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public static int getCodiTotal() {
		return codiTotal;
	}

	public static void setCodiTotal(int codiTotal) {
		Alumnes.codiTotal = codiTotal;
	}
	
	//verificar que el codi d'alumne que busca, existeix.
	public static int verificarCodiAlumne(int id){
		if(id<=Alumnes.getCodiTotal()){//es fa en la variable codi total perque els codis son automàtics i correlatius. Si es posen manuals no seria aixina, hauríem de recòrrer l'array.
			return id;
		}
		System.out.println("Codi d'alumne invàlid.\n Inserta un codi d'alumne vàlid:");
			id=Integer.parseInt(teclat.nextLine());
			return verificarCodiAlumne(id);
	}

	//mètode que verifica que no tenim  més de 10 alumnes en el curs.
	public static boolean verificaNAlumnes(int num){
		if(num<=10){
			return true;
		}
		System.out.println("Has sobrepassat el número d'alumnes permesos en un grup.\n"
				+ "Indica el número d'alumnes del grup(màx. 10):");
		num=Integer.parseInt(teclat.nextLine());
		return verificaNAlumnes(num);
	}
}
