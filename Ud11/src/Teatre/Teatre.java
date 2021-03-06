package Teatre;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import practicaGarage.Reparacions;


public class Teatre {
	
	//static ArrayList <Zona> zones= new ArrayList <Zona>(); 
	static ArrayList<Entrada> entrades = new ArrayList<Entrada>();
	

	static Zona principal = new Zona ("principal", 2,  25, 17.5);
	static Zona palco = new Zona ("palco", 40,  70, 40);
	static Zona	central = new Zona ("central", 400,  20, 14);
	static Zona lateral = new Zona ("lateral", 100,  15.5, 10);
	

	static Scanner reader = new Scanner (System.in);
	
	
	// retorne tipo de zona
	public static Zona tipoZona () {
		int tipo;
	
		System.out.println("Porfavor, introdueix una zona ");
		System.out.println("1_ Principal");
		System.out.println("2_ Palco");
		System.out.println("3_ Central");
		System.out.println("4_ Lateral");
		tipo = Integer.parseInt(reader.nextLine());
	
		switch(tipo) {
			case 1:
				return principal;
			case 2:
				return palco;
			case 3:
				return central;
			case 4:
				return lateral;		
		}
		return null;
	}

	
	// retorne tipo de entraada
	public static void tipoEntrada () {
		
		int desc;
		System.out.println("1_ normal");
		System.out.println("2_ reducida");
		System.out.println("3_ abonado");
		System.out.println("Introdueix el tipo de descompte");
		desc = Integer.parseInt(reader.nextLine());
		
		switch (desc) {
		
			case 1:
					Zona normal = tipoZona(); 
				
				if (numEntrades(normal)) {		
					entrades.add(new Normal(normal));
				}

				break;
			case 2:
			
				Zona reducida = tipoZona(); 
				
				if (numEntrades(reducida)) {		
					entrades.add(new Reducida(reducida));
				}

				break;
		
			case 3:

				Zona abonado = tipoZona(); 
				
				if (numEntrades(abonado)) {		
					entrades.add(new Abonado(abonado));
				}
				break;
			default:
				break;
		}
		
		
	}
	

	
	 // Metode que retorne true o false si hi han entrades o no 
	
	public static boolean numEntrades (Zona lloc) {
		
		if (lloc.getNumEntrades() > 0) {
			System.out.println("Sense actualitzar " +lloc.getNumEntrades());
			lloc.setNumEntrades(lloc.getNumEntrades() -1);
			System.out.println("Actualitzat " +lloc.getNumEntrades());
			return true;
		}else {
			System.out.println("No queden entrades per vendre");
			return false;
		}
	}
	
	
	public static void main(String[] args) {


		
		int menu;
		do {
		
			System.out.println("\t Men�");
			System.out.println("1_ Venta d'entrades");
			System.out.println("2_ Consulta d'entrades");
			System.out.println("3_ Informe de la zona");
			System.out.println("4_ Eixida");
			System.out.println("Introdueix una opcio ");

				menu = Integer.parseInt(reader.nextLine());
				

		switch(menu) {
			case 1:
				tipoEntrada();
				break;
			case 2:
				
			
				
				break;
				
			case 3:

	
				break;
					
			case 4: 
				System.out.println("Adios");
				break;
		
			default:
				System.out.println("ERROR");
				break;
		}
		
		}while(menu != 4);
			
	}
	
	

	
}