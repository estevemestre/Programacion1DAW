package Marian_teatre;

public class EntradaNormal extends Entrada {

	
	public EntradaNormal(Zona z) {
		super(z);
	}
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return this.zona.getPrecioNormal();
	}

	@Override
	public String infoEntrada() {
		// TODO Auto-generated method stub
		return super.infoEntrada() + "\nPrecio: " + this.calcularPrecio();
	}

	@Override
	public String toString() {
		return super.toString() + "\nPrecio: " + this.calcularPrecio();
	}
	
}
