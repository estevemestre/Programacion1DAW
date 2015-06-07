package Poo1_Coche;


public class Coche { // En esta clase definirem tots els atributs que tindra la PLATAFORMA DEL COCHE  no el tipod de coche si no La plataforma lo que tenen tots les plataformes
	
	// Caracteristiques comuns del coche 
	
	
	
	// Ponemos private para que podamos modificar la variable de instancia desde la propia clase ja que todos las plataformas tendran 4 ruedas
	// Private solo podremos verlo i modificarlo desde la propia clase 
	private int ruedas;        // Tots les plataformes tenen rodes
	
	private int largo;			// Tots les plataformes mediran algo
	
	private int ancho;			// Tots les plataformes tindran un ancho
	
	private int motor; 			// totes les plataformes tindra un motor medir en cm cubics
	
	private int peso_plataforma;           
	
	
	// Propietats que poden variar 
	
	
	String color;

	int peso_total;
	
	boolean asientos_cuero;
	
	boolean climatizador;

	
	


/*				Metodo Constructor 
 * es un metodo especial que se encarga de dar
 * un estado incial a nuestro objeto
 * 
 */

	// El contructor sempre te que tindre el mateix nom que la clase
	public  Coche () {
	
		ruedas =4;
		
		largo = 2000;
		
		ancho = 300;
	
		motor = 1600;
	
		peso_plataforma = 500;
	}





	public int getRuedas() {
		return ruedas;
	}





	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}





	public int getLargo() {
		return largo;
	}





	public void setLargo(int largo) {
		this.largo = largo;
	}





	public int getAncho() {
		return ancho;
	}





	public void setAncho(int ancho) {
		this.ancho = ancho;
	}





	public int getMotor() {
		return motor;
	}





	public void setMotor(int motor) {
		this.motor = motor;
	}





	public int getPeso_plataforma() {
		return peso_plataforma;
	}





	public void setPeso_plataforma(int peso_plataforma) {
		this.peso_plataforma = peso_plataforma;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public int getPeso_total() {
		return peso_total;
	}





	public void setPeso_total(int peso_total) {
		this.peso_total = peso_total;
	}





	public boolean isAsientos_cuero() {
		return asientos_cuero;
	}





	public void setAsientos_cuero(String asientos_cuero) {
		
		
		if (asientos_cuero == "si") {
		
			this.asientos_cuero = true;
		} else {
			
			this.asientos_cuero = false;
		}
			
	}





	public boolean isClimatizador() {
		return climatizador;
	}





	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}




	
	
	
}