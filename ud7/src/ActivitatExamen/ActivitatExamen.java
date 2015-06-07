/*
 * 
 * @Author Esteve Mestre Company
 * 
 * Activitat4.- La següent taula determina el model d'avaluació de les assignatures d'una carrera universitària a partir de les notes de l'examen final i de l'avaluació continuada.

		Qualificació examen final
		A	B	C	D	N
Qualificació avaluació continuada	A	Excel•lent	Excel•lent	Notable	Suspès	No Presentat
	B	Excel•lent	Notable	Aprovat	Suspès	No Presentat
	C	Excel•lent	Notable	Aprovat	Suspès	No Presentat
	D	Excel•lent	Notable	Aprovat	Suspès	No Presentat
	N	Excel•lent	Notable	Aprovat	Suspès	No Presentat


S'han d'introduir les notes de 30 alumnes. Per a cada alumne, s'introduirà els seu nom, la qualificació de l'examen final i la qualificació de l'avaluació continuada. Una vegada introduïdes les dos qualificacions de cada alumne, se li mostraran la següent informació (açò és un exemple d'una alumna que ha tret una B en l'examen final i una A en l'avaluació continuada):

	Alumne:		Maria Pastor Martí
	Qualificació EF:	B
	Qualificació AV:	A
	Qualificació final:	Excel•lent


A més a més, s'han d'indicar els percentatges de les qualificacions obtingudes pels alumnes, de la següent manera (açò és un exemple):

	Qualificacions globals del grup
	==================
	Excel•lent: 5
	Notable: 5
	Aprovat: 10
	Suspès: 6
	No presentat:  4

Implementa una solució en Java orientada a objectes.

 * 
 * 
 * 
 * 
 * 
 * 
 */
package ActivitatExamen;

public class ActivitatExamen {

	public static void main(String[] args) {
		Grup grup = new Grup();
		
		Alumne al;
		
		
		for (int i = 0; i < 2; i++) {
			al=new Alumne();
		
			al.mostrarInfo();
			
			grup.calcularEstadistiques(al.getNotaFinal());
			
		} 
		
		grup.mostrarEstadistiques();
		
		
		
	}
}
