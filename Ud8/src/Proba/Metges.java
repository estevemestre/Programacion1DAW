package Proba;

import java.util.Scanner;

public class Metges {
	private int Ncolegiat;
	private String nom;
	private Especialitats[] especialitat= new Especialitats [3];
	private int comptaEsp=0; 
		
	static Scanner teclat=new Scanner(System.in);
	//constructors
	public Metges(){
		System.out.println("Nom i cognoms:");
		this.nom=teclat.nextLine();
		System.out.println("N�mero de col�legiat: ");
		this.Ncolegiat =Integer.parseInt(teclat.nextLine());
		for (int i = 0; i < especialitat.length; i++) {
			especialitat[i]=null;
		}
	}
	
	//getters i setters
	public int getNcolegiat() {
		return Ncolegiat;
	}

	public void setNcolegiat(int ncolegiat) {
		Ncolegiat = ncolegiat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Especialitats[] getEspecialitat() {
		return especialitat;
	}

	public void setEspecialitat(Especialitats[] especialitat) {
		this.especialitat = especialitat;
	}
	
	//m�tode que busca si l'especialitat ja la t� el metge (retorna true si no est�)
	public boolean buscarEspecialitatMetge(Especialitats esp){
		for (int i = 0; i < comptaEsp; i++) {
			if(esp.getId()==this.especialitat[i].getId()){
				return false;
			}
		}
		return true;
	}
	
	
	//m�tode per a que no es puguen insertar m�s de 3 especialitats al metge i inserta especialitat al metge si no se'n passa de 3.

	public void insertarEspecialitat(Especialitats esp){
		if(comptaEsp<especialitat.length){
			this.especialitat[comptaEsp]=esp;
			comptaEsp++;//comptaEsp++ �s per a que sume 1 cada vegada que executa el m�tode
		}else{
			System.out.println("No es poden afegir m�s especialitats a aquest metge.");	
		}	
		
	}
	
	

}
