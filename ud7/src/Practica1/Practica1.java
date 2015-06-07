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





 *	3.- Desenvolupar un classe anomenada Triangle que:
 *	
 *	
 *	Nota: no serem rigorosos amb les matem�tiques i suposarem que els triangles sempre seran rectangles. En un triangle rectangle, 
 *	n'hi ha un costat que �s el major dels tres (que �s el que est� enfront de l'angle de 90�), que �s la hipotenusa.
 *	Els altres dos costats s�n els catets.
 *	Tinga tres variables d'inst�ncia de tipus Punt. 
 *	Tinga un constructor amb tres par�metres de tipus Punt que inicialitze les tres variables d'inst�ncia.
 *	Tinga un constructor per defecte (sense par�metres) per inicialitzar les tres variables d'inst�ncia al valor desitjat.
 *	Tinga un constructor amb sis par�metres de tipus double que inicialitze les tres variables d'inst�ncia.
 *	Tinga un getter i un setter per a cada variable d'inst�ncia.
 *	Tinga un m�tode calcularArea() que retorne l'�rea del triangle. L'�rea es pot calcular multiplicant la longitud dels catets i dividint per 2.
 *	Tinga un m�tode calcularPerimetre() que retorne el per�metre del triangle.





 * 	4.- Desenvolupar una classe anomenada Practica1 que en el seu m�tode main:
 * 
 * 
 *	Cree i inicialitze dos objectes de la classe Punt, mostre les seues coordenades i mostre la dist�ncia entre ells.
 *	Cree un objecte (o m�s d'un, es tracta de fer proves) de la classe Cercle i mostre la seua informaci�,  la seua �rea,
 *	el per�metre i la dist�ncia al primer dels dos punts anteriors.
 *	Cree un objecte de la classe Triangle i mostre la seua �rea i per�metre.
 *
 */
package Practica1;



public class Practica1 {

	public static void main(String[] args) {
		
		// Cree i inicialitze dos objectes de la classe Punt, mostre les seues coordenades i mostre la dist�ncia entre ells.
		
		Punt punt1 = new Punt(2.0,0.0);
		Punt punt2 = new Punt(6.0,2.0);
		
		
		// Creem un objecte que es diu crercle1 que tindra les 2 variables x = 3.2 y = 4.0
		
		
		
		punt2.visualitzarPunt();


		System.out.println(punt2.calcularDistancia(punt1));
		
		
		
		
		System.out.println("****************************TRIANGLE*****");
		
		
		// Punt cercle1 = new Punt (5.0, 3.0);
		
		
		Cercle cercle1 = new Cercle (5.0,0.0,1.8);
		
		System.out.println( cercle1.getRadi() , cercle1.getCentre());
		
		
		
		
		
		
	}
	
	
	
	
}
