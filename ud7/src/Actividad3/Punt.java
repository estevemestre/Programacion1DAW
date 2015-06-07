package Actividad3;

public class Punt {

	private int coordX;
	private int coordY;
	
	
	//	Implementa un constructor sense par�metres, que permitisca construir punts en l'origen de coordenades.
	public Punt(){
		this.coordX=0;
		this.coordY=0;
	}
	
	//Implementa un constructor amb par�metres per assignar valors a les variables d'inst�ncia.
	public Punt(int coordX, int coordY){
		this.coordX=coordX;
		this.coordY=coordY;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	

	
	//m�tode per calcular dist�ncia entre dos punts
	
	public double calcularDistancia(Punt altrePunt){
		
		double distX, distY;
		

		
		
		distX=Math.pow((altrePunt.coordX-this.coordX),2);
		System.out.println("Altre Punt x" +distX);
		distY=Math.pow((altrePunt.coordY-this.coordY), 2);
		System.out.println("Altre punt y" +distY);
		return Math.sqrt(distX+distY);
		
	}
	
	
	
	//*************
	//m�tode per calcular la dist�ncia a l'origen de coordenades
		public double calcularDistancia(){
			double distX, distY;
			distX=Math.pow(this.coordX,2);
			distY=Math.pow(this.coordY,2);
			return Math.sqrt(distX+distY);
		}
	
	//*******************
		
	//m�tode per visualitzar les coordenades d'un punt
	public void visualitzarPunt(){
		System.out.println("(" + this.getCoordX()+","+this.coordY+")");
	}
}
