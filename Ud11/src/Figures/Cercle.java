package Figures;

public class Cercle extends Figura {

	public Cercle (double radi) {
		
		this.radi = radi;
	}
	
	private double radi;

	@Override
	public String toString() {
		return "Cercle [radi=" + radi + "]";
	}
	
	
	public double calcularArea()  {
	
		return Math.PI + Math.pow(radi, 2);
	}
}
