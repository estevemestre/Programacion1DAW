package practicaGarage;


public abstract class Reparacions extends Treball {

	protected double preuMaterial;
	
	public Reparacions () {
	
		this.preuMaterial = preuMaterial;
	}

	public double getPreuMaterial() {
		return preuMaterial;
	}

	public void setPreuMaterial(double preuMaterial) {
		this.preuMaterial = preuMaterial;
	}
	
	
	
	public abstract double  calcularCost(); 
		

		
	
}

