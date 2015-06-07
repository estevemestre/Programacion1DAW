package Protjecte;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura {

	private String codi_client;
	private double  preu_iva;
	private double preu_no_iva;
	private static Scanner reader= new Scanner(System.in);

	public Factura (String codi_client, double preu_iva, double preu_no) {
		this.codi_client = codi_client;
		this.preu_iva = preu_iva;
		this.preu_no_iva = preu_no_iva;
	}
	
	
	public String getCodi_client() {
		return codi_client;
	}


	public void setCodi_client(String codi_client) {
		this.codi_client = codi_client;
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


	public static void CrearFacturaAny () {
		
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		
		boolean comprovar;
		String codiClient;
		
		do {
		
			 codiClient = Principal.buscarClient();
		
			System.out.println("Introdueix el any que vols al cual vols saber les factures que hi han ");
			int any = Integer.parseInt(reader.nextLine());
			
			comprovar = comprovarFactura(codiClient, any);
			
		}while(comprovar == false);
		
		String sql ="select codi_ticket, preu_iva, preu_no_iva from ticket where codi_cliente = '"+codiClient+"' and codiFactura is null;";
		ResultSet rs = Principal.resultadoBase(sql);
		System.out.println(sql);
		try {
			while(rs.next()) {
				 tickets.add(new Ticket(rs.getInt(1), rs.getDouble(2), rs.getDouble(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		double preu_iva = 0;
		double preu_no_iva = 0;
		
		
		for (int i = 0; i < tickets.size(); i++) {
			preu_iva = preu_iva + tickets.get(i).getPreu_iva();
			preu_no_iva = preu_no_iva + tickets.get(i).getPreu_no_iva();
		}
		
		Factura factura = new Factura(codiClient, preu_iva, preu_no_iva);
		
		
		int codiFactura = guardarFacturaBD(factura); // aço retornara la id i despres de totes les codiClient 
			
		
		for (int i = 0; i < tickets.size(); i++) {
			String sqlfact="update ticket set codiFactura = "+codiFactura+" where codi_ticket ="+tickets.get(i).getCodi()+";";
			System.out.println(sqlfact);
			Principal.actualitzarBase(sqlfact);

		}
		// tindrem que fer un for en totes les id del ticket asignar lo que retorna guardarFactura
		
		
	}
	public static int guardarFacturaBD(Factura factura){
		int codiFactura = 0;
		String sqlfact ="INSERT INTO FACTURA(PREU_IVA, PREU_NO_IVA, CODI_CLIENT) Values('"+factura.getPreu_iva()+"','"+factura.getPreu_no_iva()+"','"+factura.getCodi_client()+"');";
		System.out.println(sqlfact);
		Principal.actualitzarBase(sqlfact);
		
		
		String sql ="select codi from factura where preu_iva = '"+factura.getPreu_iva()+"' and preu_no_iva = '"+factura.getPreu_no_iva()+"' and codi_client = '"+factura.getCodi_client()+"';";
		System.out.println(sql);
		ResultSet rs = Principal.resultadoBase(sql);
		
		try {
			while(rs.next()){
				codiFactura = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("CODI FACTURA es " +codiFactura);
		
		return codiFactura;
	}
	
	
	
	public static boolean comprovarFactura(String codiClient, int any) {
			
		if (any < 2015) {
			System.out.println("No es troba ninguna factura en eixe any");
			return false;
		}else{
			String sql ="select * from ticket where codi_cliente = '"+codiClient+"' and codiFactura is null;";
			ResultSet rs = Principal.resultadoBase(sql);
			try {
				if (rs.next()){
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
	}		
}




// 