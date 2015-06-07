//Grup Tindra id del grup  , nom , array Alumnes (Máxim 10) //cada grup

package Institut;

import java.util.Scanner;
public class Grup {
	// Les variables de clase son les staticques que tenen un inic valor per a tota la clase
    private static Scanner lector = new Scanner (System.in);
	private static int idGrup = 0;
	
	// Variables instancia tindran un valor diferent per acada objecte
	
	private String nomGrup;
	private int numAlumnes;
	private Alumne[] arrayAlumnes; // Declare el array
	private int codi = 0;
	
	public Grup () {
	
// Puc utilitzar una unica instruccio ? 		
		
	// Dinámica	
	codi = idGrup + 1;    // Asignar un codi als grups 
	
	// Statica 
	idGrup = idGrup + 1;    //Sumem un grup mes per a cada grup 

	
	
	 System.out.println("Introduix un nom per al grup de alumnes que vols crear: ");
	 this.nomGrup = lector.next();
	 
	do {  // Per a que introduisca menos de 10
	 
	 System.out.println("Introduix  el número de alumnes que vols que tinga el grup, Introduir menos de 11 alumnes: ");
	 this.numAlumnes = Integer.parseInt(lector.next());
		
	} while(this.numAlumnes >= 10);
	
	System.out.println("Vaig a entrar en el array");

			this.arrayAlumnes = new Alumne [numAlumnes]; // Cree el array en les posicions dels Alumnes
	
				
			for (int i = 0; i < this.numAlumnes; i++) {
					
					System.out.println("Estic dins del array");
					this.arrayAlumnes[i] = new Alumne();
					
				}
	 			
	 			
	}
	
// *****************Metodos****************
	


	public static Scanner getLector() {
		return lector;
	}

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public static void setLector(Scanner lector) {
		Grup.lector = lector;
	}

	public static int getIdGrup() {
		return idGrup;
	}

	public static void setIdGrup(int idGrup) {
		Grup.idGrup = idGrup;
	}

	public String getNomGrup() {
		return nomGrup;
	}

	public void setNomGrup(String nomGrup) {
		this.nomGrup = nomGrup;
	}

	public int getNumAlumnes() {
		return numAlumnes;
	}

	public void setNumAlumnes(int numAlumnes) {
		this.numAlumnes = numAlumnes;
	}

	public Alumne[] getArrayAlumnes() {
		return arrayAlumnes;
	}

	public void setArrayAlumnes(Alumne[] arrayAlumnes) {
		this.arrayAlumnes = arrayAlumnes;
	}
	
	
	
	//*******************METODOS *********************************	

// Este metodo es static i deuria ser dinámic
	
	public static void majorEdad (Grup grup) {   // El grup que li passare  sera el del método del main BuscarGrup
		
		//public static void majorEdad () {
		 int major = 0;
		 int guarposicio = 0;
		
		 for (int i = 0; i <grup.getArrayAlumnes().length; i++) {
			
			if (arrayAlumnes[i].getEdad() > major) {
				
				major = arrayAlumnes[i].getEdad();
				
				guarposicio = i;
			} 
		}
		System.out.println("El nom del alumne major de edad: "+grup.getArrayAlumnes()[guarposicio].getNom());
	}	
	
	
	// Preguntar
		public  void  buscarCodi() {  
		
			int codi;
			
			System.out.println("Introduix el codi que vols buscar: ");
			codi = Integer.parseInt(lector.nextLine());
			
			for (int i = 0; i < this.arrayAlumnes.length; i++) {	
				if (getArrayAlumnes()[i].getIdcodi() == codi) {
					System.out.println("El nom del alumne es "+getArrayAlumnes()[i].getIdcodi());
				}
			}

			
		}


}



