package Actividad2;

public class Clase {

	private String nom;
	private int codi;
	private int curs;
	
	//Constructor sense parametres
	 /*public Clase(){//Creant un constructor
		 this.nom="Programacio";
		 this.codi=12345;
		 this.curs=1;
		 }*/
	 
	 //Constructor amb parametres
	 public Clase(String nom, int codi, int curs){//Creant un constructor
		 if (curs == 1  || curs ==2 || curs == 3){
			 this.nom=nom;
			 this.codi=codi;
			 this.curs=curs;
		 }else{ 
			 System.out.println("No es pot crear la Assignatura");
		 	}
	 }
	 
	 //getters
	 public String getNom(){
		 return nom;
	 }
	 
	 public int getCodi(){
		 return codi;
	 }
	 
	 public int getCurs(){
		 return curs;
	 }
	 
	 //setters no retornen res
	 public void setNom(String nom){
			this.nom=nom;
		}
	 public void setCodi(int codi){
			this.codi=codi;
		}
	 
	 public void setCurs(int curs){
			this.curs=curs;
		}
}
