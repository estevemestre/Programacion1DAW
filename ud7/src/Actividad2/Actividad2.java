/*
 * Escriu un programa que dispose d'una classe per a representar les assignatures d'una carrera:
•	Una assignatura té un nom, un codi numèric i el curs en el qual s'impartix.
•	Els valors inicials han de proporcionar-se en el constructor.
•	La classe ha de tindre mètodes per obtindre els valors dels atributs.
•	El programa ha de construir un objecte amb els següents valors: nom “Matemàtiques”, codi 1017, curs 1.
•	A continuació, el programa ha d'imprimir els valors de l'objecte per pantalla.
Fes el diagrama de classes UML i a continuació, implementa la solució en Java.



 * 
 */
package Actividad2;

public class Actividad2 {

	public static void main (String[] args){
		
		
		Clase assig1=new Clase("Matematiques", 1012, 7);
			
		System.out.println( assig1.getNom() + "\n" + assig1.getCodi() + "\n" + assig1.getCurs());
		
		
	}
	
}
