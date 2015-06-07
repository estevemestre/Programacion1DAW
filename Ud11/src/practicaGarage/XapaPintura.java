package practicaGarage;

public class XapaPintura extends Reparacions {

	private static double coeficient = 1.3;
	
	
	public XapaPintura() {
		super();
	}
	
	
	public double calcularCost () {
		
		return 0;
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
