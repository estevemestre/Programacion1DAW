package Practica_2;

import java.util.Scanner;

import java.util.Scanner;

public class ProfessorP2{
	private String nom;
	private String email;
	
	Scanner teclat=new Scanner(System.in);
	
	public ProfessorP2() {		//demana les dades a l'usuari	
		System.out.println("Inserta el nom complet del professor: ");
		this.nom=teclat.nextLine();
		System.out.println("Inserta l'e-mail del professor: ");
		this.email=teclat.nextLine();		
	}
	
	public ProfessorP2(String Nom, String email){
		this.nom=nom;
		this.email=email;	
	}
	
	//getters i setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Mètode per posar notes aleatòries a les assignatures d'un alumne
	public void posarNotes(AlumneP2 al1){
		 //d'alumne 1 entre a la seua assig1 i dis d'aquesta li canvie mitjançant el set, la qualificació.
		al1.getAssig1().setQualificacio(Math.random()*10+1);
		al1.getAssig2().setQualificacio(Math.random()*10+1);
		al1.getAssig3().setQualificacio(Math.random()*10+1);
		//vull que les qualificacions siguen aleatòries.
	}
	
	public void insertarNotes(AlumneP2 al1){
		
		double nota1;
		double nota2;
		double nota3;
				
		//Demanem dades
		System.out.println("Alumne "+al1.getNomCognoms());
		System.out.println("************************");
		System.out.println("Nota "+al1.getAssig1().getNom()+" :");
		nota1=Double.parseDouble(teclat.nextLine());
		System.out.println("Nota "+al1.getAssig2().getNom()+" :");
		nota2=Double.parseDouble(teclat.nextLine());
		System.out.println("Nota "+al1.getAssig3().getNom()+" :");
		nota3=Double.parseDouble(teclat.nextLine());
		
		 //d'alumne 1 entre a la seua assig1 i dins d'aquesta li canvie mitjançant el set, la qualificació.
		al1.getAssig1().setQualificacio(nota1);
		al1.getAssig2().setQualificacio(nota2);
		al1.getAssig3().setQualificacio(nota3);
		
	}

}


