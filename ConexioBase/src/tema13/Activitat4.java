/*
Activitat4.- Fes un programa amb dos mètodes que cridaràs des del principal:
– Un mètode (insertarAlumnes) per insertar els elements d'un arr ay en un fitxer
(fitxer4.txt). Serà un ar r ay amb el nom dels alumnes de classe. S'ha d'insertar cada
nom dins del fitxer en una línia diferent. S'ha de fer servir la classe B uffe re dWr i ter.
– Un altre mètode (eliminarAlumne) que demane a l'usuari el nom de l'alumne que es
vol borrar del fitxer i l'elimine.
 */

package tema13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Activitat4 {

	static Scanner reader = new Scanner (System.in);
	static ArrayList<Alumne> alumnes = new ArrayList<Alumne>();
	static File f = new File("O:\\Activitats\\1-4","fitxer1.txt");
	
	
	// Insertar
	public static void insertarAlumne () {
		
		try {
			f.createNewFile();
			
			FileWriter escriure = new FileWriter(f, true);
			
			BufferedWriter escriureRapid = new BufferedWriter(escriure);
	
			
			for (int i = 0; i < alumnes.size(); i++) {
				escriureRapid.write(alumnes.get(i).getNom()+"\n");
			}
			escriureRapid.close();
			escriure.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void borrarAlumne () {
		
		try {
			f.createNewFile();
			
			
	
		FileReader llegir = new FileReader(f);
		
		ArrayList<String> llistar = new ArrayList<String>();
		
		BufferedReader llegirRapid = new BufferedReader(llegir);
		
		
		if (llegir.read() != -1) {
			
			// Perque 
			//Mostra tots els alumnes
			/*
			String sCadena;
			while ((sCadena=llegirRapid.readLine())!=null) {
				   System.out.println(sCadena);
				}
			*/
			
			
			String alumne;
			System.out.println("Disme el alumne que vols borrar");
			alumne = reader.nextLine();
			
			String aux;
			while ((aux=llegirRapid.readLine())!=null) {			
				if(aux.equalsIgnoreCase(alumne)){
					System.out.println("L'alumne: " +alumne+ " s'he eliminara");
				}else {
					llistar.add(aux);
				}
			}
			
			System.out.println("Els alumnes qe hi han crats son: ");
			for (int i = 0; i < llistar.size(); i++) {
				System.out.println(llistar.get(i));
			}			
			
			llistar.clear();
			
		}else{
			System.out.println("No hi ha cap usuari creat ");
		}
		
		llegir.close();
		llegirRapid.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int option;
	
		do {
			System.out.println("1_Insertar alumnes");
			System.out.println("2_Borrar alumnes");
			System.out.println("0_Eixir");
			System.out.print("Inserte una opción válida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option ){
			case 1:
				String pregunta = null;
				do {	
					alumnes.add(new Alumne());
				System.out.println("Vols introduir mes Alumnes?");
				pregunta = reader.nextLine();
				}while(pregunta.equalsIgnoreCase("si"));
				insertarAlumne();
				alumnes.clear();
				break;
			case 2:
				borrarAlumne();
				break;
			case 3:
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no válida.");
				break;
					
			}
		} while (option != 0);
	}

		
		
		
		
		
		
		
		
}
	

