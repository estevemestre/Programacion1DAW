package Teatre;

import java.util.ArrayList;
import java.util.Scanner;

public class GestioTeatre {

	static Scanner reader = new Scanner(System.in);
	static ArrayList<Zona> zones = new ArrayList<Zona>();
	static ArrayList<Entrada> entrades = new ArrayList<Entrada>();
	
	public static void main(String[] args) {
		menuPrincipal();
	}
	
	
	
	
	public static Zona buscarZona() {
		System.out.println("Quin tipo de zona vols ? ");
		String tipoZona = reader.nextLine();
		for (int i = 0; i < zones.size(); i++) {
			
			if (zones.get(i).getNom().equalsIgnoreCase(tipoZona)){
				return zones.get(i);
			}
		}
		System.out.println("No s'ha trobat ninguna zona per favor tornau a intentar");
		return buscarZona();
	}
	
	
	public static void ventaEntrada() {
	
		Zona zona = buscarZona();
		
		
		
		System.out.println("Introdueix el tipo de entrada que vols (Normal) o (Abonado) o (Reducida)");
		String tipoEntrada = reader.nextLine();
		
		if (tipoEntrada.equalsIgnoreCase("normal")) {
			zona.comprovarNumLocalitats();
			entrades.add(new Normal(zona));
		}else if (tipoEntrada.equalsIgnoreCase("Abonado")) {
			zona.comprovarNumLocalitats();
			entrades.add(new Abonado(zona));
		}else if (tipoEntrada.equalsIgnoreCase("Reducida")) {
			zona.comprovarNumLocalitats();
			entrades.add(new Reducida(zona));
		}else {
			System.out.println("No s'ha trobat el tipo de entrada");
		}
	}
	
	
	public static void llistarTotesEntrades() {
		for (int i = 0; i < entrades.size(); i++) {
			System.out.println(entrades.get(i).toString());
		}
	}
	
	public static void menuPrincipal() {
		
		zones.add(new Zona("Pricipal",200, 25, 17.5));
		zones.add(new Zona("Palco",40, 70, 40));
		zones.add(new Zona("Central",400, 20, 14));
		zones.add(new Zona("Lateral",100, 15.5, 10));
		
		
		
		int option;
		
		do {
			System.out.println("GESTI�N TEATRO");
			System.out.println("==============");
			System.out.println("1.-Vender entrada.");
			System.out.println("2.-Consultar entrada.");
			System.out.println("3.-Informe zona.");
			System.out.println("0.-Salir de la aplicaci�n.");
			System.out.print("Inserte una opci�n v�lida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option ){
			case 1:
				ventaEntrada();
				break;
			case 2:
				
				llistarTotesEntrades();
				
				System.out.println("Inserta la id de la entrada");
				int id = Integer.parseInt(reader.nextLine());
				
				for (int i = 0; i < entrades.size(); i++) {
					if(entrades.get(i).getId() == id) {
						System.out.println(entrades.get(i).toString());
					}
				}
				break;
			case 3:
				Zona zona = buscarZona();
				
				
				
				
				break;
			case 0:
				System.out.println("Aplicaci�n finalizada.");
				break;
			default:
				System.out.println("Opci�n no v�lida.");
				break;
					
			}
		} while (option != 0);
	}
}
