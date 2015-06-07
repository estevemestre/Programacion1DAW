package ActivitatExamen;
import java.util.Scanner;
public class Alumne {

	private String nom;
	private char examenFinal;
	private char avalContinua;
	private String notaFinal;
	
	

	public Alumne() {
		Scanner reader=new Scanner(System.in);
		String nom;
		char examen;
		char continua;
		
		System.out.println("Nou alumne");
		System.out.println("==========");
		System.out.print("Inserta nom: ");
		nom=reader.nextLine();
		//do {
		//	System.out.println("La nota ha de ser: A, B, C, D, N");
		System.out.print("Nota EF: ");
		examen=reader.nextLine().charAt(0);
		//}while (examen!='A' && examen!='B' && ...);
		
		//do {
		System.out.print("Nota AC: ");
		continua=reader.nextLine().charAt(0);
		//}while (continua!='A' && continua!='B'...);
		
		this.nom=nom;
		this.examenFinal=examen;
		this.avalContinua=continua;
		
		this.calcularNota();
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getExamenFinal() {
		return examenFinal;
	}

	public void setExamenFinal(char examenFinal) {
		this.examenFinal = examenFinal;
	}

	public char getAvalContinua() {
		return avalContinua;
	}

	public void setAvalContinua(char avalContinua) {
		this.avalContinua = avalContinua;
	}

	public String getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public void calcularNota(){
		
		if (this.examenFinal=='A'){
			this.notaFinal="Excel·lent";
			
		} else if (this.examenFinal=='D') {
			this.notaFinal="Suspes";
			
		} else if (this.examenFinal=='N') {
			this.notaFinal="No presentat";
			
		} else if (this.examenFinal=='C' && this.avalContinua!='A'){
			this.notaFinal="Aprovat";
			
		} else if (this.examenFinal=='B' && this.avalContinua=='A') {
			this.notaFinal="Excel·lent";
		
		} else {
			this.notaFinal="Notable";
		}
		
		
	}
	
	public void mostrarInfo(){
		System.out.println("Alumne: " + this.nom);
		System.out.println("Qualificació examen final: " + this.examenFinal);
		System.out.println("Qualificació avaluació continua: " + this.avalContinua);
		System.out.println("Qualificació final: " + this.notaFinal);
	}
	
	
	
	
}
