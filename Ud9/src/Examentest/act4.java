package Examentest;

import java.util.Scanner;

public class act4 {
	
	static boolean vailadarDni (String dni) {
		
		if (dni.length() > 9) {
			return false;
		}
		if(!Character.isLetter(dni.charAt(8))){
				return false;
		}
			
			for (int i = 0; i < 8; i++) {
				if(!Character.isDigit(dni.charAt(i))){
					return false;
				}
			}
			
		
		return true;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		String dni;
		System.out.println("Introdueix el Dni");
		dni = reader.nextLine();
	
		vailadarDni(dni);
	}
}
