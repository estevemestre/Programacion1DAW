package Institut;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Prova {
		public static int[] contarNumsIMaj(String[] paraules){
			int[] numeros=new int [paraules.length];
			int suma;
			for (int i = 0; i < paraules.length; i++) { //recorre l'array
				suma=0;
				for (int j = 0; j < paraules[i].length(); j++) { //recorre les paraules
					
					if(Character.isDigit(paraules[i].charAt(j))|| Character.isUpperCase(paraules[i].charAt(j))){
					
						
						
						//els mètodes que retornen boolean no s'ha de posar "==true", se supose que es farà quan és true
						suma=suma+1;
					} //charAt(j) j perquè és el comptador que recorre els caràcters de cada paraula.
				}
				numeros[i]=suma;
			}
			return numeros;
		}
		public static void main(String[] args) {
			String [] paraules= {"moniToR5", "ordINadOr14","Ra14Li"};
			
			System.out.println(Arrays.toString(paraules));
			System.out.println(Arrays.toString(contarNumsIMaj(paraules)));
		}

	}