package Teatres;

public class Zona {
	
	private String NombreZona;
	private int numEntradas;
	private double precioNormal;
	private double precioAbonado;
	
	
	public Zona (String nombre, int numEntradas, double precioNormal, double precioAbonado) {
		
		this.NombreZona = nombre;
		this.numEntradas = numEntradas;
		this.precioNormal = precioNormal;
		this.precioAbonado = precioAbonado;
	}


	protected String getNombreZona() {
		return NombreZona;
	}


	protected void setNombreZona(String nombreZona) {
		NombreZona = nombreZona;
	}


	protected int getNumEntradas() {
		return numEntradas;
	}


	protected void setNumEntradas(int numEntradas) {
		this.numEntradas = numEntradas;
	}


	protected double getPrecioNormal() {
		return precioNormal;
	}


	protected void setPrecioNormal(int precioNormal) {
		this.precioNormal = precioNormal;
	}


	protected double getPrecioAbonado() {
		return precioAbonado;
	}


	protected void setPrecioAbonado(int precioAbonado) {
		this.precioAbonado = precioAbonado;
	}
	
	
	public boolean comprovarEntradas() {
		
		if (this.numEntradas > 0) {
			return true;
		}else{
			return false;
		}
	}


	@Override
	public String toString() {
		return "Zona [NombreZona=" + NombreZona + ", numEntradas="
				+ numEntradas + ", precioNormal=" + precioNormal
				+ ", precioAbonado=" + precioAbonado + "]";
	}
	
	
	
}

