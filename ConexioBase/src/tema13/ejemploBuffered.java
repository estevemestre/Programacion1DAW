package tema13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejemploBuffered {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		File f = new File("D:\\prog\\fitxer2.txt");
		
		
		try {
			//ESCRITURA
			FileWriter escriptor = new FileWriter(f,true);
			BufferedWriter dades = new BufferedWriter(escriptor);
			
			/*
			dades.newLine();
			dades.write("Hola Mundo");
			System.out.println("\nInserta linia a escriure: ");
			dades.write(reader.nextLine());
			*/
			
			String linia;
			
		
			while((linia= dadesLectura.readLine()) != null){
				System.out.println(linia);
			}
			
			dades.close(); 	//SI NO SE CIERRA NO GUARDA LA MODIFICACIÓN
			
			//LECTURA
			//FileReader lector = new FileReader(f);
			//BufferedReader dades = new BufferedReader(lector);
			//System.out.println(dades.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
