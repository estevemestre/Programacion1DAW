/*
 	Escriu una classe per a representar rellotges, de forma que es guarde l'hora, el minut i el segon. 
 	L'hora podrà emmagatzemar números entre 0 i 23 (es guardaran les dades en format 24 hores),
  	els minuts i segons entre 0 i 59. És a dir, l'hora serà guardada en format 24 hores. 

	
		La classe ha de disposar dels següents mètodes:

a) Dos constructors, un sense paràmetres que posarà el rellotge a 0:0:0 i un altre al qual 
	se li passarà l'hora, els minuts i els segons. 

b) Un mètode que mostre l'hora, els minuts i els segons, separats per “:”,
 en format 24 hores. És a dir, si el rellotge marca les 7:30:0, significarà que 
 són les 7 del matí, i si marca les 19:30:0, significarà que són les 7 de la vesprada. 

c) Un mètode que mostre l'hora, els minuts i els segons, separats per “:”, en format 12 hores. 
Com en el cas de l'apartat b), si són les 7 del matí, el rellotge haurà de mostrar 
7:30:0 AM, Si són les 7 de la vesprada, mostrarà 7:30:0 PM.


d) Un mètode per posar el rellotge en hora. Se li passa l'hora i els minuts i es posen els segons a 0.

e) Un mètode com l'anterior, però passant-li també els segons.

g) Setters i getters per a les variables d'instància.
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
