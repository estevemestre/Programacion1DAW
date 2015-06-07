// Crear una arraylist creem 3 usuaris a la volta 
// Medir el temps system.nanoTime();

// Executem el temps  i l'executem 2 vegades 



// ****Metodes per guardar en taula bd ****
// una unca sentencia insert into
// varies sentencies insert into 
// PrepararedSTatement 


// nomdelarray.clear



package Taules_2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {
	
	static Scanner reader = new Scanner(System.in);
	
	
	
	static ArrayList<Seccions> seccions = new ArrayList<Seccions>();
	static ArrayList<Productes> productes = new ArrayList<Productes>();
	

	
	
	
public static void borrarTaulues() {
		
	Connection con = ConexioBaseDades.MySQL.Connectar("shop");
	Statement st = null;
	
		String sql1 ="Drop table seccions";
		String sql2 ="Drop table productes";
		
		try {
			st = con.createStatement();
			st.executeUpdate(sql1);
			st.executeUpdate(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void 	taulaSeccions () {
		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		
		
		String sql ="CREATE TABLE IF NOT EXISTS seccions (CODI VARCHAR (30), NOM VARCHAR (30), PRIMARY KEY (CODI) );";
		try {
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insertarSeccions () {

		int codi = ultimaSeccio();
		
		String pregunta = "si";
		
		do {
			codi = codi +1;
			
			seccions.add(new Seccions(codi));
			System.out.println("Vols introduir mes seccions ? (si/no)");
			pregunta = reader.nextLine();
		}while (pregunta.equalsIgnoreCase("si"));
		
		guardarSeccions();
	}
	
	public static int ultimaSeccio () {
		
		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		
		
		int auxCodi = 0;
		String sql ="SELECT COUNT(CODI) from seccions";
		
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.absolute(1);  // Files que retorna la consulta 
			auxCodi= rs.getInt(1); // De les files que retora accedist a la columna 1
			
		} catch (SQLException e) {
			// TODO Auto-generated catch 
			e.printStackTrace();
		}
		return auxCodi;
	}
	
public static void guardarSeccions () {

	Connection con = ConexioBaseDades.MySQL.Connectar("shop");
	Statement st = null;
	
	
	
	Seccions sec= null;
	String sql= null;
	
	
	try {
		st = con.createStatement();
		for (int i = 0; i <seccions.size(); i++) {
			
			sec= seccions.get(i);
			
			//sql="INSERT INTO seccions VALUES('" + sec.getCodi()  + "','" + user.getContrassenya() + "','" + user.getNom()+"','"+ user.getCognoms() +"');";
			
	
																				
			sql="INSERT INTO seccions VALUES('"+sec.getCodi()+"','"+sec.getNom() +"');";
			System.out.println(sql);
			st.executeUpdate(sql);
		}
		
		
		//con.close(); //Hem tancat la conexió
		
		
		
		
		/*ALTRA FORMA!!!!!!!!!!!!!! NO L'ENTENC
		 * for (int i = 0; i <usuaris.size(); i++) {
			
			user= usuaris.get(i);
			sql=sql + "(" + user.getUsuari()  + "','" + user.getContrassenya() + "','" + user.getNom()+"','"+ user.getCognoms() +"');";
			st.executeUpdate(sql);
		}
		 * 
		 * sql ="INSERT INTO usuaris VALUES".concat(sql);
		 * sql = sql. substring 0,sql.length()-1);
		 * st.executeUpdate(sql);
		 * 
		 */
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
}
	
	public static String  buscarSeccions () {
		
		// Totes les seccionns 
		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		
		
		String sql ="SELECT codi, nom  from seccions";
		
		
		
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
	
			while(rs.next()) {
				
				System.	out.println("Codi: " +rs.getString(1)+ " Nom: " +rs.getString(2));
				System.out.println();	
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("inserta el codi de seccio");
		String sec = reader.nextLine();
		
		
		String sql1 ="SELECT codi from seccions where codi ='"+sec+"'";
		
		

			try {
				st = con.createStatement();
				ResultSet rs1 = st.executeQuery(sql1);			
				
				if(rs1.last()) {
					System.out.println("Si que existeix el codi " +sec);
					
					return sec;
				
				}else{ 
					System.out.println("No existeix el codi perfavor tornau ha intentar ");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return buscarSeccions();
	}
	
	

	public static void taulaProductes () {

		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		
		
		String sql ="CREATE TABLE IF NOT EXISTS productes (CODI VARCHAR (3) PRIMARY KEY, NOM VARCHAR (20), DESCRIPCIO VARCHAR (40), PREU_UNITARI DOUBLE,SECCIO VARCHAR (3) NOT NULL, CONSTRAINT `prova` FOREIGN KEY (`SECCIO`) REFERENCES `seccions` (`CODI`));";
		
		try {
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Primer tens de crear la taula Seccions");
			e.printStackTrace();
		
			
		
		}
		
	}
	
	
	
	public static void insertarProductes () {
		String pregunta = "si";
		int codi = ultimProducte();
		do {
		
		codi = codi +1;
		productes.add(new Productes(codi,buscarSeccions()));
			
			System.out.println("Vols introduir mes productes ? (si/no)");
			pregunta = reader.nextLine();
		}while (pregunta.equalsIgnoreCase("si"));
		
		guardarProductes();
		productes.clear();
	}
	

	public static int ultimProducte() {
		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		
		
		int auxCodi = 0;
		String sql ="SELECT COUNT(CODI) from productes";
		
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.absolute(1);  // Files que retorna la consulta 
			auxCodi= rs.getInt(1); // De les files que retora accedist a la columna 1
			
		} catch (SQLException e) {
			// TODO Auto-generated catch 
			e.printStackTrace();
		}
		return auxCodi;
		
	}



	public static void guardarProductes() {
		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		
		
		Productes product= null;
		String sql= null;
				
		try {
			
			st = con.createStatement();
			
			for (int i = 0; i <productes.size(); i++) {
				
				product= productes.get(i);
				
				sql="INSERT INTO productes VALUES('"+product.getCodi()+"','"+product.getNom()+"','"+product.getDescripcio()+"','"+product.getPreu_unitari()+"','"+product.getSeccio() +"');";
				
				st.executeUpdate(sql);
			}
			
			con.close(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
	


	public static void llistarProductes() {
		
		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		
		String seccio = buscarSeccions();
		
		
		String sql ="Select * from productes where seccio ='"+seccio+"';";

		try {
			st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			int num = 0;
			while(rs.next()) {
				num = num +1;
				System.out.println("======PRODUCTE: "+num+"======");
				System.out.println("Codi: "+rs.getString(1) +
									"\nNom: "+rs.getString(2)+ 
									"\nDescripcio: " +rs.getString(3)+
									"\nPreu: " +rs.getString(4) +
									"\nSeccio: "+ rs.getString(5));
				System.out.println();
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
	public static void 	incrementarPreuProducte() {
		// Incrementar un 10 % els preus dels productes de les seccions amb mes de 3 productes

		Connection con = ConexioBaseDades.MySQL.Connectar("shop");
		Statement st = null;
		ResultSet rs = null;
		Statement st1 = null;
	
	
		
		String sql ="SELECT SECCIO FROM PRODUCTES GROUP BY SECCIO HAVING COUNT(*) > 3;";
		
		
		try {
			
			st = con.createStatement();
			rs = st.executeQuery(sql);
			st1 = con.createStatement();
			String seccio;
		
				while(rs.next()) {
					seccio = rs.getString(1);
					String sql1 ="update productes set PREU_UNITARI = PREU_UNITARI + PREU_UNITARI * 0.10 where SECCIO = '"+seccio+"';";
					st1.executeUpdate(sql1);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	public static void menu() {
		int option;
		do {
			System.out.println("1_ Crear taula seccions");
			System.out.println("2_ Crear procuctes");
			System.out.println("3_Borrar les taules ");
			System.out.println("4_Insertar Seccions");
			System.out.println("5_Insertar Prductes");
			System.out.println("6_LListar productes per seccio ");
			System.out.println("7_Incrementar el preu");
			// Incrementar un 10 % els preus dels productes de les seccions amb mes de 3 productes
			System.out.println("0_Eixir");
			System.out.print("Inserte una opción válida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option ){
			case 1:
				taulaSeccions();
				break;
			case 2:
				taulaProductes();
				break;
			case 3:
				borrarTaulues();
				break;
			case 4:
				insertarSeccions();
				break;
			case 5:
				insertarProductes();
				break;
			case 6:
				llistarProductes();
				break;
			case 7:
				incrementarPreuProducte();
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (option != 0);
	}

	
	
	public static void main(String[] args) {	
		menu();
	}
}
