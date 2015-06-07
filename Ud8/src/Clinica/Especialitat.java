/*
 * Especialitats = (Máxim 3 ) codi(1,2,3,4,5) nom // Objecte tipo Array Especialitat
 * 
 */
package Clinica;

import java.util.Scanner;

public class Especialitat {
	private static int codiTotal =1;
	private  int codi;
	private String nom;
	Scanner teclado = new Scanner (System.in);
	
	public Especialitat () {
		codiTotal = codiTotal +1;
		codi = codiTotal +1;
		System.out.println("Inserta el nom de la especialitzacio que vuigues: ");
		nom = teclado.nextLine();
	}

	public static int getCodiTotal() {
		return codiTotal;
	}

	public static void setCodiTotal(int codiTotal) {
		Especialitat.codiTotal = codiTotal;
	}

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Scanner getTeclado() {
		return teclado;
	}

	public void setTeclado(Scanner teclado) {
		this.teclado = teclado;
	}

	
	public void mostrarEspecialitat() {
		System.out.println("El codi i nom de la especialitzacio son :");
		System.out.println(this.codi +"\t" +this.nom);
	}
	
}