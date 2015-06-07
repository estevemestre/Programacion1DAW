/*
 *	2.- Desenvolupar una classe anomenada Alumne que:
 *	Tinga tres atributs de tipus Assignatura.
 *	Tinga un constructor amb tres paràmetres de tipus Assignatura que inicialitze els tres atributs.
 *	Tinga un constructor amb tres paràmetres de tipus int que inicialitze les tres variables d'instància.
 *	Tinga un getter i un setter per a cada atribut.
 *	Tinga un mètode calcularMitjana() que reba un paràmetre de tipus Alumne i retorne un double.
 */

package Practica2;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Alumne {

private static Scanner teclado = new Scanner(System.in);
//-------------------------Variables de instancia -------------------------------------

	
	private Assignatura a;
	
	private Assignatura b;
	
	private Assignatura c;
	
	private String nomCognoms;
	
	private String email;
	
	GregorianCalendar dataNaiximent;
	
	
	private int anysTe;
					
	
//-------------------------Contructores ---------------------------------------
					
	public Alumne () {
		

			int any;
			int mes;
			int dia;
			
			
			System.out.println("Inserta el teu nom i cognom");
			this.nomCognoms=teclado.nextLine();
			
			System.out.println("Inserta el teu email");
			this.email=teclado.nextLine();
			
			System.out.println("Inserta el teu any de naiximent");
			any = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Inserta el teu mes de naiximent");
			mes = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Inserta el teu dia de naiximent");
			dia = Integer.parseInt(teclado.nextLine());
			
			this.dataNaiximent = new GregorianCalendar(any, mes -1, dia);	
			
			
			if (calcularEdat(this.dataNaiximent) < 18) {
			
				System.out.println("Student must be older than 18, perfavor introduix els datos unaltra vegada");
			}
	}
	
	
	
	
	
	
	
	public Alumne (Assignatura a, Assignatura b, Assignatura c, String nomCognoms, String email, int any, int mes, int dia)  {
		
		
			do{
				this.dataNaiximent = new GregorianCalendar (any, mes -1, dia); 
		

				this.a = a;
			
				
				
				
				
				
				
				
				
				this.b = b;
			
				this.c = c;
				
				System.out.println("Inserta els teu noms i cognoms");
				nomCognoms=teclado.nextLine();
				
				System.out.println("Inserta el teu email");
				email=teclado.nextLine();
				
				System.out.println("Inserta el teu any de naiximent");
				any = Integer.parseInt(teclado.nextLine());
				
				System.out.println("Inserta el teu mes de naiximent");
				mes = Integer.parseInt(teclado.nextLine());
				
				System.out.println("Inserta el teu dia de naiximent");
				dia = Integer.parseInt(teclado.nextLine());
				
				this.dataNaiximent = new GregorianCalendar(any, mes -1, dia);	
				
				
				if (calcularEdat(this.dataNaiximent) < 18) {
				
					System.out.println("Student must be older than 18, perfavor introduix els datos unaltra vegada");
				}
				}while (calcularEdat(this.dataNaiximent) < 18);
		}
			
		
		/*  No funciona aixi
		public Alumne (Assignatura a, Assignatura b, Assignatura c) {
			
			String nomCognoms;
			String email;
			int any;
			int mes;
			int dia;
			
			
			System.out.println("Inserta els teu noms i cognoms");
			nomCognoms=teclado.nextLine();
			
			System.out.println("Inserta el teu email");
			email=teclado.nextLine();
			
			System.out.println("Inserta el teu any de naiximent");
			any = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Inserta el teu mes de naiximent");
			mes = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Inserta el teu dia de naiximent");
			dia = Integer.parseInt(teclado.nextLine());
			
			this.dataNaiximent = new GregorianCalendar(any, mes -1, dia);	
			
			
			if (calcularEdat(this.dataNaiximent) < 18) {
			
				System.out.println("Student must be older than 18, perfavor introduix els datos unaltra vegada");
			}
			//}while (calcularEdat(this.dataNaiximent) < 18);
			 
			 * }
			 */

			
			
			
			
			
		
		
		
		
		
		
		
		
		
		public Alumne(int indentificador1, int indentificador2, int indentificador3, String nomCognoms, String email, int any, int mes, int dia) {

		
					do{
						
						this.a = new Assignatura(indentificador1);
						
						this.b = new Assignatura(indentificador2);
						
						this.c = new Assignatura(indentificador3);
						
						this.nomCognoms = nomCognoms;
						
						this.email = email;
		
						
						
						
						
						this.dataNaiximent = new GregorianCalendar(any, mes -1, dia);
						
						
						if (calcularEdat(this.dataNaiximent) < 18) {
							
							System.out.println("Student must be older than 18");
						}
						}while (calcularEdat(this.dataNaiximent) < 18);
				}
					
	
		
		public Alumne (String nomCognoms, String email, int any, int mes , int dia) {
				
			
				this.nomCognoms = nomCognoms;	
				this.email = email;
			
			
			
				this.dataNaiximent = new GregorianCalendar(any, mes -1, dia);
				
				
							if (calcularEdat(dataNaiximent) < 18) {
					
								System.out.println("Student must be older than 18");
							}
				
				
							
		}
	
		public Alumne(double qualificacio1, double qualificacio2, double qualificacio3) {
		
				this.a = new Assignatura(qualificacio1);
				this.b = new Assignatura(qualificacio2);
				this.c = new Assignatura(qualificacio3);
		}
	
		
	
// -------------------------------------------------------------------
		
// ------------------------ Setters i Getters -------------------------------------------
	
		
		
	public Assignatura getA() {
			return a;
		}

		public int getAnysTe() {
		return anysTe;
	}





	public void setAnyTe(int anysTe) {
		this.anysTe = anysTe;
	}





		public void setA(Assignatura a) {
			this.a = a;
		}

		public Assignatura getB() {
			return b;
		}

		public void setB(Assignatura b) {
			this.b = b;
		}

		public Assignatura getC() {
			return c;
		}

		public void setC(Assignatura c) {
			this.c = c;
		}

		public String getNomCognoms() {
			return nomCognoms;
		}





		public void setNomCognoms(String nomCognoms) {
			this.nomCognoms = nomCognoms;
		}





		public String getEmail() {
			return email;
		}





		public void setEmail(String email) {
			this.email = email;
		}





		public GregorianCalendar getDataNaiximent() {
			return dataNaiximent;
		}





		public void setDataNaiximent(GregorianCalendar dataNaiximent) {
			this.dataNaiximent = dataNaiximent;
		}

//-------------------------------METODDES-------------------------------------------------
		
	



		
		public int calcularEdat (GregorianCalendar dataNaiximent ) {

			
			int any;
			
			GregorianCalendar fechaActual =new GregorianCalendar();
			
			
			
			any = fechaActual.get(GregorianCalendar.YEAR)- dataNaiximent.get(GregorianCalendar.YEAR);
					
			
			
					if ( fechaActual.get(GregorianCalendar.MONTH) == dataNaiximent.get(GregorianCalendar.MONTH)) {
					
							if ( fechaActual.get(GregorianCalendar.DAY_OF_MONTH) < dataNaiximent.get(GregorianCalendar.DAY_OF_MONTH)) {

								any = any -1;
							}
					}
			
			
					if ( fechaActual.get(GregorianCalendar.MONTH) < dataNaiximent.get(GregorianCalendar.MONTH)) {	
										
							any = any -1;
					}
					
				this.anysTe = any;
		
				return this.anysTe;
		
		}



		public void setAnysTe(int anysTe) {
			this.anysTe = anysTe;
		}


		
		public double calcularMitjana () {		
			
			double mitjana;
			
			if (this.a.getQualificacio() < 4 || this.b.getQualificacio() < 4 || this.c.getQualificacio() < 4) {
				
				mitjana = -1;
						
			}else {
			
			mitjana = (this.a.getQualificacio() + this.b.getQualificacio() + this.c.getQualificacio())/3;
			}	
		
			return mitjana;
		}


		public void voreNotes() {
			System.out.println("Assignatura "+a.getNom()+"Qualificacio "+a.getQualificacio());
			System.out.println("Assignatura "+b.getNom()+"Qualificacio "+b.getQualificacio());
			System.out.println("Assignatura "+c.getNom()+"Qualificacio "+c.getQualificacio());
		}
}


