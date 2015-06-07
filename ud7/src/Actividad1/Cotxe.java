
package Actividad1;

public class Cotxe {

	private String model; 
	private String color;
	private boolean esMetal;
	private String matricula; 
	private String tipus;
	private int anyMatr;
	private String modelAsseg;
	
							// Constructor sense parametres
	
		public Cotxe(){ 		// Estic creant un constructor
		
		this.model=" Seat Ibiza";
		this.color="Blanc";
		this.esMetal=true;
		this.matricula="0512LSI";
		this.tipus=" utilitari";
		this.anyMatr=2014;
		this.modelAsseg=" todo riesgo";
		
		}
	
		// constructor amb parametres
	
		
		
		public Cotxe (String model, String color, boolean esMetal, String matricula, String tipus, int anyMatr, String modelAsseg){
		
		this.model=model;
		this.color=color;
		this.esMetal=esMetal;
		this.matricula=matricula;
		this.tipus=tipus;
		this.anyMatr=anyMatr;
		this.modelAsseg=modelAsseg;
		
	}
	
	public Cotxe(String matricula,int anyMatr){
		this.matricula=matricula;
		this.anyMatr=anyMatr;
	}
	
	
				//getters
	public String getModel(){
		return this.model;
		
	}
	
	public boolean getColor(){
		return this.esMetal;
	}
	
	public String getMatricula(){
		return this.matricula;
		
	}
	public String getTipus(){
		return this.tipus;
	}
	
	public int getAnyMatr(){
		return this.anyMatr;
	}
	
	public String getTipursAsseg(){
		return this.modelAsseg;
	}
	
				//setters
	public void setModel(String model){
		this.model=model;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public void setEsMetal(boolean esMetal){
		this.esMetal=esMetal;
	}
	
	public void setMatricula(String matricula){
		this.matricula=matricula;
	}
	
	public void setTipus(String tipus){
		this.tipus=tipus;
	}
	
	public void setAnyMatr(int anyMatr){
		this.anyMatr=anyMatr;
	}
	
	public void setModelAsseg(String modelAsseg){
		this.modelAsseg=modelAsseg;
	}
	
	// metode mostrar info
	
	public void mostrarInfo(){
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println("es metal " +this.esMetal);
		System.out.println("AnyMatricula: " + this.modelAsseg);
	
	}
}
