package fer;

import java.io.EOFException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class Aleatori {
	
	public static Scanner reader = new Scanner(System.in);
	static ArrayList<Empleat> empleats=new ArrayList<Empleat>();
	
	
	public static void insertarEmpleats(){	
		empleats.clear();

		RandomAccessFile operacions = null;
		StringBuffer empleBuffer;
		String pregunta="";

		try {
			operacions = new RandomAccessFile("empleat.dat", "rw");
		
			do {
				empleats.add(new Empleat());
				System.out.println("Vols introduir mes usuaris (Si)o(No)?");
				pregunta = reader.nextLine();
			}while(pregunta.equalsIgnoreCase("si"));
			
			
			for (int i = 0; i < empleats.size(); i++) {
				operacions.writeInt(empleats.get(i).getId());
				empleBuffer = new StringBuffer(empleats.get(i).getNom());
				empleBuffer.setLength(20); // el nom guardem 20 per a despues cuant el busque buscarlo per la posicio que ocupa en memoria 
				operacions.writeChars(empleBuffer.toString());
				operacions.writeInt(empleats.get(i).getDepartament());
				operacions.writeDouble(empleats.get(i).getSou());
			}
			operacions.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void llegirFitxer (){
		RandomAccessFile operacions=null;
		String buscNom="";
		
		char[] empleat=new char[20];
		
			try {
				
				operacions = new RandomAccessFile("empleat.dat", "rw");
				operacions.seek(0);	// Situem la posicio 0

				while((operacions.getFilePointer())<(operacions.length())){
					System.out.println("Id: "+operacions.readInt());
					
					for (int i = 0; i < empleat.length; i++) {
						empleat[i]=operacions.readChar();
					}
					System.out.println("Nom: "+new String(empleat));
					System.out.println("Departament: "+operacions.readInt());
					System.out.println("Sou: "+operacions.readDouble());
					System.out.println();
				
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public static void buscarPerID (){
		RandomAccessFile operacions=null;
		String nomBusc="";
		char[] empleat=new char[20];
		boolean buscar = false;

		System.out.println("Inserta la id que vols buscar");
		int id = Integer.parseInt(reader.nextLine());

		try {
			operacions.seek(0); // situem a la posicio 0

			operacions = new RandomAccessFile("empleat.dat", "rw");
			while((operacions.getFilePointer())<(operacions.length())){
				if(id==operacions.readInt()){
					for (int i = 0; i < empleat.length; i++) {
						empleat[i]=operacions.readChar();
					}
					System.out.println("Nom: "+new String(empleat));
					System.out.println("Departament: "+operacions.readInt());
					System.out.println("Sou: "+operacions.readDouble());
					buscar = true;
				} else {
					for (int i = 0; i < empleat.length; i++) {
						empleat[i]=operacions.readChar();
					}
					operacions.readInt();
					operacions.readDouble();
				}
			}
		} catch(EOFException e){
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		int option=0;
		do{
			System.out.println("1.- Omplir fitxer d'empleats.");
			System.out.println("2.- Llegir contingut.");
			System.out.println("3.- Buscar empleat per ID.");
			System.out.println("0.- Eixir.");
			System.out.print("Inserte una opcio valida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option) {	
			case 1:
				insertarEmpleats();
				break;
			case 2:
				llegirFitxer ();
				break;		
			case 3:
				buscarPerID ();
				break;
			case 0:
				System.out.println("Adeu, fins l'altra");
				break;
			default:
				System.out.println("Opcio no valida.");
				break;		
			}
		}while (option!=0);
	}
}