package Coche;

public class Furgoneta extends Coche{  // extends es per a dirli que eredara de Coche   // no admite herencia multiple

	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta (int plazas_extra, int capacidad_carga) {
	
		super(); // llamar contructor de la clase padre 
		
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	
	public String dimeDatosFurgoneta() {
		
		return "La capacidad de carga es " + capacidad_carga + " Y las plazas son: " + plazas_extra;
	}
}
