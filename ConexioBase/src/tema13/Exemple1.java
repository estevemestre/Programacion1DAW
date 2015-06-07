package medirTemps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exemple1 {

public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		File fitxer = new File ("O:\\Nueva carpeta\\fitxer2.txt");  // 
		
		
		String linea;
		// while ((linea =dadesLectura.readLine()) != null) {
		//System.out.println(linia);


		}

//dadeslectura.close
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try{
			/*FileReader lector = new FileReader(f);
			BufferedReader dades = new BufferedReader(lector);
			System.out.println(dades.readLine());*/
//------------------------------------------------------------			
			/*FileWriter escriptor = new FileWriter(f);
			BufferedWriter dades = new BufferedWriter(lector);
			
			dades.newLine();
			dades.write("Hola mon!!");
			system.out.print("Inseta línea a escriure: ");
			dades.write(reader.nextLine());
			dades.close();*/ 
//-----------------------------------------------------------
			
			FileWriter escriptor = new FileWriter(f);
			BufferedWriter dades = new BufferedWriter(lector);
			FileReader lector = new FileReader(f);
			BufferedReader dades = new BufferedReader(lector); 
	        
	        String linia= dadesLectura.readLine();
	        
	        while( linia!= null){
	        
	        System.out.println(linia);
	        linia = dadesLectura.readLine();
	        
	        }
			
			
		}catch(FileNotFoundExceptio e){
			
			System.out.println("Fitxer no trobat.");
			
		}catch(IOException e){
			
		System.out.println("No es pot accedir al fitxer");
		}
		
		
	}

}

	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		try {
			FileReader lector = new FileReader(f);
			BufferedReader dades = new BufferedReader(lector);
			try {
				System.out.println(dades.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		/*
		
	//bufer enmaganetjaje local mes rapid	
	
		
		File fitxer = new File ("O:\\Nueva carpeta\\fitxer2.txt");  // 
		
		//FileReader lector;

		FileWriter escriptor;
		
		try {
			
		/*	fitxer.createNewFile();
		lector = new FileReader(fitxer);
				
				int i = lector.read(); // retorna un int 
				System.out.println(i);
				lector.close();
			 escriptor = new FileWriter(fitxer, true);// añade al fitxer 
			//escriptor = new FileWriter(fitxer);
			//escriptor.write("hola mon!!");
			escriptor.write("Clase de programacioadsasddsasad"); //sobreescriu
			escriptor.close();
				
		} catch (FileNotFoundException e) {
		
				
				System.out.println("no es pot accedir al fitxer");
		


		} catch (IOException e) {
			
			System.out.println("no el trobe");
			
		}
		

		
	}
}
		
	
		
		
		
		*/
		
		
		
		
		// Utilitzan unaltre cobstructor 
		
		/*
		
		try {
			FileReader lector = new FileReader ("O:\\Nueva carpeta\\fitxer1.txt");
			//llegir
				
				int i = lector.read(); // retorna un int 
				System.out.println(i);
				lector.close();
				
		} catch (FileNotFoundException e) {
		
				
				System.out.println("no es pot accedir al fitxer");
		


		} catch (IOException e) {
			
			System.out.println("no el trobe");
			
		}
	}
	}
	*/

