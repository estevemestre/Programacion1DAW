package Examen;

import java.util.Scanner;

public class GestioNIF {
	static boolean isNIF(String nif){
		//Evalua que tenga 9 caracteres
		if(nif.length() !=9) return false;
		//Evalua los caracteres numericos
		for (int count = 0; count < nif.length()-1; count++) {
			if(!isDigit(nif.charAt(count))) return false;
		}
		//Evalua el ultimo caracter
		if(isLetter(nif.charAt(nif.length()-1))) return true;
		else return false;
		
	}
	static boolean isLetter(char c){
		if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') return true;
		else return false;
	}
	static boolean isDigit(char c){
		if(Character.getNumericValue(c) >= 0
				&& Character.getNumericValue(c) <=9) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nif;
		System.out.print("Introduce su NIF: ");
		nif = teclado.nextLine();
		if(isNIF(nif)){
			System.out.println("Su dni es valido");
			System.out.println("Parte numerica del nif: " + nif.substring(0,8));
		} else {
			System.out.println("NIF no valido.");
		}
		
		teclado.close();
	}
}
