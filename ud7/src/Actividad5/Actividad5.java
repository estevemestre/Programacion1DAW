/*
 * @author Esteve Mestre Company
 * 
 * Escriu un programa per a representar el consum d'energia d'una instal•lació elèctrica.
 *  Per a fer-ho, tindrem una classe que represente els aparells connectats en la instal•lació. Cada aparell té un consum 
 *  elèctric determinat. A l'encendre un aparell elèctric, el consum d'energia total s'incrementarà en la potència d'eixe aparell. 
 *  A l'apagar-lo, es decrementarà el consum total. Inicialment, els aparells estan tots apagats. 
 *  A més a més, es desitja consultar el consum total de la instal•lació.
 * Fer un programa que declare tres aparells elèctrics, una bombeta de 100 wats, un radiador de 2000 wats i una planxa de 1200 wats.
 *  El programa imprimirà el consum quan es creen els objectes. Posteriorment, es connectarà la bombeta i la planxa, i el programa 
 *mostrarà el consum. Després, s'apagarà la planxa i s'encendrà el radiador i es tornarà a mostrar el consum.
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
