/*
 * Activitat3.- Volem declarar una classe que represente un punt en un espai bidimensional. La classe ha de complir com a m�nim amb els seg�ents requeriments:
�	Cada punt es defineix per les seues coordenades.
�	Implementa un constructor sense par�metres, que permitisca construir punts en l'origen de coordenades.
�	Implementa un constructor amb par�metres per assignar valors a les variables d'inst�ncia.
�	Implementa els getters i setters.
�	Implementa un m�tode que calcule la dist�ncia a un altre punt. Per a calcular la dist�ncia entres dos punts, pots utilitzar la f�rmula de l'Activitat13 de la UD4.
�	Implementa un m�tode que visualitze les coordenades d'un punt en format (coordX, coordY).

Una vegada implementada la classe Punt, escriu un programa que instancie quatre punts: el primer punt situat en l'origen (0,0), el segon situat en (5,3), el tercer en (2,-1) i el quart estar� situat enmig del segon i el tercer (considerem que enmig vol dir en la meitat dels valors de la coordenada X i en la meitat dels valors de la coordenada Y). Crea un punt en (4,3) i visualitza la dist�ncia del punt a l'origen de coordenades.


 * 
 * 
 * 
 */
package Actividad3;

public class Activitat3 {
public static void main(String[] args){
		
		Punt punt1=new Punt();			//situat en (0,0)
		Punt punt2=new Punt(5,3);
		Punt punt3=new Punt(5,7);
		
		//************
		punt2.calcularDistancia(punt3);
		
		
		//**************
		punt3.calcularDistancia(punt1);
		
		
		
		
		
		punt1.visualitzarPunt();
		
				
			
		/*
		
		
		//el punt4 estar� situat enmig del segon i del tercer
		Punt punt4=new Punt((punt2.getCoordX()+punt3.getCoordX())/2,(punt2.getCoordY()+punt3.getCoordY())/2);
		Punt punt5=new Punt(4,3);
		
		System.out.print("Punt4: ");
		punt4.visualitzarPunt();
		
		System.out.print("Punt5: ");
		punt5.visualitzarPunt();
		
		System.out.println("Dist�ncia del punt5 a l'origen: " + punt5.calcularDistancia());
		
		*/
	}
}
