package Actividad5;

public class Activitat5_5 {

	//variable estatica ( sera de tota la clase)
		private static int consumTotal;
	
	// variables d'instancia
		private int consum;
		
		// crear constructor sense paràmentres
		
		
		public Activitat5_5(){
			this.consum=0;			
		}
		
		
		// crear constructor amb paràmetres
		
		public Activitat5_5( int consum){
			this.consum=consum;
		}
		
		// metodo que s'aplicara sobre un objecte, perque no retorna res.
		
		public void enxufar(){
			consumTotal= consumTotal + this.consum; // el que fa es cada vegada que enxufa un aparato s'actualitza, ( lo que ja hi haga + el consum de 
													// el aparato consum
		}
		
		public void desenxufar(){
			
			consumTotal= consumTotal - this.consum;
		}
		//getter per a vorer el que te la variable consumTotal es fa perque es privada, si nos de l'altra clase no podriem vorela
		
		public static int getConsumTotal(){
			return consumTotal;
		}
}
