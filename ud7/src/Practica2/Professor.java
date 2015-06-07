/*
 *  3.- Desenvolupar una classe anomenada Professor que:
 *	Tinga un mètode posarNotes() que reba un paràmetre de tipus Alumne i que no retorne res. Posarà una qualificació aleatòria a cada una de les assignatures de l'alumne.
 * 
 */




package Practica2;
import java.util.Scanner;
public class Professor {
	
	Scanner teclado = new Scanner(System.in);

//-----------------------------VARIABLES INSTANCIA-----------------------------------------------
	
		private  String nomComplet;
		
		private String email;
		
		
//----------------------------CONSTRUCTORES-------------------------
		
		
		public Professor () {
			
				System.out.println("Inserta el mom del professor: ");
				this.nomComplet = teclado.nextLine();

				System.out.println("inserta el teu email: ");
				this.email = teclado.nextLine();
			
		}
		
		
		
		public Professor (String nomComplet, String email) {
			
			
			this.nomComplet = nomComplet;
			
			this.email = email;
	
		}
	
//-------------------------GETTERS Y SETTERS-----------------------------------------------
		

		public String getNomComplet() {
			return nomComplet;
		}



		public void setNomComplet(String nomComplet) {
			this.nomComplet = nomComplet;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}

		
		
		
		
		
		
	
		
//------------------------------METODES ------------------------------------------------------------
	
	public void posarNotes(Alumne alumno) {

		alumno.getA().setQualificacio(Math.random()*11);
		System.out.println(	alumno.getA().getQualificacio());
		
		alumno.getB().setQualificacio(Math.random()*11);
		System.out.println(	alumno.getB().getQualificacio());
		
		alumno.getC().setQualificacio(Math.random()*11);
		System.out.println(	alumno.getC().getQualificacio());
	}

	public void insertarNotes(Alumne alumno) {

		double not1;
		double not2;
		double not3;
		
		System.out.println("Alumno " +alumno.getNomCognoms());
		System.out.println("************************");
		System.out.println("Introdueix la nota que vuigues posar en " + alumno.getA().getNom()+" ");
		not1=Double.parseDouble(teclado.nextLine());
		System.out.println("Introdueix la nota que vuigues posar en " + alumno.getB().getNom());
		not2=Double.parseDouble(teclado.nextLine());
		System.out.println("Introdueix la nota que vuigues posar en " + alumno.getC().getNom());
		not3=Double.parseDouble(teclado.nextLine());
		
		
		alumno.getA().setQualificacio(not1);
		alumno.getB().setQualificacio(not2);
		alumno.getC().setQualificacio(not3);
	}


	
}
