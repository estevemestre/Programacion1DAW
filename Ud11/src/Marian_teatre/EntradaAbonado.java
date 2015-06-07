package Marian_teatre;

public class EntradaAbonado extends Entrada{

	public EntradaAbonado(Zona z) {
		super(z);
	}
	
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return this.zona.getPrecioAbonado();
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

