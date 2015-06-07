package tema13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Prova {

	public static void main(String[] args) {

		
/*1.Invocar a la classe File (este pas és opcional)
	2.Crear el flux d'entrada amb FileReader o flux d'eixida amb FileWriter (implica la creació del
		fitxer)
	3.Fer les operacions de lectura/escriptura
	4.Tancar els fluxos de dades

 */
		
		
//********************REPRESENTAR UN FITXER************************		
		
	//primer constructor
		File f1 = new File ("O:\\document\\text1.txt");
	 //segon constructor
		File f2 = new File("O:\\document","text1.txt");	 //tercer constructor
	//tercer constructor	
		File dir = new File("O:\\document");
		File f3 = new File(dir, "text1.txt");
	
	
/* Directori ?
 * fitxer ?
 * existeix?
 * borrar
 * renombrar
 * crear un fitxersinoeexisteix
 * 
 * Saber si tenim permis de lectura
 * Saber si tenim permis de escritura
 * 	
 * retorna ruta relativa
 * retorna ruta absoluta
 * 
 * retorna el nom del arxiu
 */
		
		
		
		
	if(dir.isDirectory()) {
		System.out.println("es un directori");
	}
	
	if(f1.isFile()) {
		System.out.println("es un fitxero ?");
	}
	
	
	
	// Les operacions sobre fitxers se tenen de crear obir i tancar
	// Per a llegir utilitzarem el fileReader

	
	//********************LLEGIR********************************************
		

	
	
		try {
			// 1 Forma 
			FileReader llegir = new FileReader(f1);
			System.out.println("Primera forma: " +llegir.read()); // retorna pasat a enter
			// 2 Forma
			FileReader llegir2 = new FileReader("O:\\document\\text1.txt");
			System.out.println("Segona  forma: " +llegir2.read()); // retorna pasat a enter
			
			
			
			//LLEGIR MES RAPID 
			BufferedReader llegirRapid = new BufferedReader(llegir);
			System.out.println(llegirRapid.readLine());
			
			llegir.close();
			llegirRapid.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fitxer no trobat.");
				e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("no es pot accedir al fitxer");
			e.printStackTrace();
		}
		
        
	
 //***************************ESCRIURE*******************************************
	
		
		try {
		//	FileWriter escriure1 = new FileWriter (f1); // sobre Escriu
		
			FileWriter escriure2 = new FileWriter (f1, true); // no sobre Escriu si no que afegix
			
			
			escriure2.write("a continuacio");
			
			
			
			
			
			
			
			BufferedWriter escriureRapid =	new	BufferedWriter(escriure2);
			
			escriureRapid.newLine(); // Linea en blanc
			escriureRapid.write("Hola doomingo");
			
			escriureRapid.close();
			escriure2.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	//**********************LECTURA I ESCRITURA ************************************


		
		
		
		
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// per a escrire utilitzarem el fileWriter
	
	
		
		
	}
}
