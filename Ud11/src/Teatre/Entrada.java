package Teatre;

import java.util.Scanner;

public abstract class Entrada {
		
	protected static int idTotal = 0;
	protected static Scanner reader = new Scanner (System.in);
	
	 
	  protected int id;
	  protected Zona Zona;
	  protected String nom;
	  
	  
	  public Entrada () {
		  
		  
		  this.id =idTotal +1;
		  this.idTotal = idTotal + 1;
		  
		 System.out.println("Introdueix el nom del espectador");
		 this.nom = reader.nextLine();
		 
		 System.out.println("Identificador numero "+id);
	  }
	  
	  // Fer im metode calcular 
}
