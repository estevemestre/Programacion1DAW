package Examennn;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Nutricio {
	
	static Scanner reader = new Scanner(System.in);

	
	
	
	
	public static void guardarFitxerAliments() {
		
		ArrayList<Aliment> al=new ArrayList<Aliment>();
		FileOutputStream f;
		ObjectOutputStream os;
		
		al.add(new Aliment(1,"Lechuga",16,29,34,37));
		al.add(new Aliment(2,"Tomate",19,19,5,77));
		al.add(new Aliment(3,"Pepino",12,19,5,77));
		al.add(new Aliment(4,"Leche semidesnatada",46,28,31,41));
		al.add(new Aliment(5,"Lubina",85,86,14,0));
		al.add(new Aliment(6,"Huevo hervido",145,35,64,1));
		al.add(new Aliment(7,"Pechuga de pollo",146,62,38,0));
		al.add(new Aliment(8,"Croquetas de pollo",154,15,31,54));
		al.add(new Aliment(9,"At鷑 al horno",190,62,38,0));
		al.add(new Aliment(10,"Pan blanco",240,14,6,80));
		al.add(new Aliment(11,"Mermelada de fresat",250,0,2,97));
		al.add(new Aliment(12,"Jam髇 serrano",319,35,64,1));
		al.add(new Aliment(13,"Queso manchego",389,30,69,1));
		al.add(new Aliment(14,"Donut de chocolate",474,3,59,37));
		al.add(new Aliment(15, "Mantequilla", 733, 0, 99, 1));
		al.add(new Aliment(16, "Margarina de ma韟", 718, 0, 99, 1));
		
		
		
		try {
			f = new FileOutputStream("aliments.ser");
			os = new ObjectOutputStream(f);
			for (int i = 0; i < al.size(); i++) {
				os.writeObject(al.get(i));
			}
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	

	
	public static ArrayList<Aliment> llegirFitxerAliments () {
		ArrayList<Aliment> aliments = new ArrayList<Aliment>();
		
		try {
			
			FileInputStream pont = new FileInputStream("aliments.ser");
			ObjectInputStream operacions = new ObjectInputStream (pont);
			Aliment a;
			
			while((a = (Aliment) operacions.readObject()) != null) {
					aliments.add(a);
			}
			
			operacions.close();

			return aliments;
		}catch (EOFException e) {
			System.out.println("Fi de fitxer");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aliments;
	}
	
	
	
	public static void guardarFitxerDietes(ArrayList<Dietes> dietes) {
		
		FileOutputStream f;
		ObjectOutputStream os;
		try {
			f = new FileOutputStream("dietes.ser");
			os = new ObjectOutputStream(f);
			for (int i = 0; i < dietes.size(); i++) {
				os.writeObject(dietes.get(i));
			}
			
			
			os.close();
			
		} catch(NotSerializableException e) {
			System.out.println("Fi de fitxer");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
		public static ArrayList<Dietes>  guardarArrayDietes () {
			
			ArrayList<Dietes> dietes = new ArrayList<Dietes>();

			FileInputStream pont;
			try {
				pont = new FileInputStream("dietes.ser");
				ObjectInputStream operacions = new ObjectInputStream (pont);	
				Dietes e;
				
				while ((e = (Dietes) operacions.readObject()) != null) {
					 dietes.add(e);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return dietes;
		}
	
	

		
		// podria utilitzar este metodo per a llegir-ho tot pasan-li el array com a parametre pero no tinc temps
		public static void llegir () {
			
			ArrayList<Aliment> aliments = llegirFitxerAliments();
			
			
			for (int i = 0; i < aliments.size(); i++) {
				System.out.println(aliments.toString());
			}
		}
	
	
		public static void llegirDietes () {
			ArrayList<Dietes> dietes = new ArrayList<Dietes>();
			
			dietes = guardarArrayDietes();
			
			for (int i = 0; i < dietes.size(); i++) {
				System.out.println(dietes.get(i).toString());
			}
		}
	
	
	/*
	public static ArrayList<Aliment> alimensQueVols (ArrayList<Aliment> totsAliments, int maxKalories) {
		
		ArrayList<Aliment> aliments = new ArrayList<>();
		
		int count = 0;
		
		String pregunta = null;
		do {
			System.out.println("Disme identificador del aliment");
			int id = Integer.parseInt(reader.nextLine());
		
			for (int i = 0; i < totsAliments.size(); i++) {
				if (totsAliments.get(i).getId() == id) {
				
				count = count + totsAliments.get(i).getKcal();
					if (count < maxKalories) {
						aliments.add(totsAliments.get(i));
					}else{
						System.out.println("No es poden afegir mes dietes");
					}
				}else {
					System.out.println("No s'ha trobat la id ");
				}
			}
		
		System.out.println("Vols introduir mes aliments ? (Si)o(No)");
		pregunta = reader.nextLine();
		
		}while (pregunta.equalsIgnoreCase("Si"));
		
	
		
		
		
		
		
		
		return aliments;
	}
	*/
	
	public static  Aliment  buscarAliment () {
		
	 ArrayList<Aliment> aliments = llegirFitxerAliments();
		
	 System.out.println("Introdueix la id del aliment");
	 int id = Integer.parseInt(reader.nextLine());
	 
	 
	 for (int i = 0; i < aliments.size(); i++) {
		if(aliments.get(i).getId() == id) {
			return aliments.get(i);
		}
	}	
		return null;
	}
	
	
	
	public static void confeccionarGuardarDieta () {
		ArrayList<Dietes> dietess = new ArrayList<Dietes>();
		
		// crear un array de dietes per a despres guardarles en el fitxer
		
		String pregunta;
		System.out.println("Quin tipo de dieta vols introduir: (normal)o(Hipocalorica)");
		pregunta = reader.nextLine();
		
		if (pregunta.equalsIgnoreCase("normal")) {
			
			Normals nor = new Normals();
			
			String preguntaa;
			do {
			
				Aliment  aliment = buscarAliment();
				
				if (aliment != null) {
					nor.afegirAliments(aliment);
				}else{
					System.out.println("no s'ha trobat el alimennt");
				}
				
				System.out.println("Vols introduir mes aliments ?");
				preguntaa = reader.nextLine();
				
				dietess.add(nor);
				
			}while(preguntaa.equalsIgnoreCase("si"));
			//nor.afegirAliments(aliment);
		
	
		
		
		}else if (pregunta.equalsIgnoreCase("Hipocalorica")) {
		
			Hipocalorifiques hipo = new Hipocalorifiques();
			
			String preguntaa;
			do {
			
				Aliment  aliment = buscarAliment();
				
				if (aliment != null) {
					hipo.afegirAliments(aliment);
				}else{
					System.out.println("no s'ha trobat el aliment");
				}
				
				System.out.println("Vols introduir mes aliments ?");
				preguntaa = reader.nextLine();
				
				dietess.add(hipo);
				
			}while(preguntaa.equalsIgnoreCase("si"));
			//nor.afegirAliments(aliment);
	}
		
		guardarFitxerDietes(dietess);
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Dietes> dietes = new ArrayList<Dietes>();
		String fitxer = "aliments.ser";
		
		
		int option=0;
		File f1 = new File("aliments.ser");
		
		do{
			System.out.println();
			System.out.println("NUTRICI脫 B脌SICA");
			System.out.println("====================");
			System.out.println("1.-Llegir fitxer d'aliments.");
			System.out.println("2.-Confeccionar i guardar dieta.");
			System.out.println("3.-Llegir fitxer de dietes.");
			System.out.println("4_ Afegir una nova dieta");
			System.out.println("0.-Tancar l'aplicaci贸.");
			
			
			System.out.print("Inserte una opci贸 v脿lida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch(option){
			case 1:
				//llegirFitxerAliments();
				//guardarFitxerAliments();
				llegir();
				
				break;
			case 2:
				confeccionarGuardarDieta();
				break;
			case 3:
				llegirDietes();
				break;
			case 0:
				System.out.println("Aplicaci贸 finalitzada.");
				break;
			default:
				System.out.println("Opci贸 no v脿lida.");
				break;
			}
			
		}while (option!=0);
		
		
	}
		
	
	
}
