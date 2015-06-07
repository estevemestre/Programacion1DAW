package Marian_teatre;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionTeatro {

	static Scanner reader = new Scanner(System.in);
	static ArrayList<Zona> zonas = new ArrayList<Zona>();
	static ArrayList<Entrada> entradas = new ArrayList<Entrada>();
	
	public static void main(String[] args) {
		
		
		zonas.add(new Zona("Principal",200,25,17.5));
		zonas.add(new Zona("Palco",40,70,40));
		zonas.add(new Zona("Central",400,20,14));
		zonas.add(new Zona("Lateral",100,15.5,10));
		
		menuPrincipal();
		
	
	}
	
		public static void menuPrincipal() {
		int option;
		
		do {
			System.out.println("GESTIÓN TEATRO");
			System.out.println("==============");
			System.out.println("1.-Vender entrada.");
			System.out.println("2.-Consultar entrada.");
			System.out.println("3.-Informe zona.");
			System.out.println("0.-Salir de la aplicación.");
			System.out.print("Inserte una opción válida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option ){
			case 1:
				venderEntrada();
				break;
			case 2:
				consultarEntrada();
				break;
			case 3:
				informeZona();
				break;
			case 0:
				System.out.println("Aplicación finalizada.");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
					
			}
		} while (option != 0);
	}
	
	
	/**
	 * Mètode per buscar una zona pel seu nom
	 * @return la Zona buscada o null si no existeix
	 */
	public static Zona buscarZona() {
		System.out.print("Inserte nombre de la zona: ");
		String nombre = reader.nextLine();
		for (int i = 0; i < zonas.size(); i++) {
			if (zonas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				return zonas.get(i);
			}
		}
		return null;
	}
	
	
	
	/**
	 * Submenú per demanar a l'usuari el tipus d'entrada escollida
	 * @return el tipus seleccionat: 1, 2 ó 3
	 */
	
	public static int pedirTipoEntrada(){
		int tipus = 0;
		
		System.out.println("TIPOS DE ENTRADAS DISPONIBLES");
		System.out.println("=============================");
		System.out.println("1)Normal");
		System.out.println("2)Abonado");
		System.out.println("3)Entrada reducida");
		//System.out.print("Seleccione un tipo: ");
		
		
		
				
		
			do {
				System.out.print("Seleccione un tipo válido: ");
				tipus = Integer.parseInt(reader.nextLine());
				
			} while (tipus!=1 && tipus !=2 &&  tipus!=3);
				
			
			
				return tipus;
		 
	}
	
	/**
	 * Mètode per vendre una entrada
	 */
	public static void venderEntrada() {
		
		Entrada ent=null;
	
		Zona zonaElegida = buscarZona();
		
		if (zonaElegida !=null){
			if (zonaElegida.entradesLliures()) {
				zonaElegida.setNumLocalidadesVendidas(zonaElegida.getNumLocalidadesVendidas() + 1);
		
			int tipo = pedirTipoEntrada();
			if (tipo==1) {
				ent = new EntradaNormal(zonaElegida);
			} else if (tipo==2) {
					ent = new EntradaAbonado(zonaElegida);
			} else {
				ent = new EntradaReducida(zonaElegida);
			}
			
			entradas.add(ent);		//afegim l'entrada a la llista d'entrades
			zonaElegida.setTotalAcumulado(zonaElegida.getTotalAcumulado() + ent.calcularPrecio());
			System.out.println("Informació de la entrada adquirida");
			System.out.println(ent.infoEntrada());
			} else {
				System.out.println("ERROR. El aforo de la zona está completo.");
			}
			
			
		} else {
			System.out.println("ERROR. No existe ninguna zona con ese nombre.");
		}
	}
	
	
	/**
	 * Mètode per buscar una entrada en la llista d'entrades venudes
	 * @return la posició o -1 si no existeix l'id introduït
	 */
	
	public static int buscarEntrada() {
		
		System.out.print("Inserte id de la entrada: ");
		int id = Integer.parseInt(reader.nextLine());
		for (int i = 0; i < entradas.size(); i++) {
			if (entradas.get(i).getId() == id) {
			
				return i;
				
			}
		}
		
		return -1;
	}
	
	/**
	 * Mètode per buscar una entrada i mostrar la seua informació
	 */
	public static void consultarEntrada(){
		
		int pos = buscarEntrada();
		 if (pos!=-1) {
			 System.out.println(entradas.get(pos).toString());
		 } else {
			 System.out.println("El identificador buscado no existe.");
		 }
		
	}
	
	
	
	/**
	 * Mètode que mostra el nombre de localitats venudes en una zona i l'import recaudat
	 */
	public static void informeZona() {
		Zona zonaElegida = buscarZona();
		
		
		if (zonaElegida != null) {
			
		
			System.out.println(zonaElegida.toString());
			//System.out.println("Localidades libres: " + (zonaElegida.getNumLocalidadesTotal() - zonaElegida.getNumLocalidadesVendidas() ));
			System.out.println("Localidades vendidas: " + zonaElegida.getNumLocalidadesVendidas() );
			System.out.println("Recaudación total: " + zonaElegida.getTotalAcumulado());
		
		} else {
			System.out.println("ERROR. No existe ninguna zona con ese nombre.");
		}
	}
		
}
