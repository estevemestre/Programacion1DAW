package Activitat_11_15;
import java.util.Scanner;
import java.util.Arrays;
public class lol {
	public static void main(String[] args) {
		
		int [] UelaEtvullTestime = new int [6];
		
		
		for (int i = 0; i < UelaEtvullTestime.length; i++) {
			
			UelaEtvullTestime[i] = (int)Math.round(Math.random()*50);
		}
		
		
		System.out.println("Uela etvull, perfavor ajudam a que en toque Gracies testime " + Arrays.toString(UelaEtvullTestime));
	}
}
