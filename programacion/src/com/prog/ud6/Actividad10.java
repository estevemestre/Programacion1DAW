
/**
 *  @author: Esteve Mestre Company
 *  
 * Activitat10.- Volem dissenyar un men� semblant al seg�ent:
 * 
 * MEN� PRINCIPAL
 * ==============
 * 1.-Paraula m�s llarga.
 * 2.-Paraula m�s curta.
 * 3.-N�mero de vocals de les paraules.
 * 0.-Eixir
 * Introduix opci�:
 * 
 *  Pr�viament a la visualitzaci� del men� i �nicament una vegada, s'han de demanar 
 *  3 paraules  a l'usuari. A continuaci�, s'ha de mostrar el men�, fins que l'opci� seleccionada siga 0. 
 *  
 *  S'han d'implementar correctament els m�todes per fer el seg�ent:
 *  
 *  Opci�1: Ha de mostrar (de les tres paraules demanades a l'usuari) aquella que �s m�s llarga.
 *  Opci�2: Ha de mostrar (de les tres paraules demanades a l'usuari) aquella que �s m�s curta.
 *  Opci�3: Ha de mostrar el n�mero de vocals (accentuades o no, maj�scules o min�scules)
 *   de cada paraula, indicant-ho amb *.
 *   
 *  A continuaci� es mostra un exemple d'execuci� del programa:
 *  
 *  Escriu paraula:hola
 *  Escriu paraula:adi�s
 *  Escriu paraula:ma�ana
 *  
 *  MEN� PRINCIPAL
 *  ==============
 *  1.-Paraula m�s llarga.
 *  2.-Paraula m�s curta.
 *  3.-N�mero de vocals de les paraules.
 *  0.-Eixir
 *  Introduix opci�:
 *  
 *  1
 *  La paraula m�s llarga �s: ma�ana
 *  
 *  
 *  
 *  2
 *  La paraula m�s curta �s: hola
 *  
 *  MEN� PRINCIPAL
 *  ==============
 *  1.-Paraula m�s llarga.
 *  2.-Paraula m�s curta.
 *  3.-N�mero de vocals de les paraules.
 *  0.-Eixir
 *  Introduix opci�:
 *  
 *  3
 *  La paraula hola t� **(2) vocals.
 *  La paraula adi�s t� ***(3) vocals.
 *  La paraula ma�ana t� ***(3) vocals.
 *  
 *  MEN� PRINCIPAL
 *  ==============
 *  1.-Paraula m�s llarga.
 *  2.-Paraula m�s curta.
 *  3.-N�mero de vocals de les paraules.
 *  0.-Eixir
 *  Introduix opci�:
 *  0
 *  Aplicaci� finalitzada.
 * 
 */

package com.prog.ud6;

import java.util.Scanner;

public class Actividad10 {




		public static void main(String[] args){
			
			Scanner teclado = new Scanner(System.in);
			
			String palabra1;
			
			String palabra2;
			
			String palabra3;
		
			System.out.println("Inserta la primera palabra");
			palabra1 = teclado.nextLine();
			
			
			System.out.println("Inserta la segunda palabra");
			palabra2 = teclado.nextLine();
			
			
			System.out.println("Inserta la tercera palabra");
			palabra3 = teclado.nextLine();
		
		
			palabras(palabra1,palabra2,palabra3);     // LLamo el metodo  i le pasos los paarametros
		
		
		}
	
		
		
			public static void palabras(String palabra1, String palabra2, String palabra3){   // 
				
				Scanner teclado = new Scanner(System.in);
		
				
				String aux1 = palabra1;
				String aux2=palabra2;
				String aux3=palabra3;
				String pal1 = " ";
				String pal2 = " ";
				String pal3 = " ";
				int menu = 1;
		
		
				int cont1 = 0;
				int cont2 = 0;
				int cont3 = 0;
		
				while (menu != 0){
			
						System.out.println("MEN� PRINCIPAL");
						
						System.out.println("==============");
						
						System.out.println("1.-Palabra m�s larga");
						
						System.out.println("2.-Palabra menos corta.");
						
						System.out.println("3.-N�mero de vocales de las palabras.");
						
						System.out.println("0.-Salir");
						
						System.out.println("Inserta el un n�mero del men�");
						menu = Integer.parseInt(teclado.nextLine());
			
			
						if (menu == 0){
								System.out.println("Terminas de cerrar el men�");
						
						} else if (menu == 1){
						
							if (aux1.length()>aux2.length() && aux1.length()>aux3.length()){
									System.out.println(aux1);
						
						
						} else if (aux2.length()>aux1.length() && aux2.length()>aux3.length()){
							System.out.println(aux2);
							
						} else if (aux3.length()>aux1.length() && aux3.length()>aux2.length()){
							System.out.println(aux3);
							
							
						} else if (aux1.length()==aux2.length() && aux1.length()>aux3.length()){
							System.out.println(aux1+" , "+aux2);
							
							
						} else if (aux1.length()==aux3.length() && aux1.length()>aux2.length()){
								System.out.println(aux1+" + "+aux3);
					
						} else if (aux1.length()==aux3.length() && aux1.length()==aux3.length()){
							System.out.println(aux1+", "+aux2+" , "+aux3);
							
					
						} else {
								System.out.println(aux2+" , "+aux3);
				}
							
				
						} else if(menu == 2){
							
						if (aux1.length()<aux2.length() && aux1.length()<aux3.length()){
								System.out.println(aux1);
								
								
						} else if (aux2.length()<aux1.length() && aux2.length()<aux3.length()){
								System.out.println(aux2);
								
								
						} else if (aux3.length()<aux1.length() && aux3.length()<aux2.length()){
							System.out.println(aux3);
							
							
						} else if (aux1.length()==aux2.length() && aux1.length()<aux3.length()){
							System.out.println(aux1+" y "+aux2);
							
							
						} else if (aux1.length()==aux3.length() && aux1.length()<aux2.length()){
							System.out.println(aux1+" y "+aux3);
							
							
						} else if (aux1.length()==aux3.length() && aux1.length()==aux3.length()){
							System.out.println(aux1+", "+aux2+" y "+aux3);
							
						} else {
								System.out.println(aux2+" y "+aux3);
						}
			
						
						} else if (menu == 3){
				

							for (int i= 0; i<aux1.length();i++){
								if(aux1.charAt(i)==('a')||aux1.charAt(i)==('e')||aux1.charAt(i)==('i')||aux1.charAt(i)==('o')||aux1.charAt(i)==('u')){
									cont1 = cont1 + 1;
									pal1 = pal1 + "*";
					}
				}
				for (int i= 0; i<aux2.length();i++){
					
					if(aux2.charAt(i)==('a')||aux2.charAt(i)==('e')||aux2.charAt(i)==('i')||aux2.charAt(i)==('o')||aux2.charAt(i)==('u')){
						cont2++;
						pal2=pal2+"*";
					}
				
				}
				for (int i= 0; i<aux3.length();i++){
					
					if(aux3.charAt(i)==('a')||aux3.charAt(i)==('e')||aux3.charAt(i)==('i')||aux3.charAt(i)==('o')||aux3.charAt(i)==('u')){
						cont3 = cont3 + 1;
						pal3=pal3 + "*";
					}
				}
				
				System.out.println(cont1);
				System.out.println("La palabra "+aux1+" tiene "+pal1+"("+cont1+")"+" vocales");
				System.out.println("La palabra "+aux2+" tiene "+pal2+"("+cont2+")"+" vocales");
				System.out.println("La palabra "+aux3+" tiene "+pal3+"("+cont3+")"+" vocales");
				}
		}
		

				teclado.close();
	}
}
