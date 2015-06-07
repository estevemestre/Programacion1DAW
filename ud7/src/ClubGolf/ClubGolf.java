/*
 * @author Esteve Mestre
 * 
 *Escriu un programa que calcule la quota que s'ha d'abonar en un club de golf. La quota general �s de 500 �. 
 *Tindran un 50% de descompte les persones majors de 65 anys i un 25% els menors de 18 anys si els pares no s�n socis i el 35%
 *	si els pares s�n socis.
 *Demana a l'usuari el nom, l'edat i si els seus pares s�n socis o no. Mostra a continuaci� la informaci� que ha de pagar.
 *
 *Ac� tens alguns exemples d'execuci�:
 *
 *Inserta nom: Amparo
 *Inserta edat: 30
 *Amparo, has de pagar 500.0 euros.
 *
 *
 *Inserta nom: Pep
 *Inserta edat: 70
 *Pep, has de pagar 250.0 euros.
 *
 *
 *Inserta nom: Maria
 *Inserta edat: 15
 *Els teus pares s�n socis?(Si/No): Si
 *Maria, has de pagar 325.0 euros.
 *
 *
 *
 *Inserta nom: Raul
 *Inserta edat: 16
 *Els teus pares s�n socis?(Si/No): No
 *Raul, has de pagar 375.0 euros. 
 */
package ClubGolf;
import java.util.Scanner;
public class ClubGolf {

	public static void main(String[] args) {

	
		String resposta = "";
		
		
		
		Scanner reader=new Scanner(System.in);
		
		do{
			
			Soci s1=new Soci();
			
			
			s1.mostrarInfo();
			
			
			System.out.print("Vols introduir un altre soci?(Si/No)");
			resposta=reader.nextLine();
			
			
			
		}while (!resposta.equalsIgnoreCase("No"));
		
	}
}
