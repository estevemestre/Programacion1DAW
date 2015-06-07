/* Desenvolupar un classe anomenada Avaria que:
•	Tinga tres variables d'instància: un identificador de tipus int, el nom de l'avaria i el preu.
•	Tinga un constructor sense paràmetres.
•	Tinga un constructor amb paràmetres.
•	Tinga getters i setters per a les variables d'instància.
 */
package Practica3;

public class Averia {


	private int identificador;
	private String averia;
	private double preu;
	
	
	
	public Averia () {


	}
	
	public Averia (int identificador, String problema, double preu) {
		
		this.identificador = identificador;
		this.averia = problema;
		this.preu = preu;

	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getAveria() {
		return averia;
	}

	public void setAveria(String averia) {
		this.averia = averia;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
	
	
	
}
