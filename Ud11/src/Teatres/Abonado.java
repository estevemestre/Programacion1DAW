package Teatres;

public class Abonado extends Entrada {
	
	public Abonado (Zona zona) {
		this.zona = zona;
	}
	public double calcularPrecio () {
		return zona.getPrecioAbonado();
	}
	
	@Override
	public String toString() {
		return "Nombre de. espectador" + this.nombre + ", PRECIO" + calcularPrecio() + ", nombre de la zona" + this.zona.getNombreZona();
	}
}