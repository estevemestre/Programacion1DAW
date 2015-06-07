//visites(data,hora)

package Clinica;
import java.util.Scanner;
public class Visita {

	private String data;
	private String hora;
	private static Scanner teclado = new Scanner(System.in);
	private Metge metge; 
	
	
	public Visita (Metge m) {
		System.out.println("Data de la visita (DD/MM/AAAA):");
		data=teclado.nextLine();
		System.out.println("Hora de la visita (HH:MM):");
		hora=teclado.nextLine();
		
		this.metge = m;
	}
	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public static Scanner getTeclado() {
		return teclado;
	}


	public static void setTeclado(Scanner teclado) {
		Visita.teclado = teclado;
	}


	public Metge getMetge() {
		return metge;
	}


	public void setMetge(Metge metge) {
		this.metge = metge;
	}
	
	


	
	
}