package Protjecte;
// LLançar aplicació desde el S.O
// Generar un .jar que contindra el main()
// java -jar tpv.jar 

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ConexioBaseDades.MySQL;



public class Principal {

	private static Scanner reader = new Scanner (System.in);
	
	private static ArrayList<Client> clients = new ArrayList<Client>();
	 static ArrayList<Producte> productes = new ArrayList<Producte>(); 
	

//****************************************************************************************
//**************************** GESTIO DE CLIENTS****************************************
//***************************************************************************************	
	public static void  crearClient() {
		Connection con = ConexioBaseDades.MySQL.Connectar("tpv");
		Statement st;
		ResultSet rs;
		int auxCodi = 90;
		
		String sql ="SELECT COUNT(CODI) FROM CLIENTS;";
			try {
				st = con.createStatement();
				rs = st.executeQuery(sql);	
				
				rs.absolute(1);  // Files que retorna la consulta 
				auxCodi= rs.getInt(1);
				
				
				System.out.println("CONSULTA PER A SABER QUIN ES EL ULTIM CODI"+auxCodi);
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println();
				System.out.println("**********************************************");
				System.out.println("S'ha produit un error en la base de dades");
				System.out.println("Perfavor comunicaliu al departament informatic");
				System.out.println("ERROR public static void  crearClient() {");
				System.out.println("**********************************************");
				System.out.println();
				menuPrincipal();
				//e.printStackTrace();
				
			}
			
		boolean buscar;
	
			String introduir;
			
			String nif;
			
			System.out.println("El codi antes de asignar val "+auxCodi);
			do{
			
				do {
					System.out.println("Introdueix el nif del client ");
					nif = reader.nextLine();
					buscar = buscarNif(nif);
				}while (buscar == true);
				
			auxCodi = auxCodi + 1;
			System.out.println("El aux codi que asgnare sera : "+auxCodi);
			clients.add(new Client(nif, auxCodi));
			System.out.println("Vols introduir un altre client (Si/No)");
			introduir = reader.nextLine();
			
			
			
			} while(introduir.equalsIgnoreCase("si"));	
			guardarClientBD();
			clients.clear();
	}
		
		
	public static void guardarClientBD () {
			Connection con = ConexioBaseDades.MySQL.Connectar("tpv");
			Statement st = null;
			Client cl= null;
			String sql1= null;
			
			try {

				st = con.createStatement();
				
				for (int i = 0; i < clients.size(); i++) {
			
				cl = clients.get(i);
				System.out.println("EL CODI ES: "+cl.getCodi());
				//sql1 ="INSERT INTO CLIENTS VALUES ('"+cl.getCodi()+"','"+cl.getNif()+"','"+cl.getNom()+"','"+cl.getApellidos()+"','"+cl.getRazonSocial()+"','"+cl.getDomicili()+"');";
				sql1 ="INSERT INTO CLIENTS (CODI, NIF, NOMBRE, APELLIDOS, RAZON_SOCIAL, DOMICILIO) VALUES ('"+cl.getCodi()+"','"+cl.getNif()+"','"+cl.getNom()+"','"+cl.getApellidos()+"','"+cl.getRazonSocial()+"','"+cl.getDomicili()+"');";
				//sql1="INSERT INTO clients VALUES('"+cl.getCodi()+"','"+cl.getNif()+"','"+cl.getNom()+"','"+cl.getApellidos()+"','"+cl.getRazonSocial()+"','"+cl.getDomicili() +"','CURRENT_DATE()');";
				System.out.println(sql1);
				st.executeUpdate(sql1);
					
				}
			}catch (SQLException e) {
				System.out.println();
				System.out.println("**********************************************");
				System.out.println("S'ha produit un error en la base de dades");
				System.out.println("**public static void guardarClientBD () {***");
				System.out.println("Perfavor comunicaliu al departament informatic");
				System.out.println("**********************************************");
				System.out.println();
				e.printStackTrace();
				menuPrincipal();
			}
	}
	
// Metode per a buscar el nif en el array i en la base de  dades 	
	public static boolean buscarNif (String nif) {
		
		boolean trobat = false;
		
		System.out.println("Metodo buscar ?" +nif);
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getNif().equalsIgnoreCase(nif)) {
				trobat = true;
				System.out.println("Hi ha un usuari en el mateix nif no puc crear-lo");
				return trobat;
				
			}
		}
		
		System.out.println("Buscar en base ?");
		
		Connection con = MySQL.Connectar("tpv");
		Statement st = null;
		ResultSet rs = null;
		String sql ="SELECT NIF FROM CLIENTS WHERE NIF = '"+nif+"'";
		try {
			
			 st = con.createStatement();
			 rs = st.executeQuery(sql);
	
				if (rs.next()) {
				
					trobat = true;
					System.out.println("Hi ha un usuari en el mateix nif no puc crear-lo");
					return trobat;
					
				}
		} catch (SQLException e) {
			System.out.println();
			System.out.println("**********************************************");
			System.out.println("S'ha produit un error en la base de dades");
			System.out.println("Perfavor comunicaliu al departament informatic");
			System.out.println("public static boolean buscarNif (String nif)");
			System.out.println("**********************************************");
			System.out.println();
			menuPrincipal();
		}
		
	return false;	
}
	
	
	
	public static void borrarClient (String codiClient) {
		
	
		System.out.println("Metodo borrar client");

		String sql ="DELETE FROM CLIENTS WHERE CODI='"+codiClient+"';";
		 

		Connection con = MySQL.Connectar("tpv");
		Statement st = null;
	

		try {
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println();
			System.out.println("**********************************************");
			System.out.println("S'ha produit un error en la base de dades");
			System.out.println("Perfavor comunicaliu al departament informatic");
			System.out.println("public static void borrarClient (String codiClient)");
			System.out.println("**********************************************");
			System.out.println();
		}
	}
	
	// retornara el codi  del client o null si no existeix
	public static String buscarClient () {
		
		Client.llistarUsuaris();
		
		Connection con = MySQL.Connectar("tpv");
		Statement st = null;
		ResultSet rs = null;
		
		String codi;
		
		
		System.out.println("Inserta el codi del client");
		codi = reader.nextLine();
		
		
		
		
		
		String sql ="SELECT CODI FROM CLIENTS WHERE CODI ='"+codi+"'";

		 try {
			 st = con.createStatement();
			 rs = st.executeQuery(sql);
			
			if (rs.next()) {
				System.out.println("Si que s'ha trobat codi del Usuari");
				
			// podria fer una consula açi
				
				
				return codi;
			}
			 
		
			 
		} catch (SQLException e) {
			System.out.println();
			System.out.println("**********************************************");
			System.out.println("S'ha produit un error en la base de dades");
			System.out.println("Perfavor comunicaliu al departament informatic");
			System.out.println("	public static String buscarClient () {");
			System.out.println("**********************************************");
			System.out.println();
		//	menuPrincipal();
		}
	
		System.out.println("No s'ha trobat cap usuari");
		System.out.println("Perfavor tornau a intentar");
		
		return buscarClient();
		
	}
	
//****************************************************************************************
//**************************** GESTIO DE PRODUCTES****************************************
//***************************************************************************************
	public static void crearProductes () {
		String introduir;
		do{
			String CodClient = buscarClient();
			productes.add(new Producte(CodClient));
			System.out.println("Vols introduir un altre producte (Si/No)");
			introduir = reader.nextLine();
		
		
		
		} while(introduir.equalsIgnoreCase("si"));	
		
		guardarProducteBD();
		
		productes.clear();
}
		
	
	
	public static void guardarProducteBD () {
		
		Connection con = MySQL.Connectar("tpv");
		try {
			Statement st = con.createStatement();
			
			
			
			for (int i = 0; i < productes.size(); i++) {
				Producte p = productes.get(i);
				
				
				//String sql ="INSERT INTO PRODUCTES VALUES (null, '"+p.getNom()+"','"+p.getCantStock()+"','"+p.getPrecioConIva()+"','"+p.getPrecioSinIva()+"','"+p.getCantStock()+"','"+p.getCodClient()+"');";
			String sql ="INSERT INTO PRODUCTES(NOM, DESCRIPCIO, PREU_IVA,  PREU_NO_IVA, STOCK, CODI_CLIENT) Values('"+p.getNom()+"','"+p.getDescripcio()+"','"+p.getPrecioConIva()+"','" + p.getPrecioSinIva() + "','" +p.getCantStock()+"','"+p.getCodClient()+"');";
				System.out.println(sql);

				st.executeUpdate(sql);
			}
		} catch (SQLException e) {
			System.out.println("**********************************************");
			System.out.println("S'ha produit un error en la base de dades");
			System.out.println("Perfavor comunicaliu al departament informatic");
			System.out.println("public static void guardarProducteBD () ");
			System.out.println("**********************************************");
			System.out.println("Fallo en preoductos"+e.getSQLState()+"\n"+e.getMessage());
		}	
	}

	
	//****************************************************************************************
	//**************************** GESTIO DE VENDES*******************************************
	//****************************************************************************************

	public static void llistarTotesFactura() {
		
		String sql="select * from factura;";
		
		ResultSet rs;
	
		rs = resultadoBase(sql);
		try {
			while(rs.next()) {
				System.out.println();
				System.out.println("***************");
				System.out.println("FACTURA: "+rs.getInt(1));
				System.out.println("***************");
				System.out.println("Codi: "+rs.getInt(1) +
								"\n Preu: "+rs.getDouble(2) +
								"\n Codi_client: "+rs.getString(4)+
								"\n Data: "+rs.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void llistarTicketsFacturats () {
		String sql="select * from ticket where codiFactura is not null;"; 
		ResultSet rs;
		rs = resultadoBase(sql);
		try {
			while(rs.next()) {
				System.out.println();
				System.out.println("***************");
				System.out.println("Ticket: "+rs.getInt(1));
				System.out.println("***************");
				System.out.println("Codi_ticket: "+rs.getInt(1) +
								"\n Data: "+rs.getString(2) +
								"\n Preu_iva: "+rs.getDouble(3) +
								"\n Preu_no_iva: "+rs.getDouble(4) +
								"\n Codi_factura: "+rs.getInt(5)+
								"\n Codi cliente: "+rs.getString(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void llistarTicketsNoFacturats () {
		String sql="select * from ticket where codiFactura is null;"; 
		ResultSet rs;
		rs = resultadoBase(sql);
		try {
			while(rs.next()) {
				System.out.println();
				System.out.println("***************");
				System.out.println("Ticket: "+rs.getInt(1));
				System.out.println("***************");
				System.out.println("Codi_ticket: "+rs.getInt(1) +
								"\n Data: "+rs.getString(2) +
								"\n Preu_iva: "+rs.getDouble(3) +
								"\n Preu_no_iva: "+rs.getDouble(4) +
								"\n Codi_factura: "+rs.getInt(5)+
								"\n Codi cliente: "+rs.getString(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void llistarLineaTickets () {
		
		int codiTicket = buscarTicket();

		String sql ="select * from lineaticket where coditicket= "+codiTicket+";";
		ResultSet rs = resultadoBase(sql);
		try {
			while(rs.next()) {
				System.out.println();
				System.out.println("***************");
				System.out.println("Linea: "+rs.getInt(1));
				System.out.println("***************");
				System.out.println("Codi_Linea: "+rs.getInt(1) +
								"\n Nom: "+rs.getString(2) +
								"\n Cantitat: "+rs.getInt(3) +
								"\n Preu iva: "+rs.getDouble(4) +
								"\n Preu_no_iva: "+rs.getDouble(5) +
								"\n Codi_Ticket: "+rs.getInt(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static int buscarTicket () {
		llistarTicketsFacturats();
		llistarTicketsNoFacturats();
		System.out.println("Introdueix el numero de Ticket");
		int ticket = Integer.parseInt(reader.nextLine());
		
		String sql ="select * from lineaticket where coditicket="+ticket+";";
		ResultSet st = resultadoBase(sql);
		
		
		try {
			if (st.next()) {
				System.out.println("Si que s'ha trobat el ticket");
				return ticket;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buscarTicket();
	}
	
	
	
	
	
	
	public static void menuVendes () {
			int option;
					do {
						System.out.println();
						System.out.println();
						System.out.println("==================================");
						System.out.println("******MENU GESTIO PRODUCTES*******");
						System.out.println("==================================");
						System.out.println("1_Gestiò de taules Mysql");
						System.out.println("2_Crear un ticket");
						System.out.println("3_Crear una Factura");
						System.out.println("4_Llistar totes les factures");
						System.out.println("5_Llistar tickets facturats*");
						System.out.println("6_Llistar tickets no facturats");
						System.out.println("7_Llistar linea tickets segons el ticket");
						System.out.println("0_ Eixir de la gestio de Productes");
						System.out.print("Inserte una opción válida: ");
						option=Integer.parseInt(reader.nextLine());
						
						switch (option ){
						case 1:
							gestioTaules();
							break;
						case 2:
							Ticket.crearTicket();
							break;
						case 3:
							Factura.CrearFacturaAny();
							break;
						case 4:
							llistarTotesFactura();
							break;
						case 5:
							llistarTicketsFacturats();
							break;
						case 6:
							llistarTicketsNoFacturats();
							break;
						case 7:
							llistarLineaTickets();
							break;
						case 0:
							break;
						default:
							System.out.println("Opción no válida.");
							break;
								
						}
					} while (option != 0);
			}
	

	
	//*******************GESTIO DE TAULES MYSQL
	public static void gestioTaules () {
		
		int option;
				do {
					System.out.println();
					System.out.println();
					System.out.println("==================================");
					System.out.println("******MENU GESTIO PRODUCTES*******");
					System.out.println("==================================");
					System.out.println("1_Crear taula Factura");
					System.out.println("2_Crear taula Ticket ");
					System.out.println("3_Crear taula linea tickets");
					System.out.println("4_Borrar taula linea tickets");
					System.out.println("5_Borrar taula ticket");
					System.out.println("6_borrar taula factura");
					System.out.println("0_ Eixir de la gestio de Productes");
					System.out.print("Inserte una opción válida: ");
					option=Integer.parseInt(reader.nextLine());
					
					switch (option ){
					case 1:
						String sqlCrearFactura ="CREATE TABLE IF NOT EXISTS `factura`( `codi` INT NOT NULL AUTO_INCREMENT, `preu_iva` DOUBLE, `preu_no_iva` DOUBLE, `codi_client` VARCHAR(5), `data` DATETIME DEFAULT CURRENT_TIMESTAMP, CONSTRAINT `faact` FOREIGN KEY (`codi_client`) REFERENCES `clients` (`CODI`), PRIMARY KEY (`codi`));";
						actualitzarBase(sqlCrearFactura);
						break;
					case 2:
						String sqlCrearTicket="Create table if not exists ticket (codi_ticket int auto_increment, fecha datetime default current_timestamp, preu_iva double, preu_no_iva double, codiFactura int default null, `codi_cliente` VARCHAR(5), CONSTRAINT `faascxt` FOREIGN KEY (`codi_cliente`) REFERENCES `clients` (`CODI`), constraint `ticket` FOREIGN KEY (`codiFactura`)  REFERENCES `factura` (`codi`),primary key (codi_ticket));";
						//String sqlCrearTicket="Create table if not exists ticket ( codi_ticket int auto_increment, fecha datetime default current_timestamp, preu_iva double, preu_no_iva double, codiFactura int default not null, constraint `ticket` FOREIGN KEY (`codiFactura`)  REFERENCES `factura` (`codi`), primary key (codi_ticket));";
						actualitzarBase(sqlCrearTicket);
						break;
					case 3:
						
						String sqlCrearLineaTicket="Create table if not exists lineaTicket ( codi int auto_increment, nom varchar (10) not null, cantitat int not null, preu_iva double not null, preu_no_iva double, coditicket int not null, constraint `tit` FOREIGN KEY (`coditicket`)  REFERENCES `ticket` (`codi_ticket`),  primary key (`codi`));";
						actualitzarBase(sqlCrearLineaTicket);
						break;
					case 4:
						String sqlborrarLineaTicket="drop table lineaticket";
						actualitzarBase(sqlborrarLineaTicket);
						
						break;
					case 5:
						String sqlBorrarTicket ="drop table ticket";
						actualitzarBase(sqlBorrarTicket);
						
						break;
					case 6:
						String sqlBorrarFactura="drop table factura";
						actualitzarBase(sqlBorrarFactura);
						break;
				
					case 0:
						System.out.println("0_ Eixir de la gestio de taules");
						break;
					default:
						System.out.println("Opción no válida.");
						break;
					}
				} while (option != 0);
		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	//******************************GENERAAAAAAAAAAL********************************
	// Metode per a fer una actualitzacio 	
	public static void actualitzarBase (String sql) {
			Connection con = MySQL.Connectar("tpv");
			try {
				Statement st = con.createStatement();
					st.executeUpdate(sql);
			} catch (SQLException e) {
			}	
		}
	// Metode per a fer un consulta 
	public static ResultSet resultadoBase (String sql) {
		Connection con = MySQL.Connectar("tpv");
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			return rs;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return null;
		}


	

	
	
	
	public static void menuPrincipal ()	{
	

		int option;
				do {
					System.out.println("==========================");
					System.out.println("******MENU PRINCIPAL******");
					System.out.println("==========================");
					System.out.println("1_ Gestió de clients");
					System.out.println("2_ Gestió de productes");
					System.out.println("3_ Gestió de vendes ");
					System.out.println("0_ Eixir del programa");
					System.out.print("Inserte una opción válida: ");
					option=Integer.parseInt(reader.nextLine());
					
					switch (option ){
					case 1:
						Client.menuClients();
						break;
					case 2:
						Producte.menuProductes();
						break;
					case 3:
						menuVendes();
						break;
					case 0:
						System.out.println("Adeu fins l'altra");
						break;
					default:
						System.out.println("Opción no válida.");
						break;
							
					}
				} while (option != 0);
			}
	

	public static void main(String[] args) {
		menuPrincipal();
	}
}
