 /*
 *	2.- Desenvolupeu un classe anomenada Cercle que:
 *
 *
 *	Tinga una variable d'inst�ncia de tipus Punt (per a representar el centre del cercle) i una de tipus double 
 *	(per a representar el radi del cercle).
 *	Tinga un constructor amb dos par�metres, un de tipus Punt i un altre double que inicialitze les dos variables d'inst�ncia.
 *	Tinga un constructor amb tres par�metres de tipus double que inicialitze les dos variables d'inst�ncia.
 *	Tinga un constructor sense par�metres que inicialitze les dos variables d'inst�ncia al valor escollit per vosaltres.
 *	Tinga un getter i un setter per a cada una de les variables d'inst�ncia.
 *	Tinga un m�tode calcularArea() que no reba cap par�metre i retorne un double.
 *	Tinga un m�tode calcularPerimetre() que no reba cap par�metre i retorne un double.
 *	Tinga un m�tode visualitzarCercle() que mostre la seua informaci� com es mostra en el seg�ent exemple:
 *	Cercle de radi 2.5 cm situat en el punt (3.2, 4.0).
 *	NOTA: Si el centre del cercle est� situat en el punt (0, 0), el missatge mostrat ser�:
 *	Cercle de radi 3.2 cm situat en l'origen de coordenades.
 *
 *
 * 
 */


package Practica1;

public class Cercle {

	private  double  radi;
	// Gastes esta variable de tipo punt perque en punt ja tenim variables
	private Punt centre; 
	
	//Constructor amb dos par�metres
	
	public Cercle(Punt centre, double radi) {
		this.centre=centre;
		this.radi=radi;
		
	}
	
	public Cercle (double x, double y, double z) {
		
		this.centre = new Punt (x, y);
		
		this.radi = z;
		}
	
	public Cercle() {
		this.centre = new Punt (5.6 , 5.2);
		this.radi = 5.0;
		
		
	}

	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}

	public Punt getCentre() {
		return centre;
	}

	public void setCentre(Punt centre) {
		this.centre = centre;
	}
	
	public double calcularArea() {
		
		double area;
		
		area = Math.PI * this.radi;
		area = Math.pow((area), 2);
				
		return area;
		
	}

	 public double calcularPerimetre () {
		 
		 double perimetre;
		 
		 perimetre = 2 * (Math.PI * this.radi);
		 return perimetre;
	 }

	 public void visualitzarCercle() {
		 
		 System.out.print ("Cercle de radi" + this.radi + "cm situat en el punt( "+ this.centre);
	 }
}

	