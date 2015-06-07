package Examen;

import java.util.Arrays;

public class GestioParaules {
	static void mayus(String [] cadenas){
		for (int count = 0; count < cadenas.length; count++) {
			if(cadenas[count].length() <= 5){
				cadenas[count] = cadenas[count].toUpperCase();
			}
		}
	}
	static void masCorta(String [] cadenas){
		int corta = cadenas[0].length();
		int posicion = 0;
		for (int count = 0; count < cadenas.length; count++) {
			if(cadenas[count].length() < corta){
				corta = cadenas[count].length();
				posicion = count;
			}
		}
		System.out.println("Posicion de la palabra: " + posicion);
		System.out.println("La palabra es: " + cadenas[posicion]);
		System.out.println("La palabra tiene : " + cadenas[posicion].length() + " caracteres.");
	}
	public static void main(String[] args) {
		String [] cadenas = {"Maria","Javi","Antonio","Elena","Esther","Ivan"};
		System.out.println("Array original: " + Arrays.toString(cadenas));
		System.out.print("Array con nombres en mayuscula: ");
		mayus(cadenas);
		System.out.println("Array original: " + Arrays.toString(cadenas));
		masCorta(cadenas);
	}
}
