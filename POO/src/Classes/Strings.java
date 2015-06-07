/* Cuant diem String fem referencia a una clase i no a un tipo primtiu de datos
 * String com es una clase te els seus propis metodos per ejemple per a saber la
 * longitud , en que posicion se encuentra una letra, casos practics per ejemple
 * cuant tingues que validar un email per a saber si hi a una @ i un punt si nia 
 * mes de una @ 
 */	

package Classes;

public class Strings {

	
	public static void main(String[] args) {
		
		metodosString();
		
	}
	
	
	
	public static void metodosString() {
		
	
	String mi_nombre = "Juan";  // mi_nombre es un objeto 
	String tu_nombre= "Juana";
	String nom = "Esteve";
	String primerCognom = "Mestre";
	String segonCognom = "Company";
	String nomComplet;
	
	int guardaTotalCaracteres;
		
//*********************METODOS*************************************** 
		 
	// length() : Devuelve la longitud de una cadena de caracteres
		 
				System.out.println("lenght = numero total caracteres en Juan: "+mi_nombre.length());
			
				//reptecionsUltimoCaract(); //Ejemplo Repeticion ultimo Caracter
	// charAt(n): devuelve la posicion de un caracter dentro de una cadena , las posiciones empiezan desde 0
		 
				System.out.println("charAt = posicion numero 2 en Juan:  "+mi_nombre.charAt(2));
			
	/* substring(x,y): devuelve una subcadena dentro de la cadena, siendo X el caracter
	*	 a partir del cual se extrae e Y el nº de caracteres que se  quieren extraer
	*/
		 
				System.out.println("substring = a partir del 1 asta el 3 que el caracter 3 no ixiria. en Juan: "+mi_nombre.substring(1, 3));
				System.out.println(nom.substring(nom.length()-2, nom.length()));  //mostra els 2 últims caràcters
	/* equals(cadena) : devuelve true si dos cadenas que se comparan son iguales y 
	* false si no  lo son. Distingue mayúsculas y minúsculas
	* equalsIgnoreCase(cadena) ignora les mayúsculas
	*/ 

				System.out.println("Compara para ver si juan i Juana son iguales es :"+mi_nombre.equalsIgnoreCase(tu_nombre));
	 
	/* concat(cadena) adjunta varies variables en una domes , podriem gastaro
	 * per ejemple per a guardar un nom complet si tenim 3 variables 
	 * 			
	 */
				nomComplet = nom.concat( " " + primerCognom.concat(" " +segonCognom));
				System.out.println("Adjuntar 3 variables en una nom , 1cognom, 2cognom: "+nomComplet);
		

	/*toLowerCase(); Converteix tots el caractes de uan variable en  minúscula
	 *toUpperCase();  Converteix tots el caractes de uan variable en  mayúcula
	 */
	

				System.out.println("El teu nom en minúcules "+nomComplet.toLowerCase());
				System.out.println("El teu nom en mayúcules "+nomComplet.toUpperCase());
				
				
	}	
				
				public static void reptecionsUltimoCaract () {
					String nom = "Esteve";
					String primerCognom = "Mestre";
					String segonCognom = "Company";
					String nomComplet = "Esteve mestre company";
					int repeticions = 1;
					
					int totalCaract = nomComplet.length()-1;  
					char ultimCaract = nomComplet.charAt(nomComplet.length()-1);

					
					for (int contCaract = 0; contCaract < totalCaract; contCaract++) {
						if(nomComplet.charAt(contCaract) == ultimCaract) {
							repeticions = repeticions + 1;
						}
					System.out.println("Número de repeticions de la lletra : " + ultimCaract +"  "+ repeticions + "vegades");

						
				
	}
}
}
