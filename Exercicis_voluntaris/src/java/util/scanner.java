package java.util;
import java.util.Scanner;
public class scanner {
	//substitueix totes les ocurr�ncies del text �es� per �no por�.
		public static void substitueixEs(String cadena){
			System.out.println(cadena.replaceAll("es","no por"));
		}
		
		//substitueix tots els grups de d�gits per un *.
		public static void substitueixNumeros(String cadena){
			System.out.println(cadena.replaceAll("\\d+","*")); // "\\d+" significa un d�git o m�s.
		}
		
		public static void main(String[] args) {
			String frase;
			Scanner teclat=new Scanner(System.in);
			System.out.println("Escriu una frase: ");
			frase=teclat.nextLine();
			
			substitueixEs(frase);
			substitueixNumeros(frase);
		}
	}


