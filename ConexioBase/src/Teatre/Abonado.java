package Teatre;

public class Abonado extends Entrada{

	public Abonado(Zona zona) {
		super(zona);
	}

	public void calcularPreu() {
		this.preuEntrada = this.zona.getPreuAbonat();
	}

	@Override
	public String toString() {
		return "Abonado [id=" + id + ", zona=" + zona + ", nombre=" + nombre
				+ ", preuEntrada=" + preuEntrada + "]";
	}

	
	
}
