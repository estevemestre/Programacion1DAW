package Teatre;

public class Reducida extends Entrada {

	private int descompte = 15;
	
	public Reducida (Zona zona) {
		super(zona);
		calcularPreu();
	}

	public void calcularPreu() {
		this.preuEntrada = zona.getPreuNormal() - (zona.getPreuNormal() *0.15);
	}
}
