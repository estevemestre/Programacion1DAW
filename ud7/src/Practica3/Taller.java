/*4.- Desenvolupar una classe anomenada Taller que:
*Tinga les següents variables d'instància: el codi i l'adreça. 
*********A més a més, també voldrem saber la quantitat de cotxes que s'han atès en eixe taller.
Tinga un constructor sense paràmetres.
Tinga un constructor amb paràmetres.
Tinga getters i setters per a les variables d'instància.
Tinga un mètode acceptarCotxe() que reba un paràmetre de tipus Cotxe. 
Posarà la data actual a la d'entrada del cotxe.
Tinga un mètode retornarCotxe() que reba un paràmetre de tipus Cotxe. 
En un cas real posaria la data del sistema (perquè se suposa que este mètode 
seria executat per una aplicació quan es fera la factura quan es torna el cotxe al 
client, però en este cas anem a fer que pose la data tres dies després de la data actual).
 * 
 */
package Practica3;
import java.util.GregorianCalendar;

public class Taller {

	
//**********************************VARIABLES INSTANCIA***********************************************	
	private int codi;
	private String adreça;
	private Cotxe cotxe;

	
	
//***********************************CONTRUCTORS*********************************************************	
	public Taller () {
		
		
	}
	
	
	public Taller (int codi, String adreça) {
		
		this.codi = codi;
		this.adreça = adreça;
	}


	
//***********************************Setters i getters *******************************************************	
	
	public int getCodi() {
		return codi;
	}


	public void setCodi(int codi) {
		this.codi = codi;
	}


	public String getAdreça() {
		return adreça;
	}




	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}

//********************************************METODOS************************************************************
	
	
	public void acceptarCotxe(Cotxe cotxe) {
		
	
		
		GregorianCalendar dataActual=new GregorianCalendar();
		cotxe.setDataEntrada(dataActual);
		
	}
	
	
	public void retornarCotxe(Cotxe cotxe) {
	
		
		GregorianCalendar dataRetorno=new GregorianCalendar();
		
		dataRetorno.add(GregorianCalendar.DAY_OF_MONTH, 3);
		cotxe.setDataEixida(dataRetorno);
		
		cotxe.informacioCoxe();

	}
	
	/*
	 * Mostrar la següent informació al final del main(). Per exemple:
Informació del taller
Taller: C/Major, 50
Nº cotxes reparats: 3
 * 		
 */

	public void mostrarInformacio () {
		
		System.out.println("Informació del taller \n Taller: " +getAdreça()+
		"\n Nº cotxes reparats: " +cotxe.getNumeroCotxes());
		
		
	}
	
}
