package tema13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejemplo1 {

	public static void main(String[] args) {
		//File fitxer = new File("D:\\prog\\fitxer2.txt"); 	Constructor 
		
		//FileReader reader;		//Constructor
		FileWriter escriptor;
		
		
		//CÓMO CREAR UN FICHERO, LEER Y ESCRIBIR EN ÉL
		
		try {
			/*
			//fitxer.createNewFile(); 	Crea un archivo nuevo
			reader = new FileReader("D:\\prog\\fitxer1.txt");
			//reader = new FileReader(fitxer);
			int i = reader.read();
			System.out.println(i);
			*/
			escriptor = new FileWriter("D:\\prog\\fitxer1.txt", true);	//El append en TRUE añade al fichero, no lo sobrescribe
			escriptor.write("Classe de programació");  	//	¡¡¡OJO!!! ---> SOBRESCRIBE EL FICHERO
			escriptor.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fitxer no trobat");
			
		} catch (IOException e) {
			System.out.println("No es pot accedir al fitxer");
		}
	}
}
