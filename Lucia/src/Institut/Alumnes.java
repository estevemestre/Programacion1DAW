package Institut;

import java.util.Scanner;

public class Alumnes {
	private static int codiTotal;   //guardar� el n�mero de alumnes totals del centre
	private int codi; //guarda el codi de l'alumne sin� tots tindrien el mateix.
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
		codiTotal=codiTotal+1; // sumem 1 alumne m�s cada vegada que en creem un nou.
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
		if(id<=Alumnes.getCodiTotal()){//es fa en la variable codi total perque els codis son autom�tics i correlatius. Si es posen manuals no seria aixina, haur�em de rec�rrer l'array.
			return id;
		}
		System.out.println("Codi d'alumne inv�lid.\n Inserta un codi d'alumne v�lid:");
			id=Integer.parseInt(teclat.nextLine());
			return verificarCodiAlumne(id);
	}

	//m�tode que verifica que no tenim  m�s de 10 alumnes en el curs.
	public static boolean verificaNAlumnes(int num){
		if(num<=10){
			return true;
		}
		System.out.println("Has sobrepassat el n�mero d'alumnes permesos en un grup.\n"
				+ "Indica el n�mero d'alumnes del grup(m�x. 10):");
		num=Integer.parseInt(teclat.nextLine());
		return verificaNAlumnes(num);
	}
}
