package tema13;

import java.io.File;
import java.io.IOException;

public class Activitat1 {


	// crearà un fitxer amb el nom fitxer1.txt
	void crearFitxer(String directori, String fitxer) {
	
		File f1 = new File (directori, fitxer);
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// visualitzarà el contingut del directori passat com a paràmetre.		
	void veureContingut(String directori) {

		File f1 = new File (directori);
		
		String[] llistar = f1.list();

		
		if (llistar == null) {
			System.out.println("No existeix");
		}else{
			for (int i = 0; i < llistar.length; i++) {
			System.out.println(llistar[i]);
			}
		}
	}
	
	//  visualitzarà el nom, la ruta absoluta i relativa, si es pot escriure, si es pot llegir, la grandària, si és un directori i si és un fitxer.
	void veureInf (String directori, String fitxer) {
	
		File f1 = new File (directori, fitxer);
		
		System.out.println("Ruta absoltua: " +f1.getAbsolutePath()); // ruta absoluta
		System.out.println("Ruta relativa: " +f1.getPath()); // ruta relativa
		System.out.println("Es pot escriure? "+ f1.canWrite()); // esciure ?
		System.out.println("Es pot llegir? "+f1.canRead()); // llegir ?
		System.out.println("La grandaria es: "+f1.length());	// grandaria
		System.out.println("Es un directori ?: " +f1.isDirectory());// directori 
		System.out.println("Es un fitxer?: "+f1.isFile());// fitxer
		
	}

	
	
}
