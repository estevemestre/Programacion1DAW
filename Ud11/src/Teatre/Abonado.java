package Teatre;

public class Abonado extends Entrada{

	public Abonado (Zona lloc) {
		
		
		this.Zona = lloc;
		
		System.out.println("El preu de l'entrada es " +Zona.getPreuAbonat() +"€");
	}
}

