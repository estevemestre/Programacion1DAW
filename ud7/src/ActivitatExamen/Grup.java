package ActivitatExamen;

public class Grup {

	private int numExc;
	private int numNot;
	private int numAprov;
	private int numSuspes;
	private int numNP;
	
	
	public void calcularEstadistiques(String nota){
				
		if (nota.equals("Excel·lent")){
			this.numExc++;
		} else if (nota.equals("Notable")) {
			this.numNot++;
		} else if (nota.equals("Aprovat")) {
			this.numAprov++;
		} else if (nota.equals("Suspès")) {
			this.numSuspes++;
		} else {
			this.numNP++;
		}
		
	}
	
	public  void mostrarEstadistiques(){
		
		//visualització de les qualificacions globals
		System.out.println();
		System.out.println("Qualificacions globals del grup");
		System.out.println("===============================");
		System.out.println("Excel·lent: " + this.numExc);
		System.out.println("Notable: " + this.numNot);
		System.out.println("Aprovat: " + this.numAprov);
		System.out.println("Suspés: " + this.numSuspes);
		System.out.println("No presentat: " + this.numNP);
			
	}

}
