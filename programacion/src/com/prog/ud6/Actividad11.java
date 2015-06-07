/*
 * @author Esteve Mestre 
 * 
 * Es demana implementar un programa que demane el DNI d'una persona i li retorne el seu NIF (DNI més la lletra que li correspon)
 * . L'algorisme per calcular la lletra del NIF és un algorisme anomenat mòdul 23, de forma que es tracta de calcular el resto de 
 * la divisió entera entre el número de DNI i el número 23. El resto de la divisió serà un número enter entre 0 i 22 i la lletra es
 *  calcula a partir de la posició segons la següent taula:
 *
 *RESTO	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
 *LLETRA	T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E 
 *
 * Normes a seguir:
 *•	S'ha de crear un mètode anomenat obtindreDNI() que demanarà a l'usuari el seu DNI i el retornarà. El DNI es recollirà i serà retorna pel mètode com a String.
•	S'ha de crear un mètode anomenat calcularNIF() que rebrà el DNI (com a String), calcularà la lletra del NIF segons l'algorisme descrit i retornarà el DNI juntament amb la lletra, separat per un guió.
•	Les lletres del NIF (les de la taula anterior) aniran en un String.
•	Els mètodes es cridaran des del main().


Exemple d'execució:

Introduïsca el seu DNI: 44258963
El seu NIF és: 44258963-V

 * 
 */


package com.prog.ud6;
import java.util.Scanner;

public class Actividad11 {

			public static void main(String[] args){
		
				String Dni = obtindreDNI();

				String NIF = calcularNIF(Dni);
		
				System.out.println("Tu DNI con la letra es "+NIF);
			}

		
			
			public static String obtindreDNI (){
		
				Scanner teclado = new Scanner(System.in);
		
				String DNI = "";
		
				
				
				System.out.print("Inserta tu DNI sin letra");
				DNI = teclado.nextLine();
		
		
				teclado.close();
				return DNI;		
	}	
	
	
			public static String calcularNIF(String DNI){
				
				String NIF="";
				int numeroDNI;
				int numeroletra;
				String letraDNI="TRWAGMYFPDXBNJZSQVHLCKE";
				char caracter='r';
		
				numeroDNI = Integer.parseInt(DNI);
				numeroletra = numeroDNI % 23;
		
				if (numeroletra!=23) {
					caracter = letraDNI.charAt(numeroletra);
				}
		
				NIF= DNI+"-"+caracter;
				return NIF;
	}		
	
	}
