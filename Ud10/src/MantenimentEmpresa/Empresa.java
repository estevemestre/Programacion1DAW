package MantenimentEmpresa;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Empresa {

	private static Scanner reader=new Scanner(System.in);
	private static int total=0;
	
	//dades de l'empres
	private int id;
	private String nom;
	private ArrayList<Empleat> empleats=new ArrayList<Empleat>(); //creat
	
	

	/**
	 * Constructor: demana les dades de l'empresa i dels empleats
	 */
	public Empresa() {
		
		
		String pregunta;
		String resposta = "si";
		
		
		
		System.out.println("Inserta la id de la empresa");
		id = Integer.parseInt(reader.nextLine());
		System.out.println("Inserta el nom de la empresa");
		nom = reader.nextLine();
		empleats.add(new Empleat());
		
		 do {
		
		System.out.println("Vol introduir més empleats?(SI/NO)?");
		pregunta = reader.nextLine();
		
		 if (pregunta.equalsIgnoreCase(resposta)){
				 empleats.add(new Empleat());
		
		 }else {
			 System.out.println("Ja tens la empresa creada");
		 }
		 
		 }while(pregunta.equalsIgnoreCase(resposta));
		
		
		
		
		}

	
	/**
	 * Visualitza la informació de cada empleat 
	 */
	public void mostrarInfo(){
		System.out.println("La id de la empresa " +id);
		System.out.println("EL nom de la empressa " +nom);
		
		
		for (int i = 0; i < empleats.size(); i++) {
			empleats.get(i).mostrarInfo();
		}

		
		
	}
	
	
	public Empleat buscarEmpleat(){
		int idBusc;
		double nouSou;
		System.out.println("Disme la id del empleat que vols modificarli el sou");
		idBusc = Integer.parseInt(reader.nextLine());
		
		for (int i = 0; i < empleats.size(); i++) {
			if (empleats.get(i) == null) {
				System.out.println("No he trobat la id del empleat");
				return null;
			}else{
			
				if(idBusc == empleats.get(i).getId()) {
					return empleats.get(i);
				}
			}
		}
		return null;
	}
}
	

