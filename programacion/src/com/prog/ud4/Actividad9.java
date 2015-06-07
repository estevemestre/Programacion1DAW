package com.prog.ud4;

import java.util.Scanner;

public class Actividad9 {

	public static void main (String[] args) {
		
		Scanner lector=new Scanner(System.in);
		
		int segundosintroducidos;
		int minutos;
		int segundos;
		int horas;
		int dias;
	
	
	System.out.println("Escribe los segundos que quieras que te convierte en días , horas y segundos");
	
	segundosintroducidos = Integer.parseInt(lector.nextLine());
	
	
	minutos = segundosintroducidos / 60;
	segundos = segundosintroducidos % 60;
	horas = minutos / 60;
	minutos = minutos % 60;
	dias = horas / 24;
	horas = horas % 24;
	


	
	
	System.out.println("Minutos = " + minutos);
	System.out.println("Segundos = " + segundos);
	System.out.println("Horas = " + horas);
	System.out.println("Días = " + dias);
	
	
	
	}
}