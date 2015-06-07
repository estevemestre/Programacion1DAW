package Pruebas;

import java.util.Scanner;

public class Lol {
	Scanner lector = new Scanner(System.in);
	
	String esSoci ="";
	
	System.out.print("Introduce tu nombre");
	this.nombre = lector.nextLine();
	
	System.out.print("Introduce tu edad");
	this.edad = Integer.parseInt(lector.nextLine());
	

	if (edad < 18) {	
	System.out.print("Tu padre es socio (Si/No)?");
	esSoci = lector.nextLine();
	}
}
