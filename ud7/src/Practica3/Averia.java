/* Desenvolupar un classe anomenada Avaria que:
�	Tinga tres variables d'inst�ncia: un identificador de tipus int, el nom de l'avaria i el preu.
�	Tinga un constructor sense par�metres.
�	Tinga un constructor amb par�metres.
�	Tinga getters i setters per a les variables d'inst�ncia.
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
