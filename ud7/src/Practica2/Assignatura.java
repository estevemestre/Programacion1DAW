/*
 *   Desenvolupar una classe anomenada Assignatura que:
 *	Tinga dos atributs. Un de tipus int (l'identificador) l'altre de tipus double (la qualificaci�).
 *	Tinga getters i setters per a les variables d'inst�ncia.
 *
 */
package Practica2;
import java.util.Scanner;
public class Assignatura {
	
//-----------Static	

	private static Scanner teclado = new Scanner(System.in);
	
	
	
// --------------------Variables de instancia ---------------------------------	

	private int identificador;
	private double qualificacio;
	private String nom;

	
//------------------------ Constructores---------------------------------------
	
		
	public Assignatura () {

		String nomAssig1;
		int codAssig1;
		
	do{

	System.out.println("Escriu el codi  assignatura");
	codAssig1 = Integer.parseInt(teclado.nextLine());
	
	System.out.println("Escriu el nom  assignatura");
	nomAssig1=teclado.nextLine();
		
	this.identificador = codAssig1;
	this.nom = nomAssig1;
	
		if (codAssig1 < 100) {
			System.out.println("Identifier must be greater than 100.�");
		}
	 
		}while(codAssig1 < 100);
	}
	
	
	public Assignatura (int identificador, String nom) {
		
		this.identificador = identificador;
		this.nom=nom;
		
	}
	

	
	
	
	
	
	
	public Assignatura (int identificador){
		
				this.identificador = identificador;
			}
	
		
		
	
	
		public Assignatura (double qualificacio) {
				
			if (qualificacio >= 0) {
				this.qualificacio = qualificacio;
			}else{
				System.out.println("Qualification must be positive.");
			}
				
	}
	
		public Assignatura (String nom) {
			
			this.nom = nom;
		}
		
		
		public Assignatura (int indentificador,  double qualificacio, String nom) {
			
		
				this.identificador = indentificador;
	
			
			if (qualificacio >= 0) {
				this.qualificacio = qualificacio;
			}else{
				System.out.println("Qualification must be positive.");
			}
			
			this.nom = nom;
			
		
		}
		
		public Assignatura (String nom, int identificador){
			
			this.nom = nom;
			this.identificador = identificador;
			
	}
	
	
//---------------------------------------------------------------------------------
		
//----------------Metodos setters i getters ------------------------------		
	
	
	public int getIndentificador() {
		
		return identificador;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setIndentificador(int indentificador) {
		
		this.identificador = indentificador;
	}
	
	public double getQualificacio() {
		return qualificacio;
	}
	
	
	public void setQualificacio(double qualificacio) {
	
		this.qualificacio = qualificacio;
	}
	
//---------------------------------------------------------
}