// Metodos nos permiten que nuestras clases interactuen entre si formando una unidad para que funcione
package Poo1_Coche;

public class Uso_Coche {

	public static void main(String[] args) {
	
		// Vaig a crear objectes que perteneixeran a la clase Coche

		
/*				CREAR UN OBJECTE = Intanciar una clase
 * 1 _ nom de la classe a la cual volem crear un objecte
 * 2 _ nom que vuigues , nom de la instancia , nom del objecte
 * 3_  new lo que fa es llamar a 
 * 4_ NOM DEL CONTRUCTOR 
 */
	
	
		Coche Renault=new Coche();	// Instanciar una clase . Ejemplar de classe
		
	
		Coche Focus = new Coche();
		
		Focus.setAsientos_cuero("s");
		System.out.println("El focus  tiene asientos de cuero   " + Focus.isAsientos_cuero());
		
	
			
			// Per a vore les propietats o els atributs
			// Nom del objecte.propietat que vuiga vore
		
		System.out.println("Este coche tiene " + Renault.getRuedas());
		
		
		
		//Renault.setPeso_total(500);
		
		System.out.println("El peso total del Renault es :" + Renault.getPeso_total());
		
	}

	
}
