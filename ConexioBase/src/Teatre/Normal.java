package Teatre;

public class Normal extends Entrada {

	
	
	
	public Normal (Zona zona) {
		super(zona);
		calcularPreu();
	}


	public void calcularPreu()	{
		this.preuEntrada = zona.getPreuNormal();
	}
}


