/*4.- Desenvolupar una classe anomenada Practica3 que en el seu mètode main:
Crea un o tres de motors.
44 CV – 5.4 l/100km
105 CV – 5.1 l/100km
86 CV – 5.2 l/100km
Crea les següents avaries:
1 – Canvi d'oli – 50 euros
2 – Canvi 2 rodes – 222.50 euros
3 – Canvi 4 rodes – 400 euros
4 – Corretja distribució – 190 euros
Cree dos o tres cotxes únicament amb el model i marca.
Seat – Ibiza
Seat – Toledo
Seat – León
Assigna el motor1 al cotxe1, el motor2 al cotxe2 i el motor3 al cotxe3.

Crea un taller.
1 – C/Major, 50
Assigna als cotxes les avaries creades que desitges.
El taller aniran acceptant els cotxes (un cada vegada) i retornant-los. Després de retornar cada cotxe es visualitzarà la següent informació:
COTXE REPARAT AMB ÈXIT.
	Marca: Seat
	Model: Ibiza
	Motor: 44 CV (5.4 l/100km)
	Avaria reparada: Canvi d'oli
	Import: 50.0 euros
	Data d'entrada: 16/01/2014
	Data d'eixida: 19/01/2014

Mostrar la següent informació al final del main(). Per exemple:
Informació del taller
Taller: C/Major, 50
Nº cotxes reparats: 3
 * 
 */
package Practica3;

public class Practica3 {

	public static void main(String[] args) {
		

		
		
		
		Motor motor1 = new Motor (44, 5.4);
		Motor motor2 = new Motor (105, 5.1);
		Motor motor3 = new Motor (86, 5.2);
		

		Averia averia1 = new Averia(1, "canvi d'oli", 50); 
		Averia averia2 = new Averia(1, "canvi dos rodes", 222.50); 
		Averia averia3 = new Averia(1, "canvi cuatre rodes", 400); 

		
		Cotxe cotxe1 = new Cotxe ("Seat","Ibiza");
		Cotxe cotxe2 = new Cotxe ("Seat","Toledo");
		Cotxe cotxe3 = new Cotxe ("Seat","León");
		

		cotxe1.setMotor(motor1);
		cotxe2.setMotor(motor2);
		cotxe3.setMotor(motor3);
		

		Taller taller1 = new Taller (1 ,"C/Major, 50" );
		
		
		cotxe1.setFallo(averia1);
		cotxe2.setFallo(averia2);
		cotxe3.setFallo(averia3);		
		

		
		taller1.acceptarCotxe(cotxe1);
		taller1.retornarCotxe(cotxe1);
		taller1.acceptarCotxe(cotxe2);
		taller1.retornarCotxe(cotxe2);
		taller1.acceptarCotxe(cotxe3);
		taller1.retornarCotxe(cotxe3);
		
		
		taller1.mostrarInformacio();
		
		
	}
}



