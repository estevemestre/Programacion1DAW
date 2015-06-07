package Teatres;

import java.util.ArrayList;
import java.util.Scanner;



public class Teatre  {

	static Scanner reader = new Scanner (System.in);
	static ArrayList<Entrada> entradas = new ArrayList<Entrada>();
	static ArrayList<Zona> zonas  = new ArrayList<Zona>();
	
	public static void main(String[] args) {
		
		
		
		zonas.add(new Zona("Principal",200, 25, 17.5));
		zonas.add(new Zona("Palco",40, 70, 40));
		zonas.add(new Zona("Central",400, 20, 14));
		zonas.add(new Zona("Lateral", 100, 15.5, 10));

			
		
		
		int menu;
		do {
		System.out.println("GESTI�N TEATRO");
		System.out.println("==============");
		System.out.println("1.-Vender entrada.");
		System.out.println("2.-Consultar entrada.");
		System.out.println("3.-Informe zona.");
		System.out.println("0.-Salir de la aplicaci�n.");
		System.out.print("Inserte una opci�n v�lida: ");
		menu = Integer.parseInt(reader.nextLine());
		
	
		
		switch (menu) {
		
			case 1:  
					venderEntrada();
			break;
			
			case 2: // Consulta entrada
			
				Entrada aux = buscarEntrada();
				
				if (aux != null) {
					System.out.println(aux.toString());
				}else {
					System.out.println("No sha trobat ");
				}
			break;
			
			case 3: // Informe de la zona 
				System.out.println(tipoZona().toString());
			break;
		default:
			break;
		}
		
		
		
		}while (menu != 0);
	}
	
	
//**************************************************************************************************************************
	
	
	// Buscar tipo zona
	public static Zona tipoZona() {
		
		
			System.out.println("Introduce un tipo de zona (Principal, Palco, Central o Lateral)");

			String nombre = reader.nextLine();
			for (int i = 0; i < zonas.size(); i++) {
				if (zonas.get(i).getNombreZona().equalsIgnoreCase(nombre)) {
					return zonas.get(i);
				}
			}
			return null;
		}
	
		
		
	
		
	// Tipo de entrada
	 public static int tipoEntrada () {
		 
		 int opcion;
		 
		 
		 System.out.println("� Que tipo de entrada desea ?");
		 System.out.println("1_ Entrada normal");
		 System.out.println("2_Entrada Reducida");
		 System.out.println("3_Entrada Abonado");
		

		 do {
		 opcion = Integer.parseInt(reader.nextLine());
			 
		 }while (opcion != 1 & opcion != 2 & opcion != 3);
	
		 return opcion;
		 
	 }
	 

	 // Vende entrada
	 public static void venderEntrada() {
		 
		 Zona z = tipoZona();
	
	if ( z != null) {	 
		 
		if ( z.comprovarEntradas())  {
			 z.setNumEntradas(z.getNumEntradas() -1);
			 
			 int tipo = tipoEntrada();
			 
			 if (tipo == 1) {
			 
				 Normal n = new Normal (z);
				 
				 System.out.println( "El precio del entrada " + n.calcularPrecio());
				 
				 entradas.add(n);
				 
			 }else if (tipo == 2)  {
				
				 
				 Reducida r = new Reducida (z);
				 
				 System.out.println( "El precio del entrada " + r.calcularPrecio());
				 entradas.add(r);
				 
			 }else {
			
				 Abonado a = new Abonado (z);
				 entradas.add(a);
				 System.out.println( "El precio del entrada " + a.calcularPrecio());
				 entradas.add(a);
				 
			 }
			 
		 }else  {
			 System.out.println("Error vuelvelo a intentar :)");
		 }
	 	}else{
	 		System.out.println("error");
	 	}
	 }
	 
	 // buscar una entrada
	 
	 public static Entrada buscarEntrada () {
		 
		 int id;
		 System.out.println("Indica el id de la entrada que vols buscar");
		 id = Integer.parseInt(reader.nextLine());
		 for (int i = 0; i < entradas.size(); i++) {
			 		if (entradas.get(i).getId() == id) {
			 			return entradas.get(i);
			 		}else{
			 			System.out.println("No s'ha trobat la id que busques");
			 			return null;
			 		}
		}
		 
		 
		 
		 return null;
	 }
	
	 
	 
	
	 
}
     