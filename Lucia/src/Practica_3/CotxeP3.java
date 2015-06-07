package Practica_3;

import java.util.GregorianCalendar;

public class CotxeP3 {
	private MotorP3 motor;
	private String marca;
	private String model;
	private AvariaP3 averia;
	private GregorianCalendar entrada= new GregorianCalendar(0,0,0);
	private GregorianCalendar eixida= new GregorianCalendar(0,0,0);
	
	//Constructors
	public CotxeP3(String marca, String model){
		this.marca=marca;
		this.model=model;
		TallerP3.setNCotxes(1);		//Suma 1 cotxe cada vegada que creem un cotxe nou
	}
	
	public CotxeP3 (){
		TallerP3.setNCotxes(1);
		
	}
	public CotxeP3 (MotorP3 motor, String marca, String model, AvariaP3 fallo, GregorianCalendar dataEntrada, 
			GregorianCalendar dataEixida){
		this.motor=motor;
		this.marca=marca;
		this.model=model;
		this.averia=fallo;
		this.entrada=dataEntrada;
		this.eixida=dataEixida;
		TallerP3.setNCotxes(1);
	}
	public CotxeP3(int cv, double consum,  String marca, String model, int id, String nom, double preu, 
			GregorianCalendar dataEntrada, GregorianCalendar dataEixida){
		motor=new MotorP3(cv,consum);
		this.marca=marca;
		this.model=model;
		averia=new AvariaP3(id,nom,preu);
		this.entrada=dataEntrada;
		this.eixida=dataEixida;
		TallerP3.setNCotxes(1);
		
	}

	//getters i setters
	public MotorP3 getMotor() {
		return motor;
	}

	public void setMotor(MotorP3 motor) {
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

	public AvariaP3 getAveria() {
		return averia;
	}

	public void setAveria(AvariaP3 averia) {
		this.averia = averia;
	}

	public GregorianCalendar getEntrada() {
		return entrada;
	}

	public void setEntrada(GregorianCalendar entrada) {
		this.entrada = entrada;
	}

	public GregorianCalendar getEixida() {
		return eixida;
	}

	public void setEixida(GregorianCalendar eixida) {
		this.eixida = eixida;
	}
	
	//mètodes visualitzar informació 
	public void mostrarInfo(){
		System.out.println(" Marca: "+marca+
				"\n Model: "+model+"\n Motor: "+motor.getCv()+"CV ("+motor.getConsum()+" l/100km) \n"+
				" Avaria reparada: "+averia.getNom()+"\n Import: "+averia.getPreu()+" euros \n"+
				" Data d'entrada: "+entrada.get(GregorianCalendar.DAY_OF_MONTH)+"/"+ entrada.get(GregorianCalendar.MONTH+1)+"/"+entrada.get(GregorianCalendar.YEAR)+
				"\n Data d'eixida: "+eixida.get(GregorianCalendar.DAY_OF_MONTH)+"/"+ eixida.get(GregorianCalendar.MONTH+1)+"/"+eixida.get(GregorianCalendar.YEAR)+"\n");
	}
	
}
