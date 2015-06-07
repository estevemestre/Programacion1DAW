package Prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class TempsInsercio {
	static ArrayList <Usuari> usuaris = new ArrayList <Usuari>();

	//m�tode insertar usuari una sent�ncia per cada usuari.
	public static void insertar1(ArrayList <Usuari> usuaris){
		Connection con=connectarBD(); //connexi�
		Statement st;
		
		String consulta= "";
		
		try {
			st=con.createStatement(); //crear el statement (necessita una connexi� "con")
			for (int i = 0; i < usuaris.size(); i++) {
			//afegix els valors de cada ususari 
			consulta="INSERT INTO usuaris VALUES ('"+usuaris.get(i).getUsuari()+
					"','"+usuaris.get(i).getPass()+"','"
					+usuaris.get(i).getNom()+"','"+
					usuaris.get(i).getCognoms()+"')";  
			st.executeUpdate(consulta); //executa la consulta
			}		
			con.close(); //tanquem la connexi�
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//M�tode per insertar usuari una sent�ncia insert per a tots els usuaris
	public static void insertar2(ArrayList <Usuari> usuaris){
		Connection con=connectarBD(); //connexi�
		Statement st;
		
		String consulta= "";
		
		try {
			st=con.createStatement(); //crear el statement (necessita una connexi� "con")
			for (int i = 0; i < usuaris.size(); i++) {
			//afegix els valors de cada ususari 
			consulta=consulta+"('"+usuaris.get(i).getUsuari()+
					"','"+usuaris.get(i).getPass()+"','"
					+usuaris.get(i).getNom()+"','"+
					usuaris.get(i).getCognoms()+"'),";  
			
			}
			consulta="INSERT INTO usuaris VALUES"+consulta; //s'acaba de crear la sent�ncia SQL
			consulta= consulta.substring(0, consulta.length()-1); //lleva la coma del final del string
			st.executeUpdate(consulta); //executa la consulta
			con.close(); //tanquem la connexi�
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//m�tode per insertar usuaris amb sent�ncies preparades PreparedStatement
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
	
	//m�tode per connectar a la base da dades, retorna la connexi� o null si hi ha error
	public static Connection connectarBD(){
		
		String url="jdbc:mysql://localhost/programacio"; //obrir la connexi�
		Connection con=null;//declare l'objecte de connexi�
		
		try {
			Class.forName("com.mysql.jdbc.Driver");// carregar el driver
			con=DriverManager.getConnection(url,"root",""); //obri la connexi�
		} catch (ClassNotFoundException e) { //quan no traba el driver
			
			e.printStackTrace();
		} catch (SQLException e) { // quan no pot connectar-se a la base de dades
			
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args) {
		usuaris.add(new Usuari("pepe","1234","Pepe","Rodr�guez"));
		usuaris.add(new Usuari("Lona","1234","Lorena","Rodr�guez"));
		usuaris.add(new Usuari("Josep","1234","Josep","Metau"));
		
		double temps1;
		double temps2;
		double total;
		
		// UNA PER USUARI
		temps1=System.nanoTime();//temps que comen�a l'execuci�
		insertar1(usuaris);  //executem m�tode inserta cada usuari en una sent�ncia insert into diferent
		temps2=System.nanoTime(); //temps que acaba l'execuci�
		total=temps2-temps1; //temps que dura l'execuci�
		System.out.println("Un INSERT INTO per cada usuari. Temps: "+total);
		
		usuaris.clear(); //borrem el que hi ha a l'array.
		usuaris.add(new Usuari("ramon","1234","ramon","Rodr�guez"));
		usuaris.add(new Usuari("pepa","1234","pepa","Rodr�guez"));
		usuaris.add(new Usuari("Josefina","1234","Josefina","Metau"));
		
		//UNA PER A TOTS ELS USUARIS
		temps1=System.nanoTime();//temps que comen�a l'execuci�
		insertar2(usuaris);  //executem m�tode inserta cada usuari en una sent�ncia insert into diferent
		temps2=System.nanoTime(); //temps que acaba l'execuci�
		total=temps2-temps1; //temps que dura l'execuci�
		System.out.println("Un INSERT INTO amb tots els usuaris. Temps: "+total);
		
		usuaris.clear(); //borrem el que hi ha a l'array.
		usuaris.add(new Usuari("pablo","1234","pablo jos�","Rodr�guez"));
		usuaris.add(new Usuari("alba","1234","alba","Rodr�guez"));
		usuaris.add(new Usuari("roberta","1234","Roberta","Metau"));
		
		//AMB SENTENCIA PREPARADA
		temps1=System.nanoTime();//temps que comen�a l'execuci�
		insertar3(usuaris);  //executem m�tode inserta cada usuari en una sent�ncia insert into diferent
		temps2=System.nanoTime(); //temps que acaba l'execuci�
		total=temps2-temps1; //temps que dura l'execuci�
		System.out.println("Un INSERT INTO amb ssent�ncia preparada. Temps: "+total);
		
	}

}
