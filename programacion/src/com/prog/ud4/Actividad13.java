package com.prog.ud4;
import java.util.Scanner;
	

	public class Actividad13 {

		public static void main(String [] args){
			
			int x1;
			int x2;
			int y1;
			int y2;
			double distancia;
			double primeraequacion;
			double segundaequacion;
			double raizCuadrada;
			
			Scanner lector=new Scanner(System.in);
			
			System.out.println(" Introduce las primeras cordenadas: ");
			x1= Integer.parseInt(lector.nextLine());
			y1= Integer.parseInt(lector.nextLine());
			
			System.out.println(" Introduce las segundas cordenadas: ");
			
			x2= Integer.parseInt(lector.nextLine());
			y2= Integer.parseInt(lector.nextLine());
			
			primeraequacion=Math.pow (x2-x1,2);
			segundaequacion=Math.pow (y2-y1,2);
			
			raizCuadrada= Math.sqrt(primeraequacion + segundaequacion);
			distancia= raizCuadrada;
			
		
			System.out.println("La distancia entre los puntos ("+( x1 )+"," +( y1 ) +")  ,  ("+ ( x2 )+ " ,"+( y2 )+ ") es:" + distancia );
			
			
			
		}
	}