package Marian_teatre;

public class EntradaReducida extends Entrada {

	private double descuento=0.15;

	
	public EntradaReducida(Zona z) {
		super(z);
	}
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return this.zona.getPrecioNormal() - this.zona.getPrecioNormal() * this.descuento;
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
