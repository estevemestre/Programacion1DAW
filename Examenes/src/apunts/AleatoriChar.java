package apunts;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class AleatoriChar {
	
static Scanner teclat = new Scanner(System.in);
	
	static ArrayList<Empleat> emple=new ArrayList<Empleat>();
	
	public static void menuPrincipal(File f){	
		int option=0;
		do{
			System.out.println("GESTIO EMPLEATS");
			System.out.println("==================");
			System.out.println("1.- Omplir fitxer d'empleats.");
			System.out.println("2.- Llegir contingut.");
			System.out.println("3.- Buscar empleat per ID.");
			System.out.println("4.- Afegir empleat.");
			System.out.println("0.- Eixir.");
			System.out.print("Inserte una opcio valida: ");
			option=Integer.parseInt(teclat.nextLine());
			
			switch (option) {	
			case 1:escriureFitxer(f)
				;break;
			case 2:llegirFitxer (f)
				;break;		
			case 3:buscarPerID (f)
				;break;
			case 4:	afegirEmpleat(f)
				;break;
			case 0:
				System.out.println("Aplicacio finalitzada.");
				break;
			default:
				System.out.println("Opcio no valida.");
				break;		
			}
		}while (option!=0);
	}
	
	public static void escriureFitxer(File f){		
		
		RandomAccessFile rf=null;
		StringBuffer nom;
		
		try {
			rf = new RandomAccessFile(f, "rw");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		try {
			String mesUsuaris="";
			
			do {
				emple.add(new Empleat());
				System.out.println("Vols introduir més usuaris?");
				mesUsuaris = teclat.nextLine();
			}while(mesUsuaris.equalsIgnoreCase("si"));
			for (int i = 0; i < emple.size(); i++) {
				rf.writeInt(emple.get(i).getId());
				nom = new StringBuffer(emple.get(i).getNom());
				nom.setLength(20);
				rf.writeChars(nom.toString());
				rf.writeInt(emple.get(i).getDept());
				rf.writeDouble(emple.get(i).getSou());
			}
			rf.close();
			emple.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void llegirFitxer (File f){
		RandomAccessFile rf=null;
		String nomAux="";
		char[] nom=new char[20];
		
		try {
			rf = new RandomAccessFile(f, "rw");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {	
			rf.seek(0);
			while((rf.getFilePointer())<(rf.length())){
				System.out.println("ID: "+rf.readInt());
				for (int i = 0; i < nom.length; i++) {
					nom[i]=rf.readChar();
				}
				System.out.println("Nom: "+new String(nom));
				System.out.println("Departament: "+rf.readInt());
				System.out.println("Sou: "+rf.readDouble());
				System.out.println();
			}
		} catch (EOFException eof){
			//System.out.println("Fi de l'arxiu");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void buscarPerID (File f){
		RandomAccessFile rf=null;
		String nomAux="";
		char[] nom=new char[20];
		
		System.out.println("Donam ID a buscar");
		int idAux = Integer.parseInt(teclat.nextLine());
		boolean encontrado = false;

		try {
			rf = new RandomAccessFile(f, "rw");
			//rf.seek(0);
			while((rf.getFilePointer())<(rf.length())){
				if(idAux==rf.readInt()){
					System.out.println("ID: "+idAux);
					for (int i = 0; i < nom.length; i++) {
						nom[i]=rf.readChar();
					}
					System.out.println("Nom: "+new String(nom));
					System.out.println("Departament: "+rf.readInt());
					System.out.println("Sou: "+rf.readDouble());
					encontrado = true;
				} else {
					for (int i = 0; i < nom.length; i++) {
						nom[i]=rf.readChar();
					}
					rf.readInt();
					rf.readDouble();
				}
			}
			if(!encontrado){
				System.out.println("Empleado no encontrado");
			}
		} catch(EOFException e){
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void afegirEmpleat(File f){
		RandomAccessFile rf=null;
		//String nomAux="";
		char[] nom=new char[20];
		StringBuffer nomA;
		
		try {
			rf = new RandomAccessFile(f, "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Empleat emplea = new Empleat();
		
		int contaEmpleats=0;
		try {
			rf.seek(0);
			while((rf.getFilePointer())<(rf.length())){
				rf.readInt();
				for (int i = 0; i < nom.length; i++) {
					nom[i]=rf.readChar();
				}
				rf.readInt();
				rf.readDouble();
				contaEmpleats++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			rf.seek(rf.length());
			rf.writeInt(contaEmpleats);
			nomA = new StringBuffer(emplea.getNom());
			nomA.setLength(20);
			rf.writeChars(nomA.toString());			
			rf.writeInt(emplea.getDept());
			rf.writeDouble(emplea.getSou());
		} catch(EOFException e){
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		File f = new File("EmpleadoChar.dat");
		menuPrincipal(f);
		
	}
}