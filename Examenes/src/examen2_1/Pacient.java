package examen2_1;

import java.util.Scanner;

public class Pacient {
	private static Scanner teclado = new Scanner (System.in);
	private static int IndenTotal = 1;
	
	private int idPacient = 1;
	private int edad;
	private String sexe = "h";
	private int alçada;
	private int pes;
	
	
	public Pacient () {
		
		IndenTotal = IndenTotal +1;
		idPacient = IndenTotal +1;
		
		System.out.println("Introduix edad");
		this.edad = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduix Sexe (h/m)");
		this.sexe = teclado.nextLine();
		
		System.out.println("Introduix alçada");
		this.alçada = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduix pes");
		this.pes = Integer.parseInt(teclado.nextLine());
		
	}


	public static Scanner getTeclado() {
		return teclado;
	}


	public static void setTeclado(Scanner teclado) {
		Pacient.teclado = teclado;
	}


	public static int getIndenTotal() {
		return IndenTotal;
	}


	public static void setIndenTotal(int indenTotal) {
		IndenTotal = indenTotal;
	}


	public int getIdPacient() {
		return idPacient;
	}


	public void setIdPacient(int idPacient) {
		this.idPacient = idPacient;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public int getAlçada() {
		return alçada;
	}


	public void setAlçada(int alçada) {
		this.alçada = alçada;
	}


	public int getPes() {
		return pes;
	}


	public void setPes(int pes) {
		this.pes = pes;
	}
	
	
	
	
	
}
