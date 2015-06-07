/*1.- Desenvolupar una classe anomenada Motor que:
�	Tinga dos atributs: un de tipus int que representa els CV (cavalls) 
i un altre de tipus double que representa el consum.
�	Tinga un constructor sense par�metres.
�	Tinga un constructor amb par�metres.
�	Tinga getters i setters per a les variables d'inst�ncia.
�	Ni el consum ni els CV poden ser negatius. Si ho s�n, s'hauran d'inicialitzar les variables a 0.
 */
package Practica3;

public class Motor {

	
	private int cv;
	private double consum;
		
	
	
	public Motor (){
		
		if (this.cv < 0 || this.consum < 0 ) {
			
			this.cv = 0;
			this.consum = 0; 
			
		}else{
			this.cv = cv;
			this.consum = consum;
			
		}

}
	
	public Motor (int cv, double consum) {
		
		
		if (this.cv < 0 || this.consum < 0 ) {
			
			this.cv = 0;
			this.consum = 0; 
			
			}else{
				
				this.cv = cv;
				this.consum = consum;
			
		}

}

	//********************** getters i setters*****************************
	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public double getConsum() {
		return consum;
	}

	public void setConsum(double consum) {
		this.consum = consum;
	}
	
	
	
	
}
