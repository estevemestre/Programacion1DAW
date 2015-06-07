/*@uthor Esteve Mestre Company
 * 
 * 		XICOTETA CLINICA

Metges = tindran nº colegiat, nom
Especialitats = (Máxim 3 ) codi(1,2,3,4,5) nom // Objecte tipo Array Especialitat
Pacient = DNI, nom, telefon, visites(data,hora) maxim 10
Visita = Metge, data visita , hora vista (Máxim 10 )


//Cuant creem el metge estara buit  "array especialitat"

** Crearem un menú

1_Alta especialitat 
2_Alta metges 
3_Alta pacients
4_Afegir especialitat

Li demanara el codi especialitat i mirara que estiga en alta especialitat si en alta especialitat, mirara 
que estiga en el metge i si no esta el afegira (si el codi especialitat no esta donat de alta li dira que 
hagut un error o que torne a possar la especialitat  

5_Visita pacient
Demanarem el nºcolegiat // la fecha

 * 
 * 
 * 
 */
package Clinica;

import java.util.Scanner;

public class ClinicaMain {

	private static Scanner teclado = new Scanner (System.in);	
	private static Pacient [] pacients =  new Pacient [10];
	private static Metge [] metges = new Metge [10];
	private static Especialitat [] especialitats = new Especialitat [10];
	private static int contEspecialitat = 0;
	private static int contPacient =0;
	private static int contMetge =0;
	private static int contVisites = 0;
	public static void main(String[] args) {
		int menu;
		do{
			System.out.println("MENÚ\n"
					+ "----------------------\n"
					+ "1. Donar d'alta especialitats\n"
					+ "2. Donar d'alta metges\n"
					+ "3. Donar d'alta pacients\n"
					+ "4. Afegir especialitat a un metge\n"
					+ "5. Afegir visita a un pacient\n"
					+ "0. Eixir del programa\n"
					+ "Elegeix l'opció que vulguis fer.");
			
			System.out.println("Introdueix una opció en el menú");
			menu = Integer.parseInt(teclado.nextLine());
			
			switch(menu){
				case 1:
					insertarEspecialitat();
					break;
				case 2:
					insertarMetge(); 
					break;
				case 3:
					insertarPacient(); 
					break;
				case 4:
					if (buscarMetge()!=null) {
						buscarMetge().agregarEspecialitzacio(buscarEspecialitat());	
					} else {
						System.out.println("No s'ha trobat el metge.");
					}
					break;
				case 5:
					Pacient p=buscarPacient();
					if (p!=null) {
						p.agregarVisita(buscarMetge());	
					}else{
						System.out.println("No s'ha trobat cap pacient.");
					}
					break;
				case 0:
					System.out.println("Ha sortit del programa amb èxit.");
					break;
				default:
					System.out.println("ERROR.Opció invàlida.");
					break;
			}
		}while(menu !=0);	
	}

//***********************Métodes per a insertar *******************************

	public static void insertarEspecialitat(){
		if (contEspecialitat < especialitats.length) {
			especialitats[contEspecialitat] = new Especialitat();
		}else{
			System.out.println("No es poden introduir mes especialitats");
		}
		contEspecialitat = contEspecialitat + 1;	
	}
	
	
	
	public static void insertarPacient() {
		if (contPacient < pacients.length) {
			pacients[contPacient] = new Pacient();
			contPacient = contPacient +1;
			
		}else{
				System.out.println("La llista dels pacients esta plena");
			}
		}
	
	
	
	
	public static void insertarMetge(){
		if (contMetge < metges.length){
			metges[contMetge] = new Metge();
			contMetge = contMetge + 1;
		}else{
			System.out.println("La llista dels metges esta plena");
		}
	}
	
	
	
	
//**************************Métodes per a buscar ************************************	

	public static Especialitat buscarEspecialitat() {
		for (int i = 0; i < especialitats.length; i++) {
			if (especialitats[i] !=null) {
				especialitats[i].mostrarEspecialitat();
			}
		}
		int num;
		System.out.println("Inserta el número de especialitat que vols buscar");
		num = Integer.parseInt(teclado.nextLine());
		
		for (int i = 0; i < especialitats.length; i++) {
			if (especialitats[i] !=null & especialitats[i].getCodi() == num) {
				System.out.println("Enhorabona la especialitat si que existeix");
				return especialitats[i];
			}
		}	
		System.out.println("La especialitat que has introduit no existeix ");
		return null;
	}
	
	
	 public static Metge buscarMetge() {
		 int num;
		 boolean trobat = false;
		 int pos = 0;
		
		 System.out.println("Introdeix el número de col-legiat per al metge");
		 num = Integer.parseInt(teclado.nextLine());
		 
		for (int i = 0; i < metges.length; i++) {
		    if (metges[i]== null ) {
		    	break;
		    }else if(num == metges[i].getNumColegiat()) {
		    	trobat = true;
		    	pos = i;
		    	break;
		    }
		} 
		if (trobat) {
			return metges[pos];
		}else{
			return null;
		}

	 }

	 public static Pacient buscarPacient () {
		 int num;
		 boolean trobat = false;
		 int pos = 0;
		
		 System.out.println("Introdeix el DNI del pacient ");
		 num = Integer.parseInt(teclado.nextLine());

		 for (int i = 0; i < pacients.length; i++) {
			 if (pacients[i]==null) {
				 break;
			 } else if (num == pacients[i].getDni()){
				trobat = true;
				pos = i;
				break;
			 
			 }
		}
		
		 if (trobat) {
			 return pacients[pos];
		 } else {
			
			 return null;
		 }
	 } 
}

