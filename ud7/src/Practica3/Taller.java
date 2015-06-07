/*4.- Desenvolupar una classe anomenada Taller que:
*Tinga les seg�ents variables d'inst�ncia: el codi i l'adre�a. 
*********A m�s a m�s, tamb� voldrem saber la quantitat de cotxes que s'han at�s en eixe taller.
Tinga un constructor sense par�metres.
Tinga un constructor amb par�metres.
Tinga getters i setters per a les variables d'inst�ncia.
Tinga un m�tode acceptarCotxe() que reba un par�metre de tipus Cotxe. 
Posar� la data actual a la d'entrada del cotxe.
Tinga un m�tode retornarCotxe() que reba un par�metre de tipus Cotxe. 
En un cas real posaria la data del sistema (perqu� se suposa que este m�tode 
seria executat per una aplicaci� quan es fera la factura quan es torna el cotxe al 
client, per� en este cas anem a fer que pose la data tres dies despr�s de la data actual).
 * 
 */
package Practica3;
import java.util.GregorianCalendar;

public class Taller {

	
//**********************************VARIABLES INSTANCIA***********************************************	
	private int codi;
	private String adre�a;
	private Cotxe cotxe;

	
	
//***********************************CONTRUCTORS*********************************************************	
	public Taller () {
		
		
	}
	
	
	public Taller (int codi, String adre�a) {
		
		this.codi = codi;
		this.adre�a = adre�a;
	}


	
//***********************************Setters i getters *******************************************************	
	
	public int getCodi() {
		return codi;
	}


	public void setCodi(int codi) {
		this.codi = codi;
	}


	public String getAdre�a() {
		return adre�a;
	}




	public void setAdre�a(String adre�a) {
		this.adre�a = adre�a;
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
	 * Mostrar la seg�ent informaci� al final del main(). Per exemple:
Informaci� del taller
Taller: C/Major, 50
N� cotxes reparats: 3
 * 		
 */

	public void mostrarInformacio () {
		
		System.out.println("Informaci� del taller \n Taller: " +getAdre�a()+
		"\n N� cotxes reparats: " +cotxe.getNumeroCotxes());
		
		
	}
	
}
