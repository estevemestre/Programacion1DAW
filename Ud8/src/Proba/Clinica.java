package Proba;

import java.util.Scanner;

public class Clinica {
	static  Metges[] metges=new Metges[10];
	static  Especialitats[] especialitats=new Especialitats[10];
	static Pacient[] pacients=new Pacient [10];
	static Scanner teclat=new Scanner (System.in);
	static int comptaEsp=0;
	static int comptaMetge=0;
	static int comptaPacients=0;
	 
	 //mètode per a donar d'alta especialitats
	
		static public void altaEspecialitat(){
			if(comptaEsp<especialitats.length){
				especialitats[comptaEsp]=new Especialitats();
				comptaEsp=comptaEsp+1;
			}else{
				System.out.println("No es poden afegir més espacialitats.");
			}
		}
		
		//mètode per a donar d'alta metges
		public static void altaMetges(){
			if(comptaMetge<metges.length){
				metges[comptaMetge]=new Metges();
				comptaMetge=comptaMetge+1;
			}else{
				System.out.println("No es poden afegir més metges.");
			}
		}
		
		//mètode per a donar d'alta als pacients
		public static void altaPacients(){
			if(comptaPacients<pacients.length){
				pacients[comptaPacients]=new Pacient();
				comptaPacients++;
			}else{
				System.out.println("No es poden afegir més pacients.");
			}
		}
		
		//mètode que assigna al metge una especialitat
		public static void assignarEspecialitat(){
			int codi;
			int num;
			Metges metge;
			Especialitats esp;
			
			System.out.println("Número de col·legiat del metge: ");
			num=Integer.parseInt(teclat.nextLine());
			metge=buscarMetge(num);
			System.out.println("Codi de l'especialitat");
			codi=Integer.parseInt(teclat.nextLine());
			esp=buscarEspecialitat(codi);
			
			if (metge.buscarEspecialitatMetge(esp)){ //busca si l'especialitat està assignada ja al metge
				metge.insertarEspecialitat(esp);
			}else {
				System.out.println("Aquesta especialitat ja existeix en aquest metge");
			}
			
		}
	//mètode que busca el codi del metge entre l'array 
	public static Metges buscarMetge(int num){
		for (int i = 0; i < comptaMetge; i++) {
			if(num==metges[i].getNcolegiat()){
				return metges[i];
			}
		}
			System.out.println("ERROR.no s'ha trobat. \nInserta de nou el número de col·legiat del metge: ");
			num=Integer.parseInt(teclat.nextLine());
			
		return buscarMetge(num);  // retorna el mètode d'ell mateixa de manera que sols pararà quan trobe al metge.
	}
	
	//mètode que busca una especialitat en l'array amb el codi
	public static Especialitats buscarEspecialitat(int codi){
		for (int i = 0; i < comptaEsp; i++) {
			if(codi==especialitats[i].getId()){
				return especialitats[i];
			}
		}
		System.out.println("ERROR. No s'ha trobat. \nInserta de nou el codi de l'especialitat:");
		codi=Integer.parseInt(teclat.nextLine());
		return buscarEspecialitat(codi);
	}
	//mètode que busca un pacient en l'array amb el dni
	public static Pacient buscarPacient(){
		String dni;
		System.out.println("Indica el DNI del pacient a buscar: ");
		dni=teclat.nextLine();
		for (int i = 0; i < comptaPacients; i++) {
			if(dni.equalsIgnoreCase(pacients[i].getDni())){
				return pacients[i];
			}
		}
		System.out.println("Paciet no trobat. Prova de nou.");
		return buscarPacient();
	}
	
	//programa principal
	public static void main(String[] args) {
		int opcio;		
		do{
			System.out.println("        MENÚ\n"
					+ "----------------------\n"
					+ "1. Donar d'alta especialitats\n"
					+ "2. Donar d'alta metges\n"
					+ "3. Donar d'alta pacients\n"
					+ "4. Afegir especialitat a un metge\n"
					+ "5. Afegir visita a un pacient\n"
					+ "0. Eixir del programa\n"
					+ "Elegeix l'opció que vulguis fer.");
			
			opcio=Integer.parseInt(teclat.nextLine());
			
			switch(opcio){
				case 1:
					altaEspecialitat();
					break;
				case 2:
					altaMetges();
					break;
				case 3:
					altaPacients();
					break;
				case 4:
					assignarEspecialitat();
					break;
				case 5:
					buscarPacient().insertarVisita();
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
