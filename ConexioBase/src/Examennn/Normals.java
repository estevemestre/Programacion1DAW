package Examennn;

import java.util.ArrayList;

public class Normals extends Dietes {

	protected int maxCalories = 1600;
	
	
	public Normals () {
		super();		
	}
	
	public void comprovarkaliries (Aliment aliment) {
	
		int suma = 0;
		
		suma = suma + aliment.getKcal();
		
		if (suma < maxCalories) {
			this.aliments.add(aliment);
		}else {
			System.out.println(" No es pot afegir mes aliments ");
		}
		
		
		
	}
	
	
	
	
}
