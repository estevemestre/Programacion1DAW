package practicaGarage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Taller {


	static ArrayList <Treballs> treballs= new ArrayList <Treball>(); 
	static Scanner reader = new Scanner(System.in);
	
		

	public static int buscarId () {
		int id;
		System.out.println("Introdueix el indentificador del treball");
		id = Integer.parseInt(reader.nextLine());
		
		for (int i = 0; i < treballs.size(); i++) {
			if(treballs.get(i) != null & treballs.get(i).getId()== id) {
				return i;
			}
		}
		System.out.println("Heu senc per-ho no trobe la id ");
		return -1;
	}
	


	public static boolean tipoTreball (int o) {
	
			if(treballs.get(o) instanceof Revisions){
				System.out.println("Es revisions");
				return false;
			}else{
				System.out.println("no es revisions");
				return true;
			}
			
			
		
	}
	
	
	
	public static void main(String[] args) {
		
	
		int menu;
		
		do {

			System.out.println("****MENÜ****");
			System.out.println("1_ Registrar Trabajo");
			System.out.println("2_ Aumentar horas ");
			System.out.println("3_ Aumentar coste piezas");
			System.out.println("4_ Finalitza trabajo");
			System.out.println("5_ Muestra trabajo");
			System.out.println("6_ Consultar fecha termini");
			System.out.println("7_ Vore la informacio de tots");
			System.out.println("8_ Salir");
			System.out.println("Seleccione una opción");
		
		menu = Integer.parseInt(reader.nextLine());
		

		switch(menu) {
			case 1:
				String tipoTreball;
				String tipoReparacio;
				System.out.println(" Quin tipo de treball vas a fer ? (¿Revisions o Reparacions?) ");
				tipoTreball = reader.nextLine();
				if (tipoTreball.equalsIgnoreCase("revisions")) {
					treballs.add(new Revisions());
				}else if (tipoTreball.equalsIgnoreCase("reparacions")){
					System.out.println("La reparacio es de pintura o mecanica?");
					tipoReparacio = reader.nextLine();
					if(tipoReparacio.equalsIgnoreCase("pintura")) {
						treballs.add(new XapaPintura());
					}else if (tipoReparacio.equalsIgnoreCase("mecanica")) {
						treballs.add(new XapaPintura());
					}else{
						System.out.println("No s'ha trobat el tipo de reparacions");
					}
					
				}else {
					System.out.println("No s'ha trobat el tipo de treball");
				}
				break;
			
			case 2:
				int id;
				int hores;
				int trobat = buscarId();

				if(trobat != -1 ) {
					
					if (treballs.get(trobat).getFinalitzat() != true) {
						System.out.println("S'ha trobat la id, perfavor indicam les hores que vols aumentar ");
						System.out.println("Té: "+ treballs.get(trobat).getNumHores() + "Hores");
						hores = Integer.parseInt(reader.nextLine());
						treballs.get(trobat).setNumHores(treballs.get(trobat).getNumHores() + hores);
						System.out.println("El número de hores s'ha actualitzat a " + treballs.get(trobat).getNumHores() + "Hores");	
					}
				}	
				
				break;
				
				case 3:
			
				double cost;
				// Aumenta coste de piezas
		
					double preuMaterial;
					int posicio = buscarId(); 

					
					if (tipoTreball(posicio)) {
						 Reparacions r = (Reparacions) treballs.get(posicio);
						 if (r.getFinalitzat()) {
							 System.out.println("Eu senc el treball esta finaniltzat");
						 }else {
							 System.out.println("El treball no esta finalitzat");
							 System.out.println("El treball es una reparacio, indicam el preu del material (Actualment el preu es " +r.getPreuMaterial());
							 preuMaterial = Double.parseDouble(reader.nextLine());
							 r.setPreuMaterial(preuMaterial); 
							 System.out.println("La reparacio actualment te un preu "+ r.getPreuMaterial());
						 }
	
					}
					
				case 4: 
				// Finalitza trabajo
					int aux = buscarId();
					
					if (aux != -1 & treballs.get(aux).getFinalitzat() == false) {
						System.out.println("Ara esta en false "+ treballs.get(aux).getFinalitzat());
						treballs.get(aux).setFinalitzat(true);
						System.out.println("Actualitzat a " + treballs.get(aux).getFinalitzat());						
					}
					
				break;
			case 5:
		
				int aux2 = buscarId();
				
				if (aux2 != -1 ) {
					System.out.println(treballs.get(aux2));
				}
			
			case 6: 
				
				int aux3 = buscarId();
				
				if (aux3 != -1 ) {
					System.out.println("La fecha de termini es: " + treballs.get(aux3).getFecha());
				}
				
				
				break;
			
			case 7:
				
				for (int i = 0; i < treballs.size(); i++) {
					System.out.println(treballs.get(i).toString());
				}
				break;
			case 8:
				
				System.out.println("Adios");
				break;
			default:
				System.out.println("ERROR");
				break;
		}
		
		}while(menu != 8);
			
	}
	
	

	
}
