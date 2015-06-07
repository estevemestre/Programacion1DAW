package examen2_1;
import java.util.Arrays;
public class SenarsParells {

	public static int [] numeros (int [] num) {
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] % 2 != 0) {
				
				System.out.print( +num[i]+ ", ");
				}
		}
		
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				
				System.out.print(num[i]+", ");
		}
		
		}
		return num;
	}
	
	public static void main(String[] args) {
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= (int)Math.round(Math.random()*60);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		 numeros(numeros);
		//System.out.println(Arrays.toString(numeros(numeros)));
	}
}
