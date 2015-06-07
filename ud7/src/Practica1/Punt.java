/*
 * @author Esteve Mestre Company
 * 
 *	1.- Desenvolupeu una classe anomenada Punt que:
 *
 *	Tinga dos variables d'instància de tipus double.
 *	Tinga un constructor amb dos paràmetres de tipus double que inicialitze les dos variables d'instància.
 *	Tinga un constructor sense paràmetres que inicialitze les dos variables d'instància al valor escollit per vosaltres.
 *	Tinga un getter i un setter per a cada una de les variables d'instància.
 *	Tinga un mètode calcularDistancia() que reba un paràmetre de tipus Punt i que retorne un double.
 *	Tinga un mètode visualitzarPunt() que mostre les coordenades del punt com es mostra en el següent exemple:
 *	(2.0, 6.2)
 */



package Practica1;



public class Punt {
	
	// Tinga dos variables d'instància de tipus double.
	
	
	private double x;
	private double y;
	
	
	// 	Tinga un constructor amb dos paràmetres de tipus double que inicialitze les dos variables d'instància.
	
	public Punt (double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	// Tinga un constructor sense paràmetres que inicialitze les dos variables d'instància al valor escollit per vosaltres.
	
	public Punt () {
		
		this.x = 1.0;
		this.y = 1.0;
	}

	// Tinga un getter i un setter per a cada una de les variables d'instància.
	
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	// Tinga un mètode calcularDistancia() que reba un paràmetre de tipus Punt i que retorne un double.
	
	// ***********************************
	
	public double calcularDistancia(Punt altrePunt){
		
		double x, y;
		
		x=Math.pow((altrePunt.x-this.x),2);
		y=Math.pow((altrePunt.y-this.y), 2);
		return Math.sqrt(x+y);
		
	}
	
	// Tinga un mètode visualitzarPunt() que mostre les coordenades del punt com es mostra en el següent exemple:
	
	//**********************************************
	
	public void visualitzarPunt(){
		System.out.println("(" + this.x+","+this.y+")");
	}
	
	
}
