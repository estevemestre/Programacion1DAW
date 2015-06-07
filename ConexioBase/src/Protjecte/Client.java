package Protjecte;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ConexioBaseDades.MySQL;

public class Client {

	
	
	private static Scanner reader = new Scanner (System.in);
	private static int codigoTotal;
	
	
	
	private String codi;
	private String nif;
	private String nom;
	private String cognoms;
	private String raoSocial;
	private String domicili;

	
	public Client (String nif, int auxCodi) {
		
	
		//auxCodi = auxCodi +1;
		
		if (auxCodi < 10) {
			this.codi ="cl0"+auxCodi;
		}else{
			this.codi ="cl"+auxCodi;
		}
		this.nif = nif;
		
		System.out.println("Introdueix el nom");
		this.nom = reader.nextLine();
		
		System.out.println("Introdueix els cognoms");
		this.cognoms = reader.nextLine();
		
		System.out.println("Introdueix la rao social");
		this.raoSocial = reader.nextLine();
		
		System.out.println("Introdueix el domicili");
		this.domicili = reader.nextLine();

	}


	public static int getCodigoTotal() {
		return codigoTotal;
	}



	public String getCodi() {
		return codi;
	}


	public void setCodi(String codi) {
		this.codi = codi;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getApellidos() {
		return cognoms;
	}


	public void setApellidos(String apellidos) {
		this.cognoms = apellidos;
	}


	public String getRazonSocial() {
		return raoSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.raoSocial = razonSocial;
	}


	public String getDomicili() {
		return domicili;
	}


	public void setDomicili(String domicili) {
		this.domicili = domicili;
	}
	// Menu de Clients
		public static void menuClients () {
			int option;
					do {
						System.out.println();
						System.out.println();
						System.out.println("==================================");
						System.out.println("******MENU GESTIO D'USUARIS*******");
						System.out.println("==================================");
						System.out.println();
						System.out.println("1_Crear taula Clients");
						System.out.println("2_Borrar taula Clients");
						System.out.println("3_Crear Clients ");
						System.out.println("4_Borrar Clients");
						System.out.println("5_Modificar clients*");
						System.out.println("6_Mostrar tots els usuaris");
						System.out.println("0_ Eixir de la gestio de Clients");
						System.out.print("Inserte una opción válida: ");
						option=Integer.parseInt(reader.nextLine());
						
						switch (option ){
						case 1:
							crearTaulaClients();
							break;
						case 2:
							borraTaulaClients();
							break;
						case 3:
							Principal.crearClient();
							break;
						case 4:
							llistarUsuaris();
							System.out.println();
							String client = Principal.buscarClient();
							Principal.borrarClient(client);
							break;
						case 5:
							modificarClients();
							break;
						case 6:
							llistarUsuaris();
							break;
						case 0:
							break;
						default:
							System.out.println("Opción no válida.");
							break;
								
						}
					} while (option != 0);
				}

		
		public static void modificarClients () {
			String codi = Principal.buscarClient();
			System.out.println("No aplegues ? ?????");
			int option;
			do {
				System.out.println("******Quina part vols modificar ?*******");
				System.out.println("1_El nom ");
				System.out.println("2_El cognom ");
				System.out.println("3_La rao social");
				System.out.println("4_Domicili");
				System.out.println("0_ Ja no vuic moficar res mes ");
				System.out.print("Inserte una opción válida: ");
				option=Integer.parseInt(reader.nextLine());
				
				switch (option ){
				case 1:
					System.out.println("Introdueix el nou nom: ");
					String nom = reader.nextLine();
					String sqlNom ="Update clients set nombre = '"+nom+"' where codi = '"+codi+"';";					
					Principal.actualitzarBase(sqlNom);
					break;
				case 2:
					System.out.println("Introdueix el nou cognom: ");
					String cognom = reader.nextLine();
					String sqlCognom ="Update clients set apellidos = '"+cognom+"' where codi = '"+codi+"';";					
					Principal.actualitzarBase(sqlCognom);
					break;
				case 3:
					System.out.println("Introdueix la nova rao Social: ");
					String raoSocial = reader.nextLine();
					String sqlraoSocial ="Update clients set razon_social = '"+raoSocial+"' where codi = '"+codi+"';";					
					Principal.actualitzarBase(sqlraoSocial);
					break;
				case 4:
					System.out.println("Introdueix el nou domicili: ");
					String domicilio = reader.nextLine();
					String sqlDomicilio ="Update clients set domicilio = '"+domicilio+"' where codi = '"+codi+"';";					
					Principal.actualitzarBase(sqlDomicilio);
					break;
				case 0:
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
			} while (option != 0);
		}
		
		
		
		// CREAR TAULA  CLIENTS 
			public static void crearTaulaClients () {
				Connection con = ConexioBaseDades.MySQL.Connectar("tpv");
				Statement st = null;
			
				String sql ="CREATE TABLE IF NOT EXISTS clients ( CODI VARCHAR (5) PRIMARY KEY, NIF VARCHAR (8) NOT NULL UNIQUE, NOMBRE VARCHAR (14) NOT NULL, APELLIDOS VARCHAR (25) NOT NULL, RAZON_SOCIAL VARCHAR (15), DOMICILIO VARCHAR (30) NOT NULL, FechAlta DATETIME DEFAULT CURRENT_TIMESTAMP);";
				//String sql ="CREATE TABLE IF NOT EXISTS clients ( CODI VARCHAR (6) PRIMARY KEY, NIF VARCHAR (8) NOT NULL UNIQUE, NOMBRE VARCHAR (14) NOT NULL, APELLIDOS VARCHAR (25) NOT NULL, RAZON_SOCIAL VARCHAR (15), DOMICILIO VARCHAR (30) NOT NULL);";

				try {
					st = con.createStatement();
					st.executeUpdate(sql);
				
				} catch (SQLException e) {
					
					System.out.println();
					System.out.println("**********************************************");
					System.out.println("S'ha produit un error en la base de dades");
					System.out.println("Perfavor comunicaliu al departament informatic");
					System.out.println("public static void crearTaulaClients () {{");
					System.out.println("**********************************************");
					System.out.println();
					e.printStackTrace();
				}
			}
			// Borrar taula clients 	
				public static void borraTaulaClients () {
					
					Connection con = ConexioBaseDades.MySQL.Connectar("tpv");
					Statement st = null;
					String sql ="drop table clients;";
						
					try {
						st = con.createStatement();
						st.executeUpdate(sql);
						//con.close();
					} catch (SQLException e) {
						System.out.println();
						System.out.println("**********************************************");
						System.out.println("S'ha produit un error en la base de dades");
						System.out.println("Perfavor comunicaliu al departament informatic");
						System.out.println("public static void borraTaulaClients (){");
						System.out.println("**********************************************");
						System.out.println();
					}
					
				}
	
				public static void llistarUsuaris () {
					
					Connection con = MySQL.Connectar("tpv");
					
					Statement st = null;
					
					ResultSet rs = null;
					
				
					int count = 0;
					
					String sql ="SELECT * FROM CLIENTS;";
					
					
					try {
						st = con.createStatement();
						rs = st.executeQuery(sql);
						
						while(rs.next()){
						count = count +1;
							
							System.out.println();
							System.out.println("***************");
							System.out.println("CLIENT: "+rs.getString(1));
							System.out.println("***************");
							System.out.println(" Codi "+rs.getString(1) +
											"\n NIF: "+rs.getString(2) +
											"\n Nombre: "+rs.getString(3)+
											"\n Cognoms: "+rs.getString(4)+
											"\n Rao Social: "+rs.getString(5)+
											"\n Domicili: "+rs.getString(6)+
											"\n Fecha de Alta: "+rs.getString(7));

						}
						
					} catch (SQLException e) {
						System.out.println();
						System.out.println("**********************************************");
						System.out.println("S'ha produit un error en la base de dades");
						System.out.println("Perfavor comunicaliu al departament informatic");
						System.out.println("	public static void llistarsUsuaris) {");
						System.out.println("**********************************************");
						System.out.println();
						Principal.menuPrincipal();
					}
				}
}
