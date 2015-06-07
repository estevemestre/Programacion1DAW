package Marian_teatre;

public class Zona {
	
	private String nombre;
	private final int numLocalidadesTotal;		//total de localidades de la zona. No se modificará
	private int numLocalidadesVendidas; 		//Inicialmente a 0. En cada venta, se incrementará en 1
	private double precioNormal;
	private double precioAbonado;
	private double totalAcumulado;				//importe acumulado de las entradas vendidas

	public Zona(String nombre, int numLocalidadesTotal, double precioNormal,
			double precioAbonado) {
		this.nombre = nombre;
		this.numLocalidadesTotal = numLocalidadesTotal;
		this.numLocalidadesVendidas = 0;
		this.precioNormal = precioNormal;
		this.precioAbonado = precioAbonado;
		this.totalAcumulado = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public int getNumLocalidadesVendidas() {
		return numLocalidadesVendidas;
	}

	public void setNumLocalidadesVendidas(int numLocalidadesVendidas) {
		this.numLocalidadesVendidas = numLocalidadesVendidas;
	}

	public int getNumLocalidadesTotal() {
		return numLocalidadesTotal;
	}

	public double getPrecioNormal() {
		return precioNormal;
	}

	public void setPrecioNormal(double precioNormal) {
		this.precioNormal = precioNormal;
	}

	public double getPrecioAbonado() {
		return precioAbonado;
	}

	public void setPrecioAbonado(double precioAbonado) {
		this.precioAbonado = precioAbonado;
	}

	@Override
	public String toString() {
		return "Información de la zona: " + nombre + " (" + numLocalidadesTotal + " localidades )";
	}
	
	
	
	
	public double getTotalAcumulado() {
		return totalAcumulado;
	}

	public void setTotalAcumulado(double totalAcumulado) {
		this.totalAcumulado = totalAcumulado;
	}

	
	
	/**
	 * Mètode per comprovar si queden entrades lliures
	 * @return true si queda alguna entrad lliure, false en cas contrari
	 */
	public boolean entradesLliures() {
		if (this.numLocalidadesTotal - this.numLocalidadesVendidas >= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
