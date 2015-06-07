package Figures;

public abstract class Figura {

	protected String color;

	
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}


	public Figura () {
		
		this.color= "blue";
	}
	


	public abstract double calcularArea();
		// cuant nia una metode abstracte no te codic 
		
	
}
