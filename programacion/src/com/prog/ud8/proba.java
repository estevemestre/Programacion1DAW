package com.prog.ud8;
import java.util.Scanner;
public class proba {
	
		public static void main(String[] args) {
			
				int a=3;
				System.out.println("antes de la llamada: a="+a);
				canviarValor(a);
				System.out.println("despu�s de la llamada: a="+a);
			}
				
		
		public static void canviarValor(int x){
				x=x+3;
				System.out.println("dentro de la funci�n: a="+x);
			}
			

	}	