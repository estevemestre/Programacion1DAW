package Teatres;

public class Reducida extends Entrada {
	
	public Reducida (Zona zona) {
		this.zona = zona;
	}

	public double calcularPrecio () {
		return zona.getPrecioNormal() - this.zona.getPrecioNormal() * 0.15;
	}
	
	@Override
	public String toString() {
		return "Nombre de. espectador" + this.nombre + ", PRECIO" + calcularPrecio() + ", nombre de la zona" + this.zona.getNombreZona();
	}
}