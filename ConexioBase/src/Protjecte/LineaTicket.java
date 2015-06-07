package Protjecte;

import java.util.ArrayList;

public class LineaTicket {

	private int cant;
	private String nom;
	private double preu_iva;
	private double preu_no_iva;
	private int codTicket;
	
	
	public LineaTicket (Producte producte, int stock, int codiTicket) {
		this.cant = stock;
		this.nom = producte.getNom();
		this.preu_iva = stock * producte.getPrecioConIva();
		System.out.println("El preu essssssssssssss "+preu_iva);
		this.preu_no_iva = stock * producte.getPrecioSinIva();
		this.codTicket = codiTicket;
	}
	
	public LineaTicket (Producte producte, int stock) {
		this.cant = stock;
		this.nom = producte.getNom();
		this.preu_iva = stock * producte.getPrecioConIva();
		System.out.println("El preu essssssssssssss "+preu_iva);
		this.preu_no_iva = stock * producte.getPrecioSinIva();
	}
	

	public int getCant() {
		return cant;
	}
	
	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public int getCodTicket() {
		return codTicket;
	}

	public void setCodTicket(int codTicket) {
		this.codTicket = codTicket;
	}

	public static void guardarLineaTicket (LineaTicket linea, int codTicket) {
		
		System.out.println("EL CODI DEL TICKET ES " + codTicket);
		String sql ="INSERT INTO LINEATICKET(NOM, CANTITAT, PREU_IVA, PREU_NO_IVA, CODITICKET) Values('"+linea.getNom()+"','"+linea.getCant()+"','"+linea.getPreu_iva() +"','"+linea.getPreu_no_iva()+"','"+codTicket+"');";
		System.out.println(sql);
		
		Principal.actualitzarBase(sql);
	}
}
