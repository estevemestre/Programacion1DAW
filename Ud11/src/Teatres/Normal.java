package Teatres;


public class Normal extends Entrada {

	public Normal (Zona zona)  {
		this.zona = zona;
	}
	
	
	public double calcularPrecio () {
		return this.zona.getPrecioNormal();
	}


	@Override
	public String toString() {
		return "Nombre de. espectador" + this.nombre + ", PRECIO" + calcularPrecio() + ", nombre de la zona" + this.zona.getNombreZona();
	}
	
	
}
