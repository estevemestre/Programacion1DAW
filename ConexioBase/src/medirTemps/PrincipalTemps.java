/* Crear una arraylist creem 3 usuaris a la volta 
 * Medir el temps system.nanoTime();
 * Executem el temps  i l'executem 2 vegades 
 * Metodes per guardar en taula bd ****
 * una unca sentencia insert into
 * varies sentencies insert into 
 * PrepararedSTatement 
 * nomdelarray.clear
 */

package medirTemps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import ConexioBaseDades.MySQL;


public class PrincipalTemps {
	
	static ArrayList <Usuari> usuaris = new ArrayList <Usuari>();
	static Scanner reader = new Scanner (System.in);

	//Mètode per insertar usuari una sentència insert per a tots els usuaris
	public static void unicaSentencia(){
		Connection con= MySQL.Connectar("programacio");
		Statement st;	
		String sql= "";
			
			try {
				st=con.createStatement(); 
				
				Usuari u;
				for (int i = 0; i < usuaris.size(); i++) {
					
				u = usuaris.get(i);
				sql=sql+"('"+u.getNom_usuari()+"','"+u.getContrassenya()+"','"+u.getNom()+"','"+u.getCognoms()+"'),";  
				}
				sql="INSERT INTO usuaris VALUES"+sql; 
				sql= sql.substring(0, sql.length()-1); 
	
				st.executeUpdate(sql+";"); 
				con.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	

	public static void moltesSentencies(){
		Connection con=MySQL.Connectar("programacio");
		Statement st;
		String sql= null;;
		try {
			st=con.createStatement();
			
			Usuari u;
			
			for (int i = 0; i < usuaris.size(); i++) {
				u = usuaris.get(i);
				sql="INSERT INTO usuaris VALUES ('"+u.getNom_usuari()+"','"+u.getContrassenya()+"','"+u.getNom()+"','"+u.getCognoms()+"')";  
				st.executeUpdate(sql);
			}		
			con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	
	public static void sentenciesPreparades(){
		Connection con= MySQL.Connectar("programacio");
		
	
		PreparedStatement pS;
		
		String sql="INSERT INTO usuaris (nom_usuari, contrassenya, nom, cognoms) VALUES (?,?,?,?)";
		try {
			pS = con.prepareStatement(sql);
			
			Usuari u;
			for (int i = 0; i < usuaris.size(); i++) {
				u=usuaris.get(i);
				pS.setString(1,u.getNom_usuari());
				pS.setString(2,u.getContrassenya());
				pS.setString(3,u.getNom());
				pS.setString(4,u.getCognoms());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void borrarBD () {
		Connection con = MySQL.Connectar("programacio");
		
		String sql ="delete from usuaris;";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	
	public static void main(String[] args) {
	
		usuaris.add(new Usuari("emestre","lliurex","Garcia","Mestre"));
		usuaris.add(new Usuari("elduro","admin","Maria","Company"));
		usuaris.add(new Usuari("jmjtre","jware","Luis","Alemany"));
		
		
		double temps;
		double auxTemps;
		double tempsTotal;
		
		
		
	
		int option;
				do {
					System.out.println("1_Única sentencia");
					System.out.println("2_Moltes sentencies");
					System.out.println("3_Sentencies preparades");
					System.out.println("0_Eixir");
					System.out.print("Inserte una opción válida: ");
					option=Integer.parseInt(reader.nextLine());
					
					switch (option ){
					case 1:
						temps=System.nanoTime();
						unicaSentencia();
						auxTemps=System.nanoTime();
						tempsTotal=auxTemps-temps;
						System.out.println("Unica sentencia "+tempsTotal);
						borrarBD();
						break;
					case 2:
						temps=System.nanoTime();
						moltesSentencies();
						auxTemps=System.nanoTime();
						tempsTotal=auxTemps-temps;
						System.out.println("Varies sentencies: "+tempsTotal);
						borrarBD();
						break;
					case 3:
						temps=System.nanoTime();
						sentenciesPreparades();
						auxTemps=System.nanoTime();
						tempsTotal=auxTemps-temps;
						System.out.println("Sentencies preparades: "+tempsTotal);
						borrarBD();
						break;
					case 0:
						break;
					default:
						System.out.println("Opción no válida.");
						break;
							
					}
				} while (option != 0);
			}
}

		
	/*	
		
		// UNA PER USUARI
		temps1=System.nanoTime();//temps que comença l'execució
		insertar1(usuaris);  //executem mètode inserta cada usuari en una sentència insert into diferent
		temps2=System.nanoTime(); //temps que acaba l'execució
		total=temps2-temps1; //temps que dura l'execució
		System.out.println("Un INSERT INTO per cada usuari. Temps: "+total);
		
		usuaris.clear(); //borrem el que hi ha a l'array.
		usuaris.add(new Usuari("ramon","1234","ramon","Rodríguez"));
		usuaris.add(new Usuari("pepa","1234","pepa","Rodríguez"));
		usuaris.add(new Usuari("Josefina","1234","Josefina","Metau"));
		
		//UNA PER A TOTS ELS USUARIS
		temps1=System.nanoTime();//temps que comença l'execució
		insertar2(usuaris);  //executem mètode inserta cada usuari en una sentència insert into diferent
		temps2=System.nanoTime(); //temps que acaba l'execució
		total=temps2-temps1; //temps que dura l'execució
		System.out.println("Un INSERT INTO amb tots els usuaris. Temps: "+total);
		
		usuaris.clear(); //borrem el que hi ha a l'array.
		usuaris.add(new Usuari("pablo","1234","pablo josé","Rodríguez"));
		usuaris.add(new Usuari("alba","1234","alba","Rodríguez"));
		usuaris.add(new Usuari("roberta","1234","Roberta","Metau"));
		
		//AMB SENTENCIA PREPARADA
		temps1=System.nanoTime();//temps que comença l'execució
		insertar3(usuaris);  //executem mètode inserta cada usuari en una sentència insert into diferent
		temps2=System.nanoTime(); //temps que acaba l'execució
		total=temps2-temps1; //temps que dura l'execució
		System.out.println("Un INSERT INTO amb ssentència preparada. Temps: "+total);
		
	}

}
*/