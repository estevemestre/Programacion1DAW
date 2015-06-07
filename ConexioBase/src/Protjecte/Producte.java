package Protjecte;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ConexioBaseDades.MySQL;

public class Producte {

	
	private static Scanner reader = new Scanner (System.in);


	private int codi;
	private String nom;
	private String descripcio;
	private double precioConIva;
	private double precioSinIva;
	private int cantStock;
	private String codClient;
	
	/*
	 System.out.println(" Codic barres: "+rs.getInt(1) +
							"\n Nom: "+rs.getString(2) +
							"\n Descripcio: "+rs.getString(3)+
							"\n Preu_Iva: "+rs.getDouble(4)+
							"\n Preu_no_Iva: "+rs.getDouble(5)+
							"\n Stock: "+rs.getInt(6)+
							"\n Codi client: "+rs.getString(7));	
	 */
	
	
	public Producte (int codi, String nom, String descripcio, double preu_Iva, double preu_no_iva, int stock, String codClient) {
		this.codi = codi;
		this.nom = nom;
		this.descripcio = descripcio;
		this.precioConIva = preu_Iva;
		this.precioSinIva = preu_no_iva;
		this.cantStock = stock;
		this.codClient = codClient;
	}
	
	public Producte (String codiClient) {
		
		System.out.println("Inserta un nom del un producte");
		this.nom = reader.nextLine();
		
		System.out.println("Inserta una descripción de un producto");
		this.descripcio = reader.nextLine();
		
		System.out.println("Inserta precio con iva ");
		this.precioConIva = Double.parseDouble(reader.nextLine());
		
		System.out.println("Inserta precio sin iva ");
		this.precioSinIva = Double.parseDouble(reader.nextLine());
		
		System.out.println("Inserta la cantida en stock");
		this.cantStock = Integer.parseInt(reader.nextLine());
	
		this.codClient = codiClient;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescripcio() {
		return descripcio;
	}



	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}



	public double getPrecioConIva() {
		return precioConIva;
	}



	public void setPrecioConIva(double precioConIva) {
		this.precioConIva = precioConIva;
	}



	public Double getPrecioSinIva() {
		return precioSinIva;
	}



	public void setPrecioSinIva(Double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}



	public int getCantStock() {
		return cantStock;
	}



	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}



	public String getCodClient() {
		return codClient;
	}



	public void setCodClient(String codClient) {
		this.codClient = codClient;
	}


	
	@Override
	public String toString() {
		return "Producte [codi=" + codi + ", nom=" + nom + ", descripcio="
				+ descripcio + ", precioConIva=" + precioConIva
				+ ", precioSinIva=" + precioSinIva + ", cantStock=" + cantStock
				+ ", codClient=" + codClient + "]";
	}









	//******************************
	public static void menuProductes () {
		int option;
				do {
					System.out.println();
					System.out.println();
					System.out.println("==================================");
					System.out.println("******MENU GESTIO PRODUCTES*******");
					System.out.println("==================================");
					System.out.println("1_Crear taula productes");
					System.out.println("2_Borrar taula productes");
					System.out.println("3_Crear productes");
					System.out.println("4_Borrar productes");
					System.out.println("5_Modificar productes*");
					System.out.println("6_Llistar tots productes");
					System.out.println("0_ Eixir de la gestio de Productes");
					System.out.print("Inserte una opción válida: ");
					option=Integer.parseInt(reader.nextLine());
					
					switch (option ){
					case 1:
						crearTaulaProductes();
						break;
					case 2:
						borraTaulaPrductes();
						break;
					case 3:
						Principal.crearProductes();
						break;
					case 4:
						borrarProductes();
						break;
					case 5:
						modificarProductes();
						break;
					case 6:
						llistarProductes();
						break;
					case 0:
						break;
					default:
						System.out.println("Opción no válida.");
						break;
							
					}
				} while (option != 0);
		}

	
	
	
	
	
	
	
	
	
	
	
public static void crearTaulaProductes() {
		
		
		Connection con = MySQL.Connectar("tpv");
		Statement st = null;
		//ResultSet rs = null;
		// create table if not exists
		String sql ="SELECT * from clients;";
		String sql1 = "CREATE TABLE IF NOT EXISTS `productes`(`CODI_BARRES` INT NOT NULL AUTO_INCREMENT, `NOM` VARCHAR(45) NOT NULL, `DESCRIPCIO` VARCHAR(140) NOT NULL, `PREU_IVA` DOUBLE, `PREU_NO_IVA` DOUBLE, `STOCK` INT NOT NULL, `CODI_CLIENT` VARCHAR(5), CONSTRAINT `prodt` FOREIGN KEY (`CODI_CLIENT`) REFERENCES `clients` (`CODI`), PRIMARY KEY(`CODI_BARRES`));";		
		
		
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			// SI EXISTEIX LA TABLA CLIENTS ENTONCES CREE LA DE PRODUCTES AIXI EVITEM ERRORS 
			if(rs.next()) {
				
			//	System.out.println("ENTRES PER A CREARO ?");
				st.execute(sql1);
			}else{
				System.out.println("Primer tens de crear un client  ");
			}
			
			
		} catch (SQLException e) {
			
			System.out.println("**********************************************");
			System.out.println("S'ha produit un error en la base de dades");
			System.out.println("Perfavor comunicaliu al departament informatic");
			System.out.println("public static void crearTaulaProductes() {");
			System.out.println("**********************************************");
			System.out.println();
			//e.printStackTrace();
		}
		System.out.println();
	}
	
	
	
	public static void borraTaulaPrductes() {
		String sql ="DROP TABLE PRODUCTES;";
		
		Connection con = MySQL.Connectar("tpv");
		
		try {
			Statement st = con.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			System.out.println("**********************************************");
			System.out.println("S'ha produit un error en la base de dades");
			System.out.println("Perfavor comunicaliu al departament informatic");
			System.out.println("public static void BorrarTaulaProductes() {");
			System.out.println("**********************************************");
			System.out.println();
			//e.printStackTrace();
		}
	}
	
	// Retorna si o si el coodi 
	public static int buscarProductes () {
		llistarProductes();
		
		System.out.println("Inserte el codi de barres del producte");
		int codi = Integer.parseInt(reader.nextLine());
		
		ResultSet rs;
		String sql ="Select codi_barres from productes where codi_barres='"+codi+"' and stock > '0';";
		System.out.println("aaaaaaaaaa" + sql);
		rs = Principal.resultadoBase(sql);
		
		
		
		try {
			if (rs.next()) {
				
				System.out.println("Retorna el codic ");
				return codi;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return buscarProductes();
	}
	
	
	public static void borrarProductes () {
		
		int codi = buscarProductes();
		String sql="DELETE FROM PRODUCTES where codi_barres ='"+codi+"';";
		System.out.println(sql);
		
		Principal.actualitzarBase(sql);
	}
	
	
	public static void llistarProductes() {
		String sql = "Select * from productes;";
		ResultSet rs = Principal.resultadoBase(sql);
		
		try {
			while(rs.next()) {
				System.out.println();
				System.out.println("***************");
				System.out.println("PRODUCTE: "+rs.getInt(1));
				System.out.println("***************");
				System.out.println(" Codic barres: "+rs.getInt(1) +
								"\n Nom: "+rs.getString(2) +
								"\n Descripcio: "+rs.getString(3)+
								"\n Preu_Iva: "+rs.getDouble(4)+
								"\n Preu_no_Iva: "+rs.getDouble(5)+
								"\n Stock: "+rs.getInt(6)+
								"\n Codi client: "+rs.getString(7));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void modificarProductes() {
		int codi = buscarProductes();
		System.out.println("pases ?");
		int option;
		do {
			System.out.println("******Quina part vols modificar ?*******");
			System.out.println("1_El nom ");
			System.out.println("2_ Descripcio ");
			System.out.println("3_ Preu en iva");
			System.out.println("4_ Preu sense iva");
			System.out.println("5_ Stock");
			System.out.println("0_ Ja no vuic moficar res mes ");
			System.out.print("Inserte una opción válida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option ){
			case 1:
				System.out.println("Introdueix el nou nom: ");
				String nom = reader.nextLine();
				String sqlNom ="Update productes set nom = '"+nom+"' where codi_barres = '"+codi+"';";					
				Principal.actualitzarBase(sqlNom);
				break;
			case 2:
				System.out.println("Introdueix la descripcio: ");
				String descripcio = reader.nextLine();
				String sqlDescripcio ="Update productes set descripcio = '"+descripcio+"' where codi_barres = '"+codi+"';";	
				System.out.println(sqlDescripcio);
				Principal.actualitzarBase(sqlDescripcio);
				break;
			case 3:
				System.out.println("Introdueix el preu en iva");
				Double preuIva = Double.parseDouble(reader.nextLine());
				String sqlpreuIVa ="Update productes set preu_iva = '"+preuIva+"' where codi_barres = '"+codi+"';";	
				System.out.println(sqlpreuIVa);
				Principal.actualitzarBase(sqlpreuIVa);
				break;
			case 4:
				System.out.println("Introdueix el preu sense iva ");
				Double preuNoIva = Double.parseDouble(reader.nextLine());
				String sqlpreuNoIva ="Update productes set preu_no_iva = '"+preuNoIva+"' where codi_barres = '"+codi+"';";	
				System.out.println(sqlpreuNoIva);
				Principal.actualitzarBase(sqlpreuNoIva);
				break;
			case 5:
				System.out.println("Introdueix el nou stock ");
				int stock = Integer.parseInt(reader.nextLine());
				String sqlStock ="Update productes set stock = '"+stock+"' where codi_barres = '"+codi+"';";	
				System.out.println(sqlStock);
				Principal.actualitzarBase(sqlStock);
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
