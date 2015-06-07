package Prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class TempsInsercio {
	static ArrayList <Usuari> usuaris = new ArrayList <Usuari>();

	//mètode insertar usuari una sentència per cada usuari.
	public static void insertar1(ArrayList <Usuari> usuaris){
		Connection con=connectarBD(); //connexió
		Statement st;
		
		String consulta= "";
		
		try {
			st=con.createStatement(); //crear el statement (necessita una connexió "con")
			for (int i = 0; i < usuaris.size(); i++) {
			//afegix els valors de cada ususari 
			consulta="INSERT INTO usuaris VALUES ('"+usuaris.get(i).getUsuari()+
					"','"+usuaris.get(i).getPass()+"','"
					+usuaris.get(i).getNom()+"','"+
					usuaris.get(i).getCognoms()+"')";  
			st.executeUpdate(consulta); //executa la consulta
			}		
			con.close(); //tanquem la connexió
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//Mètode per insertar usuari una sentència insert per a tots els usuaris
	public static void insertar2(ArrayList <Usuari> usuaris){
		Connection con=connectarBD(); //connexió
		Statement st;
		
		String consulta= "";
		
		try {
			st=con.createStatement(); //crear el statement (necessita una connexió "con")
			for (int i = 0; i < usuaris.size(); i++) {
			//afegix els valors de cada ususari 
			consulta=consulta+"('"+usuaris.get(i).getUsuari()+
					"','"+usuaris.get(i).getPass()+"','"
					+usuaris.get(i).getNom()+"','"+
					usuaris.get(i).getCognoms()+"'),";  
			
			}
			consulta="INSERT INTO usuaris VALUES"+consulta; //s'acaba de crear la sentència SQL
			consulta= consulta.substring(0, consulta.length()-1); //lleva la coma del final del string
			st.executeUpdate(consulta); //executa la consulta
			con.close(); //tanquem la connexió
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//mètode per insertar usuaris amb sentències preparades PreparedStatement
	public static void insertar3(ArrayList <Usuari> usuaris){
		Connection con=connectarBD();
		String sql="INSERT INTO usuaris (usuari, contrasenya, nom, cognoms) VALUES (?,?,?,?)";
		PreparedStatement sentencia;
		try {
			sentencia = con.prepareStatement(sql);
			for (int i = 0; i < usuaris.size(); i++) {
				Usuari u=usuaris.get(i);
				sentencia.setString(1,u.getUsuari());
				sentencia.setString(2, u.getPass());
				sentencia.setString(3,u.getNom());
				sentencia.setString(4, u.getCognoms());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	//mètode per connectar a la base da dades, retorna la connexió o null si hi ha error
	public static Connection connectarBD(){
		
		String url="jdbc:mysql://localhost/programacio"; //obrir la connexió
		Connection con=null;//declare l'objecte de connexió
		
		try {
			Class.forName("com.mysql.jdbc.Driver");// carregar el driver
			con=DriverManager.getConnection(url,"root",""); //obri la connexió
		} catch (ClassNotFoundException e) { //quan no traba el driver
			
			e.printStackTrace();
		} catch (SQLException e) { // quan no pot connectar-se a la base de dades
			
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args) {
		usuaris.add(new Usuari("pepe","1234","Pepe","Rodríguez"));
		usuaris.add(new Usuari("Lona","1234","Lorena","Rodríguez"));
		usuaris.add(new Usuari("Josep","1234","Josep","Metau"));
		
		double temps1;
		double temps2;
		double total;
		
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
