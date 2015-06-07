package com.prog.ud5;

public class Actividad191 {
public static void main (String [] args){
		
		int numero1=1;
		int llancamentdau=1000000;
		int numeroaleatori;
		int bucle1 = 0;
		int bucle2 = 0;
		int bucle3 = 0;
		int bucle4 = 0;
		int bucle5 = 0;
		int bucle6 = 0;
		double percentatge1 = 0.0;
		double percentatge2;
		double percentatge3;
		double percentatge4;
		double percentatge5;
		double percentatge6;
		
		
			
			while (numero1 <= llancamentdau){
				
				numeroaleatori=(int)(Math.random()*6+1);
				
				switch (numeroaleatori){
					case 1:
						bucle1 = bucle1 + 1;
						break;
					case 2:
						bucle2 = bucle2 + 1;
						break;
					case 3:
						bucle3 = bucle3 + 1;
						break;
					case 4:
						bucle4 = bucle4 + 1;
						break;
					case 5:
						bucle5 = bucle5 + 1;
						break;
					case 6:
						bucle6 = bucle6 + 1;
						break;					
				}
				
				numero1 = numero1 + 1;
				
		
				}
					percentatge1=(double)bucle1/10000;
					percentatge2=(double)bucle2/10000;
					percentatge3=(double)bucle3/10000;
					percentatge4=(double)bucle4/10000;
					percentatge5=(double)bucle5/10000;
					percentatge6=(double)bucle6/10000;
			
			System.out.println("Vegades que ha aparegut el número 1: "+bucle1+ " ("+percentatge1 +"%)");
			System.out.println("Vegades que ha aparegut el número 2: "+bucle2+ " ("+percentatge2 +"%)");
			System.out.println("Vegades que ha aparegut el número 3: "+bucle3+ " ("+percentatge3 +"%)");
			System.out.println("Vegades que ha aparegut el número 4: "+bucle4+ " ("+percentatge4 +"%)");
			System.out.println("Vegades que ha aparegut el número 5: "+bucle5+ " ("+percentatge5 +"%)");
			System.out.println("Vegades que ha aparegut el número 6: "+bucle6+ " ("+percentatge6 +"%)");
			
		}
	}

				