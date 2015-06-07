/*	1º  Carregem el driver
 * 	2º	Obrir la conexio 
 * 	3º	Crear una conexio
 * 	
 */

package Prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;




public class prova {
	
	static Scanner reader= new Scanner(System.in);
	
//METODE PER A CONECTAR A LA BASE DE DADES, RETORNA LA CONEXIÓ O NULL SI HI HA ERROR.
	
	
	public static Connection connectarBD(){
		
		
		String url="jdbc:mysql://localhost/programacio"; 	
		Connection con = null; //Conexió
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //* Carregem el driver 
			con = DriverManager.getConnection(url,"root", ""); // L'encarregat d'obrir una nova conexio connexió
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	//-------------------------------------------------------
	
	//METODE PER A INSERTAR L'USUARI
	public static void insertarUsuari(){
		
		Connection con = connectarBD(); //Crida el metodo conectar
		
		Statement st; //Els objectes Statement els crea la connexió
		
		System.out.println("Login: ");
		String usuari= reader.nextLine();
		
		System.out.println("Contrassenya: ");
		String contrassenya= reader.nextLine();
		
		System.out.println("Nom d'usuari: ");
		String nom= reader.nextLine();
		
		System.out.println("Cognoms ");
		String cognoms= reader.nextLine();
		
		String sql= "INSERT INTO usuaris VALUES(' " + usuari + "','" + contrassenya + "','" + nom+"','"+cognoms +"');";
		
		try {
			
			st = con.createStatement();  // crea una conexio
			st.executeUpdate(sql); // Per a ejecutar els SELECT
			
			con.close(); //Hem tancat la conexió
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
	
	//-------------------------------------------------------------------------------------------
	
	//LISTAR USUARIS.
	public static void llistarUsuaris(){
		
		Connection con= connectarBD(); //Crida el metodo conectar
		
		Statement st; //Els objectes Statement els crea la connexió
		
		String sql= "SELECT * FROM usuaris;";
		
		ResultSet rs; //Per a guardar els resultats de la consulta
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql); //AVANÇAR FILA A FILA (recorreles)
			
			while(rs.next()){ //MENTRES HI HAGEN REGISTRES ANEM A VITSUALITZAR LO QUE NIA.
			
				System.out.println("Login: " + rs.getString(1) + "\nPassword: " + rs.getString("contrassenya") +
						"\nNom: " + rs.getString(3) + "\nCognoms: " + rs.getString(4)); 
				System.out.println();
			}
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace(); //Errors que ixen en roig
		} 
	}
	
	//-------------------------------------------------------------------------------------------
	
		//Modificar contrassenya.
	public static void modificarContrassenya(){
		
		Connection con= connectarBD(); //Crida el metodo conectar
		Statement st; //Els objectes Statement els crea la connexió
		ResultSet rs;
		
		System.out.println("Inserta login");
		String login= reader.nextLine();
		
		try{
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM usuaris WHERE nom_usuari='"+ login + "';"); //AVANÇAR FILA A FILA (recorreles)
		
		while(rs.next()){ //MENTRES HI HAGEN REGISTRES ANEM A VITSUALITZAR LO QUE NIA.
		
			System.out.println("Login: " + rs.getString(1) + "\nPassword: " + rs.getString("contrassenya") +
					"\nNom: " + rs.getString(3) + "\nCognoms: " + rs.getString(4)); 
			System.out.println();
		}
		
		System.out.println("Inserta una nova contrasenya");
		String contrassenya= reader.nextLine();
		
		st.executeUpdate("UPDATE usuaris SET contrassenya='" + contrassenya + "' WHERE nom_usuari='" + login + "';");
		
		con.close();
		
		} catch (SQLException e) {
			
			e.printStackTrace(); //Errors que ixen en roig
		} 
	
	
	}
	
	//-------------------------------------------------------------------------
	//ELIMINAR USUARI DE LA TAULA:
	
	public static void eliminarUsuari(){
		
		Connection con= connectarBD(); //Crida el metodo conectar
		Statement st; //Els objectes Statement els crea la connexió
		ResultSet rs;
		
		System.out.println("Inserta login");
		String login= reader.nextLine();
		 
		
		try{
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM usuaris WHERE nom_usuari='" + login + "';"); //AVANÇAR FILA A FILA (recorreles)
		
		while(rs.next()){ //MENTRES HI HAGEN REGISTRES ANEM A VITSUALITZAR LO QUE NIA.
		
			System.out.println("Login: " + rs.getString(1) + "\nPassword: " + rs.getString("contrassenya") +
					"\nNom: " + rs.getString(3) + "\nCognoms: " + rs.getString(4)); 
			System.out.println();
		}
		
		System.out.println("Estas segur de que vols borrar l'usuari? (si o no)");
		String resposta= reader.nextLine();
		
		if (resposta.equalsIgnoreCase("si")) {
			st.executeUpdate("DELETE FROM usuaris WHERE nom_usuari='" + login + "';");
		}
		
		con.close();
		
		} catch (SQLException e) {
			
			e.printStackTrace(); //Errors que ixen en roig
		} 
	
	
	}
	
	//-------------------------------------------------------------------------
	
	public static void main(String[]args){
	
	
		int option;
		do {
			System.out.println("1_ Llistar tota la base de dades ");
			System.out.println("2_ Eliminar un usuari de una taula");
			System.out.println("3_ Modificar un usuari la contrasenya");
			System.out.println("0_ Eixir");
			System.out.println("");
			System.out.println("");
			System.out.print("Inserte una opción válida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option ){
			case 1:
				llistarUsuaris();
				break;
			case 2:
				eliminarUsuari();
				break;
			case 3:
				modificarContrassenya();
				break;
			case 4:
				insertarUsuari();
			case 0:
				System.out.println("Adeu fins l'altra");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
					
			}
		} while (option != 0);
	
	}
}
