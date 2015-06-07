/*
 * Metges = tindran nº colegiat, nom
 */
package Clinica;

import java.util.Scanner;

public class Metge {

	Scanner teclado = new Scanner(System.in);
	private int numColegiat;
	private String nom;
	private Especialitat [] especialitats = new Especialitat[3]; 
	private int contEspecialitat = 0; 	

	public Metge () {
	
		System.out.println("Inserta un número de colegiat per al metge");
		this.numColegiat =Integer.parseInt(teclado.nextLine());
		
		System.out.println("Inserta un nom per al metge ");
		this.nom =teclado.nextLine();
	}
		
		

	public int getNumColegiat() {
		return numColegiat;
	}



	public void setNumColegiat(int numColegiat) {
		this.numColegiat = numColegiat;
	}







	public String getNom() {
		return nom;
	}







	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	public void agregarEspecialitzacio (Especialitat especialitat) {
		
		if (contEspecialitat < 3) {
			especialitats[contEspecialitat] =  especialitat;
			contEspecialitat = contEspecialitat + 1;
	}
  }
}
