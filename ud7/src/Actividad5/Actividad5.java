/*
 * @author Esteve Mestre Company
 * 
 * Escriu un programa per a representar el consum d'energia d'una instal�laci� el�ctrica.
 *  Per a fer-ho, tindrem una classe que represente els aparells connectats en la instal�laci�. Cada aparell t� un consum 
 *  el�ctric determinat. A l'encendre un aparell el�ctric, el consum d'energia total s'incrementar� en la pot�ncia d'eixe aparell. 
 *  A l'apagar-lo, es decrementar� el consum total. Inicialment, els aparells estan tots apagats. 
 *  A m�s a m�s, es desitja consultar el consum total de la instal�laci�.
 * Fer un programa que declare tres aparells el�ctrics, una bombeta de 100 wats, un radiador de 2000 wats i una planxa de 1200 wats.
 *  El programa imprimir� el consum quan es creen els objectes. Posteriorment, es connectar� la bombeta i la planxa, i el programa 
 *mostrar� el consum. Despr�s, s'apagar� la planxa i s'encendr� el radiador i es tornar� a mostrar el consum.
 * 
 * 
 */
package Actividad5;

public class Actividad5 {
public static void main (String [] args){
		
		
	
		Activitat5_5 bombilla = new  Activitat5_5 (100); // consum de la bombilla es 100
		Activitat5_5 radiador = new Activitat5_5 (500);
		Activitat5_5 plancha = new Activitat5_5 (1200);
		
		
		
		
		System.out.println(Activitat5_5.getConsumTotal()); // pasarem el nom de la clase NO DE L'OBJECTE
		
		
		
		
		bombilla.enxufar(); // guarda en consum total que ja hi havia + la variable de  isntancia de la bombilla
		//System.out.println(Activitat5_5.getConsumTotal());
		
		
		radiador.enxufar();
		//System.out.println(Activitat5_5.getConsumTotal());
		
		
		plancha.enxufar();
		//System.out.println(Activitat5_5.getConsumTotal());
		
		//desenxufar
		
		radiador.desenxufar();
		//System.out.println(Activitat5_5.getConsumTotal());
	}
}
