/*
 * 
 *Activitat1.- Definix una classe que represente a un cotxe. En la definició s'ha d'incloure:
 *	
 *	•el model
 *  •el color
 *	•si la pintura és metal•litzada o no
 *	•la matrícula
 *	•el tipus de cotxe, que pot ser mini, utilitari, familiar o esportiu
 *	•l'any de fabricació
 *	•la modalitat de l'assegurança, que pot ser a tercers o a tot risc

 *Fes un constructor amb valors inicials (els que tú vullgues), un altre constructor amb paràmetres, els getters, els setters 
 *i un mètode que es diga mostrarInfo() que mostre el model i el color del cotxe.
 *Fes el diagrama de classes UML i a continuació fes la implementació.
 * 
 * 
 * 
 * 
 * 
 */
package Actividad1;

public class Actividad1 {
	public static void main (String [] args){
		
		Cotxe c1= new Cotxe();// Declarar i crear objecte
		
						c1.mostrarInfo();
	
		System.out.println("**********************************");
		System.out.println("---------Final del c1-------------");
		System.out.println("**********************************");
		
		
		
		Cotxe c2= new Cotxe("focus ","negre", true, "65748-LSI","utilitari",2014,"tercers");			
	
		
		c2.mostrarInfo();
		
		
		System.out.println("**********************************");
		System.out.println("---------Final del c2-------------");
		System.out.println("**********************************");
		
	
		
		
		
		System.out.println(c2.getAnyMatr());
		
		

		c2.setAnyMatr(2016);
		
		System.out.println(c2.getAnyMatr());
		
	
		
	
		
		
		
	}	
}
