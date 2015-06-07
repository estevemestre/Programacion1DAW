package Examen;

import java.util.Scanner;

public class Act4 {
	static boolean validarDNI(String dni){
		if(dni.length() != 9){
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
		Scanner teclado = new Scanner(System.in);
		String dni;
		System.out.println("Introduce el dni");
		dni = teclado.nextLine();
		
		
		if(validarDNI(dni)){
			System.out.println(dni.substring(0,8));
		} else {
			System.out.println("El dni no es valido.");
		}
		teclado.close();
	}
}
