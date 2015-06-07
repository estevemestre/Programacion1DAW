package Practica_2;

import java.util.Scanner;

public class AssignaturaP2 {
	private int id;
	private double qualificacio;
	private String nom;
	
	Scanner teclat=new Scanner(System.in);
	
	public AssignaturaP2(){		//demanarà les dades a l'usuari
		String nom;
		int id;
		
		System.out.println("Inserta el nom de l'assignatura: ");
		nom=teclat.nextLine();
		System.out.println("Inserta el seu codi: (>100)");
		id=Integer.parseInt(teclat.nextLine());
		if(comprovarId(id)== true){
			this.id=id;
			this.nom=nom;
			this.qualificacio=100;
		}else{
			System.out.println("ERROR. No s'ha creat l'objecte.\n");
		}
	}
	
	public AssignaturaP2(int id, String nom, double qualificacio){
		if(comprovarId(id)== true && comprovarQualificacio(qualificacio)==true){
			this.id=id;
			this.nom=nom;
			this.qualificacio=qualificacio;
		}else{
			System.out.println("ERROR. No s'ha creat l'objecte.\n");
		}	
	}
	
	public AssignaturaP2(int id, String nom){
		if(comprovarId(id)== true){
			this.id=id;
			this.nom=nom;
		}else{
			System.out.println("ERROR. No s'ha creat l'objecte.\n");
		}
	}
		
	public AssignaturaP2(int id){
		if(comprovarId(id)== true){
			this.id=id;	
		}else{
			System.out.println("ERROR. No s'ha creat l'objecte.\n");
		}	
	}

	
	//getters i setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(comprovarId(id)== true){
			this.id=id;
		}else{
			System.out.println("ERROR. No s'ha creat l'objecte.\n");
		}
	}
	public double getQualificacio() {
		return qualificacio;
	}
	public void setQualificacio(double qualificacio) {
		if(comprovarQualificacio(qualificacio)== true){
			this.qualificacio = qualificacio;
		}else{
			System.out.println("ERROR. No s'ha creat l'objecte.\n"+qualificacio);
		}	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Mètodo que valida el Id
	public boolean comprovarId(int id){
	 if(id<100){
			System.out.println("Identifier must be greater than 100.");
			return false;
		}
		return true;
	}
	
	//Mètode que valida la qualifiació
	public boolean comprovarQualificacio(double nota){
		 if(nota<0){
				System.out.println("Qualification must be positive.");
				return false;
			}
			return true;
		}
	
	
}

