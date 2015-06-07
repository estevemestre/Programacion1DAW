/*Alumne tindra un codi que sera variable statica  , nom , edad
 * 
 * Grup Tindra id del grup  , nom , array Alumnes (Máxim 10) //cada grup
 * 
 * 
 * 1_Metodo: Quants alumnes te  maxim (10) , si introduix 2 nira dos voltes 
 * al contructor del alumne per a preguntar el nom 2 vegades nom y edat
 * 
 * 
 * 2_Buscar l´alumne major  d´un grup "Id grup"  Implementar el metodo en 
 * la clase del grup  
 * 
 *  
 *  3_ Buscar un alumne  tindra que donarmos el id del grup i codi del nom del
 *  alumne  Este metodo es fara en la clase grup 
 *  
 *  
 *  4_Mostrar el grup que te nes alumnes  . Implementaro en el main
 *  
 *  
 *  ?Cc*s"A#\'R?Cc*s"A#\'RCrear el grup alumnes

buscar alumne major
buscar alumne
buscar grup alumnes major
 *  
 *  
 *  
 *  Main  crear arrays de grups  (Máxim 4 ) ejemple: 1Daw, 2 Daw, 1Asix, 2Asix
 */

package Institut;

import java.util.Scanner;

public class IntitutMain {

	static Grup [] arrayGrup; 
	
	static Scanner teclat = new Scanner (System.in);
	
		public static void buscarMajor () {
		
			int posicio = 0 ;
			int busc = 0;
			for (int i = 0; i < arrayGrup.length; i++) {
				
				if (arrayGrup[i].getNumAlumnes() >  posicio){
					
					posicio = arrayGrup[i].getNumAlumnes();
					busc = i;
				}
			}
			
			
			System.out.println("El grup que te més alumnes es : " + arrayGrup[busc].getNomGrup()+ "I te " + posicio + " Alumnes. "  );
		}
			
	
	public static void crearGrup () {
		
		int numGrup;
		System.out.println("Introduix número de grups, que vols crear");
		numGrup=Integer.parseInt(teclat.nextLine());
		 
		arrayGrup = new Grup [numGrup];
		
		 for (int i = 0; i <arrayGrup.length; i++) {
			
			 arrayGrup[i] = new Grup();
		}
	}
	
	
	public static Grup buscarGrup () {
		
		int codiGrup;
		
		System.out.println("Inserta codi Grup");
		codiGrup = Integer.parseInt(teclat.nextLine());
		
		
		for (int i = 0; i < arrayGrup.length; i++) {
			
			if (arrayGrup[i].getCodi() == codiGrup) {
				
				return arrayGrup[i];
			
			}
		}
			System.out.println("No existeix. ");
		
			
			
	// No eixira del bucle fins que trobe un codi grup
		return buscarGrup(); // Es crida a ell mateix
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int menu;
		
		
		do {
		
		System.out.println("*****MENÚ INSTITUT*****\n"
						  +"-----------------------\n"
						  +"1_ Crear un grup de Alumnes\n"
						  +"2_Buscar alumne major d´un grup\n"   // Perque no es fa en el main = 
						  +"3-Buscar un alumne en un grup\n"	 // Perque no es fa en el main =
						  +"4_Buscar el grup que té mes alumnes\n"
						  +"5_Eixir del programa");
		
		
		System.out.println("Inserta un número:  ");
		menu = Integer.parseInt(teclat.nextLine());
		
		switch (menu) {
		
				case 1:
					crearGrup();
					break;
				case 2:
					Grup.majorEdad(buscarGrup());				
					//buscarGrup().majorEdad();
				case 3:
					buscarGrup().buscarCodi();   // No entenc  perque cuant agarre el  get  buscar nom en el grup com sap de quin grup es ?
					
				case 4:
					
					buscarMajor();
				default:
					System.out.println("Adeu");
		}
		
		
		
		}while(menu < 4);
		
		}
}
	