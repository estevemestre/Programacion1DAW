/*@uthor Esteve Mestre Company
 * 
 * Alumne tindra un codi que sera variable statica  , nom , edad
 * 
 * 
 */
package Institut;
import java.util.Scanner;

public class Alumne {

	
	private static Scanner teclado = new Scanner(System.in);
	
	private static int codi = 0;
	
	// variables dinstancia
	
	private String nom;
	
	private int edad;
		
	private int idcodi = 0;
	
	
	
//**************************Constructors***
	// SI es estatic no podre cridarlo sobre un objecte si  vuic cridarlo sobre un objecte no tindra que gastar
	// el static 
	

	public Alumne () {
	

		// Preguntar si en una única isntrucio puc utilitzar-ho
		
		
			idcodi = codi + 1;  // Posara un codi per a cada alumne diferent 
			
			
		// Statica	
			codi = codi + 1;  // Sumara tots els alumnes que es creen en esta clase 
			
			
			
			
			System.out.print ("Inserta el nom de l´alumne ");
			
			this.nom = teclado.nextLine();
			
			System.out.println("Inserta els anys que té  l´alumne ");
			edad = Integer.parseInt(teclado.nextLine());
		
	}






	public int getIdcodi() {
		return idcodi;
	}






	public void setIdcodi(int idcodi) {
		this.idcodi = idcodi;
	}






	public static Scanner getTeclado() {
		return teclado;
	}






	public static void setTeclado(Scanner teclado) {
		Alumne.teclado = teclado;
	}






	public static int getCodi() {
		return codi;
	}






	public static void setCodi(int codi) {
		Alumne.codi = codi;
	}






	public String getNom() {
		return nom;
	}






	public void setNom(String nom) {
		this.nom = nom;
	}






	public int getEdad() {
		return edad;
	}






	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
					
		

