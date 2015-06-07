package Practica_3;

import java.util.GregorianCalendar;

public class TallerP3 {
	private int codi;
	private String adreça;
	private static int NCotxes;  //Static perquè és un número en global, no afecta a cada objecte
	
	//Constructors
	public TallerP3(){
		
	}
	public TallerP3(int codi, String direccio){
		this.codi=codi;
		this.adreça=direccio;
	}
	
	//getters i setters
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
	public static int getNCotxes() {
		return NCotxes;
	}
	public static void setNCotxes(int nCotxes) { //Sumarem a la variable Static NCotxes el valor que li posem a nCotxes.
		NCotxes = NCotxes + nCotxes;
	}
	
	public void acceptarCotxe(CotxeP3 cotxe){
		
		GregorianCalendar data=new GregorianCalendar();
		
		cotxe.setEntrada(data);
	}
	public void retornarCotxe(CotxeP3 cotxe){
		GregorianCalendar data=new GregorianCalendar();
		
		data.add(GregorianCalendar.DAY_OF_MONTH, 3);//Suma 3 dies a la data actual
		cotxe.setEixida(data);
		
		System.out.println("\n COTXE REPARAT AMB ÈXIT. \n ");
		cotxe.mostrarInfo();
		
	}
	
	//Mostra la informació del taller
	public void visualitzarTaller(){
		System.out.println("Informació del taller \n Taller: "+adreça+"\n Nº cotxes reparats: "+NCotxes);
	}
	
	

}
