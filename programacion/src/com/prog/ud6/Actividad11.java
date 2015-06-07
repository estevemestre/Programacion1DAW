/*
 * @author Esteve Mestre 
 * 
 * Es demana implementar un programa que demane el DNI d'una persona i li retorne el seu NIF (DNI m�s la lletra que li correspon)
 * . L'algorisme per calcular la lletra del NIF �s un algorisme anomenat m�dul 23, de forma que es tracta de calcular el resto de 
 * la divisi� entera entre el n�mero de DNI i el n�mero 23. El resto de la divisi� ser� un n�mero enter entre 0 i 22 i la lletra es
 *  calcula a partir de la posici� segons la seg�ent taula:
 *
 *RESTO	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
 *LLETRA	T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E 
 *
 * Normes a seguir:
 *�	S'ha de crear un m�tode anomenat obtindreDNI() que demanar� a l'usuari el seu DNI i el retornar�. El DNI es recollir� i ser� retorna pel m�tode com a String.
�	S'ha de crear un m�tode anomenat calcularNIF() que rebr� el DNI (com a String), calcular� la lletra del NIF segons l'algorisme descrit i retornar� el DNI juntament amb la lletra, separat per un gui�.
�	Les lletres del NIF (les de la taula anterior) aniran en un String.
�	Els m�todes es cridaran des del main().


Exemple d'execuci�:

Introdu�sca el seu DNI: 44258963
El seu NIF �s: 44258963-V

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
