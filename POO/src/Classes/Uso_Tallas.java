/*Tipo enumerado  es dir que domes es pot guardar una seria de valors 
 * 
 */
package Classes;

import java.util.Scanner;





public class Uso_Tallas {
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};   // Domes podra guardar estos valors
	
	static Scanner reader = new Scanner(System.in);

	
	
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private String abreviatura;
		
		private Talla (String abreviatura) {
			this.abreviatura = abreviatura;
		}

		private String getAbreviatura() {
			return abreviatura;
		}


		public static void main(String[] args) {
		
	}
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
	/*	
		Talla s = Talla.MINI;
		
		Talla m = Talla.MEDIANO;
		
		Talla l = Talla.GRANDE;
	
		Talla xl = Talla.MUY_GRANDE;
		
		*/
		
		System.out.println("Escribe una talla: MINI, MEDIADO, GRANDE, MUY_GRANDE");
		
		String talla = reader.nextLine().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, talla);
		
		System.out.println("Talla = "+ la_talla);
		
		System.out.println("Abreviatura = " + la_talla.getAbreviatura());
		
		
		
		
	}
}










