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





 *	2.- Desenvolupeu un classe anomenada Cercle que:
 *
 *
 *	Tinga una variable d'instància de tipus Punt (per a representar el centre del cercle) i una de tipus double 
 *	(per a representar el radi del cercle).
 *	Tinga un constructor amb dos paràmetres, un de tipus Punt i un altre double que inicialitze les dos variables d'instància.
 *	Tinga un constructor amb tres paràmetres de tipus double que inicialitze les dos variables d'instància.
 *	Tinga un constructor sense paràmetres que inicialitze les dos variables d'instància al valor escollit per vosaltres.
 *	Tinga un getter i un setter per a cada una de les variables d'instància.
 *	Tinga un mètode calcularArea() que no reba cap paràmetre i retorne un double.
 *	Tinga un mètode calcularPerimetre() que no reba cap paràmetre i retorne un double.
 *	Tinga un mètode visualitzarCercle() que mostre la seua informació com es mostra en el següent exemple:
 *	Cercle de radi 2.5 cm situat en el punt (3.2, 4.0).
 *	NOTA: Si el centre del cercle està situat en el punt (0, 0), el missatge mostrat serà:
 *	Cercle de radi 3.2 cm situat en l'origen de coordenades.





 *	3.- Desenvolupar un classe anomenada Triangle que:
 *	
 *	
 *	Nota: no serem rigorosos amb les matemàtiques i suposarem que els triangles sempre seran rectangles. En un triangle rectangle, 
 *	n'hi ha un costat que és el major dels tres (que és el que està enfront de l'angle de 90º), que és la hipotenusa.
 *	Els altres dos costats són els catets.
 *	Tinga tres variables d'instància de tipus Punt. 
 *	Tinga un constructor amb tres paràmetres de tipus Punt que inicialitze les tres variables d'instància.
 *	Tinga un constructor per defecte (sense paràmetres) per inicialitzar les tres variables d'instància al valor desitjat.
 *	Tinga un constructor amb sis paràmetres de tipus double que inicialitze les tres variables d'instància.
 *	Tinga un getter i un setter per a cada variable d'instància.
 *	Tinga un mètode calcularArea() que retorne l'àrea del triangle. L'àrea es pot calcular multiplicant la longitud dels catets i dividint per 2.
 *	Tinga un mètode calcularPerimetre() que retorne el perímetre del triangle.





 * 	4.- Desenvolupar una classe anomenada Practica1 que en el seu mètode main:
 * 
 * 
 *	Cree i inicialitze dos objectes de la classe Punt, mostre les seues coordenades i mostre la distància entre ells.
 *	Cree un objecte (o més d'un, es tracta de fer proves) de la classe Cercle i mostre la seua informació,  la seua àrea,
 *	el perímetre i la distància al primer dels dos punts anteriors.
 *	Cree un objecte de la classe Triangle i mostre la seua àrea i perímetre.
 *
 */
package Practica1;



public class Practica1 {

	public static void main(String[] args) {
		
		// Cree i inicialitze dos objectes de la classe Punt, mostre les seues coordenades i mostre la distància entre ells.
		
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
