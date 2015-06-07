package fer;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;



public class EmpleatUtf {
	static Scanner reader=new Scanner(System.in);
	
	
	
	public static void omplirFitxer(){
		String resposta;
		RandomAccessFile operacions;
		
		try {
				operacions=new RandomAccessFile("empleats.dat","rw");
			do{
				System.out.println("Inserta la id : ");
				operacions.writeInt(Integer.parseInt(reader.nextLine()));
				System.out.println("Inserta el nom de empleat: ");
				operacions.writeUTF(reader.nextLine());
				System.out.println("Inserta el numero de departaments: ");
				operacions.writeInt(Integer.parseInt(reader.nextLine()));
				System.out.println("Inserta el sou ");
				operacions.writeDouble(Double.parseDouble(reader.nextLine()));
				System.out.println("Vols introduir mes (si)o(no)");
				resposta=reader.nextLine();
			}while(resposta.equalsIgnoreCase("si"));
			
			operacions.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	public static void llegirFitxer(){
		int id;
		RandomAccessFile operacions;
		try {
			operacions=new RandomAccessFile("empleats.dat","rw");
			while((id=operacions.readInt())!=0){
				System.out.println(id+"  "+operacions.readUTF()+" "+operacions.readInt()+" "+operacions.readDouble());
			}
			operacions.close();
		} catch(EOFException e){
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void buscarEmpleat(){
		int idIntroduir;
		int id;
		try {
			RandomAccessFile operacions=new RandomAccessFile("empleats.dat","rw");
			
			System.out.println("Inserta la id que vols buscar");
			idIntroduir = Integer.parseInt(reader.nextLine());
			
			while((id=operacions.readInt())!=0){
				if(idIntroduir==id){
					System.out.println(id+" "+operacions.readUTF()+" "+operacions.readInt()+" "+operacions.readDouble());
				}else{
					operacions.readUTF();
					operacions.readInt();
					operacions.readDouble();
				}
			}
			operacions.close();
			
		} catch(EOFException e){
			//e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void afegirEmpleat(){
		String resposta = null;
		RandomAccessFile operacions;
		do{
		
		try {
			operacions=new RandomAccessFile("empleats.dat","rw");
			operacions.seek(operacions.length());
			
			System.out.println("Introdueix el id del nou empleat: ");
			operacions.writeInt(Integer.parseInt(reader.nextLine()));
			System.out.println("Introdueix el nom del nou empleat: ");
			operacions.writeUTF(reader.nextLine());
			System.out.println("Introdueix el numero de departament: ");
			operacions.writeInt(Integer.parseInt(reader.nextLine()));
			System.out.println("Introdueix el sou del nou empleat: ");
			operacions.writeDouble(Double.parseDouble(reader.nextLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Vols insertar mes empleats ? (Si)o(No)");
		resposta=reader.nextLine();
		}while(resposta.equalsIgnoreCase("SI"));
		
		}
		
	public static void main(String[] args) {
		int menu;
		do{
			System.out.println("1_Omplir fitxer empleats: ");
			System.out.println("2_Llegir fitxer empleats: ");
			System.out.println("3_ Buscar empleat per id: ");
			System.out.println("4_ Afegir empleat: ");
			System.out.println("0_ Eixir");
			System.out.println("Elegix una opció: ");
			menu=Integer.parseInt(reader.nextLine());
			
			switch(menu){
				case 1:
					omplirFitxer();
					break;
				case 2:
					llegirFitxer();
					break;
				case 3: 
					buscarEmpleat();
					break;
				case 4:
					afegirEmpleat();
					break;
				case 0: 
					System.out.println("Adeu fins l'altra");
					break;
				default:
					System.out.println("Opció no correcta");
					break;
			}
		}while(menu!=0);

	}
}
	

