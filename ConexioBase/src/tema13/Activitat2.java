/*
Fes un programa per llegir el contingut d'un fitxer anomenat fitxer1.txt on hi haja
contingut (per exemple, el teu nom i cognoms).
Després inserta una cadena de text dins d'un altre fitxer anomenat fitxer2.txt.
Els fitxers els pots crear en el directori que vullgues
 */
package tema13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Activitat2 {

	public static void escriure (File f, String es) {
		try {
			
			
			FileWriter escriure = new FileWriter(f);
			escriure.write(es);
			escriure.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void llegir (File f) {
		
		
		try {
			FileReader llegir = new FileReader(f);
			try {
				BufferedReader llegirRapid = new BufferedReader(llegir);
				System.out.println(llegirRapid.readLine());
				llegir.close();
				llegirRapid.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

	
	public static void main(String[] args) {
		
		File f1 = new File ("O:\\Activitats\\1-4","fitxer1.txt");
		File f2 = new File ("O:\\Activitats\\1-4","fitxer2.txt");

		
		escriure(f1,"Esteve Mestre Company");
		escriure(f2,"Inserta una cadena de text dins d'un altre fitxer anomenat fitxer2.txt");
		
		
		llegir(f1);
		llegir(f2);
		
	}
	
	
	
}
