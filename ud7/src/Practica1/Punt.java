/*
 * @author Esteve Mestre Company
 * 
 *	1.- Desenvolupeu una classe anomenada Punt que:
 *
 *	Tinga dos variables d'inst�ncia de tipus double.
 *	Tinga un constructor amb dos par�metres de tipus double que inicialitze les dos variables d'inst�ncia.
 *	Tinga un constructor sense par�metres que inicialitze les dos variables d'inst�ncia al valor escollit per vosaltres.
 *	Tinga un getter i un setter per a cada una de les variables d'inst�ncia.
 *	Tinga un m�tode calcularDistancia() que reba un par�metre de tipus Punt i que retorne un double.
 *	Tinga un m�tode visualitzarPunt() que mostre les coordenades del punt com es mostra en el seg�ent exemple:
 *	(2.0, 6.2)
 */



package Practica1;



public class Punt {
	
	// Tinga dos variables d'inst�ncia de tipus double.
	
	
	private double x;
	private double y;
	
	
	// 	Tinga un constructor amb dos par�metres de tipus double que inicialitze les dos variables d'inst�ncia.
	
	public Punt (double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	// Tinga un constructor sense par�metres que inicialitze les dos variables d'inst�ncia al valor escollit per vosaltres.
	
	public Punt () {
		
		this.x = 1.0;
		this.y = 1.0;
	}

	// Tinga un getter i un setter per a cada una de les variables d'inst�ncia.
	
	
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
	
	
	// Tinga un m�tode calcularDistancia() que reba un par�metre de tipus Punt i que retorne un double.
	
	// ***********************************
	
	public double calcularDistancia(Punt altrePunt){
		
		double x, y;
		
		x=Math.pow((altrePunt.x-this.x),2);
		y=Math.pow((altrePunt.y-this.y), 2);
		return Math.sqrt(x+y);
		
	}
	
	// Tinga un m�tode visualitzarPunt() que mostre les coordenades del punt com es mostra en el seg�ent exemple:
	
	//**********************************************
	
	public void visualitzarPunt(){
		System.out.println("(" + this.x+","+this.y+")");
	}
	
	
}
