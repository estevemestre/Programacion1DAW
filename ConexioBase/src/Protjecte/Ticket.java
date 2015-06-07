package Protjecte;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
	private static Scanner reader= new Scanner(System.in);
	private int codi;
	private double preu_iva;
	private double preu_no_iva;
	private String codiTicket;
	//private ArrayList<int> codis = new ArrayList<int>();
	
	
	
	public Ticket (int codi, double preu_iva, double preu_no_iva) {
		this.codi = codi;
		this.preu_iva = preu_iva;
		this.preu_no_iva = preu_no_iva;
	}
	/*
	public Ticket (String codiTicket, double preu_iva, double preu_no_iva) {
		this.codiTicket = codiTicket;
		this.preu_iva = preu_iva;
		this.preu_no_iva = preu_no_iva;
	}
		*/
	//Métode al cual li pasem un producte i mos retorna true o fol si el stock es correcte actualitza el stock 
	
	// Este metode tendria que fer-lo en producte millor
	
	
	
	
	public int getCodi() {
		return codi;
	}




	public void setCodi(int codi) {
		this.codi = codi;
	}




	public double getPreu_iva() {
		return preu_iva;
	}




	public void setPreu_iva(double preu_iva) {
		this.preu_iva = preu_iva;
	}




	public double getPreu_no_iva() {
		return preu_no_iva;
	}




	public void setPreu_no_iva(double preu_no_iva) {
		this.preu_no_iva = preu_no_iva;
	}




	@Override
	public String toString() {
		return "Ticket [codi=" + codi + ", preu_iva=" + preu_iva
				+ ", preu_no_iva=" + preu_no_iva + "]";
	}

	public static void crearTicket () {
		
		 ArrayList<LineaTicket> linees = new ArrayList<LineaTicket>();

		 double preu_iva = 0;
		 double preu_no_iva = 0;
		 int codi;
		 
		 String codUsuari = Principal.buscarClient();
		 
		 codi = codiTicket(); 
		 
		 System.out.println("el codi en crearTIcket es " +codi);
		 
		 	System.out.println("El quedes ahi");
			Producte producte = null;
		 String pregunta;
		do {
			//Producte producte = null;
			int codiProducte = Producte.buscarProductes();  // Mos retorna si o si un codi i ademes mos asegurem que te mes de un stock 
				
			String sqlProducte ="select * from productes where codi_barres ="+codiProducte+";";
			System.out.println("provaraaaaaaaaaaar" +sqlProducte);
				ResultSet rs = Principal.resultadoBase(sqlProducte);
				try {
					while (rs.next()) {
						
						 producte = new Producte(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6), rs.getString(7));
					}
					
					System.out.println(producte.toString());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				int cant = comprovarStock(producte, codiProducte); // Retorna si o si el stock
				
				preu_iva = preu_iva + producte.getPrecioConIva() * cant;
				preu_no_iva = preu_no_iva + producte.getPrecioSinIva() * cant;
				
				
				
				
				
			
				System.out.println(" ¿ Vols insertar mes productes ? (si)o(no)");
				pregunta = reader.nextLine();
				
				
				linees.add(new LineaTicket(producte, cant));				
				
			 
			}while(pregunta.equalsIgnoreCase("si"));
			
		
			Ticket ticket = new Ticket(codi, preu_iva, preu_no_iva);
			guardarTicket(ticket, codUsuari);
			
			
			
			for (int i = 0; i < linees.size(); i++) {
				// guardar linees  + el codi ticket
				LineaTicket.guardarLineaTicket(linees.get(i), codi);
			}
			
	}	
	
	
	// metode per a guardar un ticket
	
	
	public static void guardarTicket (Ticket ticket, String codiUsuari) {
		
		String sql ="INSERT INTO TICKET(PREU_IVA , PREU_NO_IVA, CODI_CLIENTE) Values('"+ticket.getPreu_iva()+"','"+ticket.getPreu_no_iva()+"','"+codiUsuari+"');";
		System.out.println(sql);
		Principal.actualitzarBase(sql);

		
	}
	
	
	// Altre metode que comprove el stock i si es menor o igual que 0 que no entre asi
	
	
	
	
	
	
	public static int comprovarStock (Producte producte, int codi) {
	
			int cant = 0;
			boolean comprovar;
		if(producte == null) {
			System.out.println("Error el producte no s'ha creat be");
		}else{
			do {
				System.out.println("Introdueix el stock que vols:");
				cant = Integer.parseInt(reader.nextLine());

				if (cant < producte.getCantStock()) {
					comprovar = true;
					System.out.println("Si que hi ha prou stock ");
				}else{
					System.out.println("No hi ha prou stock");
					comprovar=false;
				}
			}while(comprovar == false);
		}
		
		

		cant = producte.getCantStock() - cant;
		
		String sql ="update productes set stock = "+cant+" where codi_barres ="+codi+";";
		Principal.actualitzarBase(sql);
		System.out.println(sql);
		// update table productes set stock = stock - 2 where codi_barres = 4;
		
		
		return cant;
	}

	
	public static int codiTicket () {
		String sql ="Select MAX(codi_ticket) from ticket;";
		ResultSet rs = Principal.resultadoBase(sql);
		
		try {
			rs.absolute(1);
			int codi =rs.getInt(1);
			return codi +1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Files que retorna la consulta 
		return 0;
	}
	}

