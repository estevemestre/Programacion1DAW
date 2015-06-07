/*
 * 3.- Desenvolupar una classe anomenada Cotxe que:
•	Tinga una variable d'instància de la classe Motor, una de tipus String
 (per representar la marca), una altra de tipus String (per representar el model), 
 una altra que represente l'avaria (per què no funciona el cotxe?, què li passa?),
  una de tipus data que represente l'entrada del Cotxe en el taller (que inicialment estarà a null) 
  i una altre de tipus data que representarà l'eixida del Cotxe del taller
   quan ja estiga reparat (i que inicialment també estarà a null).
•	Tinga un constructor amb dos paràmetres de tipus String que inicialitzen la marca i el model.
•	Tinga un constructor sense paràmetres.
•	Tinga un constructor amb la següent capçalera:
◦	public Cotxe(Motor motor, String marca, String model, Avaria fallo, GregorianCalendar 
dataEntrada, GregorianCalendar dataEixida)




•	Tinga un constructor amb la següent capçalera:
◦	public Cotxe(int CV, double consum,  String marca, String model, int id, String nom, double preu,
 GregorianCalendar dataEntrada, GregorianCalendar dataEixida), on:
▪	CV i consum representen al motor
▪	id, nom i preu representen a l'avaria
•	Tinga un getter i un setter per a cada atribut.


 * 
 * 
 */
package Practica3;
import java.util.GregorianCalendar;
public class Cotxe {

//********************VARIABLES INSTACIA**************************************************		
	
	private static int numeroCotxes;
	private Motor motor; // guardara cv i vonsum
	private String marca;
	private String model;
	private Averia fallo;
	private GregorianCalendar dataEntrada = null;     // Inicalment te qu estar a nul
	private GregorianCalendar dataEixida = null;	   // Inicalment te qu estar a nul
	
//**********************CONTRUCTORES****************************
		public Cotxe () {
			
			numeroCotxes = numeroCotxes + 1;
		}
	
		public Cotxe (String marca, String model){ 
	
			this.marca = marca;
			this.model = model;
			numeroCotxes = numeroCotxes + 1;
		}
		
		public Cotxe (Motor motor, String marca, String model, Averia fallo, GregorianCalendar 
				dataEntrada, GregorianCalendar dataEixida) {
			
			
			this.motor = motor;
			this.marca = model;
			this.fallo = fallo;
			this.dataEntrada = dataEntrada;
			this.dataEixida = dataEixida;
			numeroCotxes = numeroCotxes + 1;
				
		}

		public Cotxe (int cv, double consum,  String marca, String model, int identificador, String problema, double preu,
				 GregorianCalendar dataEntrada, GregorianCalendar dataEixida) {
		
			
			this.motor = new Motor (cv, consum);
			this.marca = marca;
			this.model = model;
			this.fallo = new Averia (identificador, problema, preu);
			this.dataEntrada = dataEntrada;
			this.dataEixida = dataEixida;
			numeroCotxes = numeroCotxes + 1;
		
		}
	
		
//							Setters i Getters		
		public static int getNumeroCotxes() {
			return numeroCotxes;
		}

		public static void setNumeroCotxes(int numeroCotxes) {
			Cotxe.numeroCotxes = numeroCotxes;
		}
		public Motor getMotor() {
			return motor;
		}

		public void setMotor(Motor motor) {
			this.motor = motor;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Averia getFallo() {
			return fallo;
		}

		public void setFallo(Averia fallo) {
			this.fallo = fallo;
		}

		public GregorianCalendar getDataEntrada() {
			return dataEntrada;
		}

		public void setDataEntrada(GregorianCalendar dataEntrada) {
			this.dataEntrada = dataEntrada;
		}

		public GregorianCalendar getDataEixida() {
			return dataEixida;
		}

		public void setDataEixida(GregorianCalendar dataEixida) {
			this.dataEixida = dataEixida;
		}
	
//            Metodos 
		
		
		public void informacioCoxe() {
			System.out.println("COTXE REPARAT AMB ÈXIT. \n Marca:" +getMarca()+ "\n Model: " +getModel()+
					"\n Motor: " +motor.getConsum()+ motor.getCv() +"\n Averia reparada : " +fallo.getAveria() +"\n Import: " +fallo.getPreu()+
					"\n Data d'entrada: "+dataEntrada.get(GregorianCalendar.DAY_OF_MONTH)+"/"+ dataEntrada.get(GregorianCalendar.MONTH+1)+"/"+dataEntrada.get(GregorianCalendar.YEAR)+
					"\n Data d'eixida " +dataEixida.get(GregorianCalendar.DAY_OF_MONTH)+"/"+ dataEixida.get(GregorianCalendar.MONTH+1)+"/"+dataEixida.get(GregorianCalendar.YEAR));
		}
		
}