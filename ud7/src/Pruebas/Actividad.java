/*
 * @author Esteve Mestre
 * 
 *Escriu un programa que calcule la quota que s'ha d'abonar en un club de golf. La quota general és de 500 €. 
 *Tindran un 50% de descompte les persones majors de 65 anys i un 25% els menors de 18 anys si els pares no són socis i el 35%
 *	si els pares són socis.
 *Demana a l'usuari el nom, l'edat i si els seus pares són socis o no. Mostra a continuació la informació que ha de pagar.
 *
 *Ací tens alguns exemples d'execució:
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
 *Els teus pares són socis?(Si/No): Si
 *Maria, has de pagar 325.0 euros.
 *
 *
 *
 *Inserta nom: Raul
 *Inserta edat: 16
 *Els teus pares són socis?(Si/No): No
 *Raul, has de pagar 375.0 euros. 
 */


package Pruebas;
import java.util.Scanner;
public class Actividad {
	
	private String nombre;
	private int edad;
	private int quotaGeneral = 500;
	private String esSoci;
	
	
	
	
	
	public Actividad () {
	
		Scanner lector = new Scanner(System.in);
		
	
		
		System.out.print("Introduce tu nombre");
		this.nombre = lector.nextLine();
		
		System.out.print("Introduce tu edad");
		this.edad = Integer.parseInt(lector.nextLine());
		

		if (edad < 18) {	
		
			System.out.print("Tu padre es socio (Si/No)?");
		
			esSoci = lector.nextLine();
			
			
			
		}
	}
		
		
		public String getNombre() {
			return nombre;
		}

		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		public int getEdad() {
			return edad;
		}

		
		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getQuotaGeneral() {
			return quotaGeneral;
		}
		
		public void setQuotaGeneral(int quotaGeneral) {
			this.quotaGeneral = quotaGeneral;
		}
		
		public String getEsSoci () {
			return esSoci;
		}
		public void setEsSoci (String esSoci) {
			this.esSoci = esSoci;
		}
		
		

		public int calQularQuota () {

		int	quota;

				if (this.edad > 18 || this.edad < 65) {
					
					quota = this.quotaGeneral;
				}else if (this.edad > 65) {
					quota = this.quotaGeneral * 50 / 100;
				
				}else if (this.edad < 18 || this.esSoci)
				
		
		
		
		
		return  quota;
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
}

