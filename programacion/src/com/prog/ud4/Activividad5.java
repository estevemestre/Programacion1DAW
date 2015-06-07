package com.prog.ud4;

public class Activividad5 {

	public static void main (String[] args) {
	
		int dinero = 2000;
		double interes = 0.0137;
		double retencion = 0.18;
		double resultado;
		
		
		interes = interes * dinero;
		retencion = retencion * interes;
		
		resultado = dinero + interes -retencion;
		
		
		System.out.println("El dinero que cuando habran  pasado los 6 meses es: "+resultado);
		
	
	
	
	
	
	
	
	}
}