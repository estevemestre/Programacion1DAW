/*
 	Escriu una classe per a representar rellotges, de forma que es guarde l'hora, el minut i el segon. 
 	L'hora podr� emmagatzemar n�meros entre 0 i 23 (es guardaran les dades en format 24 hores),
  	els minuts i segons entre 0 i 59. �s a dir, l'hora ser� guardada en format 24 hores. 

	
		La classe ha de disposar dels seg�ents m�todes:

a) Dos constructors, un sense par�metres que posar� el rellotge a 0:0:0 i un altre al qual 
	se li passar� l'hora, els minuts i els segons. 

b) Un m�tode que mostre l'hora, els minuts i els segons, separats per �:�,
 en format 24 hores. �s a dir, si el rellotge marca les 7:30:0, significar� que 
 s�n les 7 del mat�, i si marca les 19:30:0, significar� que s�n les 7 de la vesprada. 

c) Un m�tode que mostre l'hora, els minuts i els segons, separats per �:�, en format 12 hores. 
Com en el cas de l'apartat b), si s�n les 7 del mat�, el rellotge haur� de mostrar 
7:30:0 AM, Si s�n les 7 de la vesprada, mostrar� 7:30:0 PM.


d) Un m�tode per posar el rellotge en hora. Se li passa l'hora i els minuts i es posen els segons a 0.

e) Un m�tode com l'anterior, per� passant-li tamb� els segons.

g) Setters i getters per a les variables d'inst�ncia.
 */


package Actividad4;

public class RelojMain {
	
	public static void main(String[] args){
		
		Reloj r1=new Reloj();
		
		r1.mostrarHora();
		
		System.out.println("*************************************************");
		System.out.println("****FINAL DE MOSTRAR HORA DEL PRIMER OBJECTE*****");
		System.out.println("*************************************************");
		

		
		
		
		
		Reloj r2=new Reloj(17, 24, 40);
		r2.mostrarHora();
		System.out.println("*************************************************");
		System.out.println("****FINAL DE MOSTRAR HORA DEL SEGON OBJECTE******");
		System.out.println("*************************************************");
		
		
		
		r2.ponerReloj(14, 15);
		r2.mostrarHora();
		System.out.println("******************************************************************");
		System.out.println("****FINAL DE MOSTRAR HORA DEL SEGON OBJECTE SOBRE UN METODO ******");
		System.out.println("******************************************************************");
		
		
		
		
	
		System.out.println("******************************************************************");
		System.out.println("****FINAL DE MOSTRAR HORA DEL SEGON OBJECTE seter ******");
		System.out.println("******************************************************************");
		
		
		r2.setHora(20);
		r2.mostrarHora();
	}
}
