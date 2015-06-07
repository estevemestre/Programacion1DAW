package Institut;

import java.util.Scanner;

public class Institut {
	static Grup grup[]=new Grup[4];
	
	static Scanner teclat=new Scanner (System.in);
	
	//crear grup
	
	public static void crearGrup(){
		int num;
		System.out.println("Número de grups que vols crear (màx. 4): ");
		num=Integer.parseInt(teclat.nextLine());
		if(verificaNGrups(num)){
			for (int i = 0; i < num; i++) { //ha de ser menor que 
				grup[i]=new Grup();
			}
		}
	}
	
	//verificar que no es vullguen crear més de 4 grups.
	public static boolean verificaNGrups(int num){
		if(num<=4){
			return true;
		}
		System.out.println("S'ha sobrepassat el número de grups permesos.\n"
				+ "Inserte el número de grups que vols crear (màx. 4): ");
		return verificaNGrups(num);
	}
	

	//buscar un grup determinat 
	public static Grup buscarAlumneGrup(){
		int grup;
		System.out.println("Inserta el codi del grup on vols buscar l'alumne: ");
		grup=Integer.parseInt(teclat.nextLine());
		if(grup<=Grup.getCodiTotal()){
			for (int i = 0; i<=Grup.getCodiTotal(); i++) {
				if(grup==Institut.grup[i].getCodi()){
					return Institut.grup[i];
				}
			}
		}
		
		System.out.println("Aquest curs no existeix. Torna-ho a intentar.");		
		return buscarAlumneGrup();
	}
	
	//PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		int opcio;
			
		do{
			System.out.println("        MENÚ\n"
					+ "----------------------\n"
					+ "1. Crear grup\n"
					+ "2. Buscar alumne major d'un grup\n"
					+ "3. Buscar un alumne en un grup\n"
					+ "4. Mostrar el grup que té més alumnes\n"
					+ "0. Eixir del programa\n"
					+ "Elegeix l'opció que vulguis fer.");
			
			opcio=Integer.parseInt(teclat.nextLine());
			
			switch(opcio){
				case 1:
					crearGrup();
					break;
				case 2:
					
					break;
				case 3:
					Grup.buscarAlumne(buscarAlumneGrup());
					break;
				case 4:
					
					break;
				case 0:
					System.out.println("Ha sortit del programa amb èxit.");
					break;
				default:
					System.out.println("ERROR.Opció invàlida.");
					break;
			}
		}while(opcio!=0);
	
	}

}
