/*
 * 
 * @Author Esteve Mestre Company
 * 
 * Activitat4.- La seg�ent taula determina el model d'avaluaci� de les assignatures d'una carrera universit�ria a partir de les notes de l'examen final i de l'avaluaci� continuada.

		Qualificaci� examen final
		A	B	C	D	N
Qualificaci� avaluaci� continuada	A	Excel�lent	Excel�lent	Notable	Susp�s	No Presentat
	B	Excel�lent	Notable	Aprovat	Susp�s	No Presentat
	C	Excel�lent	Notable	Aprovat	Susp�s	No Presentat
	D	Excel�lent	Notable	Aprovat	Susp�s	No Presentat
	N	Excel�lent	Notable	Aprovat	Susp�s	No Presentat


S'han d'introduir les notes de 30 alumnes. Per a cada alumne, s'introduir� els seu nom, la qualificaci� de l'examen final i la qualificaci� de l'avaluaci� continuada. Una vegada introdu�des les dos qualificacions de cada alumne, se li mostraran la seg�ent informaci� (a�� �s un exemple d'una alumna que ha tret una B en l'examen final i una A en l'avaluaci� continuada):

	Alumne:		Maria Pastor Mart�
	Qualificaci� EF:	B
	Qualificaci� AV:	A
	Qualificaci� final:	Excel�lent


A m�s a m�s, s'han d'indicar els percentatges de les qualificacions obtingudes pels alumnes, de la seg�ent manera (a�� �s un exemple):

	Qualificacions globals del grup
	==================
	Excel�lent: 5
	Notable: 5
	Aprovat: 10
	Susp�s: 6
	No presentat:  4

Implementa una soluci� en Java orientada a objectes.

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
