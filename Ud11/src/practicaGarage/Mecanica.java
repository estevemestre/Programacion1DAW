package practicaGarage;

public class Mecanica extends Reparacions {
	
	
	
	
	public Mecanica() {	
	
		
	}
	
	private static double coeficient = 1.1;
	
	public double calcularCost() {
		
		return 1.2;
	}
	
	
	public double getPreuMaterial() {
		return preuMaterial;
	}

	public void setPreuMaterial(double preuMaterial) {
		this.preuMaterial = preuMaterial;
	}
	
	
	@Override
	public String toString() {
		return "La id es " + this.id + "La seva descripcio es " +this.descripcio + "el preu del material es "+ this.preuMaterial;
	}	
	
}
