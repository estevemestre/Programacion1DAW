package Resum;
//*******************SCANNER**********************************
import java.util.Scanner;

public class EntradaDatos {

	
private static Scanner teclado = new Scanner(System.in);	// normalment uitlizarem per a tots els metodes i les clases
	
	
	public static void main(String [] args) {


//*********************INT***********************************
			int numeroInt;	
	
			System.out.println("Inserta un numero int");
			numeroInt= Integer.parseInt(teclado.nextLine());
			
//*********************DOUBLE********************************
			
			double numeroDecimal;
			
			

			System.out.println("Inserta un numero Decimal");
			numeroDecimal=Double.parseDouble(teclado.nextLine());
			
			
			
			
			
			
//*******************STRING**********************************
			
			String palabraString;
			
		System.out.println("Inserta una palabra");
		palabraString=teclado.nextLine();
		

	}	

	public static void menu () {
		
			Scanner teclado = new Scanner (System.in);
			int menu;
		
			do {
			System.out.println("1_Crear un array de 10 elementos"
								+"\n2_Visualitzar el array"
								+"\n3_Visualitzar contador par"
								+"\n4_Visualitzar contador impar");
			

			System.out.print("Introduce una opci�n: ");
			menu = Integer.parseInt(teclado.nextLine());
			
			
		
			}
	}
	
