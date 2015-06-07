/**
 * @author Esteve Mestre Company
 * 
 * Escriu un programa que ens permeta determinar la probabilitat amb la qual 
 * apareix cada un dels valors al llançar un dau.
 * Per a fer-ho, es llançarà el dau 1.000.000 vegades i es visualitzarà quantes vegades
 * ha aparegut cada número i el percentatge que representa del total.
 *
 *
 *	Ací tens un exemple:
 *
 *
 * Vegades que ha aparegut el número 1: 167457 (16.7457%)
 * Vegades que ha aparegut el número 2: 166165 (16.6165%)
 * Vegades que ha aparegut el número 3: 166622 (16.6622%)
 * Vegades que ha aparegut el número 4: 166995 (16.6995%)
 * Vegades que ha aparegut el número 5: 166941 (16.6941%)
 * Vegades que ha aparegut el número 6: 165820 (16.582%)
 *
 */



package com.prog.ud5;
public class Actividad19 {
	public static void main (String [] args) {
	
		int x = 1000000;
		int i = 1;
		int dados;
		int dados1 = 0;
		int dados2 = 0;
		int dados3 = 0;
		int dados4 = 0;
		int dados5 = 0;
		int dados6 = 0;
		double porcentajedado1;
		double porcentajedado2;
		double porcentajedado3;
		double porcentajedado4;
		double porcentajedado5;
		double porcentajedado6;
		
	
				while (i<=x) {
			
					dados=(int)(Math.random()*6+1);
			
							if (dados == 1) {
								dados1 = dados1 + 1;
							}

							if (dados == 2) {
								dados2 = dados2 + 1;
							}

							if (dados == 1) {
								dados3 = dados3 + 1;
							}

							if (dados == 1) {
								dados4 = dados4 + 1;
							}

							if (dados == 1) {
								dados5 = dados5 + 1;
							}
							if (dados == 6) {
								dados6 = dados6 + 1;
							}
					
								i=i+1; 
				}
								
				
				porcentajedado1= (double) dados1 / 10000;
				porcentajedado2= (double) dados2 / 10000;
				porcentajedado3= (double) dados3 / 10000;
				porcentajedado4= (double) dados4 / 10000;
				porcentajedado5= (double) dados5 / 10000;
				porcentajedado6= (double) dados6 / 10000;
		
		System.out.println("Vegades que ha aparegut el número 1: " + dados1 + " (" +porcentajedado1+"%)");
		System.out.println("Vegades que ha aparegut el número 2: " + dados2 + " (" +porcentajedado2+"%)");
		System.out.println("Vegades que ha aparegut el número 3: " + dados3 + " (" +porcentajedado3+"%)");
		System.out.println("Vegades que ha aparegut el número 4: " + dados4 + " (" +porcentajedado4+"%)");
		System.out.println("Vegades que ha aparegut el número 5: " + dados5 + " (" +porcentajedado5+"%)");
		System.out.println("Vegades que ha aparegut el número 6: " + dados6 + " (" +porcentajedado6+"%)");
	
	
				}
	}
	
	

	
	
	

