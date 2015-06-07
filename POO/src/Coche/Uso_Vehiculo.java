// la regla de  es un

package Coche;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1 = new Coche();
		
		micoche1.setColor("Rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580); 
		
		mifurgoneta1.setColor("azul");
		
		mifurgoneta1.setAsientos_cuero("Si");
		
		mifurgoneta1.setClimatizador("Si");
		
		
		System.out.println(micoche1.dime_datos_generales() + micoche1.getColor());
		
		System.out.println(mifurgoneta1.dime_datos_generales());
		
		System.out.println(mifurgoneta1.dimeDatosFurgoneta());
		
		
	}
}
