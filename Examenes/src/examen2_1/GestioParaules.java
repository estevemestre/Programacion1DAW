package examen2_1;
import java.util.Arrays;
public class GestioParaules {

	public static void posarMajuscules(String [] paraules) {
		
		//String [] majuscules = new String [paraules.length];
		
		
		for (int i = 0; i < paraules.length; i++) {
				
				if ( paraules[i].length() <= 5) {
			
			paraules[i] = paraules[i].toUpperCase();
		}
		}
		System.out.println("Arrays amb noms en majuscula: " +Arrays.toString(paraules));
		
	}
	
	public static void mostrarPosicio (String [] paraules) {
		
		int aux  = 0;
		
		for (int i = 0; i < paraules.length; i++) {
			for (int j = 0; j < paraules[i].length(); j++) {
				
				if (paraules[i].length() < paraules[i+1].length()){
				  aux = paraules[i].length();
				  
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String [] paraules = {"Maria","Javi","Antonio","Elena","Esther","Ivan"};
		
		System.out.println("Array original: " + Arrays.toString(paraules));
		posarMajuscules(paraules);
	//	System.out.println("Arrays amb noms en majuscula: "+ Arrays.toString(posarMajuscules(paraules)));
	}
}
