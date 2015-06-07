/*
Activitat3.- Fes un programa per llegir el contingut d'un fitxer anomenat fitxer3.txt on hi
hagen vàries línies de text (per exemple el teu nom complet en una línia, l' e -ma il en una altra,
el telèfon en una altra...) i mostra per pantalla el seu contingut.
Utilitza la classe B uffe re dR e ader.
 */


package tema13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Activitat3 {

public static void llegir (File f) {
		
		
		try {
			FileReader llegir = new FileReader(f);
			try {
				BufferedReader llegirRapid = new BufferedReader(llegir);
				System.out.println(llegirRapid.readLine());
				System.out.println(llegirRapid.lines());
			
			
				while (llegirRapid.readLine() != null){
					System.out.println(llegirRapid.readLine());
				}
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
		llegir(f1);
	}
}
