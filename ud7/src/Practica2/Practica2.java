/*
 * @author Esteve Mestre Company
 * 
 *  1- Desenvolupar una classe anomenada Assignatura que:
 *	Tinga dos atributs. Un de tipus int (l'identificador) l'altre de tipus double (la qualificació).
 *	Tinga getters i setters per a les variables d'instància.

 *	2.- Desenvolupar una classe anomenada Alumne que:
 *	Tinga tres atributs de tipus Assignatura.
 *	Tinga un constructor amb tres paràmetres de tipus Assignatura que inicialitze els tres atributs.
 *	Tinga un constructor amb tres paràmetres de tipus int que inicialitze les tres variables d'instància.
 *	Tinga un getter i un setter per a cada atribut.
 *	Tinga un mètode calcularMitjana() que reba un paràmetre de tipus Alumne i retorne un double.


 *  3.- Desenvolupar una classe anomenada Professor que:
 *	Tinga un mètode posarNotes() que reba un paràmetre de tipus Alumne i que no retorne res. Posarà una qualificació aleatòria a cada una de les assignatures de l'alumne.


 *  4.- Desenvolupar una classe anomenada Practica2 per a que en el seu mètode main:
 *	Es creen i s'inicialitzen tres assignatures.
 *	Es cree un alumne amb les tres assignatures anteriors.
 *	Es cree un professor que li pose qualificacions a l'alumne.
 *	Es mostre per pantalla la mitjana de les notes de l'alumne.

 * NOTA: a més a més dels mètodes anteriors, si necessites altres mètodes o altra informació addicional, afegix-la.
 * 
 */


//**************************
package Practica2;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Practica2 {
	
static Scanner teclado = new Scanner(System.in); // Esta variable sera statica per que per  a tots els metodos es el mateix valor es adir per a tota la clase valdra lo mateix

	public static void main (String [] args) {

		int menu;
		Assignatura primera = null; // Declarar
		Assignatura segona = null;
		Assignatura tercera = null; 
		Alumne alumno = null;
		Professor profe = null;
	
			do {
					System.out.println("GESTIO D'UN CENTRE");
					System.out.println("==================");
					System.out.println("1.- Insertar assignatures");
					System.out.println("2.- Insertar alumne.");
					System.out.println("3.- Insertar professor.");
					System.out.println("4.- Posar notes.");
					System.out.println("5. -Calcular mitjana"); 
					System.out.println("0.- Eixir");
		
					menu = Integer.parseInt(teclado.nextLine());
			
			
					switch(menu) {

					
					
							
						case 1:
								primera = new Assignatura ();
								segona = new Assignatura ();
								tercera = new Assignatura ();		
								break;
						case 2:
														
								alumno = new Alumne();
								alumno.setA(primera);
								alumno.setB(segona);
								alumno.setC(tercera);
							
							/* NO funciona 
							alumno = new Alumne (primera , segona , tercera);
							System.out.println(alumno.getEmail());
							*/
								break;
						case 3:
								profe = new Professor();
								break;
						case 4:

							profe.insertarNotes(alumno);

							break;
						
						case 5:
							
							alumno.voreNotes();
							
							
							break;
						
						
						
						
						
						case 0:
								System.out.println("Aplicacio Finalitzada.");
						break;
					}	//switch
			} while (menu!=0);
				
}		
		
				
	
}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
